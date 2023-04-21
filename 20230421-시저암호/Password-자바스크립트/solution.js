export default function solution(s, n) {
  let answer = '';

  for (let i = 0; i < s.length; i += 1) {
    // 대문자일 때
    if (s.charCodeAt(i) >= 65 && s.charCodeAt(i) <= 90) {
      if (s.charCodeAt(i) + n > 90) {
        answer += String.fromCharCode(s.charCodeAt(i) + n - 26);
      }
      if (s.charCodeAt(i) + n <= 90) {
        answer += String.fromCharCode(s.charCodeAt(i) + n);
      }
    }
    // 소문자일 때
    if (s.charCodeAt(i) >= 97 && s.charCodeAt(i) <= 122) {
      if (s.charCodeAt(i) + n > 122) {
        answer += String.fromCharCode(s.charCodeAt(i) + n - 26);
      }
      if (s.charCodeAt(i) + n <= 122) {
        answer += String.fromCharCode(s.charCodeAt(i) + n);
      }
    }
    // 공백일 때
    if (s.charCodeAt(i) === 32) {
      answer += ' ';
    }
  }
  return answer;
}
