export default function solution(string) {
  const stack = [];

  for (let i = 0; i < string.length; i += 1) {
    const character = string.charAt(i);

    if (stack.length > 0 && stack[stack.length - 1] === character) {
      stack.pop();
    } else if (stack.length === 0 || stack[stack.length - 1] !== character) {
      stack.push(character);
    }
  }

  return stack.length === 0 ? 1 : 0;
}
