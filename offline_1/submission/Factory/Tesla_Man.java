public class Tesla_Man extends Manufacturer{
    @Override
    Car getCar() {
        return new Tesla();
    }
}
