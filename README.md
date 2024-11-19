# Calculadora con Cobertura de Tests

Este proyecto implementa una calculadora en Java con validaciones específicas y pruebas unitarias. Además, utiliza **JaCoCo** para medir la cobertura de los tests.

## Funcionalidades

La calculadora permite realizar las siguientes operaciones básicas:

1. **Suma**
2. **Resta**
3. **Multiplicación**
4. **División**

### Restricciones

- **No se permiten números negativos.**
- **No se permiten números de más de 3 cifras.**
- **No se permite que los resultados tengan más de 3 cifras.**
- **No se permite dividir por cero.**

En caso de que alguna de estas restricciones no se cumpla, la calculadora lanza una excepción de tipo `IllegalArgumentException`.

---

## Estructura del Proyecto

El proyecto está estructurado como un proyecto **Maven** con la siguiente jerarquía:

```plaintext
calculadora/
├── src/
│   ├── main/
│   │   └── java/com/qualentum/calculadora/Calculadora.java
│   └── test/
│       └── java/com/qualentum/calculadora/CalculadoraTest.java
├── pom.xml
└── target/
    └── site/jacoco/index.html
```

## Instalación y Ejecución

### Requisitos Previos

- **Java 8 o superior.** (Recomendado Java 11 o 17)
- **Maven 3.6.3 o superior.**

### Instrucciones

1. **Clonar el repositorio:**

   ```bash
   git clone https://github.com/MarioArocaPaez/calculadora.git
   cd calculadora
   ```

2. **Compilar e instalar las dependencias:**

   Ejecuta el siguiente comando en la raíz del proyecto para compilarlo y ejecutar los tests:

   ```bash
   mvn clean install
   ```

3. **Visualizar los resultados de cobertura:**

   - Después de ejecutar los tests, se genera un reporte de cobertura con **JaCoCo**.
   - Abre el archivo HTML en tu navegador para ver los resultados:

     ```
     target/site/jacoco/index.html
     ```

---

## Tests

El proyecto incluye tests unitarios en la clase `CalculadoraTest` para cubrir los casos válidos e inválidos de todas las operaciones. Estos tests aseguran que se cumplan las restricciones especificadas.

### Ejecución de Tests

Para ejecutar los tests:

```bash
mvn test
```

---

## Generación del Reporte de Cobertura

El reporte de cobertura se genera automáticamente al ejecutar:

```bash
mvn install
```

Si deseas generar el reporte manualmente, utiliza:

```bash
mvn jacoco:report
```

El reporte estará disponible en:

```
target/site/jacoco/index.html
```

---

## Notas Técnicas

- El proyecto está configurado para un **80% mínimo de cobertura de código.**
- Se utiliza el plugin **JaCoCo** para instrumentar el código y generar reportes de cobertura.

---


¡Disfruta utilizando esta calculadora y explorando el reporte de cobertura! 😊
