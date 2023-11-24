import java.util.Arrays;
import java.util.Scanner;

public class Bank extends Karta {
    private int money;

    public Bank(int money) {
        this.money = money;
    }

    public Bank() {
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
    public  Karta[] Money(Karta[] kartas){
        boolean a = true;
       while (a) {
           Scanner scanner = new Scanner(System.in);
           System.out.println("Vnesite dengi: ");
           int mon = scanner.nextInt();
           mon += this.getMoney();
           this.setMoney(mon);
           a = false;
       }

        return kartas;
    }
    public String Balance(){
        return "Balance: "+this.getMoney();
    }
    public int perevod(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pishite nomer karty: ");
        int karta = scanner.nextInt();
        System.out.println("Pishite dengi: ");
        int number = scanner.nextInt();
        if(number <= getMoney() && number > 0){
            this.setMoney((this.getMoney() - number));
        }else System.out.println("Vedite pravilnuy summu!");

        return getMoney();

    }
    public int edd(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pishite nomer telefona: ");
        int nomer = scanner.nextInt();
        System.out.println("Pishite summu: ");
        int summa = scanner.nextInt();
        if(summa <= getMoney() && summa >0){
            this.setMoney((this.getMoney() - nomer));
        } else System.out.println("Vedite pravilnuy summu!");
        return getMoney();
    }

    @Override
    public String toString() {
        return "Bank{" +
                "Balance-> " + money +
                '}';
    }
}
