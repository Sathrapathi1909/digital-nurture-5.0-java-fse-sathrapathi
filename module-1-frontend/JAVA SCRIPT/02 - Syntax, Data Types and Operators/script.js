const eventName = "Community Meetup";
const eventDate = "June 20";
let seats = 30;
seats = seats + 1;
seats = seats - 1;
const message = `${eventName} on ${eventDate}`;
document.getElementById("output").textContent = message + " - Seats available: " + seats;
