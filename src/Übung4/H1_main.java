package Übung4;

public class H1_main {
    public static void main(String[] args){

        int zone = 6;
        double price = 10.00;

        price = 2.00;

        switch (zone){
            case 1:
                System.out.println(price);
                break;
            case 2:
                price = price + 0.35;
                System.out.println(price);
                break;
            case 3:
            case 4:
                price = price + 0.85;
                System.out.println(price);
                break;
            case 5:
                price = price + 1.55;
                System.out.println(price);
                break;
            default:
                price = 4;
                System.out.println(price);
        }

    }
}
