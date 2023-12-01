# Mini Proyecto 3
## Juan Miguel Palacios Doncel - 202359321, Juan Carlos Rojas Quintero - 202359358
Aplicación que permite el registro de votos de candidatos politicos aplicando el MVC en Java

Similar a MVC, MVP es un patrón arquitectónico que divide una aplicación en tres componentes: Modelo (datos y lógica de negocio), Vista (interfaz de usuario y presentación) y Presentador (mediador que maneja la comunicación entre el Modelo y la Vista). Este patrón se utiliza a menudo en aplicaciones basadas en interfaz gráfica de usuario (GUI).

PROS:

Simplicidad: MVC es un patrón relativamente simple y fácil de entender, lo que facilita su implementación y mantenimiento.

Flexibilidad: Permite una separación clara entre la lógica de presentación y la lógica de negocio, lo que facilita los cambios en la interfaz de usuario sin afectar la lógica subyacente.

Reusabilidad: La separación de responsabilidades facilita la reutilización de componentes, ya que el Modelo y el Controlador pueden utilizarse en diferentes contextos.

CONTRAS:

Dificultad en pruebas unitarias: La conexión directa entre la Vista y el Controlador puede dificultar las pruebas unitarias, ya que es complicado aislar la lógica de la interfaz de usuario.

Sincronización manual: En algunos casos, puede requerir sincronización manual entre la Vista y el Modelo para garantizar una presentación coherente de los datos.
