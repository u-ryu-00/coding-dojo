import solution from './solution';

test(solution, () => {
  expect(solution(
    [44, 1, 0, 0, 31, 25],
    [31, 10, 45, 1, 6, 19],
  ))
    .toEqual([3, 5]);
});
