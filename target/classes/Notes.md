
Este es un proyecto que busca recrear como una empresa maneja un inventario de productos, de una tienda de ropa que tiene:

-Proveedores
-productos 
-Clientes
-Entrada y salida de productos
-Empleados
-Una base de datos


Notas para mejorar la App:

1
 si se activa la ordenanza que este sea un comboBox, para elegir el tipo y que no varie (Ejem: por tipo de ropa, o por marcas)
 sino, será la otra (producto)
 Esto sera posible a traves de dos paneles que usen su respectiva clase (una de producto y otra de ordenaproducto)

Nota: tal vez lo mejor sea crear dos modelos default de la tabla, y que dependiendo de la opcion, sea una u otra y ya, quitas
el peso de andar creando distintos paneles
     
2.1
En cada panel se usara un JTabbed para poder pasar por diferentes listas y no tener que volverte un culo

3.0 
Las tablas de empleados, clientes, y proveedores tengan una relacion. Aunque primero debes entender como funciona eso

3.1 Hara de llave foranea es productos generales, y la original sera la que se cree de entrada (codigo de producto). 

4.0 
Para que se haga posible la creacion de un producto default con subir una entrada, es usar un procedimiento almacenado que pida normal los datos de la entrada, y que tome los que necesita para crear otro producto en la tabla de productos_generales que tenga valores default, solo teniendo de la entrada el id (que es la referencia directa de codigo de producto), la seccion que ingresamos y su marca, los demas estaran en "none"


4.5 
Y para resolver la actualizacion, haz una clase que realice una accion de actualizar (que tome al panel para que siempre se esta actualizando al pasar el mouse por el), pero que este tenga un contado definido en cero, y un if que verifique si es cero. Si lo es, actualiza la tabla (enviaTabla), y suma al contado un numero. Para que siempre cargue al poner el cursor en el panel (y que sea solo una vez) hacemos que en window, en cualquier accion que no sea la del inventario (o sea cuando cambia de panel), un set para que contador vuelva a ser a cero (antes de borraPaneles). Eso lo logras con un get y set


4.6
Toca crear en la tabla otro campo que es para id del proveedor, esto es tanto para entrada de productos como para la de C.R.U.D. es relativamente sencillo, en mysql añadimos los campos en ambos, y los relacionamos de alguna manera. Entonces, para esto, en la tabla de añadir productos creamos otro campo mas, y otro textfield para poder ingresar o incluso modificar ese dato. Esto claro, teniendo en cuenta que ese es el id de otra tabla. Entonces, toca mejorar este punto

5.0
Esta tambien que toca añadir un campo de venta y este, tendra para sus eventos un procedimiento almacenado especial, que tomara la cantidad vendida de ese producto y lo restara a la tabla de productos_generales

6.0
Toca crear 1 procedimiento almacenado para poder actualizar las entradas y, que si se actualiza cualquiera de los campos del producto, pues que se inserten esos datos (actualice(Update)) y asi pueda ser mas libertario en ese punto

7.5
Falta colocar una tabla para imagenes y crear un procedimiento almacenado para que las lee y deposite con el id de un proveedor en especifico (foreign key). Claro, para esto hay que colocar condicionales (if aninados o no), porque cuando no encuentre una foto, puede dar error. Esto se resuelve con la condicion, que si ocurre, elige la foto, y si no, pues elige la por default que tienes ya en los archivos del proyecto

Nota 7.6:  if(condicion, siOcurre, siNoOcurre)

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
Hay que añadir el precio por unidad de cada producto. Esto tanto para las entradas como para las salidas

13
Con SWING AVANZADO se pueden hacer animaciones y todo. Lo mejor es ver alguno de esos para mejorar en la parte del diseño de la APP

14
para poder cambiar entre pestañas de tabbedPane, debemos poner:

nombreDelTabbedPane.setSelectedIndex(0) o nombreDelTabbedPane.setSelectedIndex(1) y asi dependiendo del numero de paneles que tenga el tabbedPane

15
Para mostrar todos los detalles de los proveedores, solo haz algo simple, que ha cada seleccion, busque la cedula en la base de datos, y que al encontrarlo (esto solo es con un arrayList lleno de los proveedores), te entregue cada detalle. Claro, esto es actualizado a cada click que de en la tabla

Y para que se mantenga actualizada, haz lo mismo con que el panel actualice la tabla



Desarrollo junto a la app de ventas:

Esta es una app de una ventana simple que se encarga de registrar cada producto que compre un cliente, y a la hora de registrarlo/buscarlo, este, de forma automatica decidira si debe registrarlo o no. Si encuentra la cedula, autocompletara el nombre, la edad y
los demas datos del usuario.

1
La App con un thread y un event keytyped, ira actualizandose y viendo los posibles candidatos que tengan la misma cedula. Estos se veran como un pequeño comentario que ira contando cuantas coincidencia hay con esa misma cedula

2
para que se auto complete (en el textfield solo habra 8 digitos para poner), una vez se cuenta completamente toda la cedula, si encuentra en la base de datos a un cliente con esa cedula, tomara los nombres y los datos y los insertara automaticamente