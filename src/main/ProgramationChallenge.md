
### Descripción del reto:

**Sistema de Gestión de Pedidos en un Restaurante**

Desarrolla un sistema para gestionar los pedidos de un restaurante utilizando principios de Programación Orientada a Objetos. El sistema debe permitir a los usuarios realizar pedidos, asignar los pedidos a camareros, generar facturas y gestionar los estados de los pedidos.

#### Requisitos:

1. **Clases principales:**
    - `Pedido`: Representa un pedido hecho por un cliente.
        - Atributos:
            - `id` (único para cada pedido).
            - `cliente` (nombre del cliente).
            - `items` (lista de platos).
            - `estado` (nuevo, en preparación, listo, entregado).
            - `total` (monto total del pedido).
        - Métodos:
            - `añadirItem(item: Item)`: Añade un plato al pedido.
            - `actualizarEstado(estado: String)`: Cambia el estado del pedido.
            - `calcularTotal()`: Calcula el total del pedido sumando los precios de los platos.

    - `Item`: Representa un plato del menú.
        - Atributos:
            - `nombre` (nombre del plato).
            - `precio` (precio del plato).
            - `categoria` (entrada, plato principal, postre, bebida).
        - Métodos:
            - `obtenerDetalles()`: Retorna los detalles del plato (nombre, precio, categoría).

    - `Camarero`: Representa a un camarero del restaurante.
        - Atributos:
            - `id` (identificador único del camarero).
            - `nombre` (nombre del camarero).
            - `pedidos` (lista de pedidos asignados).
        - Métodos:
            - `asignarPedido(pedido: Pedido)`: Asigna un pedido al camarero.
            - `listarPedidos()`: Muestra todos los pedidos asignados al camarero.

    - `Factura`: Representa la factura de un pedido.
        - Atributos:
            - `pedido` (el pedido asociado a la factura).
            - `fecha` (fecha de emisión de la factura).
            - `descuento` (descuento aplicado).
            - `totalConDescuento` (total después de aplicar el descuento).
        - Métodos:
            - `aplicarDescuento(porcentaje: Double)`: Aplica un descuento al total del pedido.
            - `generarFactura()`: Muestra la factura final.

2. **Funcionalidades adicionales:**
    - El sistema debe permitir a un camarero recibir un pedido, agregar los platos y cambiar el estado del pedido a medida que avanza (en preparación, listo, entregado).
    - Al finalizar el pedido, se debe generar una factura con el total y aplicar descuentos si corresponde.
    - Un cliente puede tener múltiples pedidos, pero cada pedido tiene un único camarero asignado.
    - El sistema debe gestionar el proceso de asignación de pedidos entre camareros y la facturación de cada pedido.

#### Restricciones:
- Utiliza **herencia** si es necesario, por ejemplo, si se necesita diferenciar entre tipos de camareros (por ejemplo, camareros de cocina, camareros de servicio, etc.).
- Utiliza **polimorfismo** si creas diferentes tipos de platos con distintas formas de calcular el precio.
- **Encapsulamiento**: Asegúrate de proteger los atributos de las clases utilizando modificadores de acceso adecuados (por ejemplo, `private`, `public`).
- **Composición y agregación**: Asegúrate de que las clases `Pedido` y `Factura` tengan relaciones con otras clases (como `Item`).

#### Preguntas que podrían hacerte:
1. ¿Cómo mejorarías el rendimiento de este sistema si tuviera que manejar grandes volúmenes de pedidos y platos?
2. ¿Qué patrón de diseño utilizarías para gestionar el proceso de pago de los pedidos?
3. ¿Cómo manejarías la persistencia de datos (por ejemplo, almacenando pedidos y facturas en una base de datos)?
4. ¿Qué mejoras adicionales podrías implementar para hacer el sistema más eficiente o escalable?

- 3 horas para completar el reto