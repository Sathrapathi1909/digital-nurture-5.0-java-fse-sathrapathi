const events = [
    "Music Night",
    "Art Market",
    "Food Truck Fest",
    "Book Club"
];
events.push("Charity Run");
const musicEvents = events.filter(function(item) {
    return item.toLowerCase().indexOf("music") !== -1;
});
const cards = musicEvents.map(function(item) {
    return "<div>" + item + "</div>";
});
document.getElementById("output").innerHTML = cards.join("");
