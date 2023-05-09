import solution from './solution';

test('solution', () => {
  expect(solution(
    ['muzi', 'frodo', 'apeach', 'neo'],
    ['muzi frodo', 'apeach frodo', 'frodo neo', 'muzi neo', 'apeach muzi'],
    2,
  )).toEqual([2, 1, 1, 0]);

  expect(solution(
    ['con', 'ryan'],
    ['ryan con', 'ryan con', 'ryan con', 'ryan con'],
    3,
  )).toEqual([0, 0]);
});
