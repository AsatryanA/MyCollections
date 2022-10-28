public class CustomElement implements Comparable<CustomElement> {


    private String name;

    private int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(CustomElement o) {
        if (this.age == o.getAge()) {
            return 0;
        } else if (this.age < o.age) {
            return -1;
        } else {
            return 1;
        }
    }
}
