### Este es un proyecto que busca recrear como una empresa maneja un inventario de productos, de una tienda de ropa que tiene:

-Proveedores
-productos 
-Clientes
-Entrada y salida de productos
-Una base de datos

## Notas para mejorar la App:

1
 si se activa la ordenanza que este sea un comboBox, para elegir el tipo y que no varie (Ejem: por tipo de ropa, o por marcas)
 sino, será la otra (producto)
 Esto sera posible a traves de dos paneles que usen su respectiva clase (una de producto y otra de ordenaproducto)

2
Esta tambien que toca añadir un campo de venta y este, tendra para sus eventos un procedimiento almacenado especial, que tomara la cantidad vendida de ese producto y lo restara a la tabla de productos_generales

3
Para el inicio y crear un menu (para las listas de inventario de solo vista) puedes crear un tabbedPane (que las ventanas se escondan con un label con su opaque en false) y de los botones, solo cambiaria a su respectivo tabbedPane (pestaña). Evitamos crear locuras 

Nota: tal vez quitarle lo enabled a las pestañas evitaria que el usuario pueda cambiar las pestañas y crea que es un bug. Toca probarlo

4
Para cuando creemos una lista completa que no se modifique, lo que podemos hacer, es que, debamos hacer una clase global, que reciba y mande constantemente. Para esto, usamos una clase que extienda de Thread, y hacer clases (en un package dao) genericas, y de alli, mandarlos con los thread a su respectiva lista. 

Tambien, que para esto, se debe lo que es, es que los parametros de los genericos reciban un arrayList de cualquier cosa. 

El detalle para que no este fastidiando y capaz alentando procesos, es que, esos JPanels que reciban datos con la clase thread, tengan un boolean que le indique al thread si esta o no activo ese panel. Si lo esta, que se detenga, y que si no, que continue cada 3 segundos

5
Falta crear atajos de teclado

Esto es para permitir la versatilidad y que si desea buscar un nombre solo tenga que especificarlo en el comboBox

O tal vez, solo se hagan unos radioButtons, y que cuando escriba, verifique el que se haya seleccionado, a partir de eso, usara el metodo correspondiente

6
Toca añadir tres spinners en las fechas y que estas mismas siempre tengan la fecha de actual en la que se abra el programa. Ya lo haz hecho, solo es cuestion de darle su respectivo valor a cada spinner

7
Hay que añadir el precio por unidad de cada producto. Esto tanto para las entradas como para las salidas

8
Con SWING AVANZADO se pueden hacer animaciones y todo. Lo mejor es ver alguno de esos para mejorar en la parte del diseño de la APP

9
para poder cambiar entre pestañas de tabbedPane, debemos poner:

nombreDelTabbedPane.setSelectedIndex(0) o nombreDelTabbedPane.setSelectedIndex(1) y asi dependiendo del numero de paneles que tenga el tabbedPane

10
Para mostrar todos los detalles de los proveedores, solo haz algo simple, que ha cada seleccion, busque la cedula en la base de datos, y que al encontrarlo (esto solo es con un arrayList lleno de los proveedores), te entregue cada detalle. Claro, esto es actualizado a cada click que de en la tabla

Y para que se mantenga actualizada, haz lo mismo con que el panel actualice la tabla

11
Para el modo oscuro de la app, lo que haremos es crear la opcion y que esta misma se lea cada inicio de la app (tal vez sea necesario crear un menu de carga), y que lo que lea, sea una unica linea que contenga "light" or "nocturne/black", con esto, una vez lo lea (a traves de un thread), pasara ciertos parametros (con un metodo global que recibe y manda absolutamente a todos los paneles los colores y claro, esto requiere de muchos set y get modificados)

12
Para que realmente cambie a modo oscuro es simple, toma el booleano de panelInicial, y dependiendo de si es Dark o Light pones un true o false. Y ya en el constructor de todos los paneles haces la comprobación y ya. Ya cuando vuelva a cambiarse de dark a light, solo es hacer que la persona reinicie la aplicación y ya todo como nuevo

13
Cuando hagas la ventana para visualizar la tabla cargada desde un archivo de excel, puedes dar 2 opciones. Importar, o salir de la vista. Si elige salir, pues se corta toda la tabla y se vuelve todo por defecto. Si la persona, le da a importar, pues tendra que elegir otras 2 opciones: sobreescribir los registros anteriores (se eliminaran todos los que haya en la base de datos y se crearan los que se tengan en la tabla), o añadir los datos que NO existen en la base de datos, sin eliminar los registros anteriores. Claro, esto hará que ejecute dos algoritmos distintos.

14
El problema de cerrar sin apagar el sistema se resuelve con WindowClosing (WindowAdapter/WindowListener), solo pon el evento y le das que mientras se cierra haga System.exit(0)

15
El problema del diseño se arregla mejor intercalando entre paneles que mantendran organizados los botones independientemente de como se redimensione la ventana. GridBagLayout, FlowLayout, y borderLayout serán los mas utiles

PD: Si sacas los componentes del panel, cuando quieras agregarlos de nuevo, ve a navegator, busca el componente y arrastralo hacia el contenedor de dicho componente

16
En el login que haga, estaria bien que que un arhivo especial se dedique a guardar los nombres y contraseñas de cada sesión. Esto de solo una, mejor dicho. Es sencillo, ese jframe leera al inicio el archivo, si encuentra algo, leera. Buscará el nombre en la base de datos y, si coincide con algun registro, mostrará una ventana pequeña emergente, que notificara de si quiere continuar la sesión iniciada. Obvio tendra que poner la contraseña y con eso listo, tendrá acceso. Lo importante es que cada sesión guarde el nombre y la contraseña. Hasta se puede evitar lo de la contraseña, y que si lo desea, solo la inicie (esto lo que hace, es que se llenara el textField nombre con el de la sesion anterior, y lo mismo con la contraseña para su textField respectivo, lo demas es que se iniciara un pequeño panel traslucido con una animacion de carga, para que luego se cierre y pueda continuar)

17
Hacer un thread que verifique la conexion en panelInicial todo el tiempo, tan solo para verificar si hay o no. Cada que verifique la abre y cierra. 
Esto es para que, si tira un catch, imprima la cola, y no solo eso, mande un mensaje de "conexión no establecida" en una parte del panel inicial
Asi tal vez comenzamos dejando en claro cuando no hay conexion y esta todo sujeto a errores

18
Hay que hacer una versión local del funcionamiento de la base de datos. Esto es solo con serializacion, arraylist, el organizado manual, y bastante testeo

19
Se puede hacer un registro rapido de productos. Simple: lo mismo de antes, pero ante tiene la opcion de agregar a cola
Esto significa, que todos los campos se reinician, y añaden los datos anteriores a la tabla, asi con todos los demas hasta que se canse la persona.
Y, al darle a subir, que con un bucle por, se recorra toda la tabla, buscando el dato, file por fila, columna por columna (i hara de flecha para saber la fila)
De esta forma, hacemos varias inserciones rapido

20
Se puede agregar una vista, donde se muestre los ultimos inicios de sesión en el panel inicial. Hay que buscar que esa tabla, cambie su modelo, para que no se note que es una tabla. Mucha modificación


# Ponte a organizar y mejorar de una la interfaz, ya no soporto como se ve. De paso, de una comienza a hacer bosquejos. Si lo necesitas, busca los java design ui modern para poder inspirarte y ayudarte a mejorar como se ve todo. Las ideas las tienes, pero el diseño no