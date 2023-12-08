import solution from './solution';

test('solution', () => {
  expect(solution('01033334444')).toBe('*******4444');
});

test('solution', () => {
  expect(solution('027778888')).toBe('*****8888');
});
