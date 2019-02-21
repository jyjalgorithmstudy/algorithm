public class Lesson2_CyclicRotation {
    public static void main(String[] args){
        /**
         * description  : Codility Lesson 2-2. CyclicRotation
         *
         * solution     : 1. 배열의 rotation은 결국 (K % 배열의 크기) 만큼 rotation 한다.
         *                2. 따라서 K % tmp.length를 하되, 여러 원소를 rotation 해야 하므로, (i + K) % tmp.length를 한다.
         */
        int[] A = {3, 8, 9, 7, 6};
        int K   = 3;

        int[] test = solution(A, K);
        for (int i = 0; i < test.length; i++){
            System.out.print(test[i]);
        }

        System.out.println(solution(A, K));
    }

    public static int[] solution(int[] A, int K){

        int[] tmp = new int[A.length];

        for(int i = 0 ; i < A.length ; i++){
            tmp[(i + K) % tmp.length] = A[i];
        }

        return tmp;

    }
}
