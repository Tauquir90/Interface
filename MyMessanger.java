  abstract class MyMessanger implements Messanger {
    @Override
    public void sendMessage() {

    }

    @Override
    public void receiveMessage() {

    }

    @Override
    public  abstract void sendMessage(String sender, String receiver, String message) ;


}
