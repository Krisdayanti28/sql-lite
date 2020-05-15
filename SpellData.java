package com.samuel.apksqlite;

import java.util.ArrayList;

public class SpellData {
    private static String[] heroNames = {
            "CPU",
            "Flasdisk",
            "Hardisk",
            "Keyboard",
            "Kipas Eksternal",
            "Monitor",
            "Printer",
            "Mouse",
            "Speaker"
    };

    private static String[] heroDetails = {
            "CPU merupakan singkatan dari Central Processing Unit adalah komponen keras atau perangkat hardware pemroses data utama dalam sebuah komputer",
            "FlashDisk adalah sebuah alat penyimpanan data eksternal yang dihubungkan port USB yang mampu menyimpan berbagai format data dan memiliki kapasitas penyimpanan yang cukup besar.",
            "Hardisk adalah sebuah komponen perangkat keras (hardware) untuk mendukung komputer atau laptop dalam menyediakan ruang untuk menyimpan data atau output dari berbagai proses data di komputer.",
            "Keyboard sebuah perangkat keras (hardware) pada komputer yang berfungsi sebagai alat untuk input data yang berupa huruf, angka dan simbol.",
            "Kipas Eksternal peralatan yang digunakan untuk mendinginkan laptop jika temperatur ruang atau laptop terlalu panas.",
            "Monitor adalah perangkat keras yang digunakan sebagai alat output data secara grafis pada sebuah CPU, monitor juga kerap disebut sebagai layar tampilan komputer.",
            "Printer adalah peranti yang menampilkan data dalam bentuk cetakan, baik berupa teks maupun gambar/grafik, di atas kertas.",
            "Mouse Mouse komputer merupakan perangkat keras yang termasuk dalam golongan perangkat input (masukan). Fungsi mouse komputer adalah mengatur pergerakan kursor secara cepat, selain itu juga untuk memberikan suatu perintah dengan hanya menekan tombol pada mouse komputer.",
            "Speaker adalah Transduser yang dapat mengubah sinyal listrik menjadi Frekuensi Audio (sinyal suara) yang dapat didengar oleh telinga manusia dengan cara mengetarkan komponen membran pada Speaker tersebut sehingga terjadilah gelombang suara."
    };

    private static int[] heroesImages = {
            R.drawable.cpu,
            R.drawable.flashdisk,
            R.drawable.harddisk,
            R.drawable.keyboard,
            R.drawable.kipas,
            R.drawable.monitor,
            R.drawable.printer,
            R.drawable.mouse,
            R.drawable.speaker
    };

    static ArrayList<Spell> getListData() {
        ArrayList<Spell> dSpells = new ArrayList<>();
        for (int position = 0; position < heroNames.length; position++) {
            Spell spell = new Spell();
            spell.setNama(heroNames[position]);
            spell.setDetail(heroDetails[position]);
            spell.setFoto(heroesImages[position]);
            dSpells.add(spell);
        }
        return dSpells;
    }
}
