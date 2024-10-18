/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author Ecliptica
 */
public class Windows extends Laptop{
    public String fitur;

    public Windows(String fitur, String jnsBaterai, String merk, int kecProsesor, int sizeMemory, String jnsProsesor) {
        super(jnsBaterai, merk, kecProsesor, sizeMemory, jnsProsesor);
        this.fitur = fitur;
    }    
    
    public void tampilWindows() {
        tampilData();
        System.out.println("Fitur               : "+fitur);
    }
}
