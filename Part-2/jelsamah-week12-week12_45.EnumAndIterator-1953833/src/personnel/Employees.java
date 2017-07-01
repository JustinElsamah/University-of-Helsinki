package personnel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {

    private List<Person> employees;

    public Employees() {
        this.employees = new ArrayList<Person>();
    }

    public void add(Person person) {
        this.employees.add(person);
    }

    public void add(List<Person> persons) {
        for (Person person : persons) {
            this.employees.add(person);
        }
    }

    public void print() {
        Iterator<Person> iterator = this.employees.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void print(Education education) {
        Iterator<Person> iterator = this.employees.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getEducation().equals(education)) {
                System.out.println(person);
            }
        }
    }
    
    public void fire(Education education){
        Iterator<Person> iterator = employees.iterator();
        while(iterator.hasNext()){
            Person person = iterator.next();
            if(person.getEducation().equals(education)){
                iterator.remove();
            }
        }
    }
}
