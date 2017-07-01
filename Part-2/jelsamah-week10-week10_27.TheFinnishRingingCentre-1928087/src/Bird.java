
public class Bird {

    private String name;
    private String latinName;
    private int ringingYear;

    public Bird(String name, String latinName, int ringingYear) {
        this.name = name;
        this.latinName = latinName;
        this.ringingYear = ringingYear;
    }

    @Override
    public String toString() {
        return this.latinName + " (" + this.ringingYear + ")";
    }

    @Override
    public boolean equals(Object object) {
        if (getClass() != object.getClass()) {
            return false;
        }
        Bird bird = (Bird) object;
        if (!(this.latinName.equals(bird.latinName)) || !(this.ringingYear == bird.ringingYear)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return this.latinName.hashCode() + ringingYear;
    }

}
