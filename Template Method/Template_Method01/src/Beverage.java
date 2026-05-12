// Abstract Class
abstract class Beverage {

    // Template Method
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    void boilWater() {
        System.out.println("Boiling Water");
    }

    abstract void brew();

    void pourInCup() {
        System.out.println("Pouring into Cup");
    }

    abstract void addCondiments();
}