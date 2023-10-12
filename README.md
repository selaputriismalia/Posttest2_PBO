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

pada stuktur program ini juga menerapkan final class, final property, dan final method.
final class digunakan pada class "Rental_Costume". "Rental_Costume" di berikan final class karena "Rental_Costume" tidak dapat memiliki kelas turunan lagi membuat struktur class Rental_Costume tetap konsisten dan tidak dapat diubah lagi.
class "KontrolKarakter" juga menggunakan final class karena pada "KontrolKarakter" berisikan method-method yang tidak dapat diubah lagi.
pada class "Costume" tidak digunakan final class tetapi menggunakan final property


