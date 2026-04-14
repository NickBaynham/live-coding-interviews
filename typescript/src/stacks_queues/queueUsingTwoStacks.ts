export class QueueUsingTwoStacks {
  private readonly inStack: number[] = [];
  private readonly outStack: number[] = [];

  push(x: number): void {
    this.inStack.push(x);
  }

  private pour(): void {
    if (this.outStack.length === 0) {
      while (this.inStack.length > 0) {
        this.outStack.push(this.inStack.pop()!);
      }
    }
  }

  pop(): number {
    this.pour();
    return this.outStack.pop()!;
  }

  peek(): number {
    this.pour();
    return this.outStack[this.outStack.length - 1]!;
  }

  empty(): boolean {
    return this.inStack.length === 0 && this.outStack.length === 0;
  }
}
