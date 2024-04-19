public class ShowableTest {
    public static void main(String[] args) {
        Showable obj = ()-> System.out.println("Hi");


        Showable obj2 = new Showable(){
            public void show(){
                System.out.println("Bye");
            }
        };

        obj.show();
        obj2.show();
    }
}
