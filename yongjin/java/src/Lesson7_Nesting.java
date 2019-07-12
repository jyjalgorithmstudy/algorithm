import java.util.Stack;

public class Lesson7_Nesting {
    public static void main(String[] args){
        /**
         * description  : Codility Lesson 7. Nesting
         *                Stack을 사용하여 '(()(())())' 형태가 모두 가로로 둘러쌓여 있으면 1을 반환, 그렇지 않으면 0을 반환.
         *
         * solution     : 1. Stack을 만든다.
         *                2. '(' 이면 Stack에 쌓는다.
         *                3. ')' 이면 Stack이 비어있다면 0을 반환, 그렇지 않으면 Stack에서 Pop.
         *                4. 모든 Character 배열을 조회하고, Stack이 비어있다면 1을 반환, 그렇지 않으면 0을 반환한다.
         *
         * complexity   : O(N)
         */

        String string1 = "(()(())())";
        String string2 = "())";

        System.out.println(solution(string1));
        System.out.println(solution(string2));
    }

    public static int solution(String S) {
        Stack<Character> stack = new Stack<>();
        char[] characters = S.toCharArray();
        for (Character character : characters) {
            if(character == '('){
                stack.push(character);
            }

            if(character == ')'){
                if(stack.empty()){
                    return 0;
                }

                stack.pop();
            }
        }

        return (stack.empty()) ? 1 : 0;
    }
}
