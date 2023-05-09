import java.time.LocalDate;
public class EvidenceProdejcu {

    public class Prodejce {
        static String jmeno = "Karel";
        static String prijmeni = "Novotný";
        LocalDate datumNarozeni = LocalDate.of (1995,5 ,3);
        int sjednaneSmlouvy = 3;
        int vahaMrkve = 2;
        String bydliste = "Liberec";


    }

    public static void main(String[] args) {
        EvidenceProdejcu myObj = new EvidenceProdejcu();
        System.out.println(Prodejce.jmeno  Prodejce.prijmeni);
    }
}