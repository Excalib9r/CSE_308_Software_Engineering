public interface Server {
    void subscribe(String type, User user);
    void unsubscribe(String type, User user);
    void notifyUser(String type, String state,  String msg);
}
