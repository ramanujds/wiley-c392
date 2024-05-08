package interfacesegregation;

public class CanonPrinter implements Printer{

    @Override
    public void print() {
        System.out.println("Printing");
    }

}
