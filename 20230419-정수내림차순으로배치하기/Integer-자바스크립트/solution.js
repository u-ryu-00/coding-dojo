export default function solution(n) {
  const answer = `${n}`;
  const answer2 = answer.split('');
  return Number(answer2.sort((a, b) => b - a).join(''));
}

/*
계획
- 입력받은 정수 n을 문자열 형태로 변환한다.
- 변환한 문자열을 split으로 한글자 한글자 자른다.

sort((a, b) => b - a)
- 숫자 배열을 내림차순으로 정렬하는 데 사용된다.
- sort 메서드는 비교함수를 정렬 순서를 정의하는 인수로 사용한다.
- 위의 코드에서 비교 함수는 (a, b) => b - a로,
a와 b 두 요소를 비교하여 b에서 a를 뺀 결과를 반환한다.
- b - a가 음수이면 정렬된 배열에서 b가 a 앞에 와야 함을 의미한다 .
*/
