## Lesson5_PassingCars

- Java

```java
public class PassingCars {
    public int solution(int[] A) {
        /**
         0 : ->
         1 : <-
         goal : count passing cars (P,Q) 0 ≤ P < Q < N,
         A 배열의 뒤부터 순회하며 좌측으로 이동하는 차의 개수를 누적합으로 leftDirCnt에 저장한다.
         A 배열을 처음부터 순회하며 우측으로 이동하는 차량의 경우에(배열 값이 0 인 경우)
         해당 시점에서 좌측으로 이동하는 차량의 개수(leftDirCnt[i])를 countPassingCars에 더해준다.

         Time Complexity : 2n -> O(n)

         항상 . overflow를 생각하며 프로그래밍하자..
         **/
        long countPassingCars = 0 ;
        int aLen = A.length;
        int leftDirCnt = 0;
        int[] leftDirSum = new int[aLen];
        for(int i = aLen -1;i>=0;i--){
            if(A[i] == 1){
                leftDirCnt++;
            }
            leftDirSum[i] = leftDirCnt;
        }
        for(int i = 0; i < aLen; i++){
            if(A[i] == 0){
                countPassingCars += leftDirSum[i];
            }
        }
        if(countPassingCars > Math.pow(10,9)) {
            return -1;
        }
        return (int)countPassingCars;
    }
}

```