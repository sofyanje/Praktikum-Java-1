package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MahasiswaBeraksi {
    public static void main(String[] args) throws ParseException{

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.npm = "19630116";
        mahasiswa.nama = "Sofyan Assauri";
        mahasiswa.tanggalLahir = simpleDateFormat.parse("19-11-2000");

        System.out.println("Nama \t\t\t : " + mahasiswa.nama);
        System.out.println("NPM \t\t\t : " + mahasiswa.npm);
        System.out.println("Tanggal Lahir \t : " + simpleDateFormat.format(mahasiswa.tanggalLahir));

        System.out.println("");

        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.npm = "19630117";
        mahasiswa2.nama = "Mark Zuckerberg";
        mahasiswa2.tanggalLahir = simpleDateFormat.parse("14-05-1984");

        System.out.println("Nama \t\t\t : " + mahasiswa2.nama);
        System.out.println("NPM \t\t\t : " + mahasiswa2.npm);
        System.out.println("Tanggal Lahir \t : " + simpleDateFormat.format(mahasiswa.tanggalLahir));
    }
}
