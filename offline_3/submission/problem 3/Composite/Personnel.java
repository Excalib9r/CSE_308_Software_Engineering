public interface Personnel {
    public void showDetails();
    public String getName();
    public String getRole();
    public void changeRole(String role);
    public void setWorkingOnProject(boolean workingOnProject);
    public void assignProject(String project);
    public String getProjectName();
    public void showHierarchy();
}
