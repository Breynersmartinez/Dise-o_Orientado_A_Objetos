# Principios SOLID en Java

SOLID es un acrónimo que representa cinco principios fundamentales de diseño orientado a objetos que ayudan a crear software más mantenible, escalable y robusto. Estos principios fueron introducidos por Robert C. Martin (también conocido como Uncle Bob) y son especialmente relevantes en el desarrollo con Java.

## Los 5 principios SOLID:

### 1. **S - Principio de Responsabilidad Única (Single Responsibility Principle - SRP)**
```java
// MAL: Una clase con múltiples responsabilidades
class Empleado {
    public void calcularSalario() { /* ... */ }
    public void guardarEnBaseDeDatos() { /* ... */ }
    public void generarReporte() { /* ... */ }
}

// BIEN: Separar en clases con una sola responsabilidad
class Empleado {
    public void calcularSalario() { /* ... */ }
}

class EmpleadoRepository {
    public void guardar(Empleado emp) { /* ... */ }
}

class ReporteGenerator {
    public void generarReporte(Empleado emp) { /* ... */ }
}
```

### 2. **O - Principio de Abierto/Cerrado (Open/Closed Principle - OCP)**
```java
// MAL: Modificar la clase existente para añadir nuevas formas
class AreaCalculator {
    public double calcularArea(Object forma) {
        if (forma instanceof Rectangulo) {
            // cálculo para rectángulo
        } else if (forma instanceof Circulo) {
            // cálculo para círculo
        }
        // Se debe modificar para añadir nuevas formas
    }
}

// BIEN: Extender mediante abstracciones
interface Forma {
    double calcularArea();
}

class Rectangulo implements Forma {
    @Override
    public double calcularArea() { /* ... */ }
}

class Circulo implements Forma {
    @Override
    public double calcularArea() { /* ... */ }
}

// Nuevas formas se añaden implementando la interfaz sin modificar código existente
```

### 3. **L - Principio de Sustitución de Liskov (Liskov Substitution Principle - LSP)**
```java
// MAL: Subclase que viola el contrato de la superclase
class Pajaro {
    public void volar() { /* ... */ }
}

class Pinguino extends Pajaro {
    @Override
    public void volar() {
        throw new UnsupportedOperationException("Los pingüinos no vuelan");
    }
}

// BIEN: Diseño que cumple con LSP
interface Ave {
    void comer();
}

interface AveVoladora extends Ave {
    void volar();
}

class Gorrion implements AveVoladora {
    public void volar() { /* ... */ }
    public void comer() { /* ... */ }
}

class Pinguino implements Ave {
    public void comer() { /* ... */ }
}
```

### 4. **I - Principio de Segregación de Interfaces (Interface Segregation Principle - ISP)**
```java
// MAL: Interfaz "gorda" que obliga a implementar métodos no necesarios
interface Trabajador {
    void trabajar();
    void comer();
    void asistirReuniones();
}

class Programador implements Trabajador {
    // Programador no debería necesitar implementar asistirReuniones()
}

// BIEN: Interfaces específicas
interface Trabajador {
    void trabajar();
}

interface Comedor {
    void comer();
}

interface ReunionAsistente {
    void asistirReuniones();
}

class Programador implements Trabajador, Comedor {
    // Solo implementa lo que necesita
}
```

### 5. **D - Principio de Inversión de Dependencias (Dependency Inversion Principle - DIP)**
```java
// MAL: Dependencia directa de implementación concreta
class ServicioDeNotificacion {
    private EmailService emailService = new EmailService();
    
    public void notificar() {
        emailService.enviarEmail();
    }
}

// BIEN: Depender de abstracciones
interface ServicioMensajeria {
    void enviarMensaje();
}

class ServicioDeNotificacion {
    private ServicioMensajeria servicio;
    
    public ServicioDeNotificacion(ServicioMensajeria servicio) {
        this.servicio = servicio;
    }
    
    public void notificar() {
        servicio.enviarMensaje();
    }
}

// Ahora podemos inyectar EmailService, SMSService, etc. que implementen la interfaz
```

## Beneficios de aplicar SOLID en Java:

1. Código más mantenible y fácil de entender
2. Menos acoplamiento entre componentes
3. Mayor facilidad para realizar pruebas unitarias
4. Más flexible ante cambios futuros
5. Mejor reutilización de código

Estos principios son fundamentales para el desarrollo de software profesional en Java y son la base de muchos patrones de diseño y arquitecturas modernas.
