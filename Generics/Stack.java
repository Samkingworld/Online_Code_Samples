package Online_Code_Samples.Generics;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Stack< E > {

    private final int size; // number of elements in the stack
    private int top; // location of the top element
    private final E[] elements; // array that stores stack elements

    // no-argument constructor creates a stack of the default size
    public Stack() {
        this(10); // default stack size
    } // end no-argument Code_Samples.Generics.Stack constructor

    // constructor creates a stack of the specified number of elements
    public Stack(int s) {
        size = s > 0 ? s : 10; // set size of Code_Samples.Generics.Stack
        top = -1; // Code_Samples.Generics.Stack initially empty

        elements = (E[]) new Object[size]; // create array
    } // end Code_Samples.Generics.Stack constructor

    // push element onto stack; if successful, return true;
    // otherwise, throw Code_Samples.Generics.FullStackException
    public void push(E pushValue) {
        if (top == size - 1) // if stack is full
            throw new FullStackException(String.format(
                    "Code_Samples.Generics.Stack is full, cannot push %s", pushValue));

        elements[++top] = pushValue; // place pushValue on Code_Samples.Generics.Stack
    } // end method push

    // return the top element if not empty; else throw Code_Samples.Generics.EmptyStackException
    public E pop() {
        if (top == -1) // if stack is empty
            throw new EmptyStackException("Code_Samples.Generics.Stack is empty, cannot pop");

        return elements[top--]; // remove and return top element of Code_Samples.Generics.Stack
    } // end method pop

    public int getSize(){
        return this.elements.length;
    }

    public void printStack(){
        for( E el: elements){
            System.out.println(el);
        }
    }

    public static void main(String[] args) {
        Stack<String> string = new Stack<>();
        System.out.println(string.size);
        System.out.println(string.getSize());

        string.printStack();

        Map<Integer, List<List<String>>> mapList = new HashMap<>();
    }
} // end class Code_Samples.Generics.Stack< E >












