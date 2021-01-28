# CDVS-lab2
## Cuál es su mayor utilidad
la utilidad es crear proyectos, utiliza modelo POM qye significa modelo de objeto de proyecto
tiene una libreria en la cual se pueden obtener utilidades para el proyecto


## Fases de maven
__compile__ : crea archivos _class_ , no pueden haber errores para compilar.

__package__: crea un jar a base de los _class_ Genera el .jar con los .class compilados.
__install__: pone los jar en el pc, permitiendo uso en otro proyectos maven
__deploy__: pone el jar en un servidor remoto, para que maven pueda acceder a un servidor
__test__: ejecuta test con JUNIT

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
mvn exec:java -Dexec.mainClass="edu.cdvs.patterns.App"
mvn exec:java -Dexec.mainClass="edu.cdvs.patterns.App" 
![](/images/pepe.PNG)
