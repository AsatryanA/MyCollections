import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CustomList<String> customList = new CustomLinkedList<>();

        customList.add("Pargev");
        customList.add("sasdasf");

        customList.add("asfsgddsfhsdhdhf");

        customList.add("fdshdfshdsfhdsfh");

        customList.add("fdshdsewrewreqr");

        customList.update("Kxmindr", 0);

        System.out.println(customList);


    }
}
