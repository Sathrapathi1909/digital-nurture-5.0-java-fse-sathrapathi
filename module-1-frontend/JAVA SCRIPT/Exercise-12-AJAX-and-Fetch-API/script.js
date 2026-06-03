const form = document.querySelector("#registerForm");
const result = document.querySelector("#result");
form.addEventListener("submit", function(event) {
    event.preventDefault();
    const data = {
        name: form.elements["name"].value,
        event: form.elements["event"].value
    };
    fetch("https://jsonplaceholder.typicode.com/posts", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(data)
    })
        .then(function(response) {
            if (!response.ok) {
                throw new Error("Network response was not ok");
            }
            return response.json();
        })
        .then(function() {
            setTimeout(function() {
                result.textContent = "Registration sent";
            }, 500);
        })
        .catch(function() {
            result.textContent = "Registration failed";
        });
});
