public interface Messanger {
    void sendMessage();
    void receiveMessage();
    void sendMessage(String sender, String receiver, String message);
}
