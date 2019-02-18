import java.util.HashSet;
import java.util.Set;

public class Lesson2_OddOccurrencesInArray {
    public static void main(String[] args){
        /**
         * description  : Codility Lesson 2. OddOccurrencesInArray
         *               배열의 짝이 없는 수를 찾는 문제.
         * solution     : 1. Set 자료구조를 사용하여 값이 있는 경우, Set에서 제거
         *                2. 값이 없는 경우, Set에 넣어준다.
         *                3. 마지막 Set 남아 있는 값을 리턴한다.
         */
        int[] A = {9, 3, 9, 3, 9, 7, 9};

        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        Set<Integer> hs = new HashSet<>();
        for(int v : A) {
            if (hs.contains(v)) hs.remove(v);
            else hs.add(v);
        }

        return hs.iterator().next();
    }
}
