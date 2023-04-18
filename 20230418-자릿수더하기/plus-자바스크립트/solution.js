export default function solution(n) {
  let answer = 0;
  let number = n;

  while (number > 0) {
    answer += number % 10;
    number = Math.floor(number / 10);
  }

  return answer;
}
