
public class Main {

    public static void main(String[] args) {
        // write test code here
    }

    public static boolean isAWeekDay(String string) {
        return string.matches("mon|tue|wed|thu|fri|sat|sun");
    }

    public static boolean allVowels(String string) {
        return string.matches("[aeiouyäö]*");
    }

    public static boolean clockTime(String string) {
        if (string.matches("[0-1][0-9]:[0-5][0-9]:[0-6][0-9]")) {
            return true;
        }
        if (string.matches("2[0-3]:[0-5][0-9]:[0-6][0-9]")) {
            return true;
        }
        if(string.matches("24:00:00")){
        return true;
        }
        return false;
    }
}
