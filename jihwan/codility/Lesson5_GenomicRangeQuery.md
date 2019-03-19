## Lesson5_GenomicRangeQuery

- Java

```java
package jihwan.codility;

import java.util.*;

public class GenomicRangeQuery {
    /**
     * 
     * A : 1(typeNumber)
     * C : 2
     * G : 3
     * T : 4
     * countArray[idx][typeNumber] : 0 ~ idx 에서 typeNumber가 등장한 횟수를 저장하는 배열
     * P, Q 가 각각 2, 3 이라고 가정하고,
     * 주어진 P, Q 범위에서 가장 작은 typeNumber를 찾아보자.
     * countArray[Q][1] - countArray[P-1][1] 은 P ~ Q범위에 등장한 A(1)의 횟수를 의미한다.
     * 마찬가지로 countArray[Q][4] - countArray[P-1][4]는 P ~ Q범위에 등장한 T(4)의 횟수를 의미한다.
     * 따라서 아래와 같은 로직으로 주어진 범위내에서 가장 작은 typeNumber를 찾자.
     * typeNumber 1 to 4
     *     if(countArray[Q][typeNumber] - countArray[P-1][typeNumber] > 0)
     *	       then minTypeNumber = typeNumber and break
     *
     * 요새 일 + 자소서 + 공부 하느라 로직을 신경써서 못짜고있네요 죄송합니다 ㅠ
     */
    public static void main(String[] args) {
        String S = "AC";
        int[] P = {0, 0, 1};
        int[] Q = {0, 1, 1};
        int[] answer = solution(S, P, Q);
        for (int n : answer) {
            System.out.println(n);
        }

    }

    public static int[] solution(String S, int[] P, int[] Q) {
        int strLen = S.length();
        int typeCnt = 4;
        Map<Character,Integer> typeMap = buildTypeMap();
        int[][] countArray = new int[strLen + 1][typeCnt + 1]; //padding 한칸씩.

        for (int i = 0; i < strLen; i++) {
            char c = S.charAt(i);
            int typeNumber = typeMap.get(c);
            countArray[i][typeNumber]++;
            countArray[i+1]=Arrays.copyOf(countArray[i],typeCnt+1);
        }


        int queryCnt = P.length;
        int[] answer = new int[queryCnt];

        for (int queryIdx = 0; queryIdx < queryCnt; queryIdx++) {
            int beginIdx = P[queryIdx];
            int endIdx = Q[queryIdx];
            for (int num = 1; num <= typeCnt; num++) {
                if (beginIdx == 0) {
                    if (countArray[endIdx][num] > 0) {
                        answer[queryIdx] = num;
                        break;
                    }
                } else {
                    if (countArray[endIdx][num] - countArray[beginIdx - 1][num] > 0) {
                        answer[queryIdx] = num;
                        break;
                    }
                }
            }
        }
        return answer;
    }

    public static Map<Character,Integer> buildTypeMap() {
        Map<Character,Integer> typeMap = new HashMap<>();
        typeMap.put('A',1);
        typeMap.put('C',2);
        typeMap.put('G',3);
        typeMap.put('T',4);
        return typeMap;
    }
}
```
