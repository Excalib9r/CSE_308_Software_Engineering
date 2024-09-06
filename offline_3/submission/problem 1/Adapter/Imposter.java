public class Imposter {
    int number;
    public Imposter(int number){
        this.number = number;
    }
    public String getPoisoningCrew(){
        return "imposter " + number + " observing the Crew and trying to poison them without noticing anyone";
    }

    public String getDamageSpaceShip(){
        return "imposter " + number + " damaging Space Ship";
    }
}
