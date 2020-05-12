function incrementDate(date) {
    date.setDate(date.getDate() + 1);
}

function dateToString(date) {
    return date.toISOString().slice(0, 10);
}