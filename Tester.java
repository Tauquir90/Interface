public class Tester {
    public static void main(String...args)
    {
        Player pl = new Player("Afridi",false,false,true);
        pl.getPlayerDetails();
        Player.MyPlayer pm = pl.new MyPlayer("Afridi",false,false,true,40,400);
        pm.getPlayerDetails();
        pm.showFavouritePlayerDetails();

    }
}
