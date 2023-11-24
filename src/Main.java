import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Zametki zametki = new Zametki();
        Calculator calculator = new Calculator();
        Bank bank = new Bank();
        boolean is = true;
        while (is){
            System.out.println("""
                    1.Zametki
                    2.Bankprilojenie
                    3.Calculyutor
                    """);
            switch (scanner.nextLine()){
                case "1" -> {
                    zametki.Zamet();
                }
                case "2" -> {
                    boolean n = true;
                    while (n){
                        System.out.println("""
                                1.Popolnit balance
                                2.Proverit balance
                                3.Perevod na kartu
                                4.Perevod na balance
                                """);
                        switch (scanner.nextLine()){
                            case "1" -> {
                                bank.Money(bank.getKartas());
                            }
                            case "2" -> {
                                System.out.println(bank.Balance());
                            }
                            case "3" ->{
                                bank.perevod();
                                System.out.println("Uspeshno pereveli: ");
                            }
                            case "4" -> {
                                bank.edd();
                            }
                        }
                    }
                }
                case "3" -> {
                  calculator.calculaite();
                }
            }
        }
    }
}