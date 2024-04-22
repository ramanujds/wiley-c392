public class Phone {

    private Sim sim;

    public void makeCall(){
        sim.call();
    }

    public void browseInternet(){
        System.out.println("From Phone ");
        sim.browseInternet();
    }

    public void setSim(Sim sim){
        this.sim=sim;
    }


}
