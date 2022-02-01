
public class Tester {
    public static void main(String...args) throws CloneNotSupportedException
    {
        Record orig_rec = new Record(400,false,false,true,8000,400);
        Player orig_pl = new Player("Afridi", 40, orig_rec);
        System.out.println("ORIGINAL PLAYER DETAILS.....");
        orig_pl.getPlayerDetails();
        Player dup_pl = (Player)orig_pl.clone();
        System.out.println("DUPLICATE PLAYER DERTAILS....");
        dup_pl.getPlayerDetails();
        System.out.println("original player ref: "+orig_pl);
        System.out.println("duplicate player ref: "+dup_pl);
        System.out.println("original record ref :"+orig_pl.record);
        System.out.println("duplicate record  ref: "+dup_pl.record);
    }
}



