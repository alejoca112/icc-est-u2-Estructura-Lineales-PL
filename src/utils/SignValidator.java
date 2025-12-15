package utils;

import java.util.Stack;

public class SignValidator {

    public boolean isValid(String signos){

        Stack<Character> stack = new Stack<>();
        char[] caracter = signos.toCharArray();

        for (char character : caracter) {
            if (getIsApertura(character)) {
                stack.add(character);    
            }else{
                if( stack.isEmpty() ){
                    return false;
                }
                char ultimo = stack.pop();
                if(!isTipoIgual(character, ultimo)){
                    return false;
                }
                
            }
            
        }
        return stack.isEmpty();

    }

    public boolean getIsApertura(char c){
        return c=='{' || c=='(' || c=='[' ;
    }

    public boolean isTipoIgual(char c, char ultimo){
        return (c == ')' && ultimo == '(') || (c == '}' && ultimo == '{') || (c == ']' && ultimo == '[');
    }
    
}
