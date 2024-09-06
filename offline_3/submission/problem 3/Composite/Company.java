import java.util.ArrayList;

public class Company implements Personnel{
    private String name;
    private String role;
    ArrayList<Manager> managers;
    public Company(String name){
        this.name = name;
        this.role = "Company";
        managers = new ArrayList<>();
    }
    public void addManager(Manager manager){
        managers.add(manager);
    }
    public boolean removeManager(Manager manager){
        manager.makeManagerDeveloper();
        manager.setWorkingOnProject(false);
        manager.assignProject("");
        manager.removeAllDeveloper();
        return managers.remove(manager);
    }
    public void removeAllManager(){
        for(Manager manager : managers){
            manager.makeManagerDeveloper();
            manager.setWorkingOnProject(false);
            manager.assignProject("");
            manager.removeAllDeveloper();
        }
        for(Manager manager : managers){
            System.out.println("Removing " + manager.getName() + " Manager");
        }
        managers.clear();
    }
    public void removeCompany(){
        removeAllManager();
        System.out.println("Removing " + name + " Company");
        System.out.println();
    }
    @Override
    public void showDetails() {
        System.out.println("The company is " + name);
        System.out.println("The Employees under " + name + " company:");
        for(Manager manager: managers){
            manager.showDetails();
        }
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public String getRole() {
        return role;
    }

    @Override
    public void changeRole(String role) {

    }

    @Override
    public void setWorkingOnProject(boolean workingOnProject) {

    }
    @Override
    public void assignProject(String project) {

    }

    @Override
    public String getProjectName() {
        return null;
    }
    @Override
    public void showHierarchy() {
        System.out.println("- " + name);
        for(Manager manager : managers){
            System.out.print("\t - ");
            manager.showHierarchy();
        }
    }
}
