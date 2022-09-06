
package hgs;

import hgs.Arac;

/**
 *
 * @author Rukiye
 */
public class Otomobil extends Arac {
    
    private int surucuBakiye = 1000;
   
    public Otomobil(String HgsNo,  String sinif,String isim, String soyisim, String date, String time){
      super(HgsNo,sinif,isim, soyisim, date,time);
    }

   

    @Override
    public void bakiyeDegistir() {
      surucuBakiye-=100;
      System.out.println("Otomobil surucu bakiye: "+surucuBakiye);
      giseToplamBakiye+=100;
    }
    
  
}
