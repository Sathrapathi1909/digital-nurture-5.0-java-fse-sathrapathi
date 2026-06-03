const defaultEvent = { name: "Community Talk", date: "June 25", category: "Learning" };
function showEvent({ name, date, category } = defaultEvent) {
    return `${name} on ${date} (${category})`;
}
const original = [{ name: "Yoga", category: "Health" }];
const copy = [...original];
const filtered = copy.filter(function(item) {
    return item.category === "Health";
});
document.getElementById("output").textContent = showEvent(filtered[0]);
