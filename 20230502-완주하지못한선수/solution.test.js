import solution from './solution';

test('solution', () => {
  expect(solution(['leo', 'kiki', 'eden'], ['eden', 'kiki'])).toEqual('leo');
});
