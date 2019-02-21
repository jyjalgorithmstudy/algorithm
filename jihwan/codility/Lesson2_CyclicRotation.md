# Lesson2_CyclicRotation



- java



```java
public class CyclicRotation {
    public int[] solution(int[] A, int K) {

        if(A.length == 0){
            return A;
        }

        int aListLen = A.length;
        K %= aListLen;
        int[] answerList = new int[aListLen];
        for(int i = 0; i < aListLen-K; i++){
            answerList[K+i] = A[i];
        }
        for(int i = 0; i < K; i++){
            answerList[i] = A[aListLen - K + i];
        }

        return answerList;
    }
```

