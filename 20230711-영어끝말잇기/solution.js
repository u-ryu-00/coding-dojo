export default function solution(n, words) {
  const answer = [0, 0];
  let end = words[0][words[0].length - 1];
  let start;
  const set = new Set();
  set.add(words[0]);

  for (let i = 1; i < words.length; i += 1) {
    [start] = words[i];
    set.add(words[i]);
    if (end !== start || set.size !== i + 1) {
      answer[0] = (i % n) + 1;
      answer[1] = Math.floor(i / n) + 1;
      break;
    }
    end = words[i][words[i].length - 1];
  }
  return answer;
}
