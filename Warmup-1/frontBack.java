public String frontBack(String str) {
  if (str.length() == 0) {
    return str;
  }
  char swap = str.charAt(str.length() - 1);
  StringBuilder builder = new StringBuilder(str);
  builder.setCharAt(str.length() - 1, str.charAt(0));
  builder.setCharAt(0, swap);
  return builder.toString();
}