export default function solution(n) {
  let answer = 0;
  const s = Math.round(n / 2);
  for (let i = 1; i < s + 1; i += 1) {
    let sum = i;
    for (let j = i + 1; j < s + 1; j += 1) {
      sum += j;

      if (sum === n) {
        answer += 1;
      }

      if (sum > n) {
        break;
      }
    }
  }
  return answer + 1;
}
