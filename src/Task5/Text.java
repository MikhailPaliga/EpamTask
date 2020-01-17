package Task5;

import java.util.Stack;

public class Text {

    public boolean check(String randomString){
        Stack<Character> text = new Stack();
        for (int i = 0; i<randomString.length(); i++){
            char currentChar = randomString.charAt(i);
            if (currentChar == '(' || currentChar == '{' || currentChar == '['){
                text.push(randomString.charAt(i));
            }
            if (currentChar == ')' || currentChar == '}' || currentChar== ']')
            {
                if (text.isEmpty())
                    return false;
                char last = text.peek();
                if (currentChar == '}' && last == '{' || currentChar == ')' && last == '(' || currentChar == ']' && last == '[')
                    text.pop();
                else
                    return false;
            }

        }
        return text.isEmpty();
    }

}