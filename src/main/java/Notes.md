### Este es un proyecto que busca recrear como una empresa maneja un inventario de productos, de una tienda de ropa que tiene:

-Proveedores
-productos 
-Clientes
-Entrada y salida de productos
-Empleados
-Una base de datos


## Notas para mejorar la App:



5.0
Esta tambien que toca añadir un campo de venta y este, tendra para sus eventos un procedimiento almacenado especial, que tomara la cantidad vendida de ese product y lo restara a la tabla de productos_generales

6.0
Toca crear 1 procedimiento almacenado para poder actualizar las entradas y, que si se actualiza cualquiera de los campos del product, pues que se inserten esos datos (actualice(Update)) y asi pueda ser mas libertario en ese punto

8.0
Para el inicio y crear un menu (para las listas de inventario de solo vista) puedes crear un tabbedPane (que las ventanas se escondan con un label con su opaque en false) y de los botones, solo cambiaria a su respectivo tabbedPane (pestaña). Evitamos crear locuras 

Nota: tal vez quitarle lo enabled a las pestañas evitaria que el usuario pueda cambiar las pestañas y crea que es un bug. Toca probarlo

8.5
Para cuando creemos una lista completa que no se modifique, lo que podemos hacer, es que, debamos hacer una clase global, que reciba y mande constantemente. Para esto, usamos una clase que extienda de Thread, y hacer clases (en un package dao) genericas, y de alli, mandarlos con los thread a su respectiva lista. 

Tambien, que para esto, se debe lo que es, es que los parametros de los genericos reciban un arrayList de cualquier cosa. 

El detalle para que no este fastidiando y capaz alentando procesos, es que, esos JPanels que reciban datos con la clase thread, tengan un boolean que le indique al thread si esta o no activo ese panel. Si lo esta, que se detenga, y que si no, que continue cada 3 segundos

9.0
Falta crear atajos de teclado

10
Para las busquedas, las que tengan un filtro, lo mejor sera que se verifique primero el filtro seleccionado y tras esto, decidirá que cosas mostrar. Es simple con un select * from productos_generales where id/descripcion/marca/seccion like '%"+loquepongamos+"'"

Esto es para permitir la versatilidad y que si desea buscar un nombre solo tenga que especificarlo en el comboBox

O tal vez, solo se hagan unos radioButtons, y que cuando escriba, verifique el que se haya seleccionado, a partir de eso, usara el metodo correspondiente

11
Toca añadir tres spinners en las fechas y que estas mismas siempre tengan la fecha de actual en la que se abra el programa. Ya lo haz hecho, solo es cuestion de darle su respectivo valor a cada spinner

12
Hay que añadir el precio por unidad de cada product. Esto tanto para las entradas como para las salidas

13
Con SWING AVANZADO se pueden hacer animaciones y todo. Lo mejor es ver alguno de esos para mejorar en la parte del diseño de la APP

14
para poder cambiar entre pestañas de tabbedPane, debemos poner:

nombreDelTabbedPane.setSelectedIndex(0) o nombreDelTabbedPane.setSelectedIndex(1) y asi dependiendo del numero de paneles que tenga el tabbedPane

15
Para mostrar todos los detalles de los proveedores, solo haz algo simple, que ha cada seleccion, busque la cedula en la base de datos, y que al encontrarlo (esto solo es con un arrayList lleno de los proveedores), te entregue cada detalle. Claro, esto es actualizado a cada click que de en la tabla

Y para que se mantenga actualizada, haz lo mismo con que el panel actualice la tabla

16
Para el modo oscuro de la app, lo que haremos es crear la opcion y que esta misma se lea cada inicio de la app (tal vez sea necesario crear un menu de carga), y que lo que lea, sea una unica linea que contenga "light" or "nocturne/black", con esto, una vez lo lea (a traves de un thread), pasara ciertos parametros (con un metodo global que recibe y manda absolutamente a todos los paneles los colores y claro, esto requiere de muchos set y get modificados)

17
Para que realmente cambie a modo oscuro es simple, toma el booleano de panelInicial, y dependiendo de si es Dark o Light pones un true o false. Y ya en el constructor de todos los paneles haces la comprobación y ya. Ya cuando vuelva a cambiarse de dark a light, solo es hacer que la persona reinicie la aplicación y ya todo como nuevo

18
Cuando hagas la ventana para visualizar la tabla cargada desde un archivo de excel, puedes dar 2 opciones. Importar, o salir de la vista. Si elige salir, pues se corta toda la tabla y se vuelve todo por defecto. Si la persona, le da a importar, pues tendra que elegir otras 2 opciones: sobreescribir los registros anteriores (se eliminaran todos los que haya en la base de datos y se crearan los que se tengan en la tabla), o añadir los datos que NO existen en la base de datos, sin eliminar los registros anteriores. Claro, esto hará que ejecute dos algoritmos distintos.

19
El problema de cerrar sin apagar el sistema se resuelve con WindowClosing (WindowAdapter/WindowListener), solo pon el evento y le das que mientras se cierra haga System.exit(0)

20
El problema del diseño se arregla mejor intercalando entre paneles que mantendran organizados los botones independientemente de como se redimensione la ventana. GridBagLayout, FlowLayout, y borderLayout serán los mas utiles

PD: Si sacas los componentes del panel, cuando quieras agregarlos de nuevo, ve a navegator, busca el componente y arrastralo hacia el contenedor de dicho componente

21
En el login que haga, estaria bien que que un arhivo especial se dedique a guardar los nombres y contraseñas de cada sesión. 
Esto de solo una, mejor dicho. Es sencillo, ese jframe leera al inicio el archivo, si encuentra algo, leera. 
Buscará el nombre en la base de datos y, si coincide con algun registro, 
mostrará una ventana pequeña emergente, que notificara de si quiere continuar la sesión iniciada. 
Obvio tendra que poner la contraseña y con eso listo, tendrá acceso. 
Lo importante es que cada sesión guarde el nombre y la contraseña. 
Hasta se puede evitar lo de la contraseña, y que si lo desea, 
solo la inicie (esto lo que hace, es que se llenara el textField nombre con el de la sesion anterior, y lo mismo 
con la contraseña para su textField respectivo, lo demas es que se iniciara un pequeño panel
traslucido con una animacion de carga, para que luego se cierre y pueda continuar)

22
Para que la imagen de carga mientras se hace el proceso de sobreescrito de la tabla de registros, funcione bien, usaremos es un metodo 
que retorne un boolean y que haya un pequeño thread que mientras se realiza la animacion verifique si es true o false. 
Si es false, dará error, si da true la imagen se tornara en un check "Archivo carga"

23
Para la carga constante del panel inicial, usaremos varios threads, ya que de todas formas el usuario solo vera esos datos, no haran nada mas

24
Para que en la cantidad de salidas y entradas (tambien la de ventas) siempre se vuelva a cero, haremos un metodo (en el mismo thread) que
verificara que dia es. En el archivo de config guardaremos la fecha que se registro anteriormente. Tras esto, se validara si es el mismo dia
contando tanto el mes como el dia. Si detecta que es el mismo, no creara un registro nuevo, sino que continuará actualizando el mismo. Por el
contrario, si no es el mismo dia que la ves pasara, creara otro nuevo registro, con la fecha de ese dia, y la cantidad en 0 (eso hasta que
en la otra app de ventas se comiencen a hacer ventas a clientes)

25
Para rellenar un poco, se puede crear una tabla de pedidos en DB y añadir en el inicio los estados de cada pedido y quienes lo pidieron
Asi es mas sencillo y dinamico

26
Para el cambio de idiomas, solo es cuestion de agarrar un metodo que tome el idioma seleccionado, y mande a todas los paneles, labels, botones
y hasta los titulos un string nuevo. Esto sera mas sencillo si se hace un metodo controllerSelectLanguage, en el constructor tomar completara la
instancia de cada clase panel, hasta la de window. Y de esta forma, junto con muchos string, mandaremos el cambio

Otra opcion es tener un metodo de cambio con todos los strings listos y, ese metodo, sea el unico que instancia el controlador que le pertenezcaa
de esta forma, en ese constructor del controlador, tomara cual es el idioma seleccionado, y llenara strings dependiendo de un condicional tipo:

if(Español){
String tableColumnId = "Id", String tableColumnName = "Name"
}
else{
String tableColumnName = "Nombre"
}

Y de esta forma con todos los paneles y controladores.

Pienso que es mejor probar ese controlador global y que inicialize de una todos los paneles y asi poder darle correctamente uno u otro idioma
al programa 


27
Para que todo sea mas opcional, demos un pequeño frame dedicado para la edicion de los labels de los titulos. Es decir, una configuración especifica para ellos
Se leeran varios y guardaran en un array junto a un .dat la idea es simple. Darle la opcion al cliente de modificar si lo desea ese titulo
Simplemente ejecutamos esto, guardando nuestra configuracion y teniendo un metodo que mande el titulo seleccionado a donde queremos. De esta forma
Al cargar, tendra y elegira el titulo que pusimos dentro de la configuracion. Obvio, esto hace que debamos crear uno por default

En el login que diga "Mi empresa" y lo demas es igual

Y para que sea mejor, hagamos que el usuario pueda elegir el tamaño de la letra, la fuente y y su estilo. 
Complementando lo anterior, que se vea los cambio en un panel pequeño interno dentro del frame de config, para que pueda el usuario ver sus cambios
y saber que no la anda cagando. 

Recuerda: todo esto se guardara en un archivo aparte para que no se mezclen con otras configuraciones

28
Para que los componentes se recoloquen, haz un metodo de este estilo

public static void moveComponent(JComponent comp, Location locat, int sizeX, int sizeY){
}

Con esto podras mover a todos los componentes sin tener que crear cosas demas. De paso, encargate de crear un panel y añadirlo a la ventana
Es decir, un panel que NO pertenezca a la creacion de Window, porque es esto lo que te crea el problema al redimensionar