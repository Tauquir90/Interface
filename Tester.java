public class Tester {
    public static void main(String...args)
    {
        Cricketer cr = new MyCricketer("Shahid Afridi",40,400,false
        ,false,true);
        cr.showStatistics();
        System.out.println();
        System.out.println("--------------------------------");
        cr.gameChanger();
    }
}
