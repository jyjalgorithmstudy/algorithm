## Lesson5_MinAvgTwoSlice

- JAVA

```java
package jihwan.codility;

public class MinAvgTwoSlice {
    public static void main(String[] args) {
        int[] A = {4, 2, 2, 5, 1, 5, 8};
        System.out.println(new MinAvgTwoSlice().solution(A));
    }

    public int solution(int[] A) {
        // write your code in Java SE 8
        double minAvg = Integer.MAX_VALUE;
        int sliceIdx = -1;
        int aLen = A.length;
        for (int i = 0; i < aLen; i++) {
            double tmpAvg;
            if (i < aLen - 1) {
                tmpAvg = (A[i] + A[i + 1]) / 2.0;
                if (tmpAvg < minAvg) {
                    minAvg = tmpAvg;
                    sliceIdx = i;
                }
            }
            if (i < aLen - 2) {
                tmpAvg = (A[i] + A[i + 1] + A[i + 2]) / 3.0;
                if (tmpAvg < minAvg) {
                    minAvg = tmpAvg;
                    sliceIdx = i;
                }
            }
        }
        return sliceIdx;
    }
}

```

