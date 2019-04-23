## Lesson7_Fish



문제의 조건에 따라 물고기는 위치, 방향(UP/DOWN), 몸집(Volumn)이 주어진다. 



```java
package jihwan.codility;

import java.util.*;

public class FlowingFishes {
    static int DOWN = 0;
    static int UP = 1;

    public static void main(String[] args) {

        int[] A = {4, 3, 2, 1, 5};
        int[] B = {0, 1, 0, 0, 0};
        System.out.println(new FlowingFishes().solution(A, B));
    }


    public int solution(int[] A, int[] B) {
        int fishCount = A.length;
        Stack<Fish> fishStack = new Stack<>();
        for (int i = 0; i < fishCount; i++) {
            Fish fish = new Fish(A[i], B[i]);
            if (fishStack.isEmpty()) {
                fishStack.push(fish);
            } else if (fish.dir == UP) {
                fishStack.push(fish);
            } else {
                //fish.dir == DOWN
                /** 핵심 로직.**/
                while (!fishStack.isEmpty() && fishStack.peek().dir == UP) {
                    Fish topPosFish = fishStack.peek();
                    if (topPosFish.volumn < fish.volumn) {
                        fishStack.pop();
                    } else {
                        break;
                    }
                }
                if (fishStack.isEmpty() || fishStack.peek().dir == DOWN) {
                    fishStack.push(fish);
                }
            }
        }

        return fishStack.size();
    }


    class Fish {
        int volumn;
        int dir;

        public Fish(int volumn, int dir) {
            this.volumn = volumn;
            this.dir = dir;
        }
    }
}

```

