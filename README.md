# Ejercicio sobre POO en JAVA (curso de Aula-Oracle-2025)

## 📌 Descripción

Este repositorio contiene un proyecto desarrollado en **Java** que implementa conceptos de **Programación Orientada a Objetos (POO)**. Se centra en la gestión de **películas y series**, incluyendo clasificación, cálculo de duración y recomendaciones.

## 🚀 Instalación y Ejecución

### **1. Clonar el repositorio**

```sh
git clone https://github.com/jmikhaelz/Ej-java-POO.git
cd Ej-java-POO
```

### **2. Configurar el entorno**

El proyecto requiere **Java 17** y **VS Code 1.99.3**. Si no tienes las versiones adecuadas, puedes instalarlas con:

```sh
sudo apt update
sudo apt install openjdk-17-jdk
```

Para verificar la instalación:

```sh
javac -version
java -version
```

### **3. Compilar el código fuente**

```sh
javac -d bin -sourcepath src src/Principal.java
```

### **4. Ejecutar la aplicación**

```sh
java -cp bin Principal
```

## 📂 Estructura del Proyecto

```
Ej-java-POO/
│── src/                           # Código fuente
│   ├── com/alura/screenmatch/     # Paquete raíz
│   │   ├── herramientas/          # Manejo de Terminal
│   │   │   ├── LimpiarConsola.java
│   │   ├── calculos/              # Lógica de cálculos
│   │   │   ├── CalculadoraDeTiempo.java
│   │   │   ├── Clasificable.java
│   │   │   ├── FiltroRecomendacion.java
│   │   ├── modelos/               # Clases de modelos
│   │   │   ├── Episodio.java
│   │   │   ├── Pelicula.java
│   │   │   ├── Serie.java
│   │   │   ├── Titulo.java
│   ├── Principal.java             # Clase principal
├── README.md                      # Documentación
└── .gitignore                      # Archivos a ignorar en Git
```

## ✅ Funcionalidades del Proyecto

- **Gestión de títulos (películas y series):** Se pueden crear, evaluar y calcular duración.
- **Cálculo de tiempo total:** La clase `CalculadoraDeTiempo` permite sumar el tiempo de reproducción.
- **Filtros de recomendación:** `FiltroRecomendacion` sugiere contenido basado en visualizaciones y evaluaciones.

## 🛠️ Entorno de Desarrollo

- **Lenguaje:** Java 17 (OpenJDK 17.0.14)
- **IDE:** Visual Studio Code 1.99.3
- **Paradigma:** Programación Orientada a Objetos
- **Gestión de código:** Git y GitHub
