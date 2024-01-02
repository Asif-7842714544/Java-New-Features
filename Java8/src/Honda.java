public class Honda implements Vehicle{
    @Override
    public int getSpeed() {
        System.out.println("100km");
        return 100;
    }

    @Override
    public void applyBreak() {
        System.out.println("Breaks are applied");
    }

    @Override
   public void autoPoilot(){
        System.out.println("Honda autopoilot is On");
    }

    public static void main(String[] args) {
        Honda h=new Honda();
        Vehicle.TurnOnEngine();
        h.getSpeed();
        h.applyBreak();
        h.autoPoilot();
    }
}
