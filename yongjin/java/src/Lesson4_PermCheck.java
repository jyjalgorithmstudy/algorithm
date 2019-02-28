public class Lesson4_PermCheck {
    public static void main(String[] args){
        /**
         * description  : Codility Lesson 4. Lesson4_PermCheck
         *                배열의 값이 1부터 순차적으로 증가하는 원소들을 가지면 permutation 하다.
         *                permutation 하면, 1을 return 하고, 그렇지 않으면 0을 return 한다.
         *
         * solution     : 1. 배열의 원소가 배열의 길이 보다 큰 경우, 0을 return 한다.
         *                2. 새로운 배열(B)을 만들어 입력받은 배열(A)의 값 만큼 인덱스에 +1을 한다.
         *                3. B 배열의 값에 0 아닌 값(1)이 있으면 중복 값이 있다고 판단하고, 0을 return 한다.
         *
         * complexity   : O(N) or O(N * log(N))
         */
        int[] test1 = {4, 1, 3, 2};
        int[] test2 = {4, 1, 3};
        int[] test3 = {1};

        System.out.println(solution(test1));
    }

    public static int solution(int[] A){
        int[] B = new int [A.length + 1];

        for(int i = 0; i < A.length; i++){
            if(A[i] > A.length){
                return 0;
            }

            if(B[A[i]] != 0){
                return 0;
            }

            B[A[i]] += 1;
        }

        return 1;
    }
}

