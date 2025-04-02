
---

### **1. Conceptos Básicos de Spring Boot**  
- **Spring Boot Starter**: Dependencias preconfiguradas para facilitar el desarrollo (ej. `spring-boot-starter-web`, `spring-boot-starter-data-jpa`).  
- **Auto-configuración**: Spring Boot configura automáticamente beans basados en las dependencias del proyecto.  
- **SpringApplication**: Clase principal que inicia la aplicación (`@SpringBootApplication`).  
- **Embedded Server (Tomcat, Jetty, Undertow)**: Servidores integrados para ejecutar aplicaciones sin necesidad de despliegue externo.  
- **Spring Boot Actuator**: Herramientas para monitoreo y gestión de aplicaciones en producción (`/health`, `/metrics`).  

---

### **2. Desarrollo de APIs REST con Spring Boot**  
- **@RestController**: Define un controlador que maneja solicitudes HTTP y devuelve respuestas REST.  
- **@RequestMapping / @GetMapping, @PostMapping, etc.**: Mapeo de endpoints.  
- **@RequestBody / @ResponseBody**: Manejo de datos en solicitudes/respuestas (JSON/XML).  
- **DTO (Data Transfer Object)**: Patrón para transferencia de datos entre capas.  
- **ResponseEntity**: Clase para personalizar respuestas HTTP (códigos de estado, headers).  
- **OpenAPI / Swagger**: Documentación automática de APIs.  

---

### **3. Persistencia de Datos (Spring Data JPA / Hibernate)**  
- **@Entity**: Define una clase como entidad de base de datos.  
- **@Repository**: Capa de acceso a datos (interfaces que extienden `JpaRepository`).  
- **JPQL (Java Persistence Query Language)**: Lenguaje de consulta similar a SQL pero orientado a objetos.  
- **Hibernate**: Implementación de JPA más usada en Spring Boot.  
- **@Transactional**: Gestiona transacciones en métodos o clases.  
- **Flyway / Liquibase**: Herramientas para migraciones de bases de datos.  

---

### **4. Seguridad (Spring Security)**  
- **Authentication & Authorization**: Autenticación (¿quién eres?) y autorización (¿qué puedes hacer?).  
- **JWT (JSON Web Token)**: Tokens para autenticación stateless.  
- **OAuth2**: Protocolo para autorización (ej. Login con Google/GitHub).  
- **@PreAuthorize / @Secured**: Anotaciones para control de acceso a métodos.  
- **CORS (Cross-Origin Resource Sharing)**: Configuración para permitir solicitudes desde diferentes dominios.  
- **CSRF Protection**: Protección contra ataques CSRF (habilitado por defecto en formularios).  

---

### **5. Manejo de Excepciones**  
- **@ControllerAdvice / @ExceptionHandler**: Manejo centralizado de excepciones.  
- **ResponseStatusException**: Excepción para personalizar códigos HTTP.  
- **Custom Exceptions**: Creación de excepciones personalizadas.  

---

### **6. Configuración y Propiedades**  
- **application.properties / application.yml**: Archivos de configuración.  
- **@Value**: Inyección de propiedades en variables.  
- **@ConfigurationProperties**: Mapeo de propiedades a objetos Java.  
- **Perfiles (Profiles)**: Configuraciones específicas para entornos (`dev`, `prod`, `test`).  

---

### **7. Testing en Spring Boot**  
- **@SpringBootTest**: Pruebas de integración con contexto de Spring.  
- **@WebMvcTest**: Pruebas de controladores MVC.  
- **@DataJpaTest**: Pruebas de repositorios JPA.  
- **MockMvc**: Simulación de peticiones HTTP en pruebas.  
- **Testcontainers**: Pruebas con bases de datos reales en contenedores Docker.  

---

### **8. Comunicación entre Microservicios**  
- **RestTemplate / WebClient**: Clientes HTTP para consumir APIs REST.  
- **Feign Client**: Cliente declarativo para microservicios.  
- **Spring Cloud**:  
  - **Eureka**: Service discovery.  
  - **Zuul / Spring Cloud Gateway**: API Gateway.  
  - **Hystrix / Resilience4j**: Tolerancia a fallos (Circuit Breaker).  
- **Event-Driven Architecture**:  
  - **Spring Kafka / RabbitMQ**: Mensajería asíncrona.  

---

### **9. Logging y Monitoreo**  
- **SLF4J / Logback**: Librerías de logging.  
- **Spring Boot Actuator**: Endpoints para monitoreo (`/health`, `/info`, `/prometheus`).  
- **Prometheus + Grafana**: Monitoreo y visualización de métricas.  

---

### **10. Despliegue y DevOps**  
- **JAR vs WAR**: Empaquetado de aplicaciones (Spring Boot usa JAR ejecutable por defecto).  
- **Docker / Dockerfile**: Contenerización de aplicaciones.  
- **Kubernetes (K8s)**: Orquestación de contenedores.  
- **CI/CD**: Jenkins, GitHub Actions, GitLab CI.  

---

### **11. Buenas Prácticas y Patrones**  
- **Inversión de Control (IoC) / Dependency Injection (DI)**: Principios clave de Spring.  
- **SOLID**: Principios de diseño de software.  
- **Clean Architecture / Hexagonal Architecture**: Diseño modular y mantenible.  
- **CQRS (Command Query Responsibility Segregation)**: Separación de lecturas y escrituras.  

---

### **12. Herramientas Adicionales**  
- **Lombok**: Reduce código boilerplate con anotaciones (`@Data`, `@Builder`).  
- **MapStruct**: Mapeo automático entre DTOs y entidades.  
- **Spring Batch**: Procesamiento por lotes (batch).  

---

### **Conclusión**  
Spring Boot simplifica el desarrollo backend en Java, pero requiere conocimiento de su ecosistema. Desde la creación de APIs REST hasta seguridad, bases de datos y despliegue en la nube, estos términos son esenciales para cualquier desarrollador backend que use Spring Boot.  

