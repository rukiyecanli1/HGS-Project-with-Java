
package hgs;

import hgs.Arac;

/**
 *
 * @author Rukiye
 */
public class Otobus extends Arac {
    
    private int surucuBakiye = 1000;
  
    public Otobus(String HgsNo, String sinif, String isim, String soyisim, String date, String time) {
        super(HgsNo, sinif, isim, soyisim, date, time);
    }

   

    @Override
    public void bakiyeDegistir() {
      surucuBakiye-=50;
      System.out.println("Otobus surucu bakiye: "+surucuBakiye);
      giseToplamBakiye+=50;
    }
    
  
    
}

