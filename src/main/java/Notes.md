
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
