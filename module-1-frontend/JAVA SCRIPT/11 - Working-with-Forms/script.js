const form = document.querySelector("#signupForm");
const message = document.querySelector("#message");
form.addEventListener("submit", function(event) {
    event.preventDefault();
    const name = form.elements["name"].value;
    const email = form.elements["email"].value;
    const eventName = form.elements["event"].value;
    if (!name || !email) {
        message.textContent = "Enter name and email";
        return;
    }
    message.textContent = name + " registered for " + eventName;
});
