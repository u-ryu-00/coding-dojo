export default function solution(citations) {
  let answer = 0;

  citations.sort((a, b) => a - b);
  for (let i = 0; i < citations.length; i += 1) {
    const h = citations.length - i;
    if (citations[i] >= h) {
      answer = h;
      break;
    }
  }

  return answer;
}
