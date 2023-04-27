export default function solution(answers) {
  const answer = [];

  const firstPerson = [1, 2, 3, 4, 5];
  const secondPerson = [2, 1, 2, 3, 2, 4, 2, 5];
  const thirdPerson = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5];
  const score = [0, 0, 0];

  for (let i = 0; i < answers.length; i += 1) {
    if (answers[i] === firstPerson[i % 5]) score[0] += 1;
    if (answers[i] === secondPerson[i % 8]) score[1] += 1;
    if (answers[i] === thirdPerson[i % 10]) score[2] += 1;
  }

  const max = Math.max(score[0], Math.max(score[1], score[2]));

  const list = [];

  if (max === score[0]) list.push(1);
  if (max === score[1]) list.push(2);
  if (max === score[2]) list.push(3);

  for (let i = 0; i < list.length; i += 1) {
    answer[i] = list[i];
  }

  return answer;
}
