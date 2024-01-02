public interface Vehicle {
    public int getSpeed();
    public void applyBreak();

   public default void autoPoilot(){
        System.out.println("Autopilot is running");
    }

    public static void TurnOnEngine(){
        System.out.println("Turning on engine...");
    }
}
