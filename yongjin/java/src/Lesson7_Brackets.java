import java.util.Stack;

public class Lesson7_Brackets {
    /**
     * description  : Codility Lesson 7. Brackets
     *                Stack을 사용하여 {[()()]} 형태일때, 1을 반환.
     *
     * solution     : 1. Stack을 만든다.
     *                2. '(', '[', '{' 일 때, Stack에 Push.
     *                3. ')', ']', '}' 일 때, Stack에서 Pop.
     *                4. Stack에서 Pop한 값이 '(', '[', '{' 가 아니면 0을 반환.
     *                5. Stack에서 Pop한 값이 '(', '[', '{' 이면 계속해서 짝을 찾는다.
     *                6. 짝을 전부 찾았을 때, 스택이 비어있으면 1을 반환.
     *
     * complexity   : O(N)
     */
    public static void main(String[] args){
        String st1 = "{[()()]}";
        String st2 = "([)()]";
        System.out.println(solution(st1));
        System.out.println(solution(st2));
    }

    public static int solution(String S){
        Stack<Character> stack = new Stack();
        for(int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if(c == '(' || c == '[' || c == '{') {
                stack.push(S.charAt(i));
                continue;
            }

            if(stack.empty()) return 0;

            char ch = stack.pop();
            if(c == ')' && ch == '(') continue;
            else if(c == ']' && ch == '[') continue;
            else if(c == '}' && ch == '{') continue;
            else return 0;
        }

        if(stack.empty()) return 1;
        else return 0;

    }
}
