function showEvents(data) {
    const list = document.querySelector("#eventList");
    list.innerHTML = "";
    data.forEach(function(item) {
        const li = document.createElement("li");
        li.textContent = item.name + " on " + item.date;
        list.appendChild(li);
    });
}
fetch("events.json")
    .then(function(response) {
        return response.json();
    })
    .then(function(data) {
        showEvents(data);
    })
    .catch(function() {
        document.querySelector("#eventList").textContent = "Failed to load events.";
    })
    .finally(function() {
        document.querySelector("#loading").style.display = "none";
    });
