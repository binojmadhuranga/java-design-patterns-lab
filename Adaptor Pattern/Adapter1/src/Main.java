public class Main {
    public static void main(String[] args) {
        OldCharger oldCharger = new OldCharger();

        Charger charger = new ChargerAdapter(oldCharger);
        charger.charge();
    }

}
