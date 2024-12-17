# Apuntes de Llistes - M3 Programació

## Índex
1. [Llistes: Definició](#llistes-definició)
2. [Llistes Immutables](#llistes-immutables)
3. [Llistes Mutables](#llistes-mutables)
4. [Nul·labilitat en Llistes](#nul-labilitat-en-llistes)
5. [Iterar Llistes](#iterar-llistes)
6. [Llistes Multidimensionals](#llistes-multidimensionals)

---

## Llistes: Definició
- Una **llista** és una col·lecció ordenada de valors.
- **Índex**: accés als elements mitjançant posicions.
- Pot contenir **valors repetits**.
- Tipus:
  - **Mutables**: es poden editar.
  - **Immutables**: no es poden editar.

---

## Llistes Immutables
### Declaració:
```kotlin
val immutableList: List<String> = listOf("red", "blue", "green", "black")
```

### Funcions Principals:
- `size`: Retorna la mida de la llista.
- `get(pos)`: Accedeix a un element per posició.
- `first()`: Retorna el primer element.
- `last()`: Retorna l’últim element.

### Exemple:
```kotlin
val readOnly: List<String> = listOf("Dilluns", "Dimarts", "Dimecres")
println(readOnly.size)      // 3
println(readOnly.get(1))    // Dimarts
println(readOnly.first())   // Dilluns
println(readOnly.last())    // Dimecres
```

---

## Llistes Mutables
### Declaració:
```kotlin
val mutableList: MutableList<String> = mutableListOf("red", "blue", "green")
```

### Funcions Principals:
- `add(element)`: Afegeix un element al final.
- `add(index, element)`: Afegeix en una posició específica.
- `clear()`: Elimina tots els elements.
- `remove(element)`: Elimina un element específic.
- `removeAt(pos)`: Elimina l’element a una posició.
- `set(pos, element)`: Reemplaça un element.

### Exemple:
```kotlin
mutableList.add("yellow")
mutableList.add(1, "orange")
println(mutableList) // [red, orange, blue, green, yellow]
```

---

## Nul·labilitat en Llistes
Funcions per evitar errors amb **null**:
- `none()`: Retorna `true` si està buida.
- `firstOrNull()`: Retorna el primer element o `null`.
- `elementAtOrNull(pos)`: Retorna l’element a `pos` o `null`.
- `lastOrNull()`: Retorna l’últim element o `null`.

---

## Iterar Llistes
### Amb índex:
```kotlin
for (i in exampleList.indices) {
    println(exampleList[i])
}
```

### Amb valors:
```kotlin
for (valor in exampleList) {
    println(valor)
}
```

---

## Llistes Multidimensionals
### Declaració:
```kotlin
val colours: MutableList<MutableList<String>> = mutableListOf(
    mutableListOf("red", "blue", "green"),
    mutableListOf("white", "black", "grey"),
    mutableListOf("violet", "orange", "brown")
)
```

### Accés als elements:
```kotlin
println(colours[0])       // [red, blue, green]
println(colours[2][1])    // orange
println(colours[1][2])    // grey
```

---

## Notes
- Les **llistes immutables** són més eficients, però menys flexibles.
- Les **llistes mutables** permeten afegir i eliminar elements després de ser declarades.
- Gestiona els **null** amb funcions segures com `firstOrNull`.