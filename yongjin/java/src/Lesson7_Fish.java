import java.util.Stack;

public class Lesson7_Fish {
    public static void main(String[] args){
        /**
         * description  : Codility Lesson 7. Fish
         *               N 마리의 물고기가 물길을 따라 움직이는데, 마지막 몇 마리가 생존해 있나를 구하는 문제.
         *              * A 배열은 물고기의 크기를 나타내는 배열, B 배열은 물고기의 방향을 나타내는 배열로
         *                B 배열이 1이면 물고기는 아래로 움직이고 0이면 위로 움직인다.
         *                물고기가 서로 만났을 때, 크기가 큰 물고기가 작은 물고기를 잡아먹게 되고, 최종으로 생존한 물고기의 수를 구하는 문제이다.
         *                1. 스택을 만든다.
         *                2. B 배열이 1이면 스택에 값을 저장한다.
         *                3. 스택에 저장여부와는 별개로 생존 물고기의 수는 한마리가 증가한다.
         *                4. 그렇지 않으면 스택이 비어있을 때까지 스택에서 값을 꺼내서 스택에 들어있는 값과 배열의 값을 비교한다.
         *                5. 배열의 값이 큰 경우 스택의 값을 Pop 시킨다.
         *                6. 배열의 값이 작은 경우는 루프를 그냥 빠져나온다.
         *                7. 5,6번의 경우 모두 두 물고기가 서로 만난 경우이므로 물고기의 수는 한 마리가 감소한다.
         */
//        int[] A = {4, 3, 2, 1, 5};
        int[] A = {4, 3, 5, 7, 6};

//        int[] B = {0, 1, 0, 0, 0};
        int[] B = {1, 1, 0, 0, 0};
        System.out.println(solution(A, B));
    }

    public static int solution(int[] A, int[] B) {
        int aliveFishCount = 0;
        Stack<Integer> downStreamFishes = new Stack<>();
        for (int i = 0; i < A.length; i++) {
            aliveFishCount++;
            if (B[i] == 1) {
                downStreamFishes.add(i);
            } else {
                while(!downStreamFishes.empty()) {
                    int index = downStreamFishes.peek();
                    aliveFishCount--;
                    if (A[i] > A[index]) {
                        downStreamFishes.pop();
                    } else {
                        break;
                    }
                }
            }
        }

        return aliveFishCount;
    }
}
