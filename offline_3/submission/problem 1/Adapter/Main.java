public class Main {
    public static void main(String[] args) {
        Maintenance spaceShip = new Maintenance();
        CrewMates member1 = new CrewMates(1);
        CrewMates member2 = new CrewMates(2);
        Imposter imposter1 = new Imposter(1);
        Imposter imposter2 = new Imposter(2);

        ImposterToCrewMateAdapter adaptor1 = new ImposterToCrewMateAdapter(imposter1);
        ImposterToCrewMateAdapter adaptor2 = new ImposterToCrewMateAdapter(imposter2);

        spaceShip.getCrewObserving(adaptor1);
        spaceShip.getCrewObserving(member2);
        spaceShip.getCrewObserving(member1);
        spaceShip.getCrewObserving(adaptor2);

        spaceShip.getCrewMaintenanceWork(member1);
        spaceShip.getCrewMaintenanceWork(adaptor1);
        spaceShip.getCrewMaintenanceWork(member2);
        spaceShip.getCrewMaintenanceWork(adaptor2);
    }
}