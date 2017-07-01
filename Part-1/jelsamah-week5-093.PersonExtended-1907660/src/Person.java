
import java.util.Calendar;

public class Person {

    private String name;
    private MyDate birthday;

    public Person(String name, int pp, int kk, int vv) {
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);
    }

    public Person(String name, MyDate birthday) {
        this(name, birthday.getDay(), birthday.getMonth(), birthday.getYear());
    }
    
    public Person(String name){
        this(name,Calendar.getInstance().get(Calendar.DATE),Calendar.getInstance().get(Calendar.MONTH)+1,Calendar.getInstance().get(Calendar.YEAR));
    }

    public int age() {
        MyDate today = new MyDate(Calendar.getInstance().get(Calendar.DATE), Calendar.getInstance().get(Calendar.MONTH) + 1, Calendar.getInstance().get(Calendar.YEAR));
        int age = birthday.differenceInYears(today);
        return age;
    }

    public boolean olderThan(Person compared) {
        if (this.birthday.getYear() < compared.birthday.getYear()) {
            return true;
        } else if (this.birthday.getYear() == compared.birthday.getYear() && this.birthday.getMonth() < compared.birthday.getMonth()) {
            return true;
        } else if (this.birthday.getYear() == compared.birthday.getYear() && this.birthday.getMonth() == compared.birthday.getMonth() && this.birthday.getDay() < compared.birthday.getDay()) {
            return true;
        }
        return false;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name + ", born " + this.birthday;
    }
}
