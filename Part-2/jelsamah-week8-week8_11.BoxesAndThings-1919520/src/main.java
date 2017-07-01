public class main {
    public static void main(String[] args){
        Box box1 = new Box(10);

        box1.add( new Book("Fedor Dostojevski", "Crime and Punishment", 2) ) ;
        box1.add( new Book("Robert Martin", "Clean Code", 5) );
        box1.add( new Book("Kent Beck", "Test Driven Development", 0.7) );

        Box box2 = new Box(20);
        box2.add(new Book("Dostojevski", "Crime", 2));
        box2.add(new Book("Fedor", "Punishment", 4));
        box2.add(box2);
        System.out.println( box2 );
    }
}
