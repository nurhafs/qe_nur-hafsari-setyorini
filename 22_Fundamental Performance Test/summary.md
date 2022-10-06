## (22) Fundamental Performance Test

### Points learned
1. Performance test adalah teknik non functional testing untuk mengukur kualitas dari atribut sistem yang berhubungan dengan performance seperti *stability, reliability, dan resource usage*.
2. Langkah membuat contoh kasus performance test:
	* Membuat test plan
	* Membuat script test
	* Melakukan performance test
	* Menganalisa hasil performance test
3. Tipe-teipe performance test:
	* Load test != volume test
	  pengujian sistem untuk memahami perilakunya dalam beban tertentu. Lebih overall dibanding volume test yang hanya fokus ke database.
	
	* Smoke test
	  Dilakukan untuk memverify script yang sudah dibuat

	* Stress test
	  Mengamai kemampuan dan kestabilan sistem dalam kondisi ekstrem. Bertahap dari load normal, puncak, lalu menurun untuk melihat recoverynya.

	* Peak test
	  Mirip seperti stress test, tapi kenaikan dan penurunannya lebih spontan dan tidak diberikan waktu untuk scale out.

	* Soak test
	  Melihat reliability sistem ketika di dalam tekanan puncak dalam jangka waktu yang lama (>= 1 jam).