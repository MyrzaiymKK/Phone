import java.util.Scanner;

public class Calculator {
    private int a;
    private int b;

    public Calculator() {
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void  calculaite() {
        Scanner scanner = new Scanner(System.in);
        boolean n = true;
        while (n) {
            System.out.println("Enter the number: ");
            this.setA(scanner.nextInt());
            System.out.println("Enter the secomd number: ");
            this.setB(scanner.nextInt());
            System.out.println("Enter the comand +,-,*,/ : ");
            switch (new Scanner(System.in).nextLine()) {
                case "+" -> {
                   int m = getA()+getB();
                    System.out.println("Otvet: "+m);
                    System.out.println("Vyiti -> $");
                }
                case "-" ->{
                    int s = a - b;
                    System.out.println("Otvet: "+s);
                }
                case "*" -> {
                    System.out.println("Otvet: "+a * b);
                }
                case "/" -> {
                    System.out.println("Otvet: "+ a / b);
                }

            }
            n = false;


        }

    }
}
