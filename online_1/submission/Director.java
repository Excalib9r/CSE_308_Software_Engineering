import java.util.Scanner;

public class Director {
    Builder myBuilder;
    Scanner scn = new Scanner(System.in);
    public void Construct(Builder builder){
        myBuilder = builder;
        myBuilder.MsType();
        myBuilder.ExtraFeature();

        System.out.println("Do you want to a lactose free milkshake ? yes or no");
        String ans;
        ans = scn.nextLine();
        myBuilder.setLactoseFree(ans);

        System.out.println("Do you want candy added on top ? yes or no");
        ans = scn.nextLine();
        myBuilder.AddCandyOnTop(ans);

        System.out.println("Do you want cookies added on top ? yes or no");
        ans = scn.nextLine();
        myBuilder.AddCookiesOnTop(ans);
    }
}