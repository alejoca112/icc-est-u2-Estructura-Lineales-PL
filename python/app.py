from sign_validator import SignValidator
from stack_sorter import StackSorter
from queue_utils import QueueUtils

def main():
    print("--- TAREA PYTHON ---")

    # Ejercicio 01
    print("\n[Ej 01] Validar Signos:")
    val = SignValidator()
    print(f"{{[()]}}: {val.is_valid('{[()]}')}")

    #Ejercicio 02
    #print("\n[Ej 02] Ordenar Stack:")
    #sorter = StackSorter()
    #stack = [5, 1, 4, 2] # En Python lista actua como stack
    #print(f"Original: {stack}")
    #sorter.sort(stack)
    #print(f"Ordenado: {stack} (Tope es el ultimo elemento: {stack[-1]})")

    #Ejercicio 03
    #print("\n[Ej 03] Palindromo:")
    #utils = QueueUtils()
    #print(f"radar: {utils.is_palindrome('radar')}")
    #print(f"java:  {utils.is_palindrome('java')}")

if __name__ == "__main__":
    main()