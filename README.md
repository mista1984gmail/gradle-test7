**Описание проекта:** многомодульный проект (3 модуля: utils, core, api), который принимает VarArgs и определяет являются ли все переданные значения положительными целыми числами (больше нуля), если да - то возвращается true, в противном случае - false.

**Модуль utils**, содержит класс StringUtils c методом  public static boolean isPositiveNumber(String str)

   ![img.png](img/img1.png)

Для проверки его работы есть класс с тестами, используется JUnit 5.

   ![img.png](img/img2.png)
   
Для генерации отчета об тестах используется библиотека JaCoCo.

   ![img.png](img/img3.png)
   
После генерации jar файла данного модуля, он автоматически копируется в модуль core, для его использования в качестве зависимости.

   ![img.png](img/img4.png)

**Модуль core**, содержит класс Utils c методом public static boolean isAllPositiveNumbers(String ... str), который принимает VarArgs и переиспользует метод из модуля utils, подключенного в виде зависимости в build.gradle

   ![img.png](img/img5.png)

   ![img.png](img/img6.png)

Также для тестирования этого метода используется JUnit5, а для генерации отчета об покрытии - библиотека JaCoCo.

   ![img.png](img/img7.png)

**Модуль api** содержит класс App, где мы запускаем метод isAllPositiveNumbers из модуля core с параметрами ("12", "79"), предварительно подключив этот модуль в build.gradle

   ![img.png](img/img9.png)

   ![img.png](img/img8.png)




   
