/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mod_2a;

/**
 *
 * @author rizal
 */
import javax.swing.JOptionPane;
public class PostTest {
public static void main(String[] args){
String Nama, NIM, Ttl, Prodi, Fakultas, Universitas;
Nama = JOptionPane.showInputDialog("Masukan Nama");
NIM = JOptionPane.showInputDialog("Masukan NIM");
Ttl = JOptionPane.showInputDialog("Masukan Tempat Tanggal Lahir");
Prodi = JOptionPane.showInputDialog("Masukan Nama Prodi");
Fakultas = JOptionPane.showInputDialog("Masukan Nama Fakultas");
Universitas = JOptionPane.showInputDialog("Masukan Nama Universitas");

JOptionPane.showMessageDialog(null, 
        "Nama = " + Nama + "\n"+
        "NIM = " + NIM + "\n"+
        "Ttl = " + Ttl + "\n"+
        "Prodi = " + Prodi + "\n"+
        "Fakultas = " + Fakultas +"\n"+
        "Universitas = " + Universitas +"\n");
                
                


}
    
}
