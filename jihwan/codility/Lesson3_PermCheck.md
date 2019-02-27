# Lesson3_PermCheck

- java

```java
import java.util.HashMap;
import java.util.Map;

/**
 *
 * problem description : 주어진 배열이 permutation 이 되려면 1 ~ A.length 까지의 숫자가 1회씩만 등장해야한다.
 * solution : 전체 합을 구한 뒤 주어진 숫자의 합과 동일한지 비교하려 했지만, 숫자 범위가 1 ~ 10^6 이므로 이 방법은 불가능하다.(BigInteger 를 꼭 사용해야함)
 *            따라서 HashMap 구조를 사용하여 1 ~ A.length 값이 1번씩만 주어지는지 확인하며,
 *            1. domain 에서 벗어날 때 (A.length보다 큰 값이 주어질 때)
 *            2. 같은 값이 중복해서 존재하는 경우
 *            위의 2가지에 대해 확인하여 permutation 여부를 체크하자.
 *
 * **/
public class PermCheck {
    public int solution(int[] A) {
        int aLen = A.length;
        Map<Integer,Boolean> overlapNumberCheckMap = new HashMap<>();
        for(int num : A){
            boolean isAlreadyExist = overlapNumberCheckMap.getOrDefault(num,false);
            if(isAlreadyExist || num > aLen) {
                return 0; // not Perm
            }
            else{
                overlapNumberCheckMap.put(num,true);
            }
        }
        return 1;
    }
}

```

