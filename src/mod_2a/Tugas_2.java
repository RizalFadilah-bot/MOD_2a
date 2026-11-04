
package mod_2a;

import javax.swing.JOptionPane;
public class Tugas_2 {
    public static void main(String[]args){
     String nama,NIM;
     double MP,UTS,UAS,NA;
     
     nama = JOptionPane.showInputDialog("Masukan Nama");
     NIM = JOptionPane.showInputDialog("Masukan NIM");
     MP = Double.parseDouble(JOptionPane.showInputDialog("Masukkan Nilai MP"));
     UTS = Double.parseDouble(JOptionPane.showInputDialog("Masukkan Nilai UTS"));
     UAS = Double.parseDouble(JOptionPane.showInputDialog("Masukkan Nilai UAS"));
     
     NA =(6 * MP + 2 * UTS + 2 * UAS) /10;
     
     JOptionPane.showMessageDialog(null, 
             "Nama = " + nama + "\n" +
              "NIM = " + NIM + "\n" +
              "Nilai MP = " + MP + "\n"+
              "Nilai UTS = " + UTS + "\n"+
              "Nilai UAS = " + UAS + "\n"+
              "Nilai Akhir = " + NA);
     
    }
    
}
