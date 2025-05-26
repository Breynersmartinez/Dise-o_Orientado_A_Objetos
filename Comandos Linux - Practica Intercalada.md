## Ejercicio 1: Navegación y Listado

**Breiner ejecuta:**
```bash
pwd                    # Ver directorio actual
ls                     # Listar contenido
ls -la                 # Listar con detalles y archivos ocultos
```

**Andrés ejecuta:**
```bash
cd ~                   # Ir al directorio home
ls -lh                 # Listar con tamaños legibles
history               # Ver historial de comandos
```

## Ejercicio 2: Creación de Directorios y Archivos

**Andrés ejecuta:**
```bash
mkdir practica_linux                    # Crear directorio
cd practica_linux                       # Entrar al directorio
mkdir -p proyectos/web/frontend         # Crear directorios anidados
```

**Breiner ejecuta:**
```bash
cd practica_linux                       # Entrar al mismo directorio
touch archivo1.txt                      # Crear archivo vacío
touch archivo2.txt archivo3.txt         # Crear múltiples archivos
ls -l                                   # Ver los archivos creados
```

## Ejercicio 3: Edición y Visualización de Archivos

**Breiner ejecuta:**
```bash
echo "Hola, soy Breiner" > archivo1.txt    # Escribir contenido
echo "Línea 2" >> archivo1.txt             # Añadir contenido
cat archivo1.txt                            # Ver contenido completo
```

**Andrés ejecuta:**
```bash
echo "Hola, soy Andrés" > archivo2.txt     # Escribir contenido
echo "Esta es mi práctica" >> archivo2.txt # Añadir contenido
head archivo2.txt                           # Ver primeras líneas
tail archivo1.txt                           # Ver últimas líneas de archivo de Breiner
```

## Ejercicio 4: Copia y Movimiento

**Andrés ejecuta:**
```bash
cp archivo1.txt backup_archivo1.txt        # Copiar archivo de Breiner
mkdir respaldos                             # Crear directorio para respaldos
cp -r proyectos proyectos_backup            # Copiar directorio completo
```

**Breiner ejecuta:**
```bash
mv archivo3.txt archivo_renombrado.txt     # Renombrar archivo
mv archivo_renombrado.txt respaldos/        # Mover archivo a directorio
ls respaldos/                               # Verificar contenido
```

## Ejercicio 5: Gestión de Permisos

**Breiner ejecuta:**
```bash
ls -l archivo1.txt                          # Ver permisos actuales
chmod 644 archivo1.txt                      # Establecer permisos rw-r--r--
ls -l archivo1.txt                          # Verificar cambios
```

**Andrés ejecuta:**
```bash
chmod u+x archivo2.txt                      # Añadir permiso de ejecución al propietario
chmod g-w archivo2.txt                      # Quitar permiso de escritura al grupo
ls -l archivo*.txt                          # Ver permisos de todos los archivos
```

## Ejercicio 6: Información del Sistema y Usuarios

**Andrés ejecuta:**
```bash
whoami                                      # Ver tu usuario actual
id                                          # Ver ID y grupos
pwd                                         # Ver directorio actual
```

**Breiner ejecuta:**
```bash
users                                       # Ver usuarios conectados
who                                         # Ver quién está conectado
clear                                       # Limpiar pantalla
```

## Ejercicio 7: Búsqueda y Filtrado

**Breiner ejecuta:**
```bash
find . -name "*.txt"                        # Buscar archivos .txt
find . -type d                              # Buscar directorios
ls -la | grep archivo                       # Filtrar listado
```

**Andrés ejecuta:**
```bash
grep "Breiner" archivo1.txt                 # Buscar texto en archivo
grep -r "Andrés" .                          # Búsqueda recursiva
find . -name "*backup*"                     # Buscar archivos con "backup"
```

## Ejercicio 8: Gestión de Procesos y Comandos Avanzados

**Andrés ejecuta:**
```bash
ps aux | head -10                           # Ver procesos activos
top                                         # Monitor de procesos (salir con 'q')
```

**Breiner ejecuta:**
```bash
df -h                                       # Ver espacio en disco
du -sh *                                    # Ver tamaño de directorios
free -h                                     # Ver memoria disponible
```

## Ejercicio 9: Limpieza y Eliminación

**Breiner ejecuta:**
```bash
rm backup_archivo1.txt                      # Eliminar archivo
ls -la                                      # Verificar eliminación
```

**Andrés ejecuta:**
```bash
rmdir respaldos                             # Intentar eliminar directorio (fallará si no está vacío)
rm respaldos/*                              # Eliminar contenido del directorio
rmdir respaldos                             # Ahora eliminar el directorio vacío
```

## Ejercicio 10: Comandos de Red y Sistema (Opcional)

**Andrés ejecuta:**
```bash
ping -c 3 google.com                        # Probar conectividad
date                                        # Ver fecha y hora
uptime                                      # Ver tiempo de actividad del sistema
```

**Breiner ejecuta:**
```bash
uname -a                                    # Información del sistema
which ls                                    # Ubicación del comando ls
echo $HOME                                  # Ver variable de entorno HOME
```

## Ejercicio Final: Navegación y Limpieza

**Ambos ejecutan (por turnos):**
```bash
cd ..                                       # Salir del directorio de práctica
ls -la                                      # Ver contenido
rm -r practica_linux                        # Eliminar directorio de práctica completo
ls -la                                      # Verificar eliminación
```

---

## Consejos para la Práctica:

1. **Alternen turnos**: Cada uno ejecute su bloque de comandos antes de que el otro continúe
2. **Observen los resultados**: Después de cada comando, analicen la salida
3. **Hagan preguntas**: Si algo no funciona como esperan, discútanlo
4. **Experimenten**: Una vez completados los ejercicios, prueben variaciones
5. **Usen `man comando`**: Para obtener ayuda detallada de cualquier comando

## Atajos de Teclado Útiles:
- `Ctrl + C`: Interrumpir comando actual
- `Ctrl + L`: Limpiar pantalla (equivale a `clear`)
- `Ctrl + R`: Buscar en historial de comandos
- `Tab`: Autocompletar nombres de archivos y directorios
- `↑/↓`: Navegar por historial de comandos
