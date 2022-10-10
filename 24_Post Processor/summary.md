## (24) Post Processor

### Points learned
1. Post Processor adalah elemen dalam test plan yang digunakan untuk perform certain actions setelah memproses sampler request. Biasanya dipakai untuk mengekstrak value tertentu dari response yang ditangkap dan dipass ke request selanjutnya.
2. JSON Path bisa digunakan untuk ekstrak isi dari json response
3. Commonly used expressions:
    * $ = root element
    * . = child operator (obj)
    * [] = child operator (array)
    * .. = recursive descent (langsung ke objek)
    * * = wildcard (bisa buat semua)
    * [start:end] = array slice operator borrowed