class Navigator {

    private RouteStrategy strategy;

    // Set Strategy
    public void setStrategy(RouteStrategy strategy) {
        this.strategy = strategy;
    }

    // Use Strategy
    public void navigate() {
        strategy.buildRoute();
    }
}