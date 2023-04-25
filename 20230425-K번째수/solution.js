/* eslint-disable no-console */
export default function solution(array, commands) {
  const answer = [];
  for (let i = 0; i < commands.length; i += 1) {
    const start = commands[i][0] - 1;
    const end = commands[i][1];
    const select = commands[i][2] - 1;

    const copyArray = array.slice(start, end);
    copyArray.sort((a, b) => a - b);

    answer[i] = copyArray[select];
  }

  return answer;
}

/*
1. 자바 스크립트에서 배열 자르는 메서드? => slice
2. 배열 요소 오름차순으로 정렬하는 메서드? => sort
*/
