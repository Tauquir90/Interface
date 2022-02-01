abstract class Cricketer {
    String name;
    int age;
    int Matches;
    boolean isBatter;
    boolean isBowler;
    boolean isAllRounder;
    public Cricketer(String name, int age, int Matches, boolean isBatter
    ,boolean isBowler, boolean isAllRounder){
        this.name = name;
        this.age = age;
        this.Matches= Matches;
        this.isBatter = isBatter;
        this.isBowler= isBowler;
        this.isAllRounder= isAllRounder;
    }
    public abstract void gameChanger();
    public void showStatistics()
    {
        System.out.println("Showing Player Statistics");
        System.out.println();
        System.out.println("-------------------------------");
        System.out.println("PLAYER NAME               :"+this.name);
        System.out.println("PLAYER AGE                :"+this.age);
        System.out.println("PLAYER MATCHES            :"+this.Matches);
        System.out.println("IS PLAYER BATTER          :"+this.isBatter);
        System.out.println("IS PLAYER BOWLER          :"+this.isBowler);
        System.out.println("IS PLAYER ALL ROUNDER     :"+this.isAllRounder);


    }

}
