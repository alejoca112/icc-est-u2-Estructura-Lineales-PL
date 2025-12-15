from collections import deque

class QueueUtils:
    def is_palindrome(self, text: str) -> bool:
        queue_original = deque()
        queue_inverted = deque()

        # Llenar original
        for char in text:
            queue_original.append(char)
        
        # Llenar invertida
        for i in range(len(text) - 1, -1, -1):
            queue_inverted.append(text[i])

        # Comparar
        while len(queue_original) > 0:
            if queue_original.popleft() != queue_inverted.popleft():
                return False
        
        return True