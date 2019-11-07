/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pkg10118048.latihan57.vehicle;

/**
 *
 * @author NIX
 * NAMA : Niko Yama
 * KELAS : PBO2
 * NIM : 10118048
 * Deskripsi program : menampilkan vehicle berdasarkan jenis 
 */
public class PBO210118048Latihan57Vehicle {

    public static void main(String[] args) {
        
        Bicycle bicycle = new Bicycle();
        bicycle.setMyBrand("Trek Bike");
        bicycle.setMyModel("7.4FX");
        bicycle.setMyGearCount(23);
        System.out.println("Brand\t: " + bicycle.getMyBrand());
        System.out.println("Model\t: " + bicycle.getMyModel());
        System.out.println("Jumlah Gear : " + bicycle.getMyGearCount() + "\n");
        
        Skateboard skate = new Skateboard();
        skate.setMyBrand("Ally Skate");
        skate.setMyModel("Rocket");
        skate.setMyBoardLength(54.5);
        System.out.println("Brand\t: " + skate.getMyBrand());
        System.out.println("Model\t: " + skate.getMyModel());
        System.out.println("Panjangnya Board : " + skate.getMyBoardLength());
    }

}
