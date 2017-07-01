
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int pv, int kk, int vv) {
        this.day = pv;
        this.month = kk;
        this.year = vv;
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
        
        
        MyDate earlier = new MyDate(this.day, this.month, this.year);
        MyDate later = new MyDate(comparedDate.day, comparedDate.month, comparedDate.year);
       
        
        int differenceSoFar = Math.abs(later.year - earlier.year);
        if (later.month < earlier.month && differenceSoFar != 0) {
            differenceSoFar--;
        } else if (later.month == earlier.month && later.day < earlier.day && differenceSoFar != 0) {
            differenceSoFar--;
        }
        return differenceSoFar;

    }
    public int differneceInYears(MyDate compared) {
        return -99;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

                
}