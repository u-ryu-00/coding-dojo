import solution from './solution';

test('solution', () => {
  expect(solution('3people unFollowed me')).toEqual('3people Unfollowed Me');
  expect(solution('for the last week')).toEqual('For The Last Week');
});
