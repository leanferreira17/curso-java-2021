# curso-java-2021
Repositorio del curso de Java 8 inicial dictado en Mayo de 2021.

# Instalando todo lo necesario:

Primero vamos a conocer qu{e tipo de arquitectura tenemos en nuestra PC con Windows. Para ello vamos a abrir un terminal nuevo (tecla Windows + "r", escribimos "cmd" y le damos Enter) ó simplemente en la cajita de búsqueda (abajo a la izquierda) escribimos "terminal" y le damos Enter.
Una vez que nos abre la ventana de la terminal escribimos "dxdiag", seguido se abre una ventana de mensaje y ponemos "No". En la pestaña "Sistema" con el nombre "sistema operativo" vamos a encontrar la información necesaria: 32 ó 64 bits.

# Java 8: JRE y JDK
Veamos si tenemos Java instalado en nuestra PC y por algún motivo no lo sabiamos:
En una terminal ejecutamos el siguiente comando
```
java -version
```
Si nos devuelve un mensaje como este: 

*"java" no se reconoce como un comando interno o externo,
programa o archivo por lotes ejecutable.*

Entonces no lo tenemos instalado. Vamos a descargarlo.

# Descargando el JRE y JDK:
Vamos a https://www.oracle.com/ar/java/technologies/javase/javase-jdk8-downloads.html y seleccionamos oportunamente la versión de Java 8 para nuestro sistema de 32 (Windows x86) ó de 64 bits (Windows x64). Tenemos que registrarnos en el sitio de Oracle para poder realizar la descarga. 
Una vez que descarguemos el instalador lo ejecutamos y dejamos todo como está por default, esto es "siguiente" hasta que finalice.
Cerramos las terminales que tengamos abiertas, abrimos una nueva y ejecutamos el comando nuevamente:

```
java -version
```
Esperamos a que nos devuelva el siguiente mensaje: 

*java version "1.8.0_291"
Java(TM) SE Runtime Environment (build 1.8.0_291-b10)
Java HotSpot(TM) 64-Bit Server VM (build 25.291-b10, mixed mode)*

# Añadiendo Java 8 a nuestras variables de entorno
Ahora necesitamos ubicar el directorio de instalación de Java 8. Si no cambiamos la ruta que viene por default, tendriamos que encontrarlo fácilmente en esta dirección: C:\Program Files\Java\jdk1.8.0_291\bin. 
Abrimos una nueva terminal y escribimos lo siguiente: 
```
set path=%path%;C:\Program Files\Java\jdk1.8.0_291\bin
```
Le damos Enter.
Si todo salió bien y no observamos un error en la consola, procederemos a realizar un chequeo. Escribimos:
```
echo %PATH%
```
Deberiamos poder ver al final de la cadena devuelta nuestro nueva ruta adherida recientemente:

*C:\Program Files (x86)\Common Files\Oracle\Java\javapath;C:\Program Files (x86)\Intel\iCLS Client\;C:\Program Files\Intel\iCLS Client\;C:\Windows\system32;C:\Windows;C:\Windows\System32\Wbem;C:\Windows\System32\WindowsPowerShell\v1.0\;C:\Windows\System32\OpenSSH\;C:\Program Files\Intel\Intel(R) Management Engine Components\DAL;C:\Program Files (x86)\Intel\Intel(R) Management Engine Components\DAL;C:\Program Files\Intel\Intel(R) Management Engine Components\IPT;C:\Program Files (x86)\Intel\Intel(R) Management Engine Components\IPT;C:\Users\Lean\AppData\Local\Microsoft\WindowsApps;;C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.1.1\bin;;**C:\Program Files\Java\jdk1.8.0_291\bin***

# Instalación del Entorno Integrado de Desarrollo (IDE)
Para programar en Java, o en cualquier otro lenguaje, no es necesario contar con ningún Entorno Integrado de Desarrollo (IDE) en particular. Existen diversos IDEs en el mercado, algunos gratuitos y otros pagos. Yo suelo elegir IntelliJ IDEA por que trabajo hace años con él y porque tiene un montón de características y funcionalidades (features) que son muy útiles a la hora de desarrollar, hacer un code review o simplemente navegar el código fuente de una app.

Mi recomendación es que lo utilicen, pero son libres de optar por el que más les guste.

Vamos a descargarlo de la página oficial: https://www.jetbrains.com/es-es/idea/download/#section=windows. Yo tengo la versión "community", tiene algunos features de menos pero para nuestros fines va a andar bien. Descargamos el ejecutable e instalamos. Cuando nos aparezca en pantalla esta ventana:

![installar intellij](https://user-images.githubusercontent.com/38332862/117705110-01ec1700-b1a2-11eb-82da-7463440544a9.PNG)

Marcamos las opciones que se muestran en la captura. 
Si nuestro sistema es de 32 bits, en el grupo "Create Desktop Shortcut" vamos a seleccionar "32-bit launcher", en lugar de 64 bits. Reiniciamos la PC y comprobamos que esté instalado.






