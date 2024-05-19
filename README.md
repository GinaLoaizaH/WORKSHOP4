### GRUPO SISTEMA DE ARCHIVOS

#### *Integrantes*: 
+ Eimy Garcia Barrera
+ Gina Loaiza
+ Eddie Serna

***¿Por qué decidimos usar los patrones de diseño Composite y Decorator?***

Decidimos usar el patrón de diseño Composite debido a su estructura jerárquica que representa fielmente un sistema de archivos, permitiendo la existencia de subcarpetas como se describe en el primer párrafo. La estructura en forma de árbol del patrón Composite nos permite tratar tanto archivos como carpetas de manera uniforme, como si fueran objetos individuales. Implementamos este patrón utilizando recursividad, lo que permite que los métodos se llamen a sí mismos múltiples veces para recorrer la jerarquía de archivos y carpetas.
En cuanto a las funcionalidades especiales de las carpetas mencionadas en el segundo párrafo, elegimos el patrón de diseño Decorator. Este patrón se adapta perfectamente, ya que nos permite añadir funcionalidades específicas a las carpetas sin alterar las responsabilidades básicas de la implementación inicial. Gracias a esto, pudimos modelar una solución flexible y fácilmente extensible para agregar nuevas funcionalidades a diferentes tipos de carpetas especializadas en el futuro.
