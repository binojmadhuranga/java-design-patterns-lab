class NorthIndianMealFactory implements MealFactory {
    public MainCourse createMainCourse() {
        return new ButterChicken();
    }
    public SideDish createSideDish() {
        return new Naan();
    }
    public Dessert createDessert() {
        return new GulabJamun();
    }
}