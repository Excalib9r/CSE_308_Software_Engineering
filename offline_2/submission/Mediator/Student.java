import java.util.HashMap;

public class Student extends User{
    private int stdID;
    private int mark;
    public Student(Mediator mediator, int stdID) {
        super(mediator);
        this.stdID = stdID;
        this.mark = 0;
    }

    public void setMarks(int mark){
       this.mark = mark;
    }

    public int getID(){
        return stdID;
    }

    public int getMark(){
        return this.mark;
    }

    public void reExamine(){
        HashMap<Integer, Integer> ind = new HashMap<>();
        ind.put(stdID, mark);
        System.out.println("re-examine request sent from student id " + stdID);
        mediator.sendNotification(this, ind);
    }

    public void printResult(){
        System.out.println("My Student ID " + stdID + " and I got " + mark + " marks");
    }
}
