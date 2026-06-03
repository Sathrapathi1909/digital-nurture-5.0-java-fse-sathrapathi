function addEvent(name, date, category) {
    return { name: name, date: date, category: category };
}
function registerUser(user, eventName) {
    return user + " registered for " + eventName;
}
function filterEventsByCategory(events, category) {
    return events.filter(function(item) {
        return item.category === category;
    });
}
function categoryCounter(category) {
    let count = 0;
    return {
        add: function(item) {
            if (item.category === category) {
                count = count + 1;
            }
        },
        value: function() {
            return count;
        }
    };
}
const events = [
    addEvent("Bake Sale", "June 30", "Food"),
    addEvent("Live Music", "July 5", "Music"),
    addEvent("Yoga Class", "July 8", "Health")
];
const musicEvents = filterEventsByCategory(events, "Music");
const counter = categoryCounter("Music");
musicEvents.forEach(function(item) {
    counter.add(item);
});
document.getElementById("output").textContent = registerUser("Alex", musicEvents[0].name) + " (" + counter.value() + " total)";
