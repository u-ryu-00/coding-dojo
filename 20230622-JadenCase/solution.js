export default function solution(string) {
  let answer = '';
  const words = string.toLowerCase().split('');
  let space = true;

  for (let i = 0; i < words.length; i += 1) {
    if (space) {
      answer += words[i].toUpperCase();
    }

    if (!space) {
      answer += words[i];
    }

    space = words[i] === ' ';
  }
  return answer;
}

/*
1. 이해
- JadenCase란 모든 단어의 첫문자가 대문자이고, 그 외의 알파벳은 소문자인 문자열이다.
- 단, 첫 문자가 알파벳이 아닐 때에 이어지는 알파벳은 소문자로 쓰면 된다.
2. 계획
- 주어진 문자열을 한 글자씩 모두 잘라서 모두 소문자로 바꾼 후 배열 words에 담는다.
- for문을 돌려서 배열 안의 모든 요소에 접근할 수 있도록 한다.
- 우선 space 변수를 선언하고 기본값을 true로 잡는다.
- space라면 배열의 요소를 대문자로 바꾸고
- space가 아니라면 배열의 요소를 그대로 둔다.
- 배열의 요소가 공백일 때 space라고 한다.
3. 실행
*/
