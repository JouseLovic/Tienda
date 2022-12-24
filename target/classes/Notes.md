
Este es un proyecto que funcionara con base de datos para poder gestionar una tienda de ropa que tendrá

-Proveedores
-productos (con sus clases especificas)
-clientes
-entrada y salida de empleados
-empleados
-Lista de cada producto (a traves de un JTable) y los formularios se llenaran con JTabbed para el agregado de la ropa
-Y que esa lista este con el precio de cada producto (Esto que se pueda hacer
con el formulario)

Solucionado:

-Añadida la herencia, y sus superclases
-Añadido mejoras como: clases mas precisas, y patrón MVC

Falta:

-La interfaz
-la base de datos
-mejorar los detalles que diferencian un cliente, de un empleado y de un proveedor
-falta cargar las colecciones
-La comparacion de id, para evitar duplicado (aunque esto ya esta porque sobreescribi el hashcode y el equals de products)

Una idea para el llenado del formulario para agregar los datos de una camisa/pantalon/zapatos, etc

--Cuando aumente el tamaño de la camisa, por ejemplo, talla M, la imagen aumente, cuando salga una talla S, pues que disminuya

Importante:

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

