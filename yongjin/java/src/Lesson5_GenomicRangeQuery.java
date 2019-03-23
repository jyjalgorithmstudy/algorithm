import java.util.HashMap;

public class Lesson5_GenomicRangeQuery {
    public static void main(String[] args){
        /**
         * description  : Codility Lesson 5. GenomicRangeQuery
         *                주어진 두 배열의 substring 문자열을 돌면서 value 값이 가장 최소인 값들을 리턴하는 문제.
         *
         * solution     : 1. 이중 for문을 돈다. (Performance가 낮을 것이라 예상했지만, 일단 1차로 풀어 보았다.)
         *                2. 맵에 문제에서 주어진 ACGT를 맵핑해놓고
         *                3. substring 한 만큼 문자열을 돌면서 hash의 키값의 문자가 나오면
         *                4. 최소값을 찾아서 리턴한다.
         *
         * complexity   : O(N * M) Performance tests 통과하지 못함. 62%
         */
        int[] P = {2, 5, 0};
        int[] Q = {4, 5, 6};
        int [] result = solution("CAGCCTA", P, Q);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static int[] solution(String S, int[] P, int[] Q){
        int[] result = new int[Q.length];
        HashMap<Character, Integer> hm = new HashMap<>();

        hm.put('A', 1);
        hm.put('C', 2);
        hm.put('G', 3);
        hm.put('T', 4);
        String str;
        for(int i = 0; i < P.length; i++){
            str = S.substring(P[i], Q[i] + 1);
            int minValue = 0;
            char[] ch = str.toCharArray();
            for (int j = 0; j < ch.length; j++) {
                int tmp = hm.get(ch[j]);
                if(j == 0){
                    minValue = tmp;
                    continue;
                }

                if (minValue > tmp) {
                    minValue = tmp;
                }
            }
            result[i] = minValue;
        }

        return result;
    }
}
