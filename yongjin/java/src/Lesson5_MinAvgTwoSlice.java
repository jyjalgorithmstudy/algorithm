public class Lesson5_MinAvgTwoSlice {
    public static void main(String[] args){
        /**
         * description  : Codility Lesson 5. MinAvgTwoSlice
         *
         * solution     : 수학적 명제 - 전체 그룹을 두 개의 그룹으로 나눠, 평균을 구하고 작은 그룹의 평균은 무조건 전체 그룹의 평균보다 작거나 같다.
         *                코드 상의 부분 그룹의 수가 2, 3인 것으로만 나누는 이유는 이 보다 큰 원소를 가지고 있는 그룹,
         *                예를 들어 원소의 갯수가 10개인 그룹도 부분 그룹으로 쪼개면 2개 또는 3개의 원소를 가지고 있는 그룹으로 나뉘게 되기 때문이다.
         *
         *                하위 문제로 나누어 풀어 최종 결과에 다가가는 부분이 마치 DP를 푸는 듯한 느낌을 주는 문제.
         *                (지환님께 도움 받음)
         *
         * complexity   : O(N)
         */
        int[] test = {4, 2, 2, 5, 1, 5, 8};

        System.out.println(solution(test));
    }

    public static int solution(int[] A){
        int idx = 0;
        double result = Integer.MAX_VALUE;

        for(int i = 0 ; i < A.length ; i++){
            if(i + 1 < A.length){
                if( result > (A[i] + A[i + 1]) / 2.0){
                    result = (A[i] + A[i + 1]) / 2.0 ;
                    idx = i;
                }
            }

            if(i + 2 < A.length){
                if( result > (A[i] + A[i + 1] + A[i + 2]) / 3.0){
                    result = (A[i] + A[i + 1] + A[i + 2]) / 3.0 ;
                    idx = i;
                }
            }
        }

        return idx;
    }
}
