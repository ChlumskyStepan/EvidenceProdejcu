import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.LocalDate;
public class EvidenceProdejcu {

     static class Prodejce {
        static String jmeno = "Karel"; //Jméno
        static String prijmeni = "Novotný"; //Příjmení
        static LocalDate datumNarozeni = LocalDate.of (1995,5 ,3); //Datum nazorení
        static int sjednaneSmlouvy = 1; //Počet sjednaných smluv
        static double prodaneMrkve = 5.3; //Celkové množství prodané mrkve v tunách
        static String bydliste = "Liberec"; //Název města, kde prodejce sídlí
        static String SPZ = "6L2 1546"; //Registrační značka vozidla
        static double spotrebaVozidla = 7.6; //Spotřeba firemního vozidla
        static byte[] addr = { 127, 0, 0, 1 }; //IP adresa verze 4 firemního počítače
         static InetAddress adresa_IPv4;

         static {
             try {
                 adresa_IPv4 = InetAddress.getByAddress(addr);
             } catch (UnknownHostException e) {
                 throw new RuntimeException(e);
             }
         }

     }

    public static void main(String[] args) {
        EvidenceProdejcu myObj = new EvidenceProdejcu();
        float prumer = (float)((Prodejce.sjednaneSmlouvy + Prodejce.prodaneMrkve) / 2);
        System.out.println("Průměr prodaného množství mrkve na jednu smlouvu: "+prumer);


    }
}