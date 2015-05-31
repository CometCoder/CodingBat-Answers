public String missingChar(String str, int n) {
  return new StringBuilder(str).delete(n, n + 1).toString();
}