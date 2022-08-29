## Nomor 1
Pada gambar di soal, terlihat bahwa terdapat 2 Class yang diuji, yaitu class entity dan service. Pada class entity, line coverage yang terpenuhi sebesar 6/9 dan mutation coverage sebesar 2/3. Sementara pada class service tercatat memiliki 6/6 line coverage dan 3/4 mutation coverage.

Setelah itu, kita bisa melihat terlebih dahulu definisi dari line coverage dan mutation coverage.
> "The Line Coverage of a program is the number of executed lines divided by the total number of lines. Only lines that contain executable statements are considered, not those with pure declarations."
- froglogic
> Mutation testing is a testing technique used to improve the adequacy of tests and identify defects in code. The idea is to change the production code dynamically and cause the tests to fail.
Each change in the code is called a mutant, and it results in an altered version of the program, called a mutation.
We say that the mutation is killed if it can cause a fail in the tests. We also say that the mutation survived if the mutant couldn't affect the behavior of the tests.
- baeldung

Berdasarkan definisi di atas, dapat disimpulkan sebagai berikut:
1. Test case yang dibuat tidak dapat meng-cover 3 baris dari Class entity dan dari 3 mutant, terdapat 2 mutant yang membuat pengujian menjadi gagal.
2. Test case yang dibuat telah menguji seluruh jalur eksekusi kode dan dari 4 mutant yang dibuat, 3 di antaranya membuat kegagalan dalam pengujian.

Dengan begitu, masih diperlukan beberapa perbaikan terutama dalam *Mutation coverage*nya.

sumber:
https://www.froglogic.com/coco/line-coverage/
https://www.baeldung.com/java-mutation-testing-with-pitest

---
## Nomor 2
Melalui gambar pada soal, kita dapat melihat bahwa class CalculatorServiceImpl dan method add telah lulus testing. Namun, pada method subtract, masih terlihat bayangan merah yang menunjukkan bahwa method ini belum lulus testing. Saya belum dapat memastikan mengenai penyebab error ini, namun satu hal yang dapat saya simpulkan adalah diperlukan perbaikan dan pengujian ulang, khususnya unit testing pada method subtract.