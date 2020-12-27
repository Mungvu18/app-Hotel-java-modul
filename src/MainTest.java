import java.awt.*;
import java.util.Scanner;

public class MainTest {
    static Scanner sc = new Scanner(System.in);
    static ManageHotel manageHotel = new ManageHotel();

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("menu ");
            System.out.println("1. add hotel ");
            System.out.println("2. display all");
            System.out.println("3. find and return money by Id");
            System.out.println("0. Exit ");
            System.out.println("Enter choice ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Mời bạn nhập n số người cần thêm");
                    int number = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < number ; i++) {
                        addHotel();
                    }
                    break;
                case 2:
                   manageHotel.displayAll();
                    break;
                case 3:
                    returnMoney();
                    break;
                case 0:
                    System.out.println("Bạn rời khỏi chương trình");
                    System.exit(0);
                    break;
            }
        } while (choice != 0);
    }
    public static void addHotel(){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Nhập tên");
        String name = sc.nextLine();
        System.out.println("Nhập ngày sinh");
        String birthDay = sc1.nextLine();
        System.out.println("Nhập chứng minh thứ");
        String peopleId = sc.nextLine();
        System.out.println("Nhập số ngày thuê");
        int dayByRent = Integer.parseInt(sc1.nextLine());
        System.out.println("Nhập kiểu phòng là 1 trong ba kiểu: [small,normal,luxury]");
        String kindOfRoom = sc.nextLine();
        Person person = new Person(name,birthDay,peopleId);
        Hotel hotel = new Hotel(person,dayByRent,kindOfRoom);
        manageHotel.addPerson(hotel,peopleId);
        System.out.println("-------------------------------------");
    }
    public static void returnMoney(){
        System.out.println("Mòi bạn nhập chứng minh thư của khách cần trả phòng");
        String peopleId = sc.nextLine();
        manageHotel.returnTotalMoneyByIdOfPerson(peopleId);
    }
}
