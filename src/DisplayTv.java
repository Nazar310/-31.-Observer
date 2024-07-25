public class DisplayTv implements Observer {
    @Override
    public void update(int temperature) {
        System.out.println("Дисплей телевізора: Поточна температура " + temperature + " градусів.");
    }
}
