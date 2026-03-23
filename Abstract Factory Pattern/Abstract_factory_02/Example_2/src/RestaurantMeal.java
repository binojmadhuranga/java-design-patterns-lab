public class RestaurantMeal {
    public static void main(String[] args) {
        // User selected North Indian theme
        MealFactory northFactory = new NorthIndianMealFactory();
        FoodOrderingApp northOrder = new FoodOrderingApp(northFactory);
        northOrder.prepareAndServeMeal();
        // User selected South Indian theme
        MealFactory southFactory = new SouthIndianMealFactory();
        FoodOrderingApp southOrder = new FoodOrderingApp(southFactory);
        southOrder.prepareAndServeMeal();
    }
}