export default function solution(n) {
  const result = [];
  const array = String(n).split('').reverse().map((data) => Number(data));
  for (let i = 0; i < array.length; i += 1) {
    result[i] = Number(array[i]);
  }
  return array;
}
