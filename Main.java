package algorithms;

public class Main {

    public static void main(String[] args) {
      // Codility - Binary Gap
//      System.out.println(BinaryGap.solution(20));
      
      // Codility - Array Shift
      int[] testArray = new int[]{3, 8, 9, 7, 6};
      System.out.println("Test Array: ");
      for (int number : testArray) {
        System.out.print(number + ", ");
      }
      
      int[] result = ArrayShift.solution(testArray, 3);
      
      System.out.println("\nShifted Array: ");
      for (int number : result) {
        System.out.print(number + ", ");
      }
    }
}
