export default function solution(string) {
  let answer = [];
  let zeroCount = 0;
  let binary = 0;
  let count = 0;
  let textLength = 0;

  while (string !== '1') {
    const text = string.replace(/0/g, '');

    zeroCount += string.length - text.length;

    textLength = text.length;

    binary = textLength.toString(2);

    string = binary;

    count += 1;
  }

  answer = [count, zeroCount];
  return answer;
}

/*
1. 이해
- 0과 1로 이루어진 어떤 문자열 x에 대한 이진 변환을 다음과 같이 정의한다.
1) x의 모든 0을 제거한다.
2) x의 길이를 c라고 하면, x를 "c를 2진법으로 표현한 문자열"로 바꾼다.
- 예를 들어, x = "0111010"이라면, x에 이진 변환을 가하면 x = "0111010" -> "1111" -> "100" 이 된다.
- 0과 1로 이루어진 문자열 string이 매개변수로 주어진다. string이 "1"이 될 때까지 계속해서 string에 이진 변환을 가했을 때,
이진 변환의 회수와 변환 과정에서 제거된 모든 0의 개수를 각각 배열에 담아 return 하도록 solution 함수를 완성하라.
2. 계획
- 입력받은 문자열 string이 1이 될 때까지 while 반복문을 돌린다.
- replace() 메서드로 입력받은 문자열 string에 있는 모든 0을 ''으로 바꾼다.
- 입력받은 문자열 string의 길이에서 0을 모두 제거한 문자열의 길이를 빼서 문자열 string에 0이 몇 개 들어있는지 count 한다.
- 0을 제거한 문자열의 길이를 이진수로 변환한다.
- 반복문이 한 번 돌 때마다 count를 1씩 올려준다.
3. 실행

!! JS에서 replace() 메서드는 문자열에서 변경하려는 문자열이 여러 번 반복될 경우, 첫 번째로 발견한 문자열만 치환해준다. !!
*/
