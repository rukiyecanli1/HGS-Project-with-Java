package hgs;

/**
 *
 * @author Rukiye
 */
public class Yonetim {

    public static void main(String[] args) {
        
         System.out.println("Baslangicta tum suruculerde 1000TL vardir.");

        Arac a = new Arac();

        // Otomobil geçişi 
        System.out.println("Otomobil gecisi...");
        Arac arac1 = new Otomobil("0", "Otomobil", "Ayşe", "Can", "05.08.22", "13:21");

        // otomobil sürücüsünün bakiyesi azaltilip bakiye ekrana yazdırılıyor
        arac1.bakiyeDegistir();

        // Otomobil Arac sınıfındaki araclar isimli diziye ekleniyor
        a.aracEkle(arac1);

        //Minibüs geçişi
         System.out.println("Minibus gecisi...");
        Arac arac2 = new Minibus("1", "Minibus", "Emre", "Ak", "05.08.22", "13:35");

        // Minibüs sürücüsünün bakiyesi azaltilip bakiye ekrana yazdırılıyor
        arac2.bakiyeDegistir();

        // MinibusArac sınıfındaki araclar isimli diziye ekleniyor
        a.aracEkle(arac2);
        // islem.aracYazdir();

        //Otobus geçişi
         System.out.println("Otobus gecisi...");
        Arac arac3 = new Otobus("2", "Otobus", "Ali", "Demir", "05.08.22", "13:35");

        // Otobüs sürücüsünün bakiyesi azaltilip bakiye ekrana yazdırılıyor
        arac3.bakiyeDegistir();

        //Otobus Arac sınıfındaki araclar isimli diziye ekleniyor
        a.aracEkle(arac3);

        //Dizideki aracların HgsNo ve sınıfları ekrana yazdırılıyor
        a.aracYazdir();

        //Gisedeki toplam para miktarı ekrana yazdırılıyor
        giseToplam();

    }

    // Arac sınıfındaki static olan giseToplamBakiye değişkeni çağrılıyor
    public  static void giseToplam() {
      
        System.out.println("Gise toplam bakiye: " + Arac.giseToplamBakiye);
    }
}
