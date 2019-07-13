public class Lesson10_CountFactors {
    public static void main(String[] args){
        /**
         * description  : Codility Lesson 10. CountFactors
         *                약수 구하기
         *
         * solution     : 1. Performance를 위해 N의 Sqrt까지만 루프를 돌린다.
         *                2. sqrtN * sqrtN == N 이면 count * 2에 - 1를 하고 리턴한다.
         *                3. 그렇지 않으면 count * 2를 리턴한다.
         *                ex) 9는 1, 3, 3, 9 즉, return 3
         *
         * complexity   : O(sqrt(N))
         */
        System.out.println(solution(10));
        System.out.println(solution(24));
    }

    public static int solution(int N){
        int sqrtN = (int) Math.sqrt(N);
        if(N == 1) return 1;
        int factorCnt = 0;
        for(int i = 1; i <= sqrtN; i++){
            if(N % i == 0){
                factorCnt++;
            }
        }

        return (sqrtN * sqrtN == N) ? (factorCnt * 2) - 1 : (factorCnt * 2);
    }
}
