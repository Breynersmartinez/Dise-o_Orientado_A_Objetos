## Hilos en programacion
- Los hilos en programación son unidades de ejecución que permiten la ejecución simultánea de tareas dentro de un programa.
### Definición:
- Un hilo se puede entender como una unidad de ejecución dentro de un proceso, lo que permite que múltiples tareas se realicen de manera independiente y concurrente.

tuconectividad.com+1
### Importancia: 
- Los hilos permiten separar tareas complejas en tareas más simples, lo que mejora la eficiencia y la capacidad de respuesta de una aplicación.


### Funcionalidad: 
- Al utilizar hilos, si un proceso falla, no bloquea toda la aplicación, lo que es crucial para la programación concurrente.
Estos conceptos son fundamentales para entender cómo funcionan los hilos y su relevancia en el desarrollo de software.

### LIBRO: Sistemas Operativos

## Tecnica overclocking
El overclocking es la práctica de aumentar la frecuencia de reloj de un componente electrónico (normalmente una CPU o GPU) por encima de las especificaciones del fabricante.
El objetivo es obtener un mayor rendimiento sin necesidad de cambiar los componentes.



### DNS: Domain Net Server


### Pilas en Java:
- Importación de la clase Stack: Se importa la clase Stack del paquete java.util.
Creación de la pila: Se crea una instancia de Stack que almacenará elementos de tipo Integer.
Apilar elementos: Se utilizan los métodos push para agregar elementos a la pila.
Mostrar la pila: Se imprime el contenido de la pila.
- Desapilar elementos: Se utiliza el método pop para eliminar y devolver el elemento en la cima de la pila.
Ver el elemento en la cima: Se utiliza el método peek para ver el elemento en la cima sin eliminarlo.
Verificar si la pila está vacía: Se utiliza el método isEmpty para comprobar si la pila está vacía.


## Micro servicios
- Un microservicio es simplemente una pequeña aplicación que se encarga de hacer una única tarea. 
A diferencia de una aplicación monolítica, donde todo está junto en un único bloque, 
los microservicios dividen esa gran aplicación en pequeñas partes que funcionan de manera independiente.


## El problema de lectores-escritores 
- es un dilema de programación que se crea cuando varios lectores y escritores necesitan acceder al mismo recurso. Si se les permitiera el acceso a todos a la vez, podrían surgir problemas como sobrescrituras, información incompleta y otros problemas1. Los lectores y escritores proporcionan I/O simple para datos basados en texto/caracteres2.


### SITIO RECOMENDADO PARA ESTUDIAR HILOS:
 ```sh
https://www.w3schools.com/java/java_threads.asp
 ```


Java Threads
Java Threads
Threads allows a program to operate more efficiently by doing multiple things at the same time.

### Threads can be used to perform complicated tasks in the background without interrupting the main program.

Creating a Thread
There are two ways to create a thread.

It can be created by extending the Thread class and overriding its run() method:
```sh
```

```sh
```

```sh
```

```sh
```

```sh
```

```sh
```

### Datos sobre los hilos
- Los hilos son totalmente indepedientes, no se ejecutan de manera lineal.

Ejemplos:

```sh
https://github.com/dfleper/ProducerConsumerThreads/blob/master/src/main/java/com/dfleper/ProducerConsumerThreads/Consumer.java
```