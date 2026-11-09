Sistema de gestión de personas para una agencia de turismo del sur de Chile, desarrollado en Java 23 aplicando Programación Orientada a Objetos: herencia, composición, encapsulamiento, validaciones y excepciones personalizadas.

📋 Descripción

El proyecto modela las personas que interactúan con la agencia (guías, empleados, clientes y proveedores). Todas heredan los datos comunes de la clase Personas y agregan sus atributos propios. Los datos se validan en los setters y el RUT chileno se valida al momento de crearse.

🗂️ Estructura del proyecto
repo-Llanquihue-Tour/
├── src/
│   ├── app/
│   │   └── Main.java                  # Punto de entrada, crea y muestra los objetos
│   ├── model/
│   │   ├── Personas.java              # Clase base con datos personales
│   │   ├── Guias.java                 # Guía turístico (idiomas, experiencia, especialidades)
│   │   ├── Empleados.java             # Empleado (cargo, sueldo, área, años de servicio)
│   │   ├── Clientes.java              # Cliente (tipo de cliente, reserva)
│   │   ├── Proveedores.java           # Proveedor (empresa, tipo de servicio)
│   │   ├── Direccion.java             # Calle, número, comuna y región
│   │   └── Rut.java                   # RUT validado y normalizado
│   └── util/
│       └── RutInvalidoException.java  # Excepción para RUT con formato inválido
└── Llanquihue_Tour.iml
🧩 Diagrama de clases
lanza
Personas
-String nombre
-String apellido
-Direccion direccion
-Rut rut
-String email
-String telefono
Guias
-List<String> idiomas
-int aniosExperiencia
-List<String> especialidades
Empleados
-String cargo
-double sueldo
-String area
-int aniosServicio
Clientes
-String tipoCliente
-String reserva
Proveedores
-String empresa
-String tipoDeServicio
Direccion
-String calle
-int numero
-String comuna
-String region
Rut
-String numero
-validar(String) : String
RutInvalidoException
✅ Validaciones implementadas
Clase	Atributo	Regla
Personas	nombre, apellido	No pueden ser nulos ni vacíos
Personas	email	Debe contener @
Direccion	comuna	No puede ser nula ni vacía
Direccion	numero	Debe ser positivo
Empleados	cargo	No puede ser nulo ni vacío
Empleados	sueldo	Debe ser mayor a 0
Rut	numero	Formato XXXXXXXX-Y (acepta puntos, los elimina y pasa la k a mayúscula); si no cumple lanza RutInvalidoException
🚀 Cómo ejecutar

Requisitos: JDK 23 (o JDK 15+ por el uso de text blocks).

Desde IntelliJ IDEA
Abrir la carpeta del proyecto.
Ejecutar src/app/Main.java.
Desde la terminal
bash
git clone https://github.com/madsaldivia-dev/repo-Llanquihue-Tour.git
cd repo-Llanquihue-Tour

# Compilar
javac -d out $(find src -name "*.java")

# Ejecutar
java -cp out app.Main

En Windows (PowerShell):

powershell
javac -d out (Get-ChildItem -Recurse src -Filter *.java).FullName
java -cp out app.Main
🖥️ Salida de ejemplo
╔══════════════════════════════════════════╗
║           LLANQUIHUE TOUR                ║
║  Aventura entre volcanes y lagos del Sur ║
╚══════════════════════════════════════════╝

========== GUÍA ==========
Nombre           : Juanito Perez
RUT              : 19994040-4
Email            : juanito@hotmail.cl
Teléfono         : 95678943
Dirección        : salvador Gutierrez 1234, Cerro Navia, Región Metropolitana
Idiomas          : Ingles, Español, Portugues
Años experiencia : 10
Especialidades   : Patrimonio Cultural, Tours de aventura, Montañismo
==========================

======== EMPLEADO ========
Nombre           : Patricia Saldivia
...
🛠️ Tecnologías
Java 23
IntelliJ IDEA
Git / GitHub
🔮 Mejoras futuras
Validar el dígito verificador del RUT (algoritmo módulo 11).
Convertir tipoCliente, reserva y area en enums o clases propias.
Formatear toString() de Proveedores igual que el resto de las clases.
Agregar pruebas unitarias con JUnit 5.
Menú interactivo por consola para registrar personas.
👩‍💻 Autora

Madeleine Saldivia — @madsaldivia-dev
