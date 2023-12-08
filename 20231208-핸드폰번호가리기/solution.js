/*
1. 이해
프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때
고객들의 전화번호의 일부를 가립니다.
전화번호가 문자열 phone_number로 주어졌을 때,
전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수 solution을 완성하라.

2. 계획
- substring 메소드를 사용해서 전화번호의 뒷 4자리를 추출한다.
- substring 메소드를 사용해서 전화전호를 뒷 4자리를 제외한 문자열을 추출한다. 그 후 그것의 숫자를 모두 *로 바꾼다.
- 전화번호의 앞자리와 뒷자리를 합쳐서 answer를 만든다.

3. 실행
*/

export default function solution(phoneNumber) {
  let answer = '';

  const phoneNumberBack = phoneNumber.substring(phoneNumber.length - 4, phoneNumber.length);

  const phoneNumberFront = phoneNumber.substring(0, phoneNumber.length - 4).replace(/[0-9]/g, '*');

  answer = phoneNumberFront + phoneNumberBack;

  return answer;
}
