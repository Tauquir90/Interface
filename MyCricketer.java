public class MyCricketer extends Cricketer {
    public MyCricketer(String name, int age, int Matches, boolean isBatter, boolean isBowler, boolean isAllRounder) {
        super(name, age, Matches, isBatter, isBowler, isAllRounder);
    }

    @Override
    public void gameChanger() {
        System.out.println("Has the ability to change fortune of game..");

    }
}
