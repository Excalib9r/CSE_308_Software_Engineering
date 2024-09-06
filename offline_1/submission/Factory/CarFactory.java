public class CarFactory {
    Manufacturer getManufacturer(String input){
        if(input == null)
            return null;
        else if(input.equalsIgnoreCase("Asia"))
            return new Toyota_Man();
        else if(input.equalsIgnoreCase("Europe"))
            return new BMW_Man();
        else if(input.equalsIgnoreCase("United States"))
            return new Tesla_Man();
        else
            return null;
    }
}
