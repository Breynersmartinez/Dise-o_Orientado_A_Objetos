
## Gestión de directorios

**Crear carpetas**:
- `mkdir nombre_carpeta` - Crea un directorio
- `mkdir -p ruta/a/nueva/carpeta` - Crea directorios anidados

**Acceder a carpetas**:
- `cd nombre_carpeta` - Cambia al directorio especificado
- `cd ..` - Sube un nivel en la estructura de directorios
- `cd ~` - Va al directorio home del usuario
- `cd /` - Va al directorio raíz

**Borrar carpetas**:
- `rmdir nombre_carpeta` - Elimina un directorio vacío
- `rm -r nombre_carpeta` - Elimina un directorio y su contenido recursivamente

**Mover/renombrar carpetas**:
- `mv carpeta_origen carpeta_destino` - Mueve o renombra la carpeta

**Copiar carpetas**:
- `cp -r carpeta_origen carpeta_destino` - Copia un directorio y su contenido

## Gestión de archivos

**Crear archivos**:
- `touch nombre_archivo.txt` - Crea un archivo vacío
- `nano nombre_archivo.txt` - Crea/edita un archivo con el editor nano
- `vim nombre_archivo.txt` - Crea/edita un archivo con el editor vim

**Acceder/ver archivos**:
- `cat archivo.txt` - Muestra el contenido completo
- `less archivo.txt` - Muestra el contenido página por página
- `head archivo.txt` - Muestra las primeras líneas
- `tail archivo.txt` - Muestra las últimas líneas

**Borrar archivos**:
- `rm archivo.txt` - Elimina un archivo

**Mover/renombrar archivos**:
- `mv archivo_origen.txt archivo_destino.txt` - Mueve o renombra archivo

**Copiar archivos**:
- `cp archivo_origen.txt archivo_destino.txt` - Copia un archivo

## Listar contenido de directorios

- `ls` - Lista el contenido básico del directorio actual
- `ls -l` - Lista en formato largo (permisos, propietario, tamaño)
- `ls -a` - Muestra también archivos ocultos
- `ls -la` - Combina formato largo y archivos ocultos
- `ls -lh` - Formato largo con tamaños legibles (KB, MB)

## Uso de terminales

- `clear` - Limpia la pantalla
- `exit` o `logout` - Cierra la sesión actual
- `history` - Muestra historial de comandos
- `sudo comando` - Ejecuta comando con privilegios de superusuario
- `Ctrl+C` - Interrumpe el proceso actual
- `Ctrl+Z` - Suspende el proceso actual
- `bg` - Continúa un proceso suspendido en segundo plano
- `fg` - Trae al primer plano un proceso en segundo plano

## Gestión de permisos

**Ver permisos**:
- `ls -l` - Muestra permisos en formato `-rwxrwxrwx`
  - Primer carácter: tipo de archivo (d=directorio, -=archivo regular)
  - Siguientes 3 caracteres: permisos del propietario (rwx)
  - Siguientes 3 caracteres: permisos del grupo (rwx)
  - Últimos 3 caracteres: permisos de otros usuarios (rwx)

**Cambiar permisos**:
- `chmod` - Cambia permisos de archivos y directorios
  - Modo simbólico:
    - `chmod u+x archivo` - Añade permiso de ejecución al propietario
    - `chmod g-w archivo` - Quita permiso de escritura al grupo
    - `chmod o=r archivo` - Establece solo permiso de lectura para otros
    - `chmod a+r archivo` - Añade permiso de lectura para todos
  - Modo numérico:
    - `chmod 755 archivo` - rwxr-xr-x (7=rwx, 5=r-x)
    - `chmod 644 archivo` - rw-r--r-- (6=rw-, 4=r--)

**Cambiar propietario y grupo**:
- `chown usuario archivo` - Cambia el propietario
- `chown usuario:grupo archivo` - Cambia propietario y grupo
- `chgrp grupo archivo` - Cambia solo el grupo

## Gestión de usuarios

**Información de usuarios**:
- `whoami` - Muestra tu nombre de usuario
- `id` - Muestra ID de usuario y grupos
- `users` - Muestra usuarios conectados
- `who` - Muestra quién está conectado

**Crear usuarios** (requiere privilegios de administrador):
- `sudo useradd nombre_usuario` - Crea un usuario
- `sudo useradd -m nombre_usuario` - Crea usuario con directorio home
- `sudo passwd nombre_usuario` - Establece contraseña para el usuario

**Modificar usuarios**:
- `sudo usermod -aG grupo usuario` - Añade usuario a un grupo
- `sudo usermod -l nuevo_nombre antiguo_nombre` - Cambia nombre de usuario

**Eliminar usuarios**:
- `sudo userdel nombre_usuario` - Elimina un usuario
- `sudo userdel -r nombre_usuario` - Elimina usuario y su directorio home

**Gestión de grupos**:
- `sudo groupadd nombre_grupo` - Crea un nuevo grupo
- `sudo groupdel nombre_grupo` - Elimina un grupo
- `groups usuario` - Muestra los grupos a los que pertenece un usuario

