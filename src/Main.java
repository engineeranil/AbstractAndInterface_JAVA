import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("ENTER CARD NUMBER :)");
        String cartNumber = sca.next();
        System.out.println("ENTER EXPIRE DATE :)");
        String expireDate = sca.next();
        System.out.println("ENTER CVC :)");
        String CVC = sca.next();
        System.out.println("-------------------------");
        System.out.println("SELECT BANK");
        System.out.println("1-ABank");
        System.out.println("2-Bbank");

        int selectBank = sca.nextInt();

        switch (selectBank){
            case 1:
                ABank a1 = new ABank("ABank","147","3737");
                a1.connect();
                a1.sendCardInfo();
                break;
            case 2:
                BBank b1 = new BBank("BBank","158","7878");
                b1.connect();
                b1.sendCardInfo();
                break;
            default:
                System.out.println("ENTER A VALID NUMBER :( ");
        }
    }
}
