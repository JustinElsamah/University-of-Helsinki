package boxes;

public class Thing {

    private String name;
    private int weight;

    public Thing(String name, int weight) {
        if(weight < 0){
            throw new IllegalArgumentException("weight can't be negative");
        }
        this.name = name;
        this.weight = weight;
    }

    public Thing(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
    
    @Override
    public boolean equals(Object object){
        if(object == null){
            return false;
        }
        
        if(object.getClass() != this.getClass()){
            return false;
        }
        
        Thing thing = (Thing)object;
        
        return this.name.equals(thing.name);
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }
}
