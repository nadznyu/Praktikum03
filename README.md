***Percobaan 1***
1. Berdasarkan uji coba 3.2, apakah class yang akan dibuat array of object harus selalu memiliki 
   atribut dan sekaligus method? Jelaskan!
2. Apa yang dilakukan oleh kode program berikut?
   Mahasiswa16[] arrayOfMahasiswa = new Mahasiswa16[3];
3. Apakah class Mahasiswa memiliki konstruktor? Jika tidak, kenapa bisa dilakukan pemanggilan 
   konstruktur pada baris program berikut?
   arrayOfMahasiswa[0] = new Mahasiswa16();
4. Apa yang dilakukan oleh kode program berikut?
   arrayOfMahasiswa[0] = new Mahasiswa16();
   arrayOfMahasiswa[0].nim = "244107060033";
   arrayOfMahasiswa[0].nama = "AGNES TITANIA KINANTI";
   arrayOfMahasiswa[0].kelas = "SIB-1E";
   arrayOfMahasiswa[0].ipk = (float) 3.75;
5. Mengapa class Mahasiswa dan MahasiswaDemo dipisahkan pada uji coba 3.2?

***Jawaban Percobaan 1***
1. Tidak harus, class yang digunakan array of object tidak harus memiliki keduanya. Sebuah class 
   bisa hanya memiliki atribut saja, hanya method saja, atau keduanya. Yang terpenting class bisa diinstisiasi menjadi object. 
2. Mendeklerasikan dan membuat sebuah array bertipe Mahasiswa dengan nama arrayOfMahasiswa yang 
   berkapasitas 3 elemen. Tetapi ini masih berupa elemen saja (bernilai null) dan belum terisi object. Jadi perlu dilakukan instansiasi secara terpisah menggunakan new Mahasiswa16.
3. Class Mahasiswa16 tidak memiliki konstruktor. Tetapi java secara otomatis menyediakan 
   konstruktor default untuk setiap kelas yang tidak mendefinisikan konstruktor sendiri. Maka dari itu pemanggilan new Mahasiswa16() tetap bisa dilakukan.
4. - Menginstansiasi elemen pertama (index 0), dari array dengan menggunakan object Mahasiswa baru 
     menggunakan new Mahasiswa16()
   - Mengisi atribut dari setiap object tersebut.
5. Pemisahan dilakukan dengan menerapkan konsep PBO (Pemrograman Berorientasi Objek). PBO adalah 
   paradigma pemrograman dengan kumpulan objek yang saling berinteraksi.
   - class Mahasiswa16 bertugas sebagai blueprint/model data yang merepresentasikan entitas 
     mahasiswa beserta atributnya.
   - class MahasiswaDemo16 bertugas sebagai class yang melakukan eksekusi karena bersisi fungsi 
     main (menangani logika program seperti input, pembuatan array, output).