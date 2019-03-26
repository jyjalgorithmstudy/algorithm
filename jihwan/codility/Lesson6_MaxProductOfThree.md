## Lesson6_MaxProductOfThree

- java

```java
import java.util.Arrays;

public class MaxProductOfThree {
    public int solution(int[] A) {
        int aLen = A.length;
        Arrays.sort(A);
        int answer = 0; // - 와 0을 고려
        int rightSum = A[aLen-3]*A[aLen-2]*A[aLen-1];
        int leftSum = A[0]*A[1]*A[aLen-1];
        answer = leftSum < rightSum ? rightSum : leftSum;
        return answer;
    }
}
```

