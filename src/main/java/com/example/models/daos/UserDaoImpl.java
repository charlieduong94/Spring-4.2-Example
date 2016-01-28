package com.example.models.daos;

import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import com.example.models.User;
import com.example.models.daos.UserDao;
import com.example.utils.DataSourceConfig;
import java.sql.Types;
import java.sql.ResultSet;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.RowMapper;
import java.util.List;
import java.sql.SQLException;
/**
 * This is a Data Access Object that is used to query the User table in our postgresql db.
 */
@Repository
public class UserDaoImpl implements UserDao {
  private JdbcTemplate jdbcTemplate;

    // sql queries
    private static final String INSERT_USER_STATEMENT = "insert into users(name, age) values (?,?)";
    private static final String COUNT_USERS_STATEMENT = "select count(*) from users";
    private static final String SELECT_USERS_STATEMENT = "select * from users";
    /**
     * Upon creation, instantiate jdbcTemplate with datasource
     */
    public UserDaoImpl(){
      jdbcTemplate = new JdbcTemplate(DataSourceConfig.getDataSource());
  }

    /**
     * Inserts a user into the Users table
     * @param name
     * @param age
     * @return the user's row position
     */
    public int createUser(String name, long age){
        Object[] params = new Object[]{name, age};
        int[] types = new int[]{Types.VARCHAR, Types.INTEGER};
        int rowNumber = -1;
        try{  // attempt to insert user
            rowNumber = jdbcTemplate.update(INSERT_USER_STATEMENT, params, types);
        }
        catch(DataAccessException exception){ // catch excpetion (failed insert)
            System.out.println("Failed insert of user " + name + ", age " + age);
        }
        return rowNumber;
    }

    /**
     * Gets a count of how many users are in the database.
     * @return the number of users in the table
     */
    public long getUserCount(){
        int rowCount = -1;
        try{
            rowCount = jdbcTemplate.queryForObject(COUNT_USERS_STATEMENT, Integer.class);
        }
        catch(DataAccessException exception){
            System.out.println("Failed to get count of users");
        }
        return rowCount;
    }

    /**
     * Gets all users from the Users table.
     * @return
     */
    public List<User> getAllUsers(){
        List<User> users;
        try{
            users = jdbcTemplate.query(SELECT_USERS_STATEMENT, new RowMapper<User>(){
                @Override
                public User mapRow(ResultSet rs, int rownumber) throws SQLException {
                    User user = new User();
                    user.setId(rs.getInt(1));
                    user.setName(rs.getString(2));
                    user.setAge(rs.getInt(3));
                    return user;
                }
            });
        }
        catch(DataAccessException exception){
            System.out.println("Could not get list of users");
            users = null;
        }
        return users;
    }
}
