// Advances the given date by one day.
function incrementDate(date) {
    date.setDate(date.getDate() + 1);
}

// Returns a string representation of the given date
// in the format yyyy-MM-dd.
function dateToString(date) {
    // return date.toISOString().slice(0, 10);
    var year = date.getFullYear();
    var month = ('0' + (date.getMonth() + 1)).slice(-2);
    var day = ('0' + date.getDate()).slice(-2);
    return year + "-" + month + "-" + day;
}