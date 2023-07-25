export default function solution(n) {
  const answer = [];

  answer[1] = 1;
  answer[2] = 2;

  for (let i = 3; i < 2001; i += 1) {
    answer[i] = (answer[i - 2] + answer[i - 1]) % 1234567;
  }

  return answer[n];
}
