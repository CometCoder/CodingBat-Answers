public String startOz(String str) {
  StringBuilder answer = new StringBuilder();
  if (str.length() < 2) {
    return str;
  }
  //See if first character is an 'O', if so append it to answer string
  
  if ((str.charAt(0) + "").toString().equalsIgnoreCase("O")) {
    answer.append(str.charAt(0) + "");
  }
  //See if second character is a 'Z', if so append it to answer string
  if ((str.charAt(1) + "").equalsIgnoreCase("Z")) {
    answer.append(str.charAt(1) + "");
  }
  
  return answer.length() > 0 ? answer + "" : "";
}