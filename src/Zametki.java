import java.util.Scanner;

public class Zametki {

    private String zametka;

    public Zametki() {
    }

    public Zametki(String zametka) {
        this.zametka = zametka;
    }

    public String getZametka() {
        return zametka;
    }

    public void setZametka(String zametka) {
        this.zametka = zametka;
    }
    public void Zamet(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pishite zametku: ");
        this.setZametka(scanner.nextLine());
        System.out.println("Vashi zametki: "+getZametka());
    }

}
