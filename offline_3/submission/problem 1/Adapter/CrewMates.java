public class CrewMates {
    int number;
    public CrewMates(){}
    public CrewMates(int number){
        this.number = number;
    }
    public String getStudyingObject(){
        return "CrewMate " + number + " Studying  interstellar objects.";
    }

    public String getMaintenanceWork(){
        return "CrewMate " + number + " Doing maintenance work of the Space ship";
    }
}
