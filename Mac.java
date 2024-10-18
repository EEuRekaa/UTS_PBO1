/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author Ecliptica
 */
public class Mac extends Laptop{
    public String security;

    public Mac(String security, String jnsBaterai, String merk, int kecProsesor, int sizeMemory, String jnsProsesor) {
        super(jnsBaterai, merk, kecProsesor, sizeMemory, jnsProsesor);
        this.security = security;
    }
          
    public void tampilMac() {
        tampilData();
        System.out.println("Security            : "+security);
    }
}
