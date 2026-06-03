$(document).ready(function() {
    $("#registerBtn").click(function() {
        $("#message").text("Registered with jQuery").fadeIn().delay(600).fadeOut();
    });
    $("#showBenefit").click(function() {
        $("#benefit").text("Frameworks make UI updates easier when data changes.");
    });
});
