var val = true;
$("#btn").click(function () {
    if (val) {
        $("#home").css("color", "black");
        val = false;
    }
    else {
        $("#home").css("color", "white");
        val = true;
    }
});
