/*
1. 이해
- 괄호가 바르게 짝지어졌다는 것은 '(' 문자로 열렸으면 반드시 짝지어서 ')' 문자로 닫혀야 한다는 뜻이다.
  "()()" 또는 "(())()"는 올바른 괄호이다.
  ")()(" 또는 "(()("는 올바르지 않은 괄호이다.
- '(' 또는 ')' 로만 이루어진 문자열 string이 주어졌을 때,
  문자열 string이 올바른 괄호이면 true를 return하고,
  올바르지 않은 괄호이면 false를 return 하는 solution 함수를 완성하라.
2. 계획
- charAt() 메서드로 문자열 한글자 한글자마다 access 한다.
- 첫번째 문자가 닫는 괄호이면 false를 return 한다.
- 열린 괄호일 때 count를 하나 늘려주고,
  닫힌 괄호일 때 count를 하나 줄여준다.
- count가 0보다 작으면 false를 return 한다.
- count가 0이면 true를 return 한다.
3. 실행
*/

export default function solution(string) {
  let answer = false;

  let count = 0;

  for (let i = 0; i < string.length; i += 1) {
    if (string.charAt(0) === ')') {
      return false;
    }

    if (string.charAt(i) === '(') {
      count += 1;
    }

    if (string.charAt(i) === ')') {
      count -= 1;
    }

    if (count < 0) {
      return false;
    }
  }

  if (count === 0) {
    answer = true;
  }

  return answer;
}
