## N-Queen

- java

```java
package jihwan.baekjoon;

import java.util.*;

public class Nqueen {

    static int answer = 0;
    static List<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            depthFirstSearch(0, i, N);
        }
        System.out.println(answer);
    }

    public static void depthFirstSearch(int row, int col, int N) {
        list.add(col);
        if (list.size() == N) {
            answer++;
        } else {
            for (int i = 0; i < N; i++) {
                boolean check = validCheck(row + 1, i);
                if(check){
                    depthFirstSearch(row+1,i,N);
                }
            }
        }
        list.remove(list.size()-1);
    }
    public static boolean validCheck(int row,int col){
        for(int listRow = 0; listRow<list.size();listRow++){
            int listCol = list.get(listRow);
            if(listCol == col || Math.abs(listCol - col) == Math.abs(listRow - row)){
                return false;
            }
        }
        return true;
    }
}


```

