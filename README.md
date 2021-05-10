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
Ahora necesitamos ubicar el directorio de instalación de Java 8. Si no cambiamos la ruta que viene por default, tendriamos que encontrarlo fácilmente en esta dirección: C:\Program Files\Java\jdk1.8.0_291.

Vamos al buscador y escribimos "variables de entorno". Ingresamos a Propiedades del Sistema / Variables de entorno.

![var ent](https://user-images.githubusercontent.com/38332862/117712388-a1150c80-b1aa-11eb-8245-21f34163c664.PNG)

En variables del Sistema

![var 1](https://user-images.githubusercontent.com/38332862/117713488-19c89880-b1ac-11eb-9ee9-7f52835ada49.PNG)

Agregamos una nueva llamada "JAVA_HOME"

![VAR 2](https://user-images.githubusercontent.com/38332862/117713533-2947e180-b1ac-11eb-8268-1b4381e3fb05.PNG)
![VAR 3](https://user-images.githubusercontent.com/38332862/117713556-3238b300-b1ac-11eb-84b2-e1adb2501166.PNG)

Ahora vamos a editar la variable del sistema "Path"

![VAR 4](https://user-images.githubusercontent.com/38332862/117713628-48467380-b1ac-11eb-9a29-ff21cc8a739d.PNG)

Le damos a "Nuevo" y agregamos la ruta

![var 5](https://user-images.githubusercontent.com/38332862/117713642-4b416400-b1ac-11eb-9150-ccad4c9bb6b5.PNG)

Luego le damos a "Aceptar" en las 3 ventanas que se nos abrieron en el proceso, de lo contrario no se guardarán los cambios.
Cerramos todas las terminales que tengamos abiertas. Abrimos una nueva y escribimos:

```
javac -version
```

Deberiamos obtener esta respuesta:

*javac 1.8.0_291*


# Instalación del Entorno Integrado de Desarrollo (IDE)
Para programar en Java, o en cualquier otro lenguaje, no es necesario contar con ningún Entorno Integrado de Desarrollo (IDE) en particular. Existen diversos IDEs en el mercado, algunos gratuitos y otros pagos. Yo suelo elegir IntelliJ IDEA por que trabajo hace años con él y porque tiene un montón de características y funcionalidades (features) que son muy útiles a la hora de desarrollar, hacer un code review o simplemente navegar el código fuente de una app.

Mi recomendación es que lo utilicen, pero son libres de optar por el que más les guste.

Vamos a descargarlo de la página oficial: https://www.jetbrains.com/es-es/idea/download/#section=windows. Yo tengo la versión "community", tiene algunos features de menos pero para nuestros fines va a andar bien. Descargamos el ejecutable e instalamos. Cuando nos aparezca en pantalla esta ventana:

![installar intellij](https://user-images.githubusercontent.com/38332862/117705110-01ec1700-b1a2-11eb-82da-7463440544a9.PNG)

Marcamos las opciones que se muestran en la captura. 
Si nuestro sistema es de 32 bits, en el grupo "Create Desktop Shortcut" vamos a seleccionar "32-bit launcher", en lugar de 64 bits. Reiniciamos la PC y comprobamos que esté instalado.


# Instalación de Git
Vamos a instalar uno de los gestores de versiones mas conocidos y utilizados por los desarrolladores de todo el mundo.
Accedemos a esta web y descargamos el instalador: https://gitforwindows.org/.
Corremos el instalador y damos "next", "next" y mas "next" asi queda todo por default.

Si todo está ok, abrimos una nueva terminal y escribimos:

```
git --version
```
Deberiamos obtener el siguiente resultado:

*git version 2.31.1.windows.1*





