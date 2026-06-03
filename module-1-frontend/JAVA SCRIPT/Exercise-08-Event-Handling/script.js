const registerBtn = document.querySelector("#registerBtn");
const categorySelect = document.querySelector("#categorySelect");
const searchInput = document.querySelector("#searchInput");
const message = document.querySelector("#message");
registerBtn.onclick = function() {
    message.textContent = "Registration sent";
};
categorySelect.onchange = function() {
    message.textContent = "Filter: " + categorySelect.value;
};
searchInput.onkeydown = function(event) {
    if (event.key === "Enter") {
        message.textContent = "Search for " + searchInput.value;
    }
};
