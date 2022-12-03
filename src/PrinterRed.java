//Task 6
public class PrinterRed extends Printer{
    static final String RED = "\u001b[31m";
    public void print(String value) {
        System.out.println(RED + value);
        //Я не понимаю, где здесь нужно использовать преобразование типов и зачем.
    }
}
