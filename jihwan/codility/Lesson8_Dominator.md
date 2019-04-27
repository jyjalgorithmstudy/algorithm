## Lesson8_Dominator



```java
import java.util.*;

public class Dominator {
    public int solution(int[] A) {
        double halfCount = A.length / 2.0;
        Map<Integer, Element> countMap = new HashMap<>();

        for(int i=0;i<A.length;i++){
            int index = i;
            int key = A[i];
            Element value  = countMap.getOrDefault(key,new Element(0,index));
            value.count = value.count+1;
            countMap.put(key,value);
        }


        Set<Integer> numSet = countMap.keySet();
        for (int key : numSet) {
            if (halfCount < countMap.get(key).count) {
                return countMap.get(key).index;
            }
        }
        return -1;
    }
    class Element {
        double count;
        int index;

        public Element(double count, int index) {
            this.count = count;
            this.index = index;
        }
    }

}

```

