public int close10(int a, int b) {
  int x = Math.abs(10 - a);
  int y = Math.abs(10 - b);
  if (x == y) {
    return 0;
  }
  return x > y ? b : a;
}