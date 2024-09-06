import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class ControllerOffice implements Mediator {
    private List<Examiner> examiner;
    private List<Student> students;
    private List<Boolean> reExamined;

    public ControllerOffice(){
        this.examiner = new ArrayList<>();
        Examiner exr = new Examiner(this);
        examiner.add(exr);
        this.reExamined = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            reExamined.add(false);
        }
        this.students = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            Student std = new Student(this, i+1);
            students.add(std);
        }
        exr.returnMarkSheet();
    }
    public List<Student> getStudentList(){
        return this.students;
    }
    @Override
    public void sendNotification(User user, HashMap<Integer, Integer> marks) {
        if(user instanceof Examiner){
            for(int i = 0; i < 5; i++){
                int mark = marks.get(i+1);
                students.get(i).setMarks(mark);
            }
        }
        if(user instanceof Student){
            int id = ((Student) user).getID();
            System.out.println("re-examine request got from student id " + id);
            if(reExamined.get(id-1)){
                System.out.println("Your Answer script has already been re-examined once");
            }
            else{
                examiner.get(0).reExamineRequest(((Student) user).getID());
                reExamined.remove(id-1);
                reExamined.add(id-1, true);
            }
        }
    }
    public void printResult(){
        for(Student std : students){
            System.out.println("Student with student ID: " + std.getID() + " got " + std.getMark() + " marks");
        }
        System.out.println();
    }
    public void correctMistakes(){
        Random rand = new Random();
        int num = rand.nextInt(1,4);
        for(int i = 0; i < num; i++){
            int id = rand.nextInt(1,6);
            Student std = students.get(id - 1);
            int mark = std.getMark();
            int newMark = rand.nextInt(mark, 100);
            std.setMarks(newMark);
            System.out.println("There was a mistake in result with student ID: " + std.getID() + " Previous mark " + mark + " and corrected mark " + std.getMark());
        }
        System.out.println();
    }
    public void publishResult(){
        for(Student std : students){
            std.printResult();
        }
    }
}
