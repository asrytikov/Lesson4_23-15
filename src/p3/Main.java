package p3;

public class Main {

    public static void main(String[] args) {
        int a = 5;
        int b = a;
        int c = 5;
        c+=b; // c = c + b;
        // c-=b; c*=b; c/=b; c%=b;

        int num1 = 6;
        int num2 = 5;

        if (num1>num2){
            System.out.println("First > second");
        }else if (num1<num2){
            System.out.println("First < second");
        }else {
            System.out.println("First == second");
        }

        int num = 1;

        switch (num){
            case 1:
                System.out.println("Number = 1");
                break;
            case 8:
                System.out.println("Number = 8");
                break;
            case 9:
                System.out.println("Number = 9");
                break;
            default:
                System.out.println("Number != 1, 8, 9");
        }





    }

}
