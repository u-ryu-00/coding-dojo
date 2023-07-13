export default function solution(people, limit) {
  let answer = 0;
  people.sort((a, b) => a - b);

  let index = 0;
  for (let i = people.length - 1; i >= index; i -= 1) {
    if (people[i] + people[index] <= limit) {
      answer += 1;
      index += 1;
      continue;
    }
    answer += 1;
  }
  return answer;
}
