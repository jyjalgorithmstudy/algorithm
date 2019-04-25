## Lesson7_Brackets



```java
package jihwan.codility;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Brackets {
    public int solution(String S) {
        int isProperlyNestedBracket = 1;
        Map<Character, Character> bracketMap = buildBracketPairMap();

        Stack<Character> charStack = new Stack<>();
        int sLen = S.length();
        for (int i = 0; i < sLen; i++) {
            char bracket = S.charAt(i);
            if (isOpenBracket(bracket)) {
                charStack.push(bracket);
            } else {
                char pairedBracket = bracketMap.get(bracket);
                if (!charStack.isEmpty() && charStack.peek() == pairedBracket) {
                    charStack.pop();
                } else {
                    isProperlyNestedBracket = 0;
                    break;
                }
            }
        }

        isProperlyNestedBracket = charStack.isEmpty() ? isProperlyNestedBracket : 0;
        return isProperlyNestedBracket;
    }


    public static boolean isOpenBracket(char bracket) {
        if (bracket == '(' || bracket == '{' || bracket == '[') {
            return true;
        }
        return false;
    }

    public static HashMap<Character, Character> buildBracketPairMap() {
        HashMap<Character, Character> bracketMap = new HashMap<>();
        bracketMap.put(')', '(');
        bracketMap.put('}', '{');
        bracketMap.put(']', '[');
        return bracketMap;
    }
}

```

