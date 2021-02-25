# AlfaTask
 
В проекте используется Spring boot, Feign, Thymeleaf.


# Getting started

Установленная Java версии 8 и выше.

Неободимо установить [Gradle](https://docs.gradle.org/current/userguide/getting_started.html) .

В командной строке из директории где находится проект выполнить команду:

    ./gradlew bootRun

В браузере открыть: http://localhost:8080/ .  

![alt tag](http://domain.com/path/to/img.png "Вывод рандомной Giphy")​

 http://localhost:8080/giphy . Возвращает Giphy object формата:
 
```Json
{"type":"gif","id":"3ohhwJgErfr480jPX2","slug":"Bounce-TV-comedy-3ohhwJgErfr480jPX2","url":"https://giphy.com/gifs/Bounce-TV-comedy-3ohhwJgErfr480jPX2","bitly_gif_url":"https://gph.is/2yfek0X","bitly_url":"https://gph.is/2yfek0X","embed_url":"https://giphy.com/embed/3ohhwJgErfr480jPX2","username":"Bounce_TV","source":"","rating":"pg","caption":"","content_url":"","source_tld":"","source_post_url":"","import_datetime":"2017-10-13 15:12:42","trending_datetime":"0000-00-00 00:00:00","images":{"fixed_height":{"url":"https://media3.giphy.com/media/3ohhwJgErfr480jPX2/200.gif?cid=0105b5a8bbde5adfcad64d9a0a2518f784f5224e351d120b&rid=200.gif","width":"200","height":"200","size":"513064","mp4":"https://media3.giphy.com/media/3ohhwJgErfr480jPX2/200.mp4?cid=0105b5a8bbde5adfcad64d9a0a2518f784f5224e351d120b&rid=200.mp4","mp4Size":null,"webp":"https://media3.giphy.com/media/3ohhwJgErfr480jPX2/200.webp?cid=0105b5a8bbde5adfcad64d9a0a2518f784f5224e351d120b&rid=200.webp","webpSize":null}}}
```




# Run test

Для запуска тестов использовать команду:

    ./gradlew test
