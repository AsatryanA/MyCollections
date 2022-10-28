public class CustomQueueL<T> implements CustomQueue<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;

    public CustomQueueL() {
        size = 0;
    }

    @Override
    public void add(T value) {
        if (size == 0) {
            head = tail = new Node<>(value);
        } else {
            Node<T> temp = new Node<>(value);
            temp.setPrevious(tail);
            tail.setNext(temp);
            tail = temp;
        }
        size++;
    }

    private Node<T> getNode(int index) {
        Node<T> tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.getNext();
        }
        return tmp;
    }

    @Override
    public void update(T value, int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException("size is " + size);
        }
        Node<T> node = getNode(index);
        node.setValue(value);
    }

    @Override
    public T get(int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException("size is " + size);
        }
        return this.getNode(index).getValue();
    }

    @Override
    public void poll() {
        T value = this.getNode(0).getValue();
        head = head.getNext();
        head.setPrevious(null);

        System.out.println(value);
        size--;
    }

    @Override
    public void peek() {
        System.out.println(this.head.getValue());
    }

    @Override
    public void remove(int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException("size is " + size);
        } else if (index == 0) {
            head = head.getNext();
            head.setPrevious(null);
        } else if (index == size - 1) {
            tail = tail.getPrevious();
            tail.setNext(null);
        } else {
            Node<T> tmp = getNode(index);
            tmp.getPrevious().setNext(tmp.getNext());
            tmp.getNext().setPrevious(tmp.getPrevious());
        }
        size--;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public String toString() {
        String returnable = "CustomLinkedList [ ";

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


