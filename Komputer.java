/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author Ecliptica
 */
public class Komputer {
    public String merk;
    public int kecProsesor;
    public int sizeMemory;
    public String jnsProsesor;
    
    public Komputer() {
        
    }

    public Komputer(String merk, int kecProsesor, int sizeMemory, String jnsProsesor) {
        this.merk = merk;
        this.kecProsesor = kecProsesor;
        this.sizeMemory = sizeMemory;
        this.jnsProsesor = jnsProsesor;
    }
    
    public void tampilData() {
        System.out.println("Merk                : "+merk);
        System.out.println("Kecepatan Prosesor  : "+kecProsesor+" Ghz");
        System.out.println("Size Memory         : "+kecProsesor+" GB");
        System.out.println("Jenis Prosesor      : "+jnsProsesor);
        System.out.println("-------------------------------------------");
    }
}
