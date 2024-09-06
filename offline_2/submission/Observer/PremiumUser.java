import java.io.FileWriter;
import java.io.IOException;

public class PremiumUser implements User{
    private FileWriter out;
    public PremiumUser()throws IOException {
        try {
            out = new FileWriter("PremiumUser.txt");
//            System.out.println("Inside Premium user");
        }
        catch (IOException e){
            throw new RuntimeException(e);
        }
    }
    @Override
    public void Update(String state, String msg) {
        try {
            out.write(" The Server State is: " + state + "\n");
            out.write(msg + "\n");
            out.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
