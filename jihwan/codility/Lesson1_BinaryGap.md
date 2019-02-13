## Lesson 1

### Binary Gap



- Java

```java
public class BinaryGap {
    public int solution(int N) {
        int maxGap = 0;
        int tmpGap = 0;

        String binaryNum = Integer.toBinaryString(N);
        for(int i = 0; i<binaryNum.length();i++){
            if(binaryNum.charAt(i)=='0'){
                tmpGap++;
            }else{
                maxGap = tmpGap < maxGap ? maxGap : tmpGap;
                tmpGap = 0;
            }
        }
        return maxGap;
    }
}

```





- Python

```python
def solution(N):
    max_gap = 0
    tmp_gap = 0
    binary_num = bin(N)[2:]
    for c in binary_num:
        if c == '0':
            tmp_gap += 1
        else:
            max_gap = max_gap if tmp_gap < max_gap else tmp_gap
            tmp_gap = 0
    return max_gap

```





- Javascript

```Javascript
function solution(N) {
   // write your code in JavaScript (Node.js 8.9.4)
    let maxGap = 0;
    let tmpGap = 0;
    const binaryNum = N.toString(2);
    for(let idx = 0; idx < binaryNum.length;idx++){
        if(binaryNum[idx] =='0'){
            tmpGap += 1;
        }else{
            maxGap = tmpGap < maxGap ? maxGap : tmpGap;
            tmpGap = 0;
        }
    }
    return maxGap;
}

```

