function gcd(a, b) {
  let x = Math.max(a, b);
  let y = Math.min(a, b);

  while (x % y !== 0) {
    const r = x % y;
    x = y;
    y = r;
  }
  return y;
}

export default function solution(array) {
  let answer = array[0];

  for (let i = 1; i < array.length; i += 1) {
    const gcdVal = gcd(answer, array[i]);
    answer = (answer * array[i]) / gcdVal;
  }

  return answer;
}

/*
1. 이해
- n개의 수의 최소공배수는 n개의 수들의 배수 중 공통이 되는 가장 작은 숫자가 된다.
- n개의 숫자를 담은 배열 array가 입력되었을 때 이 수들의 최소공배수를 구하는 함수 solution을 완성하라.
2. 계획
- 최대공약수를 구하는 함수 gcd를 만든다.
- N개의 수의 최소공배수를 구하므로 기존의 두 수의 최대공약수, 최소공배수를 구하는 방식과 다르게 answer의
값을 array의 첫 번째 값으로 고정한다.
- 1번째 인덱스 값과 2번째 인덱스 값의 최소공배수를 answer에 반영하고 그 최소공배수와 다음 3번째 인덱스와의 최소공배수를 구한다.
- 1,2 번째 인덱스의 최소공배수 값과 3번째 인덱스 두 수의 최소공배수를 구한 값을 answer에 반영한다.
- 이와 같은 방법으로 마지막 인덱스의 값과도 최소공배수를  구해 answer에 반영한다.
3. 실행
*/
