public class Lesson4_FrogRiverOne {
    public static void main(String[] args){
        /**
         * description  : Codility Lesson 4. FrogRiverOne
         *                개구리가 X까지 가는 최소의 시간(인덱스)을 구하는 문제.
         *
         * solution     : 1. X 크기의 boolean 배열을 선언한다.
         *                2. A 배열을 돌면서 A[i] 보다 X가 크거나 같다면
         *                3. 개구리가 이미 도착한 길이면 cnt++를 하고 이미 도착했다고 boolean 배열의 값을 true로 바꿔준다.
         *                4. cnt와 X가 같다면 return 한다.
         *
         * complexity   : O(N)
         */
        int[] A = {1, 3, 1, 4, 2 ,3, 5, 4};
        System.out.println(solution(3, A));
        System.out.println(solution(5, A));
    }

    public static int solution(int X, int[] A){

        boolean[] isArrived = new boolean[X];

        int cnt = 0;
        for(int i = 0; i < A.length; i++){
            if(A[i] <= X){
                if(isArrived[A[i] - 1]) {
                    continue;
                }

                cnt++;
                isArrived[A[i] - 1] = true;
            }

            if(cnt == X){
                return i;
            }
        }

        return -1;
    }
}
