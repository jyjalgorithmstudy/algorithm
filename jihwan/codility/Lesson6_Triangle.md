## Lesson6_Triangle

- java

```java
import java.util.*;


public class Lesson6_Triangle {
    public int solution(int[] A) {
        /**
         * 1. 3개의 수를 선택했을 때, 임의의 2개의 수의 합이 나머지 수보다 커야한다. 따라서 연속된 3개의 숫자 중 해당 조건을 만족하는 3개의 수가 있다면, 연속하는 3개의 수이다.
         * 2. (P < Q < R)조건은 없는 조건이나 마찬가지이다. 선택 된 3개의 수 중 원래의 인덱스가 가장 작은수를 P, 순서대로 Q R 에 할당하면 된다.
         * */
        Arrays.sort(A);
        int aLen = A.length;
        for (int i = 0; i < aLen - 2; i++) {
            long sum = (long)A[i]+(long)A[i+1];
            long largestNum = A[i+2];
            if (sum > largestNum) {
                return 1;
            }
        }
        return 0;
    }
}

```

