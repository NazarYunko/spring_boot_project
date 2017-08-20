/// <reference path="../definitions/jQuery.d.ts"/>

let val: boolean = true;


$("#btn").click(() => {

    if (val) {
        $("#home").css("color", "black");
        val = false;
    } else {
        $("#home").css("color", "white");
        val = true;
    }
});


