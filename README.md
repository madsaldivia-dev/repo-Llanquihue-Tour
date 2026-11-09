# 🌋 Llanquihue Tour

Sistema de gestión de personas para una agencia de turismo del sur de
Chile, desarrollado en **Java 23** con Programación Orientada a
Objetos.

## 📋 Descripción

El proyecto modela a las personas de la agencia: **guías**,
**empleados**, **clientes** y **proveedores**. Todas heredan los datos
comunes de la clase `Personas` y agregan sus propios atributos.

## 🧠 Conceptos aplicados

- **Herencia:** `Guias`, `Empleados`, `Clientes` y `Proveedores`
extienden `Personas`.
- **Composición:** `Personas` contiene un objeto `Direccion` y un objeto `Rut`.
- **Encapsulamiento:** atributos privados con getters y setters.
- **Validaciones:** reglas en los setters con `IllegalArgumentException`.
- **Excepción personalizada:** `RutInvalidoException` para RUT con
formato inválido.

## 🗂️ Estructura

```text
src/
├── app/
│   └── Main.java
├── model/
│   ├── Personas.java
│   ├── Guias.java
│   ├── Empleados.java
│   ├── Clientes.java
│   ├── Proveedores.java
│   ├── Direccion.java
│   └── Rut.java
└── util/
    └── RutInvalidoException.java
```

## ✅ Validaciones

| Clase | Atributo | Regla |
|---|---|---|
| Personas | nombre, apellido | No pueden estar vacíos |
| Personas | email | Debe contener `@` |
| Direccion | numero | Debe ser positivo |
| Empleados | sueldo | Debe ser mayor a 0 |
| Rut | numero | Formato `XXXXXXXX-Y` |

## 🚀 Cómo ejecutar

Requiere **JDK 15 o superior**.

1. Abrir el proyecto en IntelliJ IDEA.
2. Ejecutar `src/app/Main.java`.

## 🖥️ Salida de ejemplo

```text
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
```

## 👩‍💻 Autora

**Madeleine Saldivia** · [@madsaldivia-dev](https://github.com/madsaldivia-dev)


    
