## Lesson5_CountDiv

- JAVA

```java
package jihwan.codility;

public class CountDiv {
/*
	주어진 수 A,B,K에 대해서 A ~ B 중 K로 나누었을때 나머지가 0인 수의 개수를 구하는 문제이다.
	두 수 Num1, Num2에 대해서 Num1 / Num2 의 값은 1~Num1중 Num2를 K로 나누었을때 나머지가 0인 수의 개수와 같다.
	따라서 A ~ B 범위에서 K로 나누었을때 나머지가 0인 수의 개수를 구하기 위해
	B/K - A/K 에서
	만약 A가 K로 나누었을 때 나머지가 0일 경우 1을 추가한다.
	( (B/K + (A-1)/K)하면 안된다. 여기서 mod K해서 0이 되는 값..이므로 A=0 B=0 인 경우에 대해 고려하자. )
*/
  public int solution(int A, int B, int K) {
        int countDiv = 0;
        countDiv += B / K;
        countDiv -= A / K;
        if (A % K == 0) {
            countDiv += 1;
        }
        return countDiv;
    }
}

```

