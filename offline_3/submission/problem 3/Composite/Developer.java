import java.util.ArrayList;

public class Developer implements Personnel{
    private String name;
    private boolean workingOnProject;
    private String project;
    private String role;
    public Developer(String name){
        this.name = name;
        this.project = "";
        this.role = "Developer";
        workingOnProject = false;
    }
    public void setWorkingOnProject(boolean workingOnProject){
        this.workingOnProject = workingOnProject;
    }
    public boolean getWorkingOnProject(){
        return this.workingOnProject;
    }
    public void changeRole(String role){
        this.role = role;
    }
    public String getRole(){
        return this.role;
    }
    public void assignProject(String project){
        this.project = project;
    }
    @Override
    public String getProjectName() {
        return project;
    }
    @Override
    public void showDetails() {
        System.out.println("Name: " + name + "\n" +
                "Role: " + role + "\n" +
                "Current Project: " + project);
        System.out.println();
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void showHierarchy() {
        System.out.println("\t - " + name);
    }
}
