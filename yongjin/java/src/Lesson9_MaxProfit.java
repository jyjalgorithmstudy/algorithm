public class Lesson9_MaxProfit {
    public static void main(String[] args){
        /**
         * description  : Codility Lesson 9. MaxProfit
         *                배열의 구간에서 가장 큰 수익(가장 큰값 - 가장 작은값)을 찾아라.
         *
         * solution     : 1. 가장 작은 원소를 찾는다. (Min 함수를 통해)
         *                2. 가장 큰 수익을 구한다. (Max 함수를 통해 [기존 수익]과 [현재 값 - 최소 값]중 큰 것을 선택)
         *
         * complexity   : O(N)
         */
        int[] A = {23171, 21011, 21123, 21366, 21013, 21367};
        System.out.println(solution(A));
    }

    public static int solution(int[] A){
        if(A.length == 0 || A.length == 1){
            return 0;
        }

        int maxProfit = Integer.MIN_VALUE;
        int minProfit = Integer.MAX_VALUE;
        for (int share : A) {
            minProfit = Math.min(minProfit, share);
            maxProfit = Math.max(maxProfit, share - minProfit);
        }

        return maxProfit;
    }
}
