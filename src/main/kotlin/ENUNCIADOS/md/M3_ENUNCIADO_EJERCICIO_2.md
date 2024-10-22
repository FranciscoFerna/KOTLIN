# Desafío Mágico: La Prueba del Conocedor en Programalandia

En el mágico reino de **Programalandia**, todos los aspirantes a magos deben superar la legendaria **Prueba del Conocedor** para demostrar su sabiduría y habilidades mágicas. Esta prueba consiste en una serie de cinco desafiantes retos que pondrán a prueba sus conocimientos en matemáticas, lógica y programación. Solo aquellos que completen todos los desafíos con éxito recibirán el codiciado título de "Gran Conocedor". ¡Prepara tu varita y afina tu mente!

## Desafíos

### 1. **Los Divisores Mágicos**
Un anciano sabio ha encantado un número `n`, y los participantes deben descubrir todos los números mágicos que son divisores de `n`. Un número `d` es considerado divisor de `n` si la división `n / d` no deja residuo.

#### **Entrada**
- La primera línea contiene un número entero `t` que indica la cantidad de números mágicos a analizar.
- Las siguientes `t` líneas contienen un número entero positivo `n`.

#### **Salida**
- Para cada número `n`, imprime en una línea la lista de sus divisores, separados por un espacio.

---

### 2. **Estadísticas de Sabiduría**
Durante la prueba, los aspirantes deben recopilar y analizar las notas obtenidas en sus estudios mágicos. Se les proporcionará una secuencia de notas numéricas y deberán calcular estadísticas sobre ellas.

#### **Entrada**
- Una secuencia de números enteros entre `0` y `10`, donde la entrada termina con `-1`. Este último número no se debe procesar.

#### **Salida**
- Presenta un resumen con el siguiente formato:
  NOTES: xxx MITJANA: xxx E: xxx N: xxx B: xxx S: xxx I: xxx MD: xxx


Donde:
- `xxx` representa la cantidad total de notas (`NOTES`), la media de las notas (`MITJANA`), y el conteo de notas en cada categoría (Excelente `E`, Notable `N`, Bien `B`, Suficiente `S`, Insuficiente `I`, y Muy Deficiente `MD`).

---

### 3. **Construcción de la Pirámide de Bombones**
El renombrado maestro confitero ha solicitado la creación de una impresionante pirámide de bombones para celebrar la victoria de los magos. Cada nivel de la pirámide contiene un número específico de bombones, que corresponde al cuadrado del número de su nivel.

#### **Entrada**
- La primera línea contiene un número entero `m`, que indica el número de casos de prueba.
- Cada una de las siguientes `m` líneas contiene un número entero que representa la cantidad de pisos que debe tener la pirámide.

#### **Salida**
- Para cada caso de prueba, imprime el número total de bombones necesarios para construir la pirámide.

---

### 4. **Control de Nombres Mágicos**
Antes de que un aspirante sea reconocido como mago, debe elegir un nombre único. Un nombre es considerado válido si no está compuesto únicamente por la misma letra repetida.

#### **Entrada**
- Cada línea contiene un nombre (una palabra).

#### **Salida**
- Devuelve "SI" si el nombre es válido y "NO" si no lo es.

---

### 5. **Explosión Arcana**
El hechizo **Explosión Arcana** es uno de los más poderosos en Programalandia, pero su poder aumenta exponencialmente con cada uso. Los participantes deben calcular cuántas veces deben lanzar el hechizo para derrotar a un enemigo, considerando el daño inicial del hechizo y la vida total del enemigo.

#### **Entrada**
- Cada caso contiene dos números enteros: `Ini`, que representa el daño inicial del hechizo, y `HP`, que indica la vida del enemigo.

#### **Salida**
- Indica cuántas explosiones arcanas son necesarias para reducir la vida del enemigo a 0.

---

## Objetivo
Utiliza tus habilidades de programación para resolver cada uno de estos desafiantes retos. ¡Demuestra que tienes lo necesario para convertirte en el "Gran Conocedor" de Programalandia! Que la magia de la programación te acompañe en esta prueba.