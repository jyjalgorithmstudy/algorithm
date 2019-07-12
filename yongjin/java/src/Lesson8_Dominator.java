import java.util.HashMap;

public class Lesson8_Dominator {

    public static void main(String[] args){
        /**
         * description  : Codility Lesson 8. Dominator
         *                배열의 원소중에 과반수가 넘는 원소가 있으면 그 원소 중 하나의 인덱스를 반환, 아니라면 -1를 반환
         *
         * solution     : 1. HashMap 만든다.
         *                2. Map에 Key로 원소를 Value로 count를 저장한다.
         *                3. maxNumberCount 변수를 지정하여, 원소의 Value가 가장 많은 갯수를 저장한다. 이때, Index도 저장한다.
         *                4. maxNumberCount (A 배열의 가장 많은 Value의 누적 갯수 중)가 ,과반수 이상의 카운트를 가지면 Index를 리턴한다.
         *                5. 그렇지 않으면 -1를 리턴한다.
         *
         * complexity   : O(N*log(N)) or O(N)
         */
        int[] A = {3, 4, 3, 2, 3, -1, 3, 3};
        System.out.println(solution(A));
    }

    public static int solution(int[] A){
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int maxNumberCount = -1;
        int result = -1;
        for (int i = 0 ; i < A.length; i++){
            int number = A[i];
            if(hashMap.get(number) == null){
                hashMap.put(number, 1);
            }else{
                hashMap.put(number, hashMap.get(number) + 1);
            }

            if(hashMap.get(number) > maxNumberCount){
                maxNumberCount = hashMap.get(number);
                result = i;
            }
        }

        if(maxNumberCount > A.length / 2){
            return result;
        }

        return -1;
    }
}
