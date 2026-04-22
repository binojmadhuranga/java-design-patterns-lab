class ChargerAdapter implements Charger {

    private OldCharger oldCharger;

    public ChargerAdapter(OldCharger oldCharger) {
        this.oldCharger = oldCharger;
    }
    public void charge() {
        oldCharger.oldCharge();
    }
}
