import java.util.Arrays;
import java.util.Objects;

public class CustomArrayList<T> implements CustomList<T> {

    int size;

    T[] values;

    public CustomArrayList() {
        this(16);
    }

    public CustomArrayList(int capacity) {
        values = (T[]) new Object[capacity];
        size = 0;
    }


    @Override
    public void add(T value) {
        if (values.length == size) {
            values = Arrays.copyOf(values, ((values.length * 3) / 2) + 1);
        }
        values[size] = value;
        size++;

    }
    @Override
    public void update(T value, int number){
        if(number>=size)
        {
            throw new ArrayIndexOutOfBoundsException("Size is " + size);
        }
        values[number]=value;
    }

    @Override
    public void remove(int number) {
        if (number >= size) {
            throw new IndexOutOfBoundsException("Size is " + size);
        }
        for (int i = 0; i < size; i++) {
            values[number]=values[number+1];
            number++;
        }
        size--;
        {

        }
    }
    @Override
    public int size ()
    {
        return size;
    }

    public T get(int number) {
        if (number >= size) {
            throw new IndexOutOfBoundsException("Size is " + size);
        }
        return values[number];
    }

    @Override
    public String toString() {
        String returnable = "CustomArrayList size : " + size + " [ ";

        for (int i = 0; i < size; i++) {
            if (i == size - 1) {
                returnable += this.get(i);
            } else {
                returnable += this.get(i) + ", ";
            }

        }
        returnable += " ]";
        return returnable;

    }

}