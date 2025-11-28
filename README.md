# Sistema SIAL (Sistema de Información Académica y Laboral) en Java

## Descripción
Dsarrollado en Java, simula el SIAL de la Universidad, permitiendo gestionar diferentes roles dentro de una universidad: alumnos, profesores y bedeles. Cada rol tiene permisos y funcionalidades específicas dentro del sistema.

## Características del Proyecto

### Funcionalidades Base
- Gestión de datos personales (nombre, apellidos, año de nacimiento)
- Sistema de roles jerárquico basado en herencia
- Control de acceso según el rol del usuario
- Visualización de información personalizada

## Mejoras Implementadas vs. Código Base

- ✅ Clase Empleado como extensión de Persona
- ✅ Clases especializadas: Profesor y Bedel que heredan de Empleado
- ✅ Clase Alumno con gestión de grupos y horarios
- ✅ Sistema de interacción con SIAL según rol
- ✅ Cálculo automático de antigüedad para empleados
- ✅ Validación de datos (grupos y horarios)

### Aportes Creativos Implementados

#### 1. **Jerarquía de Herencia**
Se implementó una estructura jerárquica de clases:
- `Persona` (clase base)
  - `Alumno` (hereda de Persona)
  - `Empleado` (hereda de Persona)
    - `Profesor` (hereda de Empleado)
    - `Bedel` (hereda de Empleado)

Esta estructura permite:
- Reutilización de código mediante herencia
- Polimorfismo en el método `interactuarConSIAL()`
- Organización lógica según roles universitarios

#### 2. **Sistema de Roles y Permisos**
Cada rol tiene acceso a funcionalidades específicas del SIAL:
- **Visitante**: Acceso denegado (solo página principal)
- **Alumno**: Ver calificaciones, cancelar materias, pagar matrícula
- **Empleado General**: Marcar asistencia, solicitar vacaciones, ver nómina
- **Profesor**: Subir calificaciones, modificar datos del curso
- **Bedel**: Gestionar accesos a salones, registrar inventario

#### 3. **Gestión de Grupos y Horarios (Alumno)**
- Método `ponGrupo()` con validación de datos
- Validación de grupo no nulo ni vacío
- Validación de horario (actualmente solo acepta 'M' - Mañana)
- Método `imprimeGrupo()` para visualizar asignación

#### 4. **Cálculo de Antigüedad (Empleado)**
- Cálculo automático de años de servicio
- Uso de `Calendar` para obtener el año actual
- Muestra la antigüedad en años al imprimir datos del empleado

#### 5. **Información Específica por Rol**
Cada clase especializada muestra información relevante:
- **Profesor**: Asignatura que imparte
- **Bedel**: Área supervisada
- **Empleado**: Año de ingreso y antigüedad

#### 6. **Método `imprime()` Sobrescrito**
- Cada clase extiende el método `imprime()` del padre
- Usa `super.imprime()` para reutilizar código
- Añade información específica del rol

## Estructura del Proyecto

```
ejercicio4/
│
├── Persona.java      # Clase base con datos personales
├── Alumno.java       # Clase para estudiantes
├── Empleado.java     # Clase base para empleados
├── Profesor.java     # Clase para docentes
├── Bedel.java        # Clase para personal de servicios
└── Prueba.java       # Clase principal de demostración
```

## Clases

### Persona.java
Clase base que gestiona:
- Datos personales básicos (nombre, apellidos, año de nacimiento)
- Rol dentro de la universidad
- Método base `interactuarConSIAL()` (acceso denegado para visitantes)
- Método `imprime()` para mostrar información

### Alumno.java
Extiende Persona y añade:
- Grupo académico
- Horario (M = Matutino)
- Validación de datos al asignar grupo
- Permisos de alumno en el SIAL

### Empleado.java
Extiende Persona y añade:
- Año de ingreso
- Cálculo automático de antigüedad
- Permisos básicos de empleado en el SIAL
- Clase padre de Profesor y Bedel

### Profesor.java
Extiende Empleado y añade:
- Asignatura que imparte
- Permisos específicos para gestión académica
- Capacidad de subir y modificar calificaciones

### Bedel.java
Extiende Empleado y añade:
- Área supervisada
- Permisos para gestión de espacios físicos
- Control de accesos y inventario

### Prueba.java
Clase principal que:
- Crea instancias de diferentes roles
- Demuestra el polimorfismo en `interactuarConSIAL()`
- Muestra la información completa de cada usuario
- Simula interacciones con el SIAL

## Requisitos

- Java JDK 8 o superior
- Biblioteca IO para entrada/salida (incluida en el proyecto)

## Cómo Ejecutar

1. Compilar todos los archivos .java
2. Ejecutar la clase `Prueba`
3. Observar cómo cada rol interactúa con el SIAL

## Ejemplo de Salida

```
--- SIAL (Alumno) ---
Datos Personales: Victor Cordoba Larez (2007)
Rol en la Universidad: Alumno
Grupo Ingenieria Informatica - M
[Victor, Alumno]: Accediendo al SIAL...
-> Funciones permitidas: Ver calificaciones, Cancelar materia, Pagar matricula.


--- SIAL (Profesor) ---
Datos Personales: Jonathan Berthel Castro (1998)
Rol en la Universidad: Profesor
Año de Ingreso: 2021
Antiguedad: 4 años
Asignatura: Programacion Oriendatada a Objetos
[Jonathan, Profesor]: Accediendo al SIAL...
-> Funciones permitidas: Subir calificaciones, Modificar datos del curso de Programacion Oriendatada a Objetos.


--- SIAL (Bedel) ---
Datos Personales: Pedro Ramirez Soto (1975)
Rol en la Universidad: Bedel
Año de Ingreso: 2022
Antiguedad: 3 años
Area Supervisada: Industrial 205
[Pedro, Bedel]: Accediendo al SIAL...
-> Funciones permitidas: Gestionar accesos al salon 'Industrial 205', Registrar inventario.
```

## Conceptos de POO Aplicados

### Herencia
- Todas las clases heredan de `Persona` directa o indirectamente
- `Profesor` y `Bedel` heredan de `Empleado`
- Permite reutilización de código y jerarquía lógica

### Polimorfismo
- Método `interactuarConSIAL()` sobrescrito en cada clase
- Método `imprime()` sobrescrito y extendido
- Cada clase tiene comportamiento específico según su rol

### Encapsulamiento
- Atributos `protected` para permitir acceso en subclases
- Métodos públicos para interacción externa
- Validación de datos en métodos setter

### Abstracción
- La clase `Persona` define la estructura base
- Clases especializadas implementan detalles específicos
- Separación entre interfaz y implementación

## Autor ✒️

* **Victor Cordoba** - *Creador y desarrollador principal* - [VoctorX](https://github.com/VoctorX)

## Fecha

* 27 de Noviembre del 2025, Programación Orientada a Objetos

## Licencia

Proyecto académico - Uso educativo
