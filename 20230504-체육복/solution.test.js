import solution from './solution';

test('solution', () => {
  expect(solution(5, [2, 4], [1, 3, 5])).toEqual(5);
  expect(solution(5, [2, 4], [3])).toEqual(4);
  expect(solution(3, [3], [1])).toEqual(2);
  // 여벌 체육복을 가져왔더라도 도난 당한 경우
  expect(solution(4, [2, 3], [3, 4])).toEqual(3);
  // lost 배열과 reverse 배열에 정렬되어 있지 않은 경우
  expect(solution(5, [4, 2], [3, 5])).toEqual(5);
});
