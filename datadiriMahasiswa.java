import java.util.Scanner;
public class datadiriMahasiswa {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String nama,npm,jurusan;
        int usia;

        System.out.print("Masukan nama anda: ");
        nama = input.nextLine();
        System.out.print("Masukan NPM anda: ");
        npm = input.nextLine();
        System.out.print("Masukan Jurusan anda: ");
        jurusan = input.nextLine();
        System.out.print("Masukan Usia anda: ");
        usia = input.nextInt();

        System.out.println("\nData Diri Mahasiswa");
        System.out.println("Nama : " + nama);
        System.out.println("NPM : " + npm);
        System.out.println("Jurusan : " + jurusan);
        System.out.println("Usia : " + usia);

    }
    
}
