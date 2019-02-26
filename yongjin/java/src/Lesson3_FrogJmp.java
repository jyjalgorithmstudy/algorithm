public class Lesson3_FrogJmp {
    public static void main(String[] args){
        System.out.println(solution(10, 85, 30));
    }

    public static int solution(int X, int Y, int D){
        /**
         * description  : Codility Lesson 3. FrogJmp
         *               X에서 Y까지 점프를 하여 이동한다. Y에 도착하거나 Y를 넘어서는 가장 적은 점프의 횟수를 구하는 문제.
         * solution     : 1. X와 Y가 동일한 좌표인 경우 점프 횟수가 필요 없으므로 0을 반환한다.
         *                2. X - Y(남은 거리)에 나머지와 몫을 구한다.
         *                3. 나머지가 0인 경우, Y에 도착한 경우로 몫을 리턴한다.
         *                4. 나머지가 0이 아닌 경우, Y를 넘어선 경우이므로 몫 + 1를 리턴한다.
         */
        int leftDistance = Y - X;
        if(leftDistance == 0){
            return leftDistance;
        }

        int remainder = leftDistance % D;
        int result = leftDistance / D;

        return (remainder == 0) ? result : result + 1;
    }
}
