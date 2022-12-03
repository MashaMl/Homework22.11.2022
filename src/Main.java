import java.util.Scanner;

public class Main extends Pupil{
    public static void main(String[] args) {
        //Task 2
       /* Pupil Masha = new ExcellentPupil();
        Pupil Misha = new GoodPupil();
        Pupil Kolya = new GoodPupil();
        Pupil Roma = new BadPupil();
        ClassRoom classRoom = new ClassRoom(Masha, Misha);
        classRoom.setPupils(Kolya, 2);
        classRoom.setPupils(Roma, 3);
        for(int i = 0; i < classRoom.getPupils().length; ++i) {
            classRoom.getPupil(i).study();
            classRoom.getPupil(i).read();
            classRoom.getPupil(i).write();
            classRoom.getPupil(i).read();
        }
            */
        //Task 3
       /* Plane plane = new Plane("secret coordinates", 200_000, 400, 2022, 20, 25);
        Car car = new Car("secret coordinates", 10_000, 200, 2021);
        Ship ship = new Ship("secret coordinates", 150_000, 150, 2023, "Port of unicorns", 10);
        System.out.println("\nPlane: \nCoordinates: " + plane.getCoordinates() + "\nPrice: $" + plane.getPrice() + "\nSpeed: " + plane.getSpeed() + "\nYear: " +
                plane.getYear() + "\nHeight: " + plane.getHeight() + "\nNumber of passengers" + plane.getNumberOfPassengers());

        System.out.println("\nCar: \nCoordinates: " + car.getCoordinates() + "\nPrice: $" + car.getPrice() + "\nSpeed: " + car.getSpeed() +
                "\nYear: " + car.getYear());
        System.out.println("\nShip: \nCoordinates: " + ship.getCoordinates() + "\nPrice: $" + ship.getPrice() + "\nSpeed: " + ship.getSpeed() +
                "\nYear: " + ship.getYear() + "\nPort: " + ship.getPort() + "\nNumber of passengers: " + ship.getNumberOfPassengers());


        */
        //Task 4
        /*DocumentWorker documentWorker = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nВітаємо у Ваших Документах. Введіть ключ доступу: \n1 - базова версія \n2 - PRO версія \n3 - EXPERT версія");
        int key = scanner.nextInt();
        switch (key) {
            case 1:
                documentWorker = new DocumentWorker();
                break;
            case 2:
                documentWorker = new ProDocumentWorker();
                break;
            case 3:
                documentWorker = new ExpertDocumentWorker();
                break;
            default:
                System.out.println("Wrong key. Please, restart documents and enter a correct key.");
        }
        documentWorker.openDocument();
        documentWorker.editDocument();
        documentWorker.saveDocument();

         */
        //Task 6
        /*Printer a = new PrinterRed();
        a.print("☻☻☻☻☻");
        PrinterRed b = (PrinterRed) a;
        b.print("☻☻☻☻☻");
        PrinterGreen c = new PrinterGreen();
        c.print("☻☻☻☻☻");*/
    }
}