# Lesson3_TapeEquilibrium

Time complexity  : 2N  =>  O(N)

1. 누적합을 계산해서 배열에 저장한다.  sumArr[i] := 0 ~ i 인덱스까지의 누적합 (TC : N)
2. 배열의 전체 합 - sumArr[i] 은  i+1이후의 인덱스를 갖는 배열의 총합과 같다.
3. 따라서 sumArr[i] 와 배열의 전체 합 - sumArr[i] 의 차이를 계산하여 가장 작은 값을 구하자.(TC : N)


- java

```java
public class TapeEquilibrium {
    public int solution(int[] A) {
        int minDiff = Integer.MAX_VALUE;
        int aLen = A.length;

        int[] sumArr = new int[aLen];
        int iterSum = 0; //결국엔 총합이 됨.
        for (int i = 0; i < aLen; i++){
            iterSum += A[i];
            sumArr[i] = iterSum;
        }

        // N 개일경우 0 , N 과 같이 한 part에 전부 몰리는 경우를 제외하기 위해 aLen -1는 제외한다.
       for(int i = 0; i < aLen - 1; i++){
            int beforePartSum = sumArr[i];
            int afterPartSum = iterSum - beforePartSum;
            int diff = Math.abs(beforePartSum - afterPartSum);
            minDiff = diff < minDiff ? diff : minDiff;
        }
        return minDiff;
    }
}
```

