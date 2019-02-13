## Lesson 2

### OddOccurrencesInArray



- Java

```java
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class OddOccurrencesInArray {

    class Solution{
        public int solution(int[] A){
            Map<Integer,Integer> numberMap = new HashMap<>();
            for(int num : A){
                int count = numberMap.getOrDefault(num,0);
                numberMap.put(num, count+1);
            }
            Set<Integer> numKeySet = numberMap.keySet();


            int unPairedNumber = 0;
            for(int num : numKeySet)
                if (numberMap.get(num) % 2 == 1) {
                    unPairedNumber = num;
                    break;
                }
            return unPairedNumber;
        }
    }
}


```





- Python

```python

```





- Javascript

```Javascript


```

