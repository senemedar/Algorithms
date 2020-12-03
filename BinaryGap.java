package algorithms;

public class BinaryGap {
  public static int solution(int N) {
    String binaryString = Integer.toBinaryString(N);
    char[] binaryStringArray = binaryString.toCharArray();
    System.out.println(binaryString);
    boolean isBinaryGap = false;
    int binaryGap = 0;
    int longestBinaryGap = 0;
    for (char character : binaryStringArray) {
      if (character == '1') {
//          isBinaryGap = true;
        if (binaryGap > longestBinaryGap)
          longestBinaryGap = binaryGap;
        binaryGap = 0;
      } else {
//          isBinaryGap = false;
        binaryGap++;
      }
    }
    return longestBinaryGap;
  }
  
}
