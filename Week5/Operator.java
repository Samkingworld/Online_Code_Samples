package Online_Code_Samples.Week5;


@FunctionalInterface
public interface Operator<T> {
    T operator(T value1, T value2);
}
