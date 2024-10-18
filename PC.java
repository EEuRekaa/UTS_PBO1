/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author Ecliptica
 */
public class PC extends Komputer{
    public int ukuranMonitor;

    public PC(int ukuranMonitor, String merk, int kecProsesor, int sizeMemory, String jnsProsesor) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
        this.ukuranMonitor = ukuranMonitor;
    }    
         
    public void tampilPC() {
        tampilData();
        System.out.println("Ukuran Monitor      : "+ukuranMonitor+" inch");
    }
}
