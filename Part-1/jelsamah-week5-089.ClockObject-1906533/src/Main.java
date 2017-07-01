public class Main {
    public static void main(String[] args) {
        Clock clock = new Clock(11, 59, 59);

        int i = 0;
        while (i < 20) {
            System.out.println(clock);
            clock.tick();
            i++;
        }
    }
}
