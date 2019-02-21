# Lesson3_PermMissingElem

연산 횟수  : N +1 회

1. 미리 1 ~ n+1까지의 합을 구한다
2. 합에서 A배열 속에 주어진 숫자를 마이너스 연산해주면 최종적으로 sum 변수가 1 ~ N+1 중 없는 값이다. 



- java

```java
class PermMissingElem {
    public int solution(int[] A) {
        // write your code in Java SE 8
        long len = A.length;
        long sum = ((len+1)*(len+2))/2;
        for(long num : A){
            sum -= num;
        }
        return (int)sum;
    }
}
```

