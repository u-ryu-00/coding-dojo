/* eslint-disable no-console */
export default function solution(s) {
  let answer = '';
  const words = s.split(' ');

  for (let i = 0; i < words.length; i += 1) {
    for (let j = 0; j < words[i].length; j += 1) {
      if (j % 2 === 0) {
        answer += words[i][j].toUpperCase();
      } else {
        answer += words[i][j].toLowerCase();
      }
    }
    if (i < words.length - 1) {
      answer += ' ';
    }
  }
  return answer;
}

console.log(solution('try hello world'));
