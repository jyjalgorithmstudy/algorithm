## Lesson6_Distinct

- java

```java
import java.util.HashSet;
import java.util.Set;

public class Distinct {
    public int solution(int[] A) {
        Set<Integer> numSet = new HashSet<>();
        for(int num : A){
            numSet.add(num);
        }
        return numSet.size();
    }
}
```

