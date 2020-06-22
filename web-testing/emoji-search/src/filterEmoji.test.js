jest.mock('./emojiList.json', () => [
  {
    "title": "Blush",
    "symbol": "😊",
    "keywords": "smile"
  }
]);

import filterEmoji from './filterEmoji';

describe('the filterEmoji function', () => {
  test('should search based on title', () => {
    const result = filterEmoji('blush', 10);

    expect(result).toEqual([
      {
        "title": "Blush",
        "symbol": "😊",
        "keywords": "smile"
      }
    ]);
  });

  test('should return an empty array when not found', () => {
    const result = filterEmoji('wink', 10);

    expect(result).toEqual([]);
  })
});