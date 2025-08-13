# 🎯 Proyecto: Gestor de Deseos

Este proyecto es una **aplicación de escritorio en Java con Swing** que permite registrar y gestionar una lista de deseos, guardando la información en una base de datos mediante un patrón **DAO (Data Access Object)**.

## 🛠 Tecnologías utilizadas

* **Java SE** (versión 8 o superior)
* **Swing** (Interfaz gráfica)
* **NetBeans IDE** (para el diseño y desarrollo)
* **JDBC** (Conexión con base de datos)
* **Patrón DAO** para separación de lógica de negocio y acceso a datos

## 📌 Funcionalidades principales

* **Formulario de registro** con campos para:

  * Nombre del deseo
  * Precio estimado
  * Cantidad
* **Validaciones** para evitar registros vacíos o con formatos incorrectos
* **Botones de acción**:

  * **Guardar**: Inserta el deseo en la base de datos
  * **Atrás**: Cierra la ventana actual y vuelve a la anterior (opcional)
* **Mensajes emergentes (JOptionPane)** para confirmar operaciones o mostrar errores

## 📂 Estructura del proyecto

```
src/
 ├── GUI/
 │   └── FrmDeseosNew.java      # Interfaz gráfica y control de eventos
 ├── Dao/
 │   └── DeseosDao.java         # Acceso a base de datos
 ├── model/
 │   └── Deseos.java            # Clase de modelo de datos
```

## 🚀 Cómo ejecutar

1. Clona este repositorio:

   ```bash
   git clone https://github.com/usuario/gestor-deseos.git
   ```
2. Abre el proyecto en **NetBeans**.
3. Configura la conexión a tu base de datos en `DeseosDao.java`.
4. Ejecuta el proyecto y abre la ventana `FrmDeseosNew`.

## 💡 Notas para programadores principiantes

* El código utiliza **eventos de botones** (`ActionListener`) para capturar acciones del usuario.
* NetBeans genera automáticamente el código de la interfaz. **No modifiques directamente el bloque de `initComponents()`**, usa el diseñador de NetBeans para cambios visuales.
* Si un método como `nombre2ActionPerformed` aparece duplicado, debes eliminar el repetido para que el proyecto compile correctamente.
* El patrón **DAO** ayuda a mantener el código ordenado y fácil de mantener.


Si quieres, puedo prepararte este README **con ejemplos de código e imágenes** para que se vea más profesional y atractivo para tu portafolio.
¿Quieres que lo haga así?
