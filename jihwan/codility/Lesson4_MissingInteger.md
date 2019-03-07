## Lesson4_MissingInteger

- java

```JAVA
import java.util.*;

public class MissingInteger {
    public int solution(int[] A) {

        /**
         *
         * Sort 1회 , 탐색 1회 이상 하면 TimeOut (performence 부분에서 굉장히 까다로웠다.)
         *
         * 주말에 주석 정리하자 너무 드릅다..
         * CASE1. 정렬 후 최대값이 0보다 작거나 같다면
         *      return 1
         * CASE2. 정렬된 값 중 최초로 발견된 0보다 큰 정수가 1보다 크다면
         *      return 1
         * CASE3. 최초로 0보다 큰 수를 minValue에 저장한 뒤, 차례대로 비교하여 차이가 1보다 큰 경우
         *      return (현재의 minValue) + 1
         * CASE4. 모든 수가 1부터 차례대로 존재할 경우
         *      return A.length + 1
         * **/
        Arrays.sort(A);
        int aLen = A.length;
		
      //CASE 1
        if (A[aLen - 1] <= 0) {
            return 1;
        }

        int idx = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0) {
                idx = i;
                break;
            }
        }
      	
      //CASE 2
        if(A[idx]>1){
            return 1;
        }
      //CASE 3
        int minValue = A[idx];
        for (int i = idx + 1; i < A.length; i++) {
            if (A[i] - minValue <= 1) {
                minValue = A[i];
            } else {
                return minValue+1;
            }
        }
      //CASE 4
        return A[aLen-1]+1;
    }
}

```

