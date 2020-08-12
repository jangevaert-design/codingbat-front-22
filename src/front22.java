public class front22 {
  public String front22(String str) {
    if (str.length() == 0) {
      return str;
    } else if (str.length() < 2) {
      return str.charAt(0) + str + str.charAt(0);
    } else {
      return str.substring(0,2) + str + str.substring(0,2);
    }
  }
}
