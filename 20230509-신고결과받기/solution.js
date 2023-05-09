/* eslint-disable no-restricted-syntax */
export default function solution(idList, report, k) {
  const answer = new Array(idList.length).fill(0);

  // 1. 중복 제거
  const reportSet = new Set(report);

  // 2. notifyListHash 만들기
  const notifyListHash = {};
  for (const reportItem of reportSet) {
    const [reporter, reportee] = reportItem.split(' ');

    if (!notifyListHash[reportee]) {
      notifyListHash[reportee] = [];
    }
    notifyListHash[reportee].push(reporter);
  }

  // 3. notifyListHash를 기반으로 reporterHash 만들기
  const reporterHash = {};
  for (const notifyList of Object.values(notifyListHash)) {
    if (notifyList.length >= k) {
      for (const reporter of notifyList) {
        reporterHash[reporter] = (reporterHash[reporter] || 0) + 1;
      }
    }
  }

  // 4. reporterHash를 기반으로 answer 배열을 채운다.
  for (let i = 0; i < idList.length; i += 1) {
    answer[i] = reporterHash[idList[i]] || 0;
  }
  return answer;
}
