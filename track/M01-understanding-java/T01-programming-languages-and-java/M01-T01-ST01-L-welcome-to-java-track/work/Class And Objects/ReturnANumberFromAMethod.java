
class NumberUtility {

    int getNumber() {

// Return 10
        return 10;

    }

}

public class ReturnANumberFromAMethod {

    public static void main(String[] args) {

// Create object
        NumberUtility n1 = new NumberUtility();

// Call getNumber()
        int res = n1.getNumber();

// Print returned value
        System.out.print(res);
    }
}
