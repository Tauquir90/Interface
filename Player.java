public class Player {
    String name;
    boolean isBatter;
    boolean isBowler;
    boolean isAllRounder;

    public Player(String name,boolean isBowler,boolean isBatter,boolean isAllRounder) {
        this.name=name;
        this.isBatter=isBatter;
        this.isBowler=isBowler;
        this.isAllRounder = isAllRounder;
    }
    public void getPlayerDetails()
    {
        System.out.println("PLAYER DETAILS..........");
        System.out.println("player name          :"+name);
        System.out.println("is batter            :"+isBatter);
        System.out.println("is bowler            :"+isBowler);
        System.out.println("is all rounder        :"+isAllRounder);
    }
    class MyPlayer extends Player
    {
       int age;
       int matches;


        public MyPlayer(String name, boolean isBowler, boolean isBatter, boolean isAllRounder,int age,int matches) {
            super(name, isBowler, isBatter, isAllRounder);
            this.age=age;
            this.matches=matches;
        }

        public void showFavouritePlayerDetails()
        {
            System.out.println("Showing fav player details......");
            getPlayerDetails();
            System.out.println();
            System.out.println("player  age            :"+age);
            System.out.println("matches played         :"+matches);
        }
    }
}
