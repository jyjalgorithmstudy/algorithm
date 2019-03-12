## Lesson4_MaxCounters

- Java

```java
import java.util.HashMap;
import java.util.Map;

public class MaxCounter {
    public static void main(String[] args) {

        int[] A = {3, 4, 4, 6, 1, 4, 4};
        int N = 5;
        int[] answer = new MaxCounter().solution(N,A);
        for(int num : answer){
            System.out.println(num);
        }
    }

    public int[] solution(int N, int[] A) {
        // maxCounter(N+1) 가 등장하면, 전체 배열의 값이 배열의 원소중 최대값이 된다.
        // * 따라서 maxCounter가 등장하면, 기존에 존재했던 count는 의미가 없다.(전체 값이 maxValue로 같아진다.)*
        // 따라서 기존의 maxValue를 beforeMaxValue에 저장 시킨 뒤, default값을 beforeMaxValue로 설정하자.(전체 배열을 순회하지 X)
        int maxValue = 0;
        int beforeMaxValue = 0;
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : A) {
            if (num == N + 1) {
                beforeMaxValue = maxValue;
                countMap.clear();
            } else {
                int count = countMap.getOrDefault(num, beforeMaxValue);
                countMap.put(num, count + 1);
                maxValue = maxValue < count + 1 ? count + 1 : maxValue;
            }
        }

        int[] answer = new int[N];
        for(int i=0;i<N;i++){
            int value = countMap.getOrDefault(i+1,beforeMaxValue);
            answer[i] = value;
        }


        return answer;
    }

}
```

