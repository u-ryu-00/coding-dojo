export default function solution(lottos, winNumbers) {
  const answer = [0, 0];
  let countWinNumber = 0;
  let countZero = 0;

  for (let i = 0; i < winNumbers.length; i += 1) {
    for (let j = 0; j < lottos.length; j += 1) {
      if (winNumbers[i] === lottos[j]) {
        countWinNumber += 1;
        break;
      }
    }
  }

  for (let i = 0; i < lottos.length; i += 1) {
    if (lottos[i] === 0) countZero += 1;
  }

  answer[0] = 7 - (countWinNumber + countZero);
  answer[1] = (countWinNumber === 0) ? 6 : 7 - countWinNumber;

  return answer;
}
