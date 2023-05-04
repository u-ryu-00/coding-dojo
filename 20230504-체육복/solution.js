export default function solution(n, lost, reserve) {
  let answer = 0;

  const sortLost = lost.sort();
  const sortReserve = reserve.sort();

  // 도난 당하지 않은 학생의 수
  answer = n - lost.length;

  // 여벌 체육복을 가져왔지만 도난 당한 학생 수 (다른 학생에게 체육복을 빌려줄 수 없음.)
  for (let i = 0; i < sortLost.length; i += 1) {
    for (let j = 0; j < sortReserve.length; j += 1) {
      if (sortLost[i] === sortReserve[j]) {
        answer += 1;
        sortLost[i] = -1;
        sortReserve[j] = -1;
        break;
      }
    }
  }

  // 도난 당했지만 체육복을 빌릴 수 있는 학생 수
  for (let i = 0; i < sortLost.length; i += 1) {
    for (let j = 0; j < sortReserve.length; j += 1) {
      if (sortLost[i] - 1 === sortReserve[j] || sortLost[i] + 1 === sortReserve[j]) {
        answer += 1;
        sortReserve[j] = -1;
        break;
      }
    }
  }
  return answer;
}

/*
1. 이해
- 학생들의 번호는 체격 순으로 매겨져 있어, 바로 앞번호의 학생이나 바로 뒷번호의 학생에게만 체육복을 빌려 줄 수 있다.
- 전체 학생의 수 : n, 체육복을 도난 당한 학생들의 번호가 담긴 배열 : lost, 여벌의 체육복을 가져온 학생들의 번호가 담긴 배열 : reserve
2. 계획
- 일단 lost, reserve 배열을 정렬한다. (문제에서 lost나 reserve가 정렬되어 있다는 언급이 없기 때문에 예시만 보고 정렬되어 있다고 가정하면 안 된다.)
- 도난 당하지 않은 학생의 수는 전체 학생의 수(n)에서 체육복을 도난 당한 학생들의 번호가 담긴 배열 lost의 길이를 뺀 것이다.
(answer = n - lost.length)
- 여벌 체육복을 가져왔지만 도난 당한 학생 수 (다른 학생에게 체육복을 빌려줄 수 없음.)
계산해서 answer에 더해준다.
: 여벌 체육복이 있는 학생도 도난당할 수 있다. 즉, reserve에 속한 원소가 lost에도 속할 수 있다. 여벌 체육복을 가져왔더라도 도난 당했다면 체육복을 빌려줄 수 없다.
그래서 여벌 체육복을 가져왔더라도 도난 당했다면 체육복을 빌려줄 수 없다.
- 도난 당했지만 체육복을 빌릴 수 있는 학생 수
계산해서 answer에 더해준다.
*/
