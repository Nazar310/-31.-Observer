import java.util.ArrayList;
import java.util.List;

public class WeatherStation {
    private List<Observer> observers;
    private int temperature;

    public WeatherStation() {
        this.observers = new ArrayList<>();
    }

    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }
}
