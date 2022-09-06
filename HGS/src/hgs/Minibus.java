
package hgs;

import hgs.Arac;

/**
 *
 * @author Rukiye
 */
public class Minibus extends Arac {

    private int surucuBakiye = 1000;
    //private int giseBakiye = 0;

        public Minibus(String HgsNo,  String sinif,String isim, String soyisim, String date, String time){
        super(HgsNo,sinif,isim, soyisim, date,time);
    }

    @Override
    public void bakiyeDegistir() {
        surucuBakiye -= 25;
        System.out.println("Minibus surucu bakiye: " + surucuBakiye);
        giseToplamBakiye+=25;
    }

 
    
  


}
