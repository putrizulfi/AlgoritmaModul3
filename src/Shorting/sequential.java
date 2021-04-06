package Shorting;
import java.util.Scanner;

public class sequential {
    public static void main(String [] args) {
        String dataA[] = {"Galileo","Archimedes","Alkhawarizmi","Aljabar","Nama Mahasiswa","Tesla"};
        String cari;
        int ketemu = 0;
        
        System.out.println("isi data A adalah");
            for(int i=0; i<dataA.length; i++) {
                System.out.print(dataA[i] + " ");
            }
            
            System.out.println("");
            System.out.println("");
           
            Scanner scan = new Scanner(System.in);
            System.out.println("masukkan data yang akan dicari");
            cari = scan.nextLine();
            
            for(int i=0; i<dataA.length; i++){
                if(cari.equalsIgnoreCase(dataA[i])){
                    ketemu = 1;
                    System.out.print(" data " + cari + " berada di indeks ke- " +i);
                }
            }
            System.out.println(" ");
            System.out.println(" ");
            
            if (ketemu == 1) 
                System.out.println("Kesimpulan: Data ditemukan");
            else
                System.out.println("Kesimpulan: Data tidak ditemukan");
            
            System.out.println("Putri Zulfiaturrizki");
                }
            }

            