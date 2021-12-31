<p align="center"> <img src="Logov1.png" width="256" height="212"> <br>
<h1 align="center" style="font-weight: bold"> LEND A BOOK </h1>

Lend a Book adalah sebuah program yang di desain untuk memudahkan pengelola perpustakaan dalam mengatur buku.
## Getting started
### Inisialisasi Database
Di dalam root project jalankan perintah berikut di dalam terminal anda Kemudian eksekusi scriptnya
<br> <br>
Disini menggunakan root user
```zsh
mysql -u root < src/resources/bookdb.sql
```
### Database Requirements 
`Note!` jika ingin diganti harus dirubah secara manual di `src/resources/bookdb.sql` dan `src/main/java/Database/DB.java`
- Koneksi `jdbc:mysql://127.0.0.1/book_db`
- Nama database `book_db`
- Nama tabel buku `book_table`
- Nama tabel user `user_account`

### Dependencies
- Java 8
- Maven 3.6.3
- Flatlaf 2.0-rc1
- Mysql connector 8.0.24

### Contributors
- Bima Arya Wicaksana
- Alvin Septiano
- Fahruji

<p align="center"> Made with :heart: </p>
