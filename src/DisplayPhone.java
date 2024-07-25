public class DisplayPhone implements Observer {
    @Override
    public void update(int temperature) {
        System.out.println("Дисплей телефону: Поточна температура " + temperature + " градусів.");
    }
}
