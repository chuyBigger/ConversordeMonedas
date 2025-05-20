
# 💱 Conversor de Monedas 5.3

## 🧾 Índice

- [📌 Descripción](#-descripción)
- [✨ Funcionalidades](#-funcionalidades)
- [🚀 Cómo usarlo](#-cómo-usarlo)
- [❓ Ayuda](#-ayuda)
- [👨‍💻 Autores](#-autores)

---

## 📌 Descripción

**Conversor de Monedas 5.3** es una aplicación desarrollada en Java que permite realizar conversiones de divisas en tiempo real utilizando una API externa. Además, cuenta con un **panel de administrador** para personalizar las divisas disponibles, agregar nombres personalizados a los códigos y registrar los cambios realizados por los administradores en reportes JSON.

El proyecto fue desarrollado como parte del programa **ONE - Oracle Next Education**.

---

## ✨ Funcionalidades

### 👤 Usuario Estándar
- Convertir montos entre diferentes divisas.
- Usar las divisas activas configuradas por el administrador.

### 🔐 Administrador
- Acceso restringido por usuario y contraseña.
- Agregar nuevas divisas desde la API con nombre personalizado.
- Eliminar divisas registradas.
- Ver lista de divisas disponibles.
- Reporte automático de cambios en formato JSON con fecha, acción y usuario.

---

## 🚀 Cómo usarlo

1. **Clonar el repositorio:**
   ```bash
   git clone https://github.com/tu-usuario/conversor-monedas.git
   ```

2. **Abrir el proyecto en tu IDE favorito (IntelliJ, Eclipse, VSCode, etc.).**

3. **Ejecutar la clase principal:**
   - Ve a `com.aluracursos.conversordm.App` o `Iniciar.java` y ejecuta `iniciaSistema()`.

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

## 👨‍💻 Autores

- **Jesús Medina Casas**  
  Desarrollador en formación, participante del programa ONE - Oracle Next Education.  
  Aguascalientes, México  
  Email: *(opcional)*

---

> Proyecto con fines educativos. Uso libre con fines de aprendizaje.
