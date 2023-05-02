export default function solution(participant, completion) {
  let answer = '';

  const sortParticipant = participant.sort();
  const sortCompletion = completion.sort();

  for (let i = 0; i < sortCompletion.length; i += 1) {
    if (sortParticipant[i] !== (sortCompletion[i])) {
      answer += sortParticipant[i];
      break;
    }
  }

  if (answer === '') {
    answer += sortParticipant[sortParticipant.length - 1];
  }

  return answer;
}

/*
- 계획
입력받은 participant 배열과 completion 배열을 각각 정렬한다.
정렬된 Participant 배열과 completion 배열의 요소를 인덱스 별로 각각 비교한다.
만약 비교한 값이 서로 다르다면 participant 요소를 정답에 더한다.
비교한 값이 다른게 없다면 (즉, 정답에 아무것도 더해지지 않았다면) 마지막 한 사람이 정답일 것이다.
따라서 마지막 한 사람을 정답에 더한다.
*/
