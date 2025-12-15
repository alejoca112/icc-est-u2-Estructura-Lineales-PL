class SignValidator:

    def is_valid(self, text: str) -> bool:
        stack = []


        for char in text:
            if char =='(' or char =='[' or char =='{' :
                stack.append(char)
            elif char ==')' or char ==']' or char =='}':
                ultimo = stack.pop()
                if not (char == ')' and ultimo == '(') or (char == '}' and ultimo == '{') or (char == ']' and ultimo == '['):
                    return False

        return len(stack) == 0

