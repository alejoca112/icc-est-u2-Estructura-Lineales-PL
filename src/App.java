import utils.SignValidator;
import utils.StackSorter;
import utils.QueueUtils;
import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("--- TAREA Java: ESTRUCTURAS LINEALES ---");
        
        // 1. Ejecutar SignValidator
        System.out.println("\n[Ejercicio 01] Validacion de Signos:");
        runSignValidator();

        // 2. Ejecutar StackSorter
        System.out.println("\n[Ejercicio 02] Ordenar Stack:");
        runStackSorter();

        // 3. Ejecutar QueuePalindromo
        System.out.println("\n[Ejercicio 03] Palindromo con Colas:");
        runQueuePalindrome();
    }

    private static void runSignValidator() {
        SignValidator validator = new SignValidator();
        System.out.println("Input: {[()]} -> " + validator.isValid("{[()]}"));
        System.out.println("Input: {[(])} -> " + validator.isValid("{[(])}"));
    }

    private static void runStackSorter() {
        StackSorter sorter = new StackSorter();
        Stack<Integer> stack = new Stack<>();
        stack.push(5); stack.push(1); stack.push(4); stack.push(2);
        
        System.out.println("Original (Tope derecha): " + stack);
        sorter.sort(stack);
        System.out.println("Ordenado (Tope derecha): " + stack);
        System.out.println("Tope actual: " + stack.peek()); // Debería ser 1
    }

    private static void runQueuePalindrome() {
        QueueUtils utils = new QueueUtils();
        System.out.println("radar -> " + utils.isPalindrome("radar"));
        System.out.println("java  -> " + utils.isPalindrome("java"));
    }
}