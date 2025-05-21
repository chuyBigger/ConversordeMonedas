

---

> Proyecto con fines educativos. Uso libre con fines de aprendizaje.
> 
> 
>
# Conversor de Divisas 💱

Este proyecto forma parte del programa **Oracle Next Education (ONE) + Alura Latam** y está desarrollado en **Java**. Es un conversor de divisas que consume una API de tipo de cambio en tiempo real para realizar conversiones y manejar divisas dinámicamente.

## 🧾 Índice

- [ 🚧 Estado actual del proyecto ](#-estado-actual-del-proyecto)
- [📌 Descripción](#-descripción)
- [📁 Estructura del proyecto](#-estructura-del-proyecto)
- [🧠 Próximos pasos](#-próximos-pasos)
- [🚀 Cómo usarlo](#-cómo-usarlo)
- [❓ Ayuda](#-ayuda)
- [👨‍💻 Autores](#-autores)

---

## 🚧 Estado actual del proyecto

> El proyecto se encuentra en una fase **INTERMEDIA** de desarrollo. Ya están implementadas varias funcionalidades clave y el código está en evolución para convertirse en una aplicación escalable y bien estructurada.

### ✅ Funcionalidades implementadas

- [x] **Consumo de la API ExchangeRate-API** con `HttpClient` y manejo de respuestas con `Gson`.
- [x] **Conversión de divisas** seleccionadas dinámicamente.
- [x] **Registro de conversiones** guardado como archivo `.json` en la carpeta `\src\Reportes\RegistrosDeConversiones`.
- [x] **Visualización de divisas disponibles** desde la API, mostradas en consola como tabla de 10 elementos por fila.
- [x] **Menú para administrador** con opciones para:
    - Agregar nuevas divisas (eligiendo de las disponibles en la API).
    - Asignar un nombre personalizado a cada código.
    - Eliminar divisas agregadas.
    - Validación estricta para que solo se puedan agregar divisas válidas según la API.
    - Registro de cada modificación como evento `.json` con información del usuario que lo realizó.

### 🔧 En desarrollo

- [ ] Sistema de autenticación básica para el administrador.
- [ ] Interfaz gráfica (GUI) opcional.
- [ ] Test unitarios y mejoras en validación de datos.
- [ ] Mejora de manejo de errores (timeouts, errores de conexión, etc).


### 🛠 Tecnologías utilizadas


- Java 17
- Gson
- Java `HttpClient`
- API: [ExchangeRate-API](https://www.exchangerate-api.com/)
---
## 📁 Estructura del proyecto

```
src/
├── com.aluracursos.conversordm/
│   ├── api/
│   │   ├── ConbersorDivisas.java
│   │   └── MostrarTodasDivisas.java
│   ├── modelos/
│   │   ├── Administradores.java
│   │   ├── Divisas.java
│   │   ├── RegistroConversion.java
│   │   └── RegistroModificacion.java
│   ├── reportes/
│   │   ├── HistorialConversiones.java
│   │   └── ReporteModificaciones.java
│   └── sistema/
│       └── Principal.java
└── Reportes/
    ├── RegistrosDeConversiones/
    └── ModificacionesDelAdministrador/
```
---
## 🧠 Próximos pasos

- Consolidar un sistema de persistencia más robusto.
- Permitir carga/lectura de configuraciones y datos desde archivos al iniciar.
- Agregar herramientas para exportar reportes.

---
## 🚀 Cómo usarlo

1. **Clonar el repositorio:**
   ```bash
   git clone https://github.com/chuyBigger/ConversordeMonedas/tree/master
   ```

2. **Abrir el proyecto en tu IDE favorito (IntelliJ, Eclipse, VSCode, etc.).**

3. **Ejecutar la clase principal:**
    - Ve a `src/com/aluracursos/conversordm/` y ejecuta `el main de la clase "Principal"`.

4. **Elegir modo de uso:**
    - `1` para usuario estándar.
    - `2` para acceder como administrador.

---

## ❓ Ayuda

Si tienes dudas sobre el uso del programa o encuentras algún error:

- Revisa la carpeta `/reportes/` para entender cómo se registran las modificaciones.
- Asegúrate de tener conexión a internet (la API necesita acceso).
- Verifica que tu API key esté activa si decides personalizarla.

Puedes contactarme directamente para soporte.

---


## 👤 Autor

**Jesús Medina Casas**  
Estudiante del programa ONE | Apasionado por el desarrollo de software  
🔗 [LinkedIn](https://www.linkedin.com/in/jesus-medina-casas) 

---

