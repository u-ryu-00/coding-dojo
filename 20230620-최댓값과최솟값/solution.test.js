import Solution from './solution';

test('solution', () => {
  const solution = new Solution();
  expect(solution.solution('1 2 3 4')).toEqual('1 4');
});
