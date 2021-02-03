# cvds-lab2
## Cuál es su mayor utilidad
la utilidad es crear proyectos, utiliza modelo POM qye significa modelo de objeto de proyecto
tiene una libreria en la cual se pueden obtener utilidades para el proyecto


## Fases de maven
__compile__ : crea archivos _class_ , no pueden haber errores para compilar.

__package__: crea un jar a base de los _class_ Genera el .jar con los .class compilados.

__install__: pone los jar en el pc, permitiendo uso en otro proyectos maven.

__deploy__: pone el jar en un servidor remoto, para que maven pueda acceder a un servidor.

__test__: ejecuta test con JUNIT.

## Ciclo de vida de la construcción
 Los tres ciclos de vida de Maven son:

__El ciclo de vida default__, que gestiona la construcción y despliegue del proyecto.
__El ciclo de vida clean__, que gestiona la limpieza del directorio del proyecto. Es decir, se encarga de eliminar todos los archivos generados en el proceso de construcción y despliegue.
__El ciclo de vida site__, que gestiona la creación de la documentación del proyecto.
## Para qué sirven los plugins
`` ¿Qué es un plugin?
Los plugins son pequeños programas complementarios que amplían las funciones de aplicaciones web y programas de escritorio.``

## Qué es y para qué sirve el repositorio central de maven
El repositorio central de Maven es la ubicación predeterminada para que Maven descargue todas las bibliotecas de dependencia del proyecto para su uso. 
## Creando proyecto
~~~ mvn archetype:generate -Dfilter=maven-archetype-quickstart ~~~
cuando pregunta:
~~~ 
Choose a number or apply filter (format: [groupId:]artifactId, case sensitive contains): 2: ~~~
solo damos enter
luego sale
 ~~~
Choose org.apache.maven.archetypes:maven-archetype-quickstart version: 
1: 1.0-alpha-1
2: 1.0-alpha-2
3: 1.0-alpha-3
4: 1.0-alpha-4
5: 1.0
6: 1.1
7: 1.3
8: 1.4
Choose a number: 8: ~~~
solo damos enter
y luego si sale lo de la imagen
![](/images/artifact.PNG)
luego nos deja las carpetas creadas asi.

![](/images/carpetas.PNG)
luego ponemos
 ~~~
 <properties>
        <maven.compiler.target>1.8</maven.compiler.target>
        <maven.compiler.source>1.8</maven.compiler.source>
    </properties>
  ~~~
y compilamos
## Busque cuál es el objetivo del parámetro "package" y qué otros parámetros se podrían enviar al comando mvn.
package se usa para empaquetar , se pueden poner clean, compile, package, install, deploy, javadoc, site,test.
## Busque cómo ejecutar desde línea de comandos, un proyecto maven y verifique la salida cuando se ejecuta con la clase App.java como parámetro en "mainClass". Tip: https://www.mojohaus.org/exec-maven-plugin/usage.html
 ~~~
mvn exec:java -Dexec.mainClass="edu.eci.cvds.patterns.App"
 ~~~
## Buscar cómo enviar parámetros al plugin "exec"
 ~~~
mvn exec: exec -Dexec.executable = "maven" [-Dexec.workingdir = "/ tmp"] -Dexec.args = "- X myproject: dist"
 ~~~
## puntos de ejecucion
1. Ejecutar nuevamente la clase desde línea de comandos y verificar la salida: Hello World!
2. Ejecutar la clase desde línea de comandos enviando su nombre como parámetro y verificar la salida. Ej: Hello Pepito!
3. Ejecutar la clase con su nombre y apellido como parámetro. ¿Qué sucedió?

* como vemos en la imagen, el 1 es el mensaje que ya estaba de helllo world
* el segundo renglon es el hello pepito
* y el tercer renglon ya se le pasaron los parametros de la siguiente manera
 ~~~
  mvn exec:java -Dexec.mainClass="edu.eci.cvds.patterns.App" -Dexec.args="lorenzo"    
 ~~~
 
 ![](/images/lorenzo.PNG)
## Verifique cómo enviar los parámetros de forma "compuesta" para que el saludo se realice con nombre y apellido.
foto abajo
## Ejecutar nuevamente y verificar la salida en consola. Ej: Hello Pepito Perez!

 ~~~
  mvn exec:java -Dexec.mainClass="edu.eci.cvds.patterns.App" -Dexec.args="nicolas y lorenzo"    
 ~~~
![](/images/nicolas y lorenzo.PNG)

## HACER EL ESQUELETO DE LA APLICACION

Despues de tener todo el codigo que nos entregaron en el laboratorio, nos piden:
* Cree el archivo ShapeFactory.java en el directorio src/main/java/edu/eci/cvds/patterns/shapes implementando el patrón fábrica, haciendo uso de la instrucción switch-case de Java y usando las enumeraciones.
para esto debemos entender el patron fabrica.

### Abstract Factory
El patrón Abstract Factory nos permite crear, mediante una interfaz, conjuntos o familias de objetos (denominados productos) que dependen mutuamuente y todo esto sin especificar cual es el objeto concreto.
Para nuestro caso, lo primero a saber es que regularShapeType por medio de enum nos delimita a la creacion de los objetos especificados. ya al momento de usar esta delimitacion, cada uno de nuestros objetos hace uso de la interfaz creada anteriormente Shape.
desde nuestro shape main vemos que dice que hace uso de ShapeFactory.create(type), en el cual solo pasa el tipo que usa la clase enum anteriormente mencionada, entonces en nuestro factory vamos a llamar nuestra clase de esa manera

## Ejecute múltiples veces la clase ShapeMain, usando el plugin exec de maven con los siguientes parámetros y verifique la salida en consola para cada una:

* Sin parámetros.
~~~
mvn exec:java -Dexec.mainClass="edu.eci.cvds.patterns.shapes.ShapeMain"
~~~
y nos dice
![](/images/noparam.PNG)

* Parámetro: qwerty
~~~
mvn exec:java -Dexec.mainClass="edu.eci.cvds.patterns.shapes.ShapeMain" -Dexec.args="qwerty"
~~~

![](/images/qwerty.PNG)
Parámetro: Pentagon
~~~
mvn exec:java -Dexec.mainClass="edu.eci.cvds.patterns.shapes.ShapeMain" -Dexec.args="Pentagon"
~~~
![](/images/Pentagon.PNG)
Parámetro Hexagon
~~~
mvn exec:java -Dexec.mainClass="edu.eci.cvds.patterns.shapes.ShapeMain" -Dexec.args="Hexagon"
~~~
![](/images/hexagon.PNG)
¿Cuál(es) de las anteriores instrucciones se ejecutan y funcionan correctamente y por qué?

*Sin parametros
*Hexagone
*Pentagone(lo escribimos con la "P" mayuscula por error, si lo escribiamos en minuscula no funcionaba)
Se ejecutan correctamente porque al hacer el llamado estas se encuentran como casos tomados en cuenta en el archivo de enum para que sean  casos validos en la funcion con 
el correspondiente switch type y al ser validos evitan lanzar la excepcion.

¿Que es gitignore?
el archivo "gitignore" sirve para decirle a Git qué archivos o directorios completos debe ignorar y no subir al repositorio de código.
¿Como se usa?
Se crea un archivo .gitignore en la raiz del proyecto y dentro del archivo .gitignore se colocara en texto plano todas las carpetas que queremo que Git ignore
