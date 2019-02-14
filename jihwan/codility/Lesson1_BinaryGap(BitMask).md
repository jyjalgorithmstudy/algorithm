## Lesson1_BinaryGap(BitMask)

- java

```java
   public static int solution(int N) {
        Boolean isStart = false;
        int zeroCnt = 0;
        int max = 0;

        long bitmask = 1;

        while (N > bitmask) {

            if ((N & bitmask) == bitmask) {
                isStart = true;

                if (zeroCnt > max) {
                    max = zeroCnt;
                }

                zeroCnt = 0;

            } else if (isStart) {
                zeroCnt++;
            }
            bitmask <<= 1;
        }
        return max;
    }
```

