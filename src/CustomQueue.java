public interface CustomQueue<T> {


    void add(T value);

    void update(T value, int index);

    T get(int index);

    int size();

    void remove(int index);

    void poll();

    void peek();
}
