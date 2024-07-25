public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        DisplayPhone displayPhone = new DisplayPhone();
        DisplayTv displayTv = new DisplayTv();

        weatherStation.addObserver(displayPhone);
        weatherStation.addObserver(displayTv);

        weatherStation.setTemperature(25);
        weatherStation.setTemperature(30);
    }
}
