public interface Deque<T> {

    /**
     * A method that checks if a Deque is empty.
     *
     * @return boolean
     */
    default boolean isEmpty() {
        return this.size() == 0;
    }

    void addFirst(T item);

    void addLast(T item);

    int size();

    void printDeque();

    T removeFirst();

    T removeLast();

    T get(int index);
}
