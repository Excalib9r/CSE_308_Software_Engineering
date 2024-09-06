import java.util.ArrayList;

public class Manager implements Personnel{
    private Developer developer;
    private ArrayList<Developer> developers;
    public Manager(Developer developer){
       this.developer = developer;
       developers = new ArrayList<>();
       developer.changeRole("Manager");
    }
    public void makeManagerDeveloper(){
        this.developer.changeRole("Developer");
    }
    public void addDeveloper(Developer developer){
        developer.assignProject(this.developer.getProjectName());
        developer.setWorkingOnProject(true);
        developers.add(developer);
    }
    public Boolean removeDeveloper(Developer developer){
        developer.assignProject("");
        developer.setWorkingOnProject(false);
        return developers.remove(developer);
    }
    public void removeAllDeveloper(){
        for(Developer developer : developers){
            developer.assignProject("");
            developer.setWorkingOnProject(false);
            System.out.println("Removing " + developer.getName() + " Developer");
        }
        developers.clear();
    }
    @Override
    public String getName() {
        return developer.getName();
    }
    @Override
    public String getRole() {
        return developer.getRole();
    }
    @Override
    public void changeRole(String role) {
        this.developer.changeRole(role);
    }
    @Override
    public void setWorkingOnProject(boolean workingOnProject) {
        this.developer.setWorkingOnProject(workingOnProject);
    }
    @Override
    public void assignProject(String project) {
        this.developer.assignProject(project);
    }
    @Override
    public String getProjectName() {
        return developer.getProjectName();
    }
    @Override
    public void showDetails() {
        this.developer.showDetails();
        System.out.println("The Developers under " + this.developer.getName() + " Manager:");
        for(Developer developer : developers){
            developer.showDetails();
        }
        System.out.println("Number of Supervisees: " + developers.size());
        System.out.println();
        System.out.println();
    }
    @Override
    public void showHierarchy() {
        System.out.println(this.developer.getName() + "( " + this.developer.getProjectName() + " )");
        for(Developer p : developers){
            System.out.print("\t");
            p.showHierarchy();
        }
    }
}
