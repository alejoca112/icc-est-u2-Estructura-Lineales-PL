class StackSorter:
    def sort(self, stack):
        aux_stack = []

        while len(stack) > 0:
            temp = stack.pop()

            while len(aux_stack) > 0 and aux_stack[-1] > temp:
                stack.append(aux_stack.pop())
            
            aux_stack.append(temp)

        # Regresar elementos al stack original
        while len(aux_stack) > 0:
            stack.append(aux_stack.pop())