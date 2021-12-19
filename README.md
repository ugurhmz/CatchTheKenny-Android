
## 1. Kenny  Layout
- [x] Grid Layout ekrana at ve constraint yap
- [x] Kenny'nin resmini at ve w,h boyutları ver.100x120
- [x] activity_main.xml aç ve -> 3 satır, 3 sütun kenny ekle, toplam 9 tane kenny olacak.
- [x] Constraint olmuş olan Grid layout küçült ve hepsi ortada hizalansın.
- [x] En üste
   - [x] Time textView ekle

- [x] En alta
   -  [x]  Score textView ekle ve Tekrar Infer Constraint yap.
     
</br>

##  2. Scoru Artır
- [x] activity_main.xml içinden onClick ver, Hangi Kenny'e tıklanırsa tıklansın, score artsın
  Yani aynı increaseScore metodu çağrılcak.
- [x] Time id ver -> timeText
- [x] Score id ver -> scoreText

</br>

## 3. Score için MainActivity.java içinde:
- [x] timeText ve scoreText id'li TextView lar için:
   -  [x] Classın içinde TextView Global olarak tanımla.
    - [x]  onCreate() metodu içinde ise findViewById ile onları al ve init et.
       -   [x] Yani  1) -> Global Olarak Tanımla
       -   [x]      2)  -> onCreate() 'de initialize et.
       -   [x]       3) -> Initialize edilenleri istediğin yerde çağır.
