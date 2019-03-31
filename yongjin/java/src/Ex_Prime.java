import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex_Prime {
    public static void main(String[] args) throws Exception{
        /**
         * solution : 소수구하기 (그냥 풀어봄)
         * description : 1. 소수 구하는 방법
         *                  1) 주어진 수 만큼 for문을 돌면서 1과 자기 자신을 제외한 수로 모두 나눠본 뒤, 소수를 판별한다.
         *                  2) 개선 - N의 약수는 N/2까지 확인해 보면 된다. 즉, N부터 sqrt(N)까지 나눠본 뒤, 소수를 판별한다.
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(solution1(n));
        System.out.println(solution2(n));

        br.close();
    }

    public static int solution1(int n){
        int cnt = 0;
        for (int i = 2; i < n; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if(isPrime) {
                cnt ++;
                System.out.print(i + " ");
            }
        }

        System.out.println();

        return cnt;
    }

    public static int solution2(int n){
        int cnt = 0;
        for(int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for(int j = 2; j <= Math.sqrt(i); j++) {
                if(i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if(isPrime) {
                cnt ++;
                System.out.print(i + " ");
            }
        }

        System.out.println();

        return cnt;
    }
}
