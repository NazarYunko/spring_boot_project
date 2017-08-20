$("#form").submit(function (event) {
    event.preventDefault();
    var userNameField = $("#userName");
    var userNameVal = userNameField.val().toString();
    var userPasswordField = $("#password");
    var userPasswordVal = userPasswordField.val().toString();
    if (userNameVal == '') {
        userNameField.css('background', 'rgba(151, 22, 28, 0.15');
    }
    else if (userPasswordVal == '') {
        userPasswordField.css('background', 'rgba(151, 22, 28, 0.15)');
    }
    else {
        $("#form").unbind('submit').submit();
    }
});
