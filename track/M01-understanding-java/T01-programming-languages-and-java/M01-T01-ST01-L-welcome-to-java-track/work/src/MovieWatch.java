
public class MovieWatch {

    public static void main(String[] args) {
        boolean ticket = true;
        int age = 20;
        if (ticket == true) {
            if (age >= 18) {
                System.out.print("Watch movie");
            } else {
                System.out.print("Too young");
            }
        } else {
            System.out.print("Buy Ticket");
        }
    }
}
