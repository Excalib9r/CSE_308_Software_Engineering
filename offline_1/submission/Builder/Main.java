import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        Scanner scn = new Scanner(System.in);
        String pcType;
        System.out.println("What kind of PC You want to build??");
        pcType = scn.nextLine();

        if(pcType.equalsIgnoreCase("Gaming Pc")){
            GamingPc gamingPc = new GamingPc();
            director.Construct(gamingPc);
            ProductPc pc = gamingPc.getPc();
            pc.print();
        }
        else if(pcType.equalsIgnoreCase("Type A")){
            ATypePc aTypePc = new ATypePc();
            director.Construct(aTypePc);
            ProductPc pc = aTypePc.getPc();
            pc.print();
        }
        else if(pcType.equalsIgnoreCase("Type B")){
            BTypePc bTypePc = new BTypePc();
            director.Construct(bTypePc);
            ProductPc pc = bTypePc.getPc();
            pc.print();
        }
        else if(pcType.equalsIgnoreCase("Type C")){
            CTypePc cTypePc = new CTypePc();
            director.Construct(cTypePc);
            ProductPc pc = cTypePc.getPc();
            pc.print();
        }
    }
}