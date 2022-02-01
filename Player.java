
public class Player implements Cloneable {
    String name;
    int age;
    Record record;

    public Player(String name, int age, Record record) {

        this.name = name;
        this.age = age;
        this.record = record;
    }

    public void getPlayerDetails() {
        System.out.println("player Details..............");
        System.out.println();
        System.out.println("PLAYER NAME     :" + name);
        System.out.println("PLAYER AGE     :" + age);
        System.out.println();
        record.showStatistics();
    }

    public Object clone() throws CloneNotSupportedException {
        Object obj = super.clone();
        return obj;
    }
}
