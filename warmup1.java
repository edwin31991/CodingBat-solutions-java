public String stringTimes(String str, int n) {
  StringBuilder sb = new StringBuilder();
  while(n!=0){
    sb.append(str);
    n--;
  }
  return sb.toString();
}
