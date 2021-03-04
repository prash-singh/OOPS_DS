package generics.Stack;

public interface StackADT<E> {
    public void push(E data);
    E pop();
    E peek();
    public boolean isEmpty();
}
