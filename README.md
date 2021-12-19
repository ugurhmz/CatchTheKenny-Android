
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
    
</br>
## 4. Time Geriye Sayma ( CountDownTimer )
- [x] Açılır açılmaz, geriye saysın
    -  [x] new CountDownTimer( kaçtan_Başlasın ms, SaymaAralığı ms)
        -   [x]  onTick()  -> Başlangıç time
        -   [x]  onFinish()  -> Bitiş time
</br>

## 5. Kenny'i hareket ettir.
- [x] 9 tane ImageView Global olarak tanımla.
- [x] onCreate() metounda 9 tanesini initialize et. findViewById ile
- [x]  ImageView[] arrayini oluştur ve 9 tane initialize olmuş elamanı at.
  -    [x]  Loopa sokup, diğer kenny'leri görünmez yapacağız. Random olarka 1'er tane açacağız.

- [x]  hideImages() adlı metod oluştur.Açılır, açılmaz saklanması için onCreate() te başlat.
   -   [x] hideImages altındaki her bir image'yi visible et.
</br>
## 5. Her saniyede bir Kenny'lerden birini göster
- [x] Runnable Kullanacağız 
   -  [x] Herhangi bir Image'ı açabilir/kapayabilir. Herhangi bir işlemi belli periyotlarda yapabiliriz Runnable & handler
- [x] Global -> Handler ve Runnable tanımla
- [x] hideImages() 
   -  [x] Handler() ve Runnable() kullan.
       -  [x] handler.postDelayed() -> Söylediğim periyotta çalıştır demek.
       -  [x] handler.post() -> Runnable bittekten sonra tanımlanır ve başlatır onu.

</br>
## 6. Oyunu Bitir.
- [x] CountDownTimer içindeki
   -  [x] onFinish() -> bitince yapacaklarımız
       -  [x] setText time off yaz
       -  
       -  [x] removeCallback yap runnable
       -  
       -  [x] Loop'ta tüm, resimleri invisible yap.
       -  
       -  [x] Alert çıkar
           -  [x] setTitle ver.
           -  [x] Oyun devam etsinmi sor?
           -  
               -  [x] positiv, negative button koy.
                   -  [x] yes ise  ->  restart
                   -  [x] no ise  ->  Toast 
            
