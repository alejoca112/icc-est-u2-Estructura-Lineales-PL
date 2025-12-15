package utils;

import java.util.LinkedList;
import java.util.Queue;

public class QueueUtils {

    public boolean isPalindrome(String input) {
        Queue<Character> queueOriginal = new LinkedList<>();
        Queue<Character> queueInverted = new LinkedList<>();

        for (int i = 0; i < input.length(); i++) {
            queueOriginal.add(input.charAt(i));
        }
        for (int i = input.length() - 1; i >= 0; i--) {
            queueInverted.add(input.charAt(i));
        }

        while (!queueOriginal.isEmpty()) {
            if (queueOriginal.remove() != queueInverted.remove()) {
                return false;
            }
        }

        return true;   //Verifica si es un palindromo
    }
}
