public class Lesson5_PassingCars {
    public static void main(String[] args){
        /**
         * description  : Codility Lesson 5. PassingCars
         *                0과 1로 만들어진 쌍을 찾는다.
         *                * 다만 0이 나올 때, 앞의 index의 1을 가져오는 것이 아니라, 뒤의 index의 1로 (0, 1) 을 만든다.
         *
         * solution     : 1. A 배열의 값이 0인 경우, num + 1 를 해준다.
         *                  (값이 0이 나올 때, pair가 한 쌍씩 더 나올 수 있는 구조이기 때문)
         *                2. A 배열의 값이 1인 경우, result에 num을 더해준다.
         *                3. result를 리턴한다.
         *
         * complexity   : O(N)
         */
        int[] test = {0, 1, 0, 1, 1};

        System.out.println(solution(test));
    }

    public static int solution(int[] A){
        int num = 0;
        int result = 0;
        for(int i = 0 ; i < A.length; i++){
            if(A[i] == 0){
                num = num + 1;
            }else{
                result = result + num;
            }
        }

        return (result > 1000000000 || result < 0) ?  -1 : result;
    }
}
