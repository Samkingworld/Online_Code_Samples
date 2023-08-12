package Online_Code_Samples.Generics;

public class EmptyStackException extends RuntimeException {
    // no-argument constructor
    public EmptyStackException() {
        this("Code_Samples.Generics.Stack is empty");
    } // end no-argument Code_Samples.Generics.EmptyStackException constructor

    // one-argument constructor
    public EmptyStackException(String exception) {
        super(exception);
    } // end one-argument Code_Samples.Generics.EmptyStackException constructor
} // end class Code_Samples.Generics.EmptyStackException