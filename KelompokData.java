package com.samuel.apksqlite;

import java.util.ArrayList;

public class KelompokData {
    private static String[] NamaKelompok = {
            "Nurul Fafrianti",
            "Ni Made Krisdayanti",
            "Leony Putri Limansyah",
            "Moh. Gugun Ramadhan",
            "Muh. Arjun"
    };

    private static String[] StambukKelompok = {
            "F55117011",
            "F55117053",
            "F55117063",
            "F55117112",
            "F55117153"
    };

    private static String[] EmailKelompok = {
            "nurulfafrianti99@gmail.com",
            "krisdayanti.kk28@gmail.com",
            "leony.limanyah@gmail.com",
            "gugun1512@gmail.com",
            "muhammadarjun460@gamil.com"

    };

    private static int[] ImagesKelompok = {
            R.drawable.nuy,
            R.drawable.krisda,
            R.drawable.nony,
            R.drawable.gugun,
            R.drawable.arjun
    };

    static ArrayList<Kelompok> getListData() {
        ArrayList<Kelompok> grup = new ArrayList<>();
        for (int position = 0; position < NamaKelompok.length; position++) {
            Kelompok kelompok = new Kelompok();
            kelompok.setNama(NamaKelompok[position]);
            kelompok.setStambuk(StambukKelompok[position]);
            kelompok.setEmail(EmailKelompok[position]);
            kelompok.setFoto(ImagesKelompok[position]);
            grup.add(kelompok);
        }
        return grup;
    }
}
