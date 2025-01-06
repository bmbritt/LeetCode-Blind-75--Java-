/*
 * This solution uses a stack
 * to add opening parentheses as they appear,
 * then match closing parentheses with their
 * pair as they are encountered.
 * 
 * Time complexity is O(N).
 * Memory complexity is O(N).
 */



import java.util.HashMap;
import java.util.Stack;

class Solution {
    public boolean isValid(String s) {

        if (s.length() % 2 != 0) {
            return false;
        }

       Stack<Character> stack = new Stack<Character>();
       HashMap<Character, Character> map = new HashMap<Character, Character>();

       map.put(')', '(');
       map.put(']', '[');
       map.put('}', '{');

       for (int i = 0; i < s.length(); i++) {
        if (map.containsKey(s.charAt(i))) { 
            if (!stack.empty() && stack.peek() == map.get(s.charAt(i))) {
                stack.pop();
            } else {
                return false;
            }
        } else {
            stack.add(s.charAt(i));
        }
       }
       return stack.isEmpty();
    }
}