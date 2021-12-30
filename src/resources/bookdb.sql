CREATE DATABASE book_db; 
USE book_db;

CREATE TABLE user_account (
	id int not null AUTO_INCREMENT,
	username varchar(255) not null,
	password varchar(255) not null,
	book_id int,
	qty int,
	PRIMARY KEY (id),
    FOREIGN KEY (book_id) REFERENCES book_table(book_id)
	);

CREATE TABLE book_table (
	book_id int not null AUTO_INCREMENT,
	judul_buku varchar(255) not null,
	penulis varchar(255) not null,
	penerbit varchar(255) not null,
	tahun int not null,
	kategori varchar(255),
	qty int,
	PRIMARY KEY (book_id)
	);

INSERT INTO book_table (book_id , judul_buku , penulis , penerbit, tahun, qty) VALUES
    (1,'An english-indonesia dictionary','John M. Echols','Gramedia Pustaka Utama', 2003, 15),
    (2,'Analisis dan aspek kesehatanbahan tambahan pangan','Dr. Ir. Wisnu Cahyadi,M.Si','Bumi Askara', 2009, 3),
    (3,'Analisis data kesehatan','Sutanto Priyo Haslono','FKM UI',2007, 7),
    (4,'Analisis data pada penelitian kuantitatif','H. Boy S.Sabarguna','UI Press',2011, 4),
    (5,'Analisis data untuk penelitian kesehatan','Danang Sunyoto','Nuha Medika',2013, 8),
    (6,'Analisis komponen makanan ','Dr.Abdul Rohman,M.Si.,Apt','Graha Ilmu',2012, 20),
    (7,'Analisis multivariat untuk penelitian kesehatan','Yasril, SKM., M.Kes','Mitra Cendikia Press',2009, 9),
    (8,'Antropologi kesehatan','George M Foste','UI Press',2008, 2),
    (9,'Asas-asas penelitian behavioral, ed.3','Fred N. Kerlinger','Gadjah Mada University Press',1990, 0),
    (10,'Asian functional food','John Shi','Maktabah Obeikan',2005, 0),
    (11,'Aspek sosial amdal','Sudharto, P.Hadi','UGM Press',2009, 0),
    (12,'Asuhan keperawatan gangguan sistem perkemihan','Arif Muttaqin','EGC',2008, 15),
    (13,'Asuhan keperawatan gerontik','Sharif La Ode','Nuha Medika',2012, 0),
    (14,'Asuhan keperawatan medikal bedah dan penyakit dalam','M. Clevo Rendi','Nuha Medika',2012, 0),
    (15,'At a glance ilmu gizi','Mary E. Barasi BA,BSc, MSc, Rnutr ','Erlangga',2010, 11);

