
# Apuntes de Data Classes - M3 Programació

## Índex
1. [Definició de Data Class](#definició-de-data-class)
2. [Declaració de Data Class](#declaració-de-data-class)
3. [Ús de les Data Classes](#ús-de-les-data-classes)
4. [Tasques Comunes Implementades](#tasques-comunes-implementades)
5. [Còpies i Limitacions](#còpies-i-limitacions)
6. [Altres Funcions de les Data Class](#altres-funcions-de-les-data-class)

---

## Definició de Data Class
- Una **data class** defineix un nou tipus de dades per contenir **informació en atributs**.
- Permet gestionar **dades heterogènies** (diferents tipus), a diferència dels arrays o llistes que són homogènies.
- Equivalent a **struct** en C o **registres** en altres llenguatges.

---

## Declaració de Data Class
### Exemple de definició:
```kotlin
data class Persona(var nom: String, var cognoms: String, var edat: Int)
```

### Creació d'instàncies:
```kotlin
var persona1: Persona = Persona("David", "VanAert", 25)
println(persona1.nom)  // Accedir a l'atribut
```

### Llistes de Data Class:
```kotlin
var llistaPersones: MutableList<Persona> = mutableListOf()
```

---

## Ús de les Data Classes
- Els atributs d'una data class es tracten com **variables** normals:
```kotlin
var alumne: Persona = Persona("Joan", "Puig", 19)
alumne.edat = 20
println("L’edat de l’alumne és ${alumne.edat}")
```

- Comparació directa d'objectes:
```kotlin
var alumne1: Persona = Persona("Joan", "Puig", 19)
var alumne2: Persona = Persona("Joan", "Puig", 19)
if (alumne1 == alumne2) {
    println("Són iguals")  // cert
}
```

---

## Tasques Comunes Implementades
### Còpies:
- **copy()** permet crear una còpia d’un objecte, opcionalment modificant algun atribut:
```kotlin
var alumne1: Persona = Persona("Joan", "Puig", 19)
var alumne2: Persona = alumne1.copy(cognoms = "Pons i Bofill")
println(alumne2)  // Persona(nom=Joan, cognoms=Pons i Bofill, edat=19)
```

---

## Còpies i Limitacions
- **Atributs fora del constructor primari** NO es copien:
```kotlin
data class Persona(var nom: String, var cognoms: String, var edat: Int) {
    var notaFinal: Int = 0
}

var alumne1: Persona = Persona("Joan", "Puig", 19)
alumne1.notaFinal = 8
var alumne2: Persona = alumne1.copy()

if (alumne2.notaFinal == 8) {
    println("Sorpresa!")  // FALSE!
}
```

---

## Altres Funcions de les Data Class
- `equals()`: Compara el contingut de l'objecte.
- `toString()`: Genera una representació en text:
  ```kotlin
  println(alumne1)  // Persona(nom=Joan, cognoms=Puig, edat=19)
  ```
- `componentN()`: Accedeix als atributs per ordre:
  ```kotlin
  println(alumne1.component1())  // Joan
  ```

---

## Notes
- Les **data classes** simplifiquen moltes tasques habituals.
- Útils per gestionar dades estructurades de manera senzilla.
- Vigila els atributs fora del constructor primari quan utilitzis **copy()**.
