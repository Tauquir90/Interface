public class MineMessanger extends MyMessanger {
    @Override
    public void sendMessage(String sender, String receiver, String message) {
        System.out.println(sender + " says to "+receiver +":: "+message);

    }
}
