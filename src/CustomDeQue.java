public interface CustomDeQue<T> {


    void add(T value);

    void update(T value, int index);

    T get(int index);

    int size();

    void remove(int index);

    void removeFirst();

    void removeLast();

    void poll();

    void peek();

    void pop();

    void peekLast();

    void peekFirst();

    void poolLast();

    void poolFirst();
}
