package algorithms;

public class ArrayShift {
  public static int[] solution(int[] A, int K) {
    if (A.length != 0) {
      int arrayLength = A.length - 1;
    
      for (int i = 0; i < K; i++) {
        Integer lastElement = A[arrayLength];
        System.arraycopy(A, 0, A, 1, arrayLength);
        A[0] = lastElement;
      }
    }
    return A;
  }
}

