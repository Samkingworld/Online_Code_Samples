package Online_Code_Samples.Generics;

public class FullStackException extends RuntimeException {
    // no-argument constructor
    public FullStackException() {
        this("Code_Samples.Generics.Stack is full");
    } // end no-argument Code_Samples.Generics.FullStackException constructor

    // one-argument constructor
    public FullStackException(String exception) {
        super(exception);
    } // end one-argument Code_Samples.Generics.FullStackException constructor
} // end class Code_Samples.Generics.FullStackException
