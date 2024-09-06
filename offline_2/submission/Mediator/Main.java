import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ControllerOffice office = new ControllerOffice();
        office.printResult();
        office.correctMistakes();
        office.publishResult();
        List<Student> students = office.getStudentList();
        Scanner scn = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            System.out.println("Student with student id: " + (i+1) + ", Would you like to re examine your ans Script?");
            System.out.println("If \"yes\" the press \"Yes\" other Wise press \"No\"");
            String ans = scn.next();
            if(ans.equalsIgnoreCase("yes")){
                students.get(i).reExamine();
            }
        }
    }
}