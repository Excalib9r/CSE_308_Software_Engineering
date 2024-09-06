public class BMW_Man extends Manufacturer{
    @Override
    Car getCar() {
        return new BMW();
    }
}
