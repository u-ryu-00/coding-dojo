export default function solution(string) {
  let answer = '';

  const numbers = string.split(' ');
  let min = Number.MAX_SAFE_INTEGER;
  let max = Number.MIN_SAFE_INTEGER;

  for (let i = 0; i < numbers.length; i += 1) {
    const number = parseInt(numbers[i], 10);

    min = Math.min(min, number);
    max = Math.max(max, number);
  }

  answer = `${min} ${max}`;
  return answer;
}
