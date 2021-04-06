package Shorting;
import java.util.Scanner;

public class Binary {
    public static void main (String [] args){
        int dataB[] = {2,4,6,8,10,12,14,16,18,20};
        int cari;
        int IndeksAwal = 0;
        int IndeksAkhir = dataB.length-1;
        int ketemu = 0;
        int point = 0;
        
        //menampilkan data dalam Array
        System.out.println("isi dari dataB adalah");
        for (int i=0; i<dataB.length; i++){
            
            System.out.print(dataB[i] + " ");
        }
        System.out.println("");
        System.out.println("");
        
        System.out.print(" Data yang ingin dicari adalah : ");
        Scanner scan = new Scanner(System.in);
        cari = scan.nextInt();
        
        while ((IndeksAwal <= IndeksAkhir) && (ketemu == 0)) {
        point = (IndeksAwal + IndeksAkhir) / 2;
        System.out.println("indeks pointer :"+ point);
            if (cari == dataB[point]) {
                ketemu = 1;
                System.out.println(" Data " + cari + " telah ditemukan pada indeks ke-" + point);
            }
            
            else if (cari < dataB[point]) {
                System.out.println("Cari disebelah kiri ");
                IndeksAkhir = point-1;
            }
            
            else {
                IndeksAwal = point+1;
                System.out.println("Cari disebelah kanan");
            }
        }
        
        
    if (ketemu == 1)
        System.out.println("Kesimpulan: data ditemukan");
    else 
        System.out.println("Kesimpulan: data tidak ditemukan");
        
    System.out.println("Putri Zulfiaturrizki");
    }   
}
