class SouthIndianMealFactory implements MealFactory {
    public MainCourse createMainCourse() {
        return new MasalaDosa();
    }

    public SideDish createSideDish() {
        return new SambarRice();
    }

    public Dessert createDessert() {
        return new Payasam();
    }

}