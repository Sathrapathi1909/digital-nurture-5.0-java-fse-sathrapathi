function Event(name, date, seats) {
    this.name = name;
    this.date = date;
    this.seats = seats;
}
Event.prototype.checkAvailability = function() {
    return this.seats > 0;
};
const eventItem = new Event("Spring Fair", "June 12", 20);
const details = Object.entries(eventItem).map(function(pair) {
    return pair[0] + ": " + pair[1];
});
document.getElementById("output").innerHTML = details.join("<br>") + "<br>Available: " + eventItem.checkAvailability();
