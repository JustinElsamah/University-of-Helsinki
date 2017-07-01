package reader.criteria;

public class Not implements Criterion{

    private Criterion c1;
    
    public Not(Criterion c1) {
        this.c1 = c1;
    }

    @Override
    public boolean complies(String line) {
        return !this.c1.complies(line);
    }

}
