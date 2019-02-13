public class Lesson1_BinaryGap {
    public static void main(String[] args){
        /**
         * description  : Codility Lesson 1. BinaryGap
         *                2진수로 변환했을 때, 1과 1 사이 0의 수가 가장 최대인 것을 반환하는 문제.
         * solution     : 1. 1과 1 사이의 0만 카운트 할 수 있도록, isStart 변수를 선언한다.
         *                2. 입력한 수(N)가 0보다 클 동안 2로 나눈다.
         *                3. N이 1인 경우, 1과 1 사이의 0이므로 카운트를 한다.
         *                4. max 변수를 선언하여, zeroCnt 변수와 최대값을 비교하여 최대값을 반환한다.
         */
        System.out.println(solution(32 ));
        System.out.println(solution(1041 ));
        System.out.println(solution(529 ));
        System.out.println(solution(9 ));
    }

    public static int solution(int N) {
        Boolean isStart  = false;
        int zeroCnt = 0;
        int max = 0;

        while(N > 0){

            if(N % 2 == 1){
                isStart = true;

                if(zeroCnt > max){
                    max = zeroCnt;
                }

                zeroCnt = 0;

            }else if(isStart){
                zeroCnt++;
            }

            N = N / 2;
        }

        return max;
    }
    /*
     bitmask version

     public static int solution(int N) {
        Boolean isStart = false;
        int zeroCnt = 0;
        int max = 0;

        int bitmask = 1;

        while (N > bitmask) {

            if ((N & bitmask) == bitmask) {
                isStart = true;

                if (zeroCnt > max) {
                    max = zeroCnt;
                }

                zeroCnt = 0;

            } else if (isStart) {
                zeroCnt++;
            }

            bitmask *= 2;
        }

        return max;
    }
    * */
}
