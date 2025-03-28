

### 🔹 **Conceptos básicos:**
- **Proceso**: Es un programa en ejecución (ej: una aplicación Java).
- **Hilo**: Es una *unidad más pequeña* dentro de un proceso. Un proceso puede tener uno o varios hilos.

### 🔹 **Tipos de hilos en Java:**
1. **Hilo principal (Main Thread)**: Se ejecuta automáticamente al iniciar un programa Java.
2. **Hilos secundarios (Threads creados por el programador)**: Se crean para realizar tareas en paralelo.

---

### 🔹 **¿Cómo se crean hilos en Java?**
Hay **dos formas principales**:

#### **1. Extendiendo la clase `Thread`**
```java
class MiHilo extends Thread {
    @Override
    public void run() {
        System.out.println("Hilo ejecutándose: " + this.getName());
    }
}

// Uso:
public class Main {
    public static void main(String[] args) {
        MiHilo hilo1 = new MiHilo();
        hilo1.start(); // Inicia el hilo (NO usar run() directamente)
    }
}
```

#### **2. Implementando la interfaz `Runnable`** *(Recomendado)*
```java
class MiTarea implements Runnable {
    @Override
    public void run() {
        System.out.println("Hilo Runnable en ejecución");
    }
}

// Uso:
public class Main {
    public static void main(String[] args) {
        Thread hilo2 = new Thread(new MiTarea());
        hilo2.start();
    }
}
```
✅ **Ventaja de `Runnable`**: Permite heredar de otra clase (Java no permite herencia múltiple).

---

### 🔹 **Estados de un hilo (Thread States)**
Un hilo pasa por diferentes estados:
1. **NEW**: Recién creado (antes de `start()`).
2. **RUNNABLE**: En ejecución o listo para ejecutar.
3. **BLOCKED/WAITING**: Esperando por un recurso o otro hilo.
4. **TERMINATED**: Finalizó su ejecución.

---

### 🔹 **Métodos importantes de hilos**
- `start()` → Inicia el hilo.
- `run()` → Contiene la lógica del hilo (no se llama directamente).
- `sleep(long ms)` → Pausa el hilo por un tiempo.
- `join()` → Espera a que el hilo termine.
- `interrupt()` → Interrumpe el hilo.

---

### 🔹 **Ejemplo con varios hilos**
```java
public class Main {
    public static void main(String[] args) {
        // Hilo 1
        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hilo 1: " + i);
                try { Thread.sleep(1000); } catch (InterruptedException e) {}
            }
        }).start();

        // Hilo 2
        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hilo 2: " + i);
                try { Thread.sleep(1000); } catch (InterruptedException e) {}
            }
        }).start();
    }
}
```
**Salida (aproximada)**:
```
Hilo 1: 0
Hilo 2: 0
Hilo 1: 1
Hilo 2: 1
...
```
⚠️ **Nota**: El orden de ejecución no es predecible (depende del planificador de hilos del SO).

---

### 🔹 **Concurrencia y problemas comunes**
- **Race Condition**: Cuando varios hilos acceden a un recurso compartido sin sincronización.
- **Deadlock**: Dos o más hilos se bloquean mutuamente esperando recursos.

**Solución**: Usar `synchronized`, `Lock`, o clases de `java.util.concurrent`.

---

### 🔹 **¿Por qué usar hilos?**
- Aprovechar CPUs multicore.
- Mejorar la capacidad de respuesta en aplicaciones GUI.
- Ejecutar tareas en segundo plano (ej: descargas, procesamiento de datos).

---

### 📌 **Resumen**
- Los hilos permiten **ejecución concurrente** en Java.
- Se crean con `Thread` o `Runnable`.
- Java maneja su ejecución, pero hay que controlar la **sincronización**.
- Son esenciales para programas eficientes y modernos.
