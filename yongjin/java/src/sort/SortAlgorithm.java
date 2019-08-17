package sort;

import java.util.Arrays;

public class SortAlgorithm {
    public static void main(String[] args) {
        int[] input = {6, 5, 2, 4, 1, 3, 7};
        /**
         * 선택정렬
         */
        selectionSort(input);
        System.out.println(Arrays.toString(input));
        /**
         * 버블정렬
         */
//        bubbleSort(input);
//        System.out.println(Arrays.toString(input));

        /**
         * 삽입정렬
         */
//        insertionSort(input);
//        System.out.println(Arrays.toString(input));
    }

    /**
     * 선택정렬
     * 기준이 되는 수와 나머지 수를 비교하여 작은 수를 앞으로 보낸다.
     */
    private static void selectionSort(int[] input) {
        int tmp;
        for (int i = 0; i < input.length - 1; i ++) {
            for (int j = i + 1; j < input.length; j ++) {
                if (input[i] > input[j]) {
                    tmp = input[j];
                    input[j] = input[i];
                    input[i] = tmp;
                }
            }
        }
    }

    /**
     * 버블정렬
     * n번째 인덱스와 n + 1번째 값 비교하여 큰 값을 뒤로 보낸다.
     */
    private static void bubbleSort(int[] input){
        int tmp;
        for (int i = 0 ; i < input.length; i ++) {
            for (int j = 0 ; j < input.length - i - 1; j ++) {
                if (input[j] > input[j + 1]) {
                    tmp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = tmp;
                }
            }
        }
    }

    /**
     * 삽입정렬
     * 기준이 되는 수와 앞의 수의 값 비교하여 앞에 큰 수가 있다면 큰 수를 뒤로 옮기고 기준이 되는 수를 삽입한다.
     */
    private static void insertionSort(int[] input){
        int tmp, j;
        for(int i = 1 ; i < input.length ; i ++) {
            tmp = input[i];
            for(j = i - 1 ; j >= 0 && input[j] > tmp; j --) {
                input[j + 1] = input[j];
            }
            input[j + 1] = tmp;
        }
    }
}
