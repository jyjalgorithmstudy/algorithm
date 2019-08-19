public class Lesson10_MinPermeterRectangle {

    public static void main(String[] args){
        /**
         * description  : Codility Lesson 10-2. MinPermeterRectangle
         *
         * solution     : 1. 주어진 N을 index로 나누었을 때, 0이 되는 경우만 생각한다.
         *                2. 2 * (A + B) 공식의 최소값을 구한다.
         */
        System.out.println(solution(30));
    }

    public static int solution(int N) {
        int minPerimeter  = Integer.MAX_VALUE;
        for(int i = 1; i * i <= N; i++){
            if(N % i == 0){
                minPerimeter = Math.min(minPerimeter, 2 * (N / i + i));
            }
        }

        return minPerimeter;
    }

}
