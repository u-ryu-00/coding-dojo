import Solution from './solution';

test('solution', () => {
  const solution = new Solution();
  expect(solution.solution(4)).toEqual(2);
});
