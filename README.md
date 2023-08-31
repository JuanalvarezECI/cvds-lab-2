# Laboratorio 2 - Patterns
## OBJETIVOS
1. Entender qué es Maven
2. Usar comandos de generación de arquetipos, compilación y ejecución de un proyecto usando Maven
3. Obtener puntos adicionales por PR qué corrijan o mejoren los laboratorios
### HACER EL ESQUELETO DE LA APLICACIÓN
Refactorización planteada según el patrón de diseño **Simple Factory** haciendo uso de **switch-case** de Java y usando las enumeraciones (Clase). 

Consideramos que el mejor metodo es **Factory method** ya que el diseño permite que cada vez que se agregue una nueva figura en el proyecto no se tenga que agregar al switch de **shapesFactory** el caso de la nueva figura, sino simplemente que esta sea una clase abstracta que retorne las instancias de las figuras al cliente. La creacion de las figuras ya no dependera de un switch.

- Sin parámetros
- Parámetro: qwerty
- Parámetro: pentagon
- Parámetro: Hexagon

¿Cuál(es) de las anteriores instrucciones se ejecutan y funcionan correctamente y por qué?

Solo funciona Hexagon ya que es la unica que coincide con el nombre de la clase y sin parametros ya que se ejecuta pero el main necesita un argumento para operar.

