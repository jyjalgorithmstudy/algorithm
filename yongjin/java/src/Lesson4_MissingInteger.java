public class Lesson4_MissingInteger {
    public static void main(String[] args){
        /**
         * description  : Codility Lesson 4. MissingInteger
         *                음수, 양수가 포함되어 있는 Integer 배열에서 가장 작은 양수 Integer를 반환하는 문제.
         *
         * solution     : 1. 조건 범위 만큼의 B 배열을 선언한다.
         *                2. A(주어진) 배열의 값을 B 배열의 index로 하여, 값에 +1을 한다.(단, A 배열의 값이 양수인 경우만)
         *                3. B 배열을 1부터 시작하여 값이 0인 경우 값을 반환한다.
         *                4. B 배열의 값이 모두 0이 아닌 경우는 B 배열의 길이를 반환한다.
         *
         * complexity   : O(N) or O(N * log(N))
         */
        int[] A = {1, 3, 6, 4, 1, 2};
        int[] B = {-1, -3};
        int[] C = {1, 2, 3};
        int[] D = {1, 1000};

        System.out.println(solution(A));
        System.out.println(solution(B));
        System.out.println(solution(C));
        System.out.println(solution(D));
    }

    public static int solution(int[] A){
        int[] B = new int[2000000];
        for(int i = 0; i < A.length; i++){
            if(A[i] > 0){
                B[A[i]]++;
            }
        }

        for(int i = 1; i < B.length; i++){
            if(B[i] == 0){
                return i;
            }
        }

        return B.length;
    }
}
