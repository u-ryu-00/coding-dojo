export default function solution(brown, yellow) {
  const answer = [];

  const sum = brown + yellow;

  for (let i = 3; i < sum; i += 1) {
    const j = sum / i;

    if (sum % i === 0 && j >= 3) {
      const column = Math.max(i, j);
      const row = Math.min(i, j);
      const center = (column - 2) * (row - 2);

      if (center === yellow) {
        answer[0] = column;
        answer[1] = row;

        return answer;
      }
    }
  }

  return answer;
}
