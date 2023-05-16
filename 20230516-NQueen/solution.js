export default class Solution {
  constructor() {
    this.visited = [];
    this.pick = [];
    this.count = 0;
  }

  solution(n) {
    this.visited = new Array(n).fill(false);
    this.pick = new Array(n).fill(0);
    this.count = 0;

    this.permutation(n, 0);
    return this.count;
  }

  permutation(n, index) {
    if (n === index) {
      this.count += 1;
      return;
    }

    for (let i = 0; i < n; i += 1) {
      if (this.visited[i] === false) {
        this.visited[i] = true;
        this.pick[index] = i;
        if (this.check(index)) this.permutation(n, index + 1);
        this.visited[i] = false;
      }
    }
  }

  check(index) {
    for (let i = 0; i < index; i += 1) {
      if (this.pick[i] === this.pick[index]) return false; //  같은 행에 퀸이 존재하면 false
      // 대각선에 퀸이 존재한다면 false
      if (Math.abs(index - i) === Math.abs(this.pick[index] - this.pick[i])) return false;
    }
    return true;
  }
}

export const solution = new Solution();
