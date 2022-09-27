## (19) RESTful API Testing with Rest Assured

### Points learned
1. Konsep API:
	* Mobile app menyampaikan request pada API
	* API menyalurkan request tsb pada Application
	* Application memberikan response dari request pada API
	* API menyalurkan response dari Application pada Mobile App

2. The Practical Test Pyramid:
	* UI -> pengujian interaksi melalui UI app
	* Integration -> pengujian interaksi antara 2 modul atau sub-system melalui API
	* Component -> pengujian modul/sub-system tertentu melalui api
	* Unit -> menguji testable terkecil dari app melalui method
   Tingkatan terbawah adalah unit dan tertinggi adalah UI

3. Untuk cara pengerjaannya mirip dengan materi sebelumnya, namun kali ini ditambahkan package baru setingkat dengan stepdefinitions dimana kita bisa memasukkan URL dari API yang akan kita uji beserta method test case.