import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<Company> companies = new ArrayList<>();
        while(true){
            System.out.println("Do you want a company ? press yes or no");
            String info = scn.next();
            if(info.equalsIgnoreCase("no"))
                break;
            else{
                System.out.println("Give a name to your company");
                String companyName = scn.next();
                Company company = new Company(companyName);
                System.out.println("How many Managers you want?");
                int numOfMan = scn.nextInt();
                for(int i = 0; i < numOfMan; i++){
                    System.out.println("Give Name of the " + (i+1) + " manager");
                    String man = scn.next();
                    System.out.println("Assign Project to the manager");
                    String project = scn.next();
                    Developer dev = new Developer(man);
                    dev.assignProject(project);
                    Manager manager = new Manager(dev);
                    company.addManager(manager);
                    System.out.println("How many developer you want under this Manger?");
                    int numOfDev = scn.nextInt();
                    for(int  j = 0; j < numOfDev; j++){
                        System.out.println("Give Name of the " + (j+1) + " developer");
                        String devName = scn.next();
                        Developer developer = new Developer(devName);
                        dev.assignProject(project);
                        manager.addDeveloper(developer);
                    }
                }
                System.out.println();
                System.out.println();
                company.showDetails();
                company.showHierarchy();
                companies.add(company);
            }
        }
        while(true){
            if(companies.size() == 0){
                System.out.println("All companies Removed");
                break;
            }
            System.out.println("Do you want to remove any company? press yes or no");
            String info = scn.next();
            if(info.equalsIgnoreCase("No"))
                break;
            else{
                System.out.println("Give the number of the Company you want remove");
                int companyNo = scn.nextInt();
                companies.get(companyNo - 1).removeCompany();
                companies.remove(companyNo - 1);
            }
        }
    }
}