# Lesson3_FrogJmp

- java

```java
public class FrogJmp {
    public int solution(int X, int Y, int D) {
        // write your code in Java SE 8
        /*
        X : 현재 위치
        Y : 목적지
        Z : 한번에 뛸 수 있는 거리
        distance = Y - X : 목적지까지의 거리
        jumpCount = 목적지를 넘기위한 점프 횟수

        * */
        int distance = Y - X;
        int jumpCount = 0;
        jumpCount += (distance / D);
        jumpCount = (distance - jumpCount*D) > 0 ? jumpCount +1 : jumpCount;
        return jumpCount;
    }
}
```

