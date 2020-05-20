import { addOneDay, dateToString } from './dateUtils';

describe('addOneDay', () => {
  test('handles February 29th', () => {
    const oldDate = new Date(2020, 1, 29);  // February 29th, 2020
    const newDate = addOneDay(oldDate);
    expect(newDate).toEqual(new Date(2020, 2, 1));
  });
});

describe('dateToString', () => {
  test('returns the date in the form "yyyy-MM-dd"', () => {
    var date = new Date(2020, 4, 1);   // May 1st, 2020
    expect(dateToString(date)).toEqual("2020-05-01");
  });
});
