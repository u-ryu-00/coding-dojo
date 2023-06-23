import solution from './solution';

test('solution', () => {
  expect(solution('()()')).toEqual(true);
  expect(solution('(())()')).toEqual(true);
  expect(solution(')()(')).toEqual(false);
  expect(solution('(()(')).toEqual(false);
});
