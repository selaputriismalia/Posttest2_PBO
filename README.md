# Posttest2_PBO
## DESKRIPSI PROGRAM
Program ini merupakan sebuah program yang berguna untuk admin Rental Costume yang dapat digunakan oleh Admin sebagai User dari pengguna program ini untuk menyimpan data-data costume yang ada pada rentalannya. selain menyimpan program bisa juga melihat apa saja costume yang telah di tambahkan dan dapat menghapus costume serta mengupdate bagian dari costume tersebut.
## STUKTUR PROGRAM
Pada stuktur program ini diterapkan agar program dapat menggunakan fungsi CRUD, yang dimana program dapat Create(Menambahkan), Read(Menlihat), Update(Mengubah), Delete(Menghapus). dan pada program ini create digunakan untuk menambahkan costume, read digunakan untuk melihat costume yang telah di tambahakan sebelumnya, update digunakan untuk mengubah harga dari costume tersebut, delete digunakan untuk menghapus costume.

pada stuktur program ini juga diterapkan Konsep MVC yang dimana program berjalan dengan memisah-misahkan pertiap entitas, dan setiap entitas memiliki kelas masing-masing, pembagian nya sebagai berikut :

- Model : package "Entitas_Costume" yang berisi class "Costume", "Costume_Anime", "Costume_Game" seriap class berisi property dari setiap entitas

- View : Package "Rental_Costume" yang berisi class "Rental_Costume" pada class "Rental_Costume" berisi tampilan yang akan berinteraksi dengan pengguna
  
- Control : Package "Control" yang berisi class "KontrolKarakter" pada class "KontrolKarakter" berisi eksekusi penghubung dari model dan view agar dapat berjalan nya program sesuai dengan apa yang ada di view

pada stuktur program ini juga setiap property dari entitas diterapkan aksess modifier privete yang dimana jika ingin mengakses ataupun mengambil property dari entitas tersebut harus menggunakan metode setter dan getter, setter digunakan untuk menetapkan nilai atau variabel dari property nya, sedangkan getter digunakan untuk mendapatka nilai atau variabel dari property nya.

pada stuktur program ini juga mengunakan penyimpanan Arraylist yang bersifat private, yang dimana terdapat pada package  "Control" yang berisi class "KontrolKarakter" pada class "KontrolKarakter" arraylist diberi private agar memberika pembatasan untuk mengakses array tersebut, dan untuk pengaksesan nya menggunaan metode setter dan getter.

pada stuktur program ini juga menerapkan final class, final property, final method dan class abstrack.
final class digunakan pada class "Rental_Costume". "Rental_Costume" di berikan final class karena "Rental_Costume" tidak dapat memiliki kelas turunan lagi membuat struktur class "Rental_Costume" tetap konsisten dan tidak dapat diubah lagi serta dalam class "Rental_Costume" diberikan deklarasi main final yang dimana codingan alur program eksekusi telah final. 

class "KontrolKarakter" juga menggunakan final class karena pada "KontrolKarakter" berisikan method-method yang tidak dapat diubah lagi.

pada class "Costume" tidak digunakan final class tetapi menggunakan final property karena class "Costume" merupakan kelas abstarack yang berperan sebagai induk yang memiliki class turunan yang itu class "Costume_Anime" dan class "Costume_Game", tetapi dalam setiap class turunan menerapkan final private property dan class Costume juga menerapkan final private property.


pada stuktur program ini juga "Rental_Costume" menerapkan final method yang bersifat static. karena pada "Rental_Costume" berisikan tampilan yang akan berinteraksi dengan pengguna, maka dari itu agar dapat dideklarasikan tanpa membuat objek.


pada stuktur program ini juga menerapkan fitur Inheritance yang dimana pada package "Costume_Anime" selaku induk class dari "Costume_Anime" dan "Costume_Game" mewariskan sifat dari class Induk yaitu "namekarakter" dan "HargaRental".


stuktur program ini juga menerapakan fitur Polymorphism yaitu Overriding pada class turunan "Costume_Game" dan "Costume_Anime". class turunan memberikan implementasi ulang untuk metode yang telah didefinisikan di kelas induk.

## FITUR PROGRAM DAN FUNGSIONALITASNYA
### Menu Admin Rental
hanya terdapat satu menu pada pogram ini, yaitu Menu Admin Rental yang memiliki 8 fitur yaitu :

- Tambah Costume Anime (digunakan admin untuk menambah Costume Anime)
- Tambah Kostum Game (digunakan admin untuk menambah Costume Game)
- Edit Harga Kostum (digunakan admin untuk mengedit harga Costume)
- Hapus Kostum (digunakan admin untuk menghapus Costume)
- Tampilkan Semua Kostum (digunakan admin untuk melihat semua Costume)
- Tampilkan Semua Kostum Anime (digunakan admin untuk melihat Costume anime)
- Tampilkan Semua Kostum Game (digunakan admin untuk meelihat Costume game)
- Keluar (digunakan admin untuk keluar dari program)

## Cara Penggunaan 
#### 1. Tambah Costume Anime
1. Pada menu program awal terdapat tampilan menu, yang dimana pengguna diminta untuk memilih ingin menu apa, jika ingin menambahkan costume Anime maka dapat mengimputkan angka 1
2. setelah itu program akan meminta inputan nama karakter anime yang kan di tambahakan
3. program akan meminta lagi untuk memasukan harga dan nama anime yang akan ditambahakan
4. jika telah selesai menambahkan program akan memberitaukan bahawa costme telah ditambahkan, dan program juga akan menanyakan apakah ingin kembali ke menu awal? jika ingin kembali ke manu awal dapat mengimputkan "y", dan jika tidak dapat mengetik apapun, maka program aka keluar
#### 2. Tambah Kostum Game
1. Jika ingin menambahkan costume game maka dapat mengimputkan angka 2
2. setelah itu program akan meminta inputan nama karakter anime yang kan di tambahakan
3. program akan meminta lagi untuk memasukan harga dan nama Game yang akan ditambahakan
4. jika telah selesai menambahkan program akan memberitaukan bahawa costme telah ditambahkan, dan program juga akan menanyakan apakah ingin kembali ke menu awal? jika ingin kembali ke manu awal dapat mengimputkan "ya", dan jika tidak dapat mengetik apapun, maka program akab keluar
#### 3. Edit Harga Kostum 
1. Jika ingin mengedit harga costume maka dapat mengimputkan angka 3
2. telah itu program akan meminta inputan nama karakter anime yang kan di ubah harga nya.
3. lalu kita dapat mengimputkan harga baru untuk costume yang kita ingin ubah harga nya.
4. jika telah selesai mengubah, program akan memberitaukan bahawa costme telah diubah harganya, dan program juga akan menanyakan apakah ingin kembali ke menu awal? jika ingin kembali ke manu awal dapat mengimputkan "ya", dan jika tidak dapat mengetik apapun, maka program aka keluar
#### 4. Hapus Costume
1. Jika ingin menghapus costume maka dapat mengimputkan angka 4
2. telah itu program akan meminta inputan nama karakter anime yang kan di hapus.
3. program akan memberitaukan bahawa costme telah dihapus, dan program juga akan menanyakan apakah ingin kembali ke menu awal? jika ingin kembali ke manu awal dapat mengimputkan "ya", dan jika tidak dapat mengetik apapun, maka program aka keluar
#### 5. Tampilkan Semua Costume
1. Jika ingin menampilkan semua costume maka dapat mengimputkan angka 5
2. Program akan menampilkan semua costume yang ada baik itu anime maupun game
3. program juga akan menanyakan apakah ingin kembali ke menu awal? jika ingin kembali ke manu awal dapat mengimputkan "ya", dan jika tidak dapat mengetik apapun, maka program akan keluar
#### 6. Tampilkan Semua Kostum Anime
1. Jika ingin menampilkan costume anime maka dapat mengimputkan angka 6
2. Program akan menampilkan semua costume anime
3. program juga akan menanyakan apakah ingin kembali ke menu awal? jika ingin kembali ke manu awal dapat mengimputkan "ya", dan jika tidak dapat mengetik apapun, maka program akan keluar
#### 7. Tampilkan Semua Kostum Game
1. Jika ingin menampilkan costume game maka dapat mengimputkan angka 7
2. Program akan menampilkan semua costume game
3. program juga akan menanyakan apakah ingin kembali ke menu awal? jika ingin kembali ke manu awal dapat mengimputkan "ya", dan jika tidak dapat mengetik apapun, maka program akan keluar
#### 8. Keluar 
Jika Pengguna mengimputkan angka 8 maka program akan langsung keluar.


