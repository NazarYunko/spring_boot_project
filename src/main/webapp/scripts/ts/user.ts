/// <reference path="../definitions/jQuery.d.ts"/>

//sign in form validation

//todo make validation
$("#form").submit((event) => {

    event.preventDefault();

    let userNameField: JQuery<HTMLElement> = $("#userName");
    let userNameVal: string = userNameField.val().toString();

    let userPasswordField: JQuery<HTMLElement> = $("#password");
    let userPasswordVal: string = userPasswordField.val().toString();

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
