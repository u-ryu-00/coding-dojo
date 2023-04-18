import solution from './solution';

test('solution', () => {
  expect(solution(123)).toBe(6);
  expect(solution(987)).toBe(24);
  expect(solution(1234)).toBe(10);
});
