public class Main {
    public static void main(String[] args) {
        WeatherStation ws = new WeatherStation();
        ws.addObserver(new Display("Mobile"));
        ws.addObserver(new Display("TV"));
        ws.setTemperature(30.5f);
    }
}