const form = document.querySelector("#debugForm");
const result = document.querySelector("#result");
form.addEventListener("submit", function(event) {
    event.preventDefault();
    const name = form.elements["name"].value;
    const eventName = form.elements["event"].value;
    console.log("Form submitted", { name: name, event: eventName });
    if (!name) {
        result.textContent = "Name is required";
        return;
    }
    result.textContent = "Registration ready";
});
