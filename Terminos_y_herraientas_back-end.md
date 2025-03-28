

### **🔹 1. Conceptos Fundamentales**
| Término          | Explicación                                                                 | Ejemplo                                                                 |
|------------------|-----------------------------------------------------------------------------|-------------------------------------------------------------------------|
| **API**          | Interfaz que permite comunicación entre sistemas. Define "reglas" de interacción. | `@RestController` en Spring Boot que devuelve JSON.                    |
| **Endpoint**     | URL específica de una API que realiza una operación.                        | `GET /api/users` (obtener usuarios).                                   |
| **Microservicio**| Pequeño servicio independiente con un propósito específico.                 | Servicio de "Autenticación" separado del servicio de "Pedidos".        |
| **Monolito**     | Aplicación donde todos los componentes están acoplados en un solo código.   | Un WAR de Spring Boot con módulos de usuarios, productos, etc. juntos. |

---

### **🔹 2. Protocolos & Estándares**
| Término          | Explicación                                                                 | Ejemplo                                                                 |
|------------------|-----------------------------------------------------------------------------|-------------------------------------------------------------------------|
| **HTTP/HTTPS**   | Protocolo para comunicación web. Métodos: GET, POST, PUT, DELETE.           | `@GetMapping("/users")` en Spring.                                     |
| **REST**         | Estilo arquitectónico para APIs basado en HTTP y recursos.                  | API que usa JSON y verbos HTTP (`POST /orders` para crear pedidos).    |
| **gRPC**         | Protocolo RPC de alto rendimiento (usa HTTP/2 y Protocol Buffers).          | Comunicación entre microservicios internos.                            |
| **WebSocket**    | Conexión persistente bidireccional (ej: chats en tiempo real).              | `@MessageMapping` en Spring con STOMP.                                 |

---

### **🔹 3. Bases de Datos**
| Término          | Explicación                                                                 | Ejemplo                                                                 |
|------------------|-----------------------------------------------------------------------------|-------------------------------------------------------------------------|
| **SQL**          | Bases de datos relacionales (tablas con relaciones).                        | MySQL, PostgreSQL. Uso con `JpaRepository` en Spring.                  |
| **NoSQL**        | Bases de datos no relacionales (documentos, grafos, etc.).                  | MongoDB (`@Document`), Redis para caché.                                |
| **ORM**          | Mapeo objeto-relacional (convierte objetos Java ↔ tablas SQL).              | Hibernate (usado por defecto en Spring Data JPA).                       |
| **Migraciones**  | Control de cambios en la estructura de la base de datos.                    | Flyway o Liquibase con archivos `V1__Create_users_table.sql`.           |

---

### **🔹 4. Autenticación & Seguridad**
| Término          | Explicación                                                                 | Ejemplo                                                                 |
|------------------|-----------------------------------------------------------------------------|-------------------------------------------------------------------------|
| **JWT**          | Token JSON para autenticación sin estado.                                   | `jjwt` library en Java para generar tokens.                            |
| **OAuth2**       | Protocolo para autorización (ej: "Iniciar sesión con Google").              | Spring Security OAuth2.                                                |
| **CORS**         | Mecanismo para permitir peticiones cruzadas entre dominios.                 | `@CrossOrigin(origins = "*")` en Spring.                               |
| **Hashing**      | Convertir contraseñas en cadenas irreversibles.                             | BCrypt (`PasswordEncoder` en Spring Security).                         |

---

### **🔹 5. Comunicación entre Servicios**
| Término          | Explicación                                                                 | Ejemplo                                                                 |
|------------------|-----------------------------------------------------------------------------|-------------------------------------------------------------------------|
| **API Gateway**  | Punto de entrada único que enruta peticiones a microservicios.              | Spring Cloud Gateway.                                                  |
| **Load Balancer**| Distribuye tráfico entre múltiples instancias de un servicio.               | Nginx o balanceador de AWS.                                            |
| **Message Broker**| Sistema para manejar colas de mensajes (eventos asíncronos).               | RabbitMQ (`@RabbitListener`), Apache Kafka.                            |
| **Feign Client** | Cliente HTTP declarativo para llamar a otras APIs (Spring Cloud).           | `@FeignClient(name = "servicio-usuarios")`.                            |

---

### **🔹 6. Infraestructura & DevOps**
| Término          | Explicación                                                                 | Ejemplo                                                                 |
|------------------|-----------------------------------------------------------------------------|-------------------------------------------------------------------------|
| **Contenedor**   | Empaquetado de una app con sus dependencias (aislamiento).                  | Docker (`Dockerfile` con `FROM openjdk:17`).                           |
| **Kubernetes**   | Orquestador de contenedores (auto-escalado, gestión).                       | Desplegar microservicios en pods.                                       |
| **CI/CD**        | Automatización de integración y despliegue continuo.                        | GitHub Actions para construir y deployar en cada `git push`.            |
| **Serverless**   | Ejecución de código sin gestionar servidores (ej: AWS Lambda).              | Función Java que procesa archivos en S3.                                |

---

### **🔹 7. Patrones de Diseño (Backend)**
| Término          | Explicación                                                                 | Ejemplo                                                                 |
|------------------|-----------------------------------------------------------------------------|-------------------------------------------------------------------------|
| **Singleton**    | Clase con una única instancia global.                                       | `@Service` en Spring (por defecto son singletons).                      |
| **Repository**   | Abstracción para acceder a datos (similar a DAO).                           | `JpaRepository<User, Long>` en Spring Data.                             |
| **DTO**          | Objeto para transferir datos entre capas (sin lógica).                     | Clase `UserDTO` con solo campos necesarios para la API.                 |
| **CQRS**         | Separación entre consultas (Query) y comandos (Command).                    | Usar `@Query` en repositorios para consultas complejas.                 |

---

### **🔹 8. Testing**
| Término          | Explicación                                                                 | Ejemplo                                                                 |
|------------------|-----------------------------------------------------------------------------|-------------------------------------------------------------------------|
| **Unit Test**    | Prueba de una clase/método en aislamiento.                                  | `@Test` con JUnit y Mockito (`when(...).thenReturn(...)`).              |
| **Integration Test** | Prueba de múltiples componentes interactuando.                          | `@SpringBootTest` para probar una API REST.                             |
| **Mock**         | Objeto simulado para reemplazar dependencias en tests.                      | `@MockBean` en Spring para simular un `UserRepository`.                 |

---

### **🎯 Clave para Recordar**
- **"API" es cómo hablas**, **"Microservicio" es quién eres**.
- **Spring Boot** es el "kit de herramientas" para implementar estos conceptos en Java.

