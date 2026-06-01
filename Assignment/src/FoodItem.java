class FoodItem extends MenuComponent {
    private String name;

    public FoodItem(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("- " + name);
    }
}