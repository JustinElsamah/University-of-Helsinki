
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    public int differenceInYears(MyDate comparedDate) {
        MyDate earlier;
        MyDate later;

        if (earlier(comparedDate)) {
            earlier = new MyDate(this.day, this.month, this.year);
            later = new MyDate(comparedDate.day, comparedDate.month, comparedDate.year);
        } else {
            later = new MyDate(this.day, this.month, this.year);
            earlier = new MyDate(comparedDate.day, comparedDate.month, comparedDate.year);
        }
        
        int differenceSoFar = Math.abs(later.year - earlier.year);
        if (later.month < earlier.month && differenceSoFar != 0) {
            differenceSoFar--;
        } else if (later.month == earlier.month && later.day < earlier.day && differenceSoFar != 0) {
            differenceSoFar--;
        }
        return differenceSoFar;

    }

}
