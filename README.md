# Tarea: Patrón Observer con AspectJ

## Requerimientos:
## 1. Descripción de la aplicación 
La interfaz gráfica contiene una ventana con tres botones:

- Cyan
- Rosado
- Amarillo

Cada botón cambia el color de fondo de la ventana principal. Además, imprime en la consola el nuevo color seleccionado.

## 2. Uso de AspectJ

Se utilizó AspectJ para implementar la lógica de observación y registro de los cambios de color. En lugar de escribir esta lógica directamente en la clase principal, se separó en un aspecto (`ColorChangeAspect.aj`) que se encarga de:

- Detectar los cambios de color realizados en `ColorChangeNotifier`.
- Imprimir el nuevo color por consola.

## 3. Funcionalidad adicional implementada con AspectJ

Se implementó una funcionalidad adicional que consiste en mostrar una ventana emergente después de realizar cinco cambios de color, notificando al usuario que ha alcanzado dicho número. Para ello, se incorporó un contador que lleva el registro de los primeros cinco cambios, y se añadió una condición que verifica si el contador ha llegado a 5, momento en el cual se activa la notificación.

