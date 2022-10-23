## Hasil praktikum

### Link
https://github.com/nurhafs/ksg

### Hasil
Saat melakukan push ke repository, muncul action sebagai berikut.
![image](https://github.com/nurhafs/qe_nur-hafsari-setyorini/tree/master/27_Testing%20in%20CICD%20Pipeline/Screenshots/pushResult_1.png?raw=true)

Setelah membuat branch authorized-alt dan membuat pull request, muncul lagi action sebagai berikut.
![image](https://github.com/nurhafs/qe_nur-hafsari-setyorini/tree/master/27_Testing%20in%20CICD%20Pipeline/Screenshots/pullRequest_2.png?raw=true)

Setelah dilakukan merge request, muncul lagi action sebagai berikut.
![image](https://github.com/nurhafs/qe_nur-hafsari-setyorini/tree/master/27_Testing%20in%20CICD%20Pipeline/Screenshots/mergeRequest_3.png?raw=true)
terjadi error seperti ini karena ada variabel yang perlu diubah setiap melakukan push agar test berhasil. Tidak ada perubahan variabel dari proses pull request sampai merge, sehingga pengujian pada tahap merge mengalami test failure.
