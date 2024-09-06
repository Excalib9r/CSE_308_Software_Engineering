import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Publisher implements Server{
    private HashMap<String, List<User>> users;
    public Publisher(){
         users = new HashMap<>();
    }
    @Override
    public void subscribe(String type, User user) {
        if(users.get(type) == null){
            List <User> userList = new ArrayList<>();
            userList.add(user);
            users.put(type, userList);
        }
        else{
            List <User> userList = users.get(type);
            userList.add(user);
            users.put(type, userList);
        }
    }

    @Override
    public void unsubscribe(String type, User user) {
        if(users.get(type) != null){
            List <User> userList = users.get(type);
            userList.remove(user);
        }
    }

    @Override
    public void notifyUser(String type, String state,  String msg) {
        if(users.get(type) != null){
            for(User user : users.get(type)){
                user.Update(state, msg);
            }
        }
    }
}
