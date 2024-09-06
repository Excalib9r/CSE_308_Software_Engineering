import java.util.HashMap;
import java.util.Random;

public class Examiner extends User{
    HashMap<Integer, Integer> result;
    public Examiner(Mediator mediator) {
        super(mediator);
        Random rand = new Random();
        this.result = new HashMap<>();
        for(int i = 0; i < 5; i++){
            int mark = rand.nextInt(30, 100);
            result.put(i+1, mark);
        }
    }
    public void returnMarkSheet(){
        mediator.sendNotification(this, result);
    }
     public void reExamineRequest(int stdID){
        int mark = recheck(stdID);
        result.remove(stdID);
        result.put(stdID, mark);
        returnMarkSheet();
     }
     public int recheck(int stdID){
        int origin = result.get(stdID);
        Random rand = new Random();
        int mark = rand.nextInt(origin, 100);
        return mark;
     }
}
