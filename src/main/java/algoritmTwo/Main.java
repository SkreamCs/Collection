package algoritmTwo;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String text, textTwo;
        text = "[({})]";
        textTwo = "[(){}";
        analysis(text);
        analysis(textTwo);
    }

    private static void analysis(String text) {
        Deque<Character> brackets = new ArrayDeque<>();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (text.charAt(i) == '[' || text.charAt(i) == '{' || text.charAt(i) == '(') {
                brackets.push(text.charAt(i));
            } else if (ch == ')' && brackets.peek() == '(' ||
                    ch == ']' && brackets.peek() == '[' ||
                    ch == '}' && brackets.peek() == '{') {
                brackets.pop();
            }
        }
        if (!brackets.isEmpty()) {
            System.out.println("Скобки не закрыты" + " " + brackets);
        } else System.out.println("Корректно");
    }
}
