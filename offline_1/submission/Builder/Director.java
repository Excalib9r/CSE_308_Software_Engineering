import java.util.Scanner;

public class Director {
    Builder myBuilder;
    Scanner scn = new Scanner(System.in);
    public void Construct(Builder builder){
        myBuilder = builder;
        myBuilder.PcType();
        myBuilder.ExtraFeature();
        myBuilder.setProcessor();
        System.out.println("Do you want to add extra ram? yes or no");
        String ans;
        ans = scn.nextLine();
        if(ans.equalsIgnoreCase("yes")){
            String ramModel;
            System.out.println("We have available 8 GB DDR4 RAM of two variations including 2666 MHz and 3200 MHz to all types of PC adding respectively 2620 BDT and 2950 BDT to the base price");
            System.out.println("Choose between 2666 MHz and 3200 MHz");
            ramModel = scn.nextLine();
            myBuilder.setRAM(ramModel);
        }

        System.out.println("Do you want to graphics card? yes or no");
        ans = scn.nextLine();
        if(ans.equalsIgnoreCase("yes")){
            String gcModel;
            System.out.println("We have available 2GB and 4 GB graphics cards adding respectively 6500 BDT and 7600 BDT");
            System.out.println("Choose between 2GB and 4GB");
            gcModel = scn.nextLine();
            myBuilder.setRAM(gcModel);
        }
    }
}
