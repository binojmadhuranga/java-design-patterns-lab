class Food {
    private String size;
    private boolean cheese;
    private boolean extraSauce;

    private Food(FoodBuilder builder) {
        this.size = builder.size;
        this.cheese = builder.cheese;
        this.extraSauce = builder.extraSauce;
    }

    public void display() {
        System.out.println("Size: " + size);
        System.out.println("Cheese: " + cheese);
        System.out.println("Extra Sauce: " + extraSauce);
    }

    static class FoodBuilder {
        private String size;
        private boolean cheese;
        private boolean extraSauce;

        public FoodBuilder(String size) {
            this.size = size;
        }

        public FoodBuilder addCheese() {
            cheese = true;
            return this;
        }

        public FoodBuilder addExtraSauce() {
            extraSauce = true;
            return this;
        }

        public Food build() {
            return new Food(this);
        }
    }
}