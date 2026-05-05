class Display implements Observer {
    private String name;
    public Display(String name) {
        this.name = name;
    }
    public void update(float temp) {
        System.out.println(name + " Display: Temperature = " + temp);
    }
}
