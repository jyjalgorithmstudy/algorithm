import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Lesson6_Distinct {
    /**
     * description  : Codility Lesson 6. Distinct
     *                주어진 배열의 Distinct한 Value의 갯수를 구하는 문제.
     * 초기
     * solution     : 1. JAVA 8 Steam.distinct.count를 사용.
     *                2. 같은 방식으로 parallel로도 시도해 봄.
     * complexity   : 1-1 O(N*log(N)) or O(N) Performance tests 통과하지 못함. 3개 중, 1개 통과 못함.
     *                2-2 O(N*log(N)) or O(N) or O(N**2) 오히려 성능저하. 3개 중, 2개 통과 못함.
     */


    /**
     * 개선
     * solution     : 1. 자료구조 사용. (Set은 중복을 허용하지 않는다.)
     *                2. 주어진 배열를 순회하며 Set에 넣고 Set의 count를 반환.
     *
     * complexity   : O(N*log(N)) or O(N) 100%
     */
    public static void main(String[] args){
        int[] A = {2, 1, 1, 2, 3, 1};
        System.out.println(solution3(A));
    }

    public static int solution1(int[] A){
        return (int) Arrays.stream(A).distinct().count();
    }

    public static int solution2(int[] A){
        return (int) Arrays.stream(A).parallel().distinct().count();
    }

    public static int solution3(int[] A) {
        Set<Integer> tmpSet = new HashSet<>();

        for (int a : A) {
            tmpSet.add(a);
        }

        return tmpSet.size();
    }



}
