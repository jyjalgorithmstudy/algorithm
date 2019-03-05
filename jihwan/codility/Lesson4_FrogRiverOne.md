## Lesson4_FrogRiverOne

- Java

```java
public class FrogRiverOn {
    /**
     * 첫 위치가 0 인 개구리가 X까지 가기 위한 최소 시간을 구하는 문제이다.
     * 개구리가 X위치까지 도달하기 위해서는 1 부터 X까지의 모든 위치에 잎사귀가 위치해야 한다.
     * 단순히 생각해서 A배열(key :잎사귀가 도달하는 시간 value : 떨어지는 위치)을 순회하며
     * 1 ~ X까지 모든 잎사귀가 채워지는 순간이 정답이다.
     *
     * **/
    public int solution(int X, int[] A) {
        int minArrivalTime = Integer.MAX_VALUE;
        // 1 ~ X의 위치에 나뭇잎이 채워지는 최소 시간(최소 시간을 구해야하므로 MAX값을 주었다. 사실 안줘도 된다 습관..)
        int numOfLeaves = 0;
        // 중복되지 않게 잎사귀가 채워진 개수를 나타내는 변수이다.
        boolean[] existLeaves = new boolean[X+1];
        // 잎사귀가 특정 위치에 채워졌는지 확인하기위한 boolean 배열이다. (true : 이미 채워짐 , false : 아직 없음)
        int aLen = A.length;
        for(int i=0;i<aLen;i++){
            int leafPos = A[i];
            // 잎사귀가 아직 채워지지 않은 경우
            // 잎사귀가 해당 위치에 채워졌음을 표시한 뒤 , 떨어진 앞사귀 개수를 세어준다.
            if(existLeaves[leafPos]==false){
                existLeaves[leafPos]=true;
                numOfLeaves++;
                if(numOfLeaves==X){
                    //만약 중복되지 않게 잎사귀가 X개 떨어졌다면, 1 ~ X 까지 모두 채워졌음을 알 수 있다. (문제에서 제약조건으로 A의 범위는 1 ~ X)
                    minArrivalTime=i;
                    break;
                }
            }
        }
        // minArrvalTime 이 갱신되지 않았다면, 잎사귀가 정상적으로 채워지지 못했다는 의미이다. 따라서 -1 리턴
        minArrivalTime = minArrivalTime == Integer.MAX_VALUE ? -1 : minArrivalTime;
        return minArrivalTime;
    }
}
```