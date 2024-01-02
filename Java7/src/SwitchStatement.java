public class SwitchStatement {
    public static void main(String[] args) {
        String input = "wednesday";
        switch (input) {
            case "monday":
                System.out.println("Today is Monday");
                break;

            case "tuesday":
                System.out.println("Today is tuesday");
                break;

            case "wednesday":
                System.out.println("Today is wednesday");
                break;

            case "thursday":
                System.out.println("Today is thursday");
                break;

            case "friday":
                System.out.println("Today is friday");
                break;

            case "saturday":
                System.out.println("Today is saturday");
                break;

            default:
                System.out.println("Today is Sunday");
        }

        switch (input) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                System.out.println("Today is weekday");
                break;
            case "saturday":
            case "sunday":
                System.out.println("Today is weekend");
                break;
        }
    }
}
