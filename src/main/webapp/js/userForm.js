// short hand for document.ready with jquery
$(function(){
    $("#createForm").submit(function(e){
        e.preventDefault();
    });

    $("#createButton").click(function(){
        var name = $('#name').val();
        var age = $('#age').val();
        $.ajax({
            'url' : '/users/create',
            'method' : "POST",
            'headers' : {
                'Content-Type' : 'application/json'
            },
            'data' : JSON.stringify({
                'name' : name,
                'age' : age
            })
        }).done(function(response){
            // quick but dirty way to see new data
            location.reload();
        }).fail(function(error){
            console.log("error");
            console.log(error);
            if(error.responseJSON.code == 10){
                $('#responseMessage').html("User already exists");
                setTimeout(function(){
                    $('#responseMessage').html("");
                },2000)
            }
        });
    });
});