//Task 6
public class PrinterGreen extends Printer {
    static final String GREEN = "\u001b[32m";
    public void print(String value) {
        System.out.println(GREEN + value);
    }
}
