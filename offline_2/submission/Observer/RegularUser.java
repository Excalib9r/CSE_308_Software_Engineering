import java.io.FileWriter;
import java.io.IOException;

public class RegularUser implements User{
    private FileWriter out;
    public RegularUser()throws IOException {
        try {
            out = new FileWriter("RegularUser.txt");
//            System.out.println("Inside regular user");
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
