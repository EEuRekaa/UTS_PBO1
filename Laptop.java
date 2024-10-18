/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author Ecliptica
 */
public class Laptop extends Komputer{
    public String jnsBaterai;
    
    public Laptop() {
    
    }

    public Laptop(String jnsBaterai, String merk, int kecProsesor, int sizeMemory, String jnsProsesor) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
        this.jnsBaterai = jnsBaterai;
    }
        
    public void tampilLaptop() {
        tampilData();
        System.out.println("Jenis Baterai       : "+jnsBaterai);
    }
}
