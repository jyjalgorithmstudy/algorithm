## Lesson7_StoneWall



```java
package jihwan.codility;

import java.util.Stack;

public class StoneWall {
    public int solution(int[] H) {
        // write your code in Java SE 8
        int answer = 0;
        Stack<Integer> stk = new Stack<>();
        for (int height : H) {
            if (stk.isEmpty()) {
                stk.push(height);
            } else if (stk.peek() < height) {
                stk.push(height);
            } else if (stk.peek() == height) {
                continue;
            } else {
                //stk.peek() > height
                while (!stk.isEmpty() && stk.peek() > height) {
                    answer++;
                    stk.pop();
                }
                if (stk.isEmpty() || stk.peek() != height) {
                    stk.push(height);
                }
            }
        }
        answer += stk.size();
        return answer;
    }
}

```

