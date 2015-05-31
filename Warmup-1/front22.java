public String front22(String str) {
  String front = new String((str.length() < 2) ? str : str.substring(0, 2));
  return front + str + front;
}