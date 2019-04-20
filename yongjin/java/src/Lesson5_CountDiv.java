public class Lesson5_CountDiv {
    /**
     * description  : Codility Lesson 5. CountDiv
     *                두 정수 A, B 사이의 값들 중, K로 나누어 떨어지는 숫자의 갯수 구하는 문제
     * 초기
     * solution     : 1. for문을 사용 A부터 B까지 순회
     *                 2. K로 나누어 떨어지는 경우에만 result++ 후 리턴
     *
     * complexity   : O(B-A) Performance tests 통과하지 못함. 50%
     */


    /**
     * 개선
     * solution     : 1. 수학 공식을 이용
     *                 2. A가 0인 경우, B / K + 1
     *                 3. A가 0이 아닌 경우, B / K - (A - 1) / K
     *
     * complexity   : O(1) 100%
     */
    public static void main(String[] args){
        System.out.println(solution2(6,11,2));
//        System.out.println(solution2(10,10,5));
    }

    public static int solution(int A, int B, int K){
        int result = 0;
        for(int i = A; i <= B; i++){
            if(i % K == 0){
                result ++;
            }
        }

        return result;
    }

    public static int solution2(int A, int B, int K){
        if(A == 0){
            return B / K + 1;
        }

        return B / K - (A - 1) / K;

    }
}
