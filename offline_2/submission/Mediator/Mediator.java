import java.util.HashMap;

public interface Mediator {
    public void sendNotification(User user, HashMap<Integer, Integer> marks);
}
