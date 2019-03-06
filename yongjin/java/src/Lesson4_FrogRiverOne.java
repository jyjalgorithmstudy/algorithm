import java.util.HashSet;
import java.util.Set;

public class Lesson4_FrogRiverOne {
    public static void main(String[] args){
        /**
         * description  : Codility Lesson 4. FrogRiverOne
         *                개구리가 X까지 가는 최소의 시간(인덱스)을 구하는 문제.
         *
         * solution     : 1. Hash set을 선언한다.
         *                2. for를 돌면서 set에 넣어준다.
         *                3. set의 크기가 X와 같으면, index를 반환한다.
         *                4. 배열 끝까지 반환하지 못하면 -1를 반환한다.
         *
         * complexity   : O(N)
         */
        int[] A = {1, 3, 1, 4, 2 ,3, 5, 4};
        System.out.println(solution(5, A));
        System.out.println(solution(1, A));
    }

    public static int solution(int X, int[] A){
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < A.length; i++){
            set.add(A[i]);
            if(set.size() == X) {
                return i;
            }
        }
        return -1;
    }
}
