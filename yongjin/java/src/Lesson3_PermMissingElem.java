public class Lesson3_PermMissingElem {
    public static void main(String[] args){
        /**
         * description  : Codility Lesson 3. PermMissingElem
         *               배열의 값은 1부터 N + 1 까지 증가하고, 값은 뒤죽박죽 섞여있다. 이 중 빠진 value가 있는데 이를 찾는 문제.
         * solution     : 1. 이중 포문으로 풀지 않기 위해서 즉, O(N)으로 풀기 위해 새로운 배열을 선언하는 방법으로 접근하였다.
         *                2. A 배열(입력받은 배열)의 value를 B 배열(새로운 배열)의 인덱스로 두고 value 값을 1로 넣는다.
         *                3. B 배열의 1번째 부터 조회하면서 value가 0인 인덱스의 값을 반환한다.
         */
        int[] A = {2, 3, 1, 5};

        System.out.println(solution(A));
    }

    public static int solution(int[] A){
        int[] B = new int[A.length + 2];
        int result = 0;
        for(int i = 0; i < A.length; i++){
            B[A[i]] = 1;
        }

        for(int i = 1; i < B.length; i++){
            if(B[i] == 0){
                result = i;
            }
        }

        return result;
    }
}
