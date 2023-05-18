import solution from './solution';

test('solution', () => {
  expect(solution([2, 6, 8, 14])).toEqual(168);
  expect(solution([1, 2, 3])).toEqual(6);
});
