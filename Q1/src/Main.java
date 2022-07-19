
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter maker: ");
        String Maker = sc.nextLine();
        System.out.print("Enter price: ");
        int Price = sc.nextInt();
        sc.nextLine();
        System.out.println("1. Test getMaker()");
        System.out.println("2. Test setPrice()");
        System.out.println("3. Get Code()");
        System.out.print("Enter TC (1, 2, or 3): ");
        int tc = sc.nextInt();
        sc.nextLine();
        Course t = new Course(Maker, Price);
        if (tc == 2) {
            System.out.print("Enter new price: ");
            int price2 = sc.nextInt();
            sc.nextLine();
            t.setPrice(price2);
        }

        System.out.println("OUTPUT:");
        switch (tc) {
            case 1:
                String u = t.getMaker();
                System.out.printf("%s\r\n", u);
                break;
            case 2:
                int v = t.getPrice();
                System.out.printf("%d\r\n", v);
                break;
            case 3:
                System.out.println(t.getCode());
                break;
            default:
                return;
        }

        System.out.println();
    }
}
