const events = [
    { name: "Fresh Farmers", category: "Food" },
    { name: "Summer Jazz", category: "Music" },
    { name: "Story Hour", category: "Education" }
];
const list = document.querySelector("#eventList");
events.forEach(function(item) {
    const card = document.createElement("div");
    card.textContent = item.name + " - " + item.category;
    list.appendChild(card);
});
