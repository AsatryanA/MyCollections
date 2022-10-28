import java.util.Comparator;

public class CustomElementComparator implements Comparator<CustomElement> {


    @Override
    public int compare(CustomElement o1, CustomElement o2) {
        if (o1.getAge() == o2.getAge()) {
            return 0;
        } else if (o1.getAge() < o2.getAge()) {
            return -1;
        } else {
            return 1;
        }
    }
}
