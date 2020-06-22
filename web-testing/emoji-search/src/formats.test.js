import { longDateFormat } from './formats';

test('test', () => {
  var obj = { _longDateFormat: { 'NL': 'yyyyMMdd' } };
  obj.longDateFormat = longDateFormat;
  var result = obj.longDateFormat('nl');
});