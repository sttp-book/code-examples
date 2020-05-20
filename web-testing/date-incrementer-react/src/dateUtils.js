// Advances the given date by one day.
function incrementDate(date) {
  date.setDate(date.getDate() + 1);
}

// Returns a new date that is one day later than the given date.
export function addOneDay(date) {
  const copy = new Date(date.getTime());
  incrementDate(copy);
  return copy;
}

// Returns a string representation of the given date
// in the format yyyy-MM-dd.
export function dateToString(date) {
  const year = date.getFullYear();
  const month = ('0' + (date.getMonth() + 1)).slice(-2);
  const day = ('0' + date.getDate()).slice(-2);
  return year + "-" + month + "-" + day;
}