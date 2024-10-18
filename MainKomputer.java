/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UTS;

/**
 *
 * @author Ecliptica
 */
public class MainKomputer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mac mac = new Mac("Touch ID", "B001", "MacBook M5", 4, 4, "Intel");
        mac.tampilMac();

        Windows windows = new Windows("Login", "B002", "PC apaya", 3, 8, "AMD");
        windows.tampilWindows();

        PC pc = new PC(10, "ROG", 3, 8, "Intel");
        pc.tampilPC();
    }
    
}
