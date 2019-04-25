## Lesson6_NumberOfDiscIntersections

performance부분에서 12%의 점수를 획득했다. [2019/04/21 SUN]

시간복잡도를 줄일 수 있는 방법을 더 고민해보자..

- java 

```java
import java.util.*;

public class NumberOfDiscIntersections {

    public static void main(String[] args) {
        int[] A = {1, 5, 2, 1, 4, 0};
        System.out.println(solution(A));
    }

    static Comparator<Circle> lComp = new Comparator<Circle>() {
        @Override
        public int compare(Circle c1, Circle c2) {
            return c1.left - c2.left;
        }
    };

    public static int solution(int[] A) {
        int aLen = A.length;

        int answer = 0;
        List<Circle> circleArr = new ArrayList<>();
        for (int i = 0; i < aLen; i++) {
            int left = i - A[i];
            int right = i + A[i];
            circleArr.add(new Circle(left, right));
        }
        Collections.sort(circleArr, lComp);
        for (int i = 0; i < aLen; i++) {
            int nowRight = circleArr.get(i).right;
            for (int j = i + 1; j < aLen; j++) {
                int targetLeft = circleArr.get(j).left;
                int targetRight = circleArr.get(j).right;
                if (nowRight < targetLeft) {
                    break;
                }
                if (targetLeft <= nowRight) {
                    answer++;
                    if (answer >= 10000000) {
                        return -1;
                    }
                }
            }
        }
        return answer;
    }


}

class Circle {
    int left;
    int right;

    public Circle(int left, int right) {
        this.left = left;
        this.right = right;
    }
}
```

