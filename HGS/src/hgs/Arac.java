package hgs;

import java.util.Arrays;

/**
 *
 * @author Rukiye
 */
public class Arac {

    private String HgsNo;
    private String isim;
    private String soyisim;
    private String sinif;
    private String date;
    private String time;

    public static int giseToplamBakiye = 0;

    private static final int N = 5;
    private Arac[] araclar = new Arac[N];
    private int size = 0;

    //default constructor
    public Arac() {
    }

    //constructor
    public Arac(String HgsNo, String sinif, String isim, String soyisim, String date, String time) {
        this.HgsNo = HgsNo;
        this.sinif = sinif;
        this.isim = isim;
        this.soyisim = soyisim;
        this.date = date;
        this.time = time;
    }

    //override edilecek metod
    public void bakiyeDegistir() {
    }

 
    
    public void aracYazdir() {
        System.out.println(Arrays.toString(this.araclar));
      
    }

    public void aracEkle(Arac arac) {

        this.araclar[size] = arac;
        size++;

    }

    
    @Override
    public String toString() {
        return this.HgsNo + " " + this.sinif ;
        //+ " " + this.isim...;
    }

}
