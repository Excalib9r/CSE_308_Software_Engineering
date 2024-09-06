public class ImposterToCrewMateAdapter extends CrewMates{
    Imposter imposter;
    public ImposterToCrewMateAdapter(Imposter imposter){
        this.imposter = imposter;
    }

    public String getStudyingObject(){
        String str = imposter.getPoisoningCrew();
        return "Looks like studying  interstellar objects. But actually " + str;
    }

    public String getMaintenanceWork(){
        String str = imposter.getDamageSpaceShip();
        return "Looks like doing maintenance work of the Space ship. But actually " + str;
    }
}
