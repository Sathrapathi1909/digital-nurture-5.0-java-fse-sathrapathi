const eventList = [
    { name: "Music Night", date: "June 15", seats: 10, past: false },
    { name: "Coding Workshop", date: "May 10", seats: 0, past: true },
    { name: "Art Fair", date: "July 2", seats: 5, past: false }
];
const output = [];
try {
    for (let i = 0; i < eventList.length; i++) {
        const item = eventList[i];
        if (item.past) {
            continue;
        }
        if (item.seats > 0) {
            output.push(item.name + " on " + item.date);
        } else {
            output.push(item.name + " is sold out");
        }
    }
} catch (error) {
    output.push("Error reading events");
}
document.getElementById("output").innerHTML = output.join("<br>");
