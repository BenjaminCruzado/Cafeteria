**Clase Cafe**: 
- 
Es una clase para poder crear objetos de tipo Cafe, los cuales simbolisan los cafes de la vida real.

**Atributos**:
- Gramos de Cafe: tipo double.
- Mililitros de Agua: tipo double.
- Tamaño: tipo String.

**Metodos**:
- Cafe: es el constructor el cual inicializa los atributos de la clase segun lo que se le entregue como parametro.
- Getters y Setters: para cada atributo le corresponde uno de estos para poder ver y modificar respectivamente el atributo.
- toString: imprime por consola el nombre del objeto con sus atributos.

**Clase Cafeteria**: 
-
Es una clase para poder crear objetos de tipo Cafeteria, los cuales simbolisan las cafaterias de la vida real.

**Atributos**:
- Nombre: tipo String.
- Dirección: tipo String
- Redes Sociales: tipo ArrayList<String>
- Lista de Cafes: tipo ArrayList<Cafe>

**Metodos**:
- Cafeteria: es el constructor el cual inicializa los atributos de la clase segun lo que se le entregue como parametro menos para los atributos redes sociales y lista de cafes, estos se inicialisan como ArrayList vacias. 
- Getters y Setters: para cada atributo le corresponde uno de estos para poder ver y modificar respectivamente el atributo.
- agregarCafe: se le entrega como parametro una variable de tipo Cafe y esta es agregada en el atributo de la cafeteria llamada listaDeCafes.
- agregarRedSocial: funciona igual que agregarCafe pero la variable es un String.
- eliminarCafe: elimina el cafe que se indica en el parametro del metodo.
- buscarCafePorTamaño: busca en la lista de cafes del atributo de la cafeteria uno por uno y compara el tamaño con el tamaño que se indica en el parametro de entrada y si encuentra uno de igual tamaño, este retorna el cafe.
- toString: imprime por consola el nombre del objeto con sus atributos.
- 
***Ejecucion del codigo:***
-

-Creamos un objeto de clase Cafeteria, ingresando como parametros el nombre y la direccion de la cafeteria.

-Creamos objetos de la clase Cafe con sus respectivos parametros.

-Luego por medio del metodo agregarCafe agregamos los cafes creados en el objeto de nuestra cafeteria.

-Tambien utilizamos el metodo agregarRedSocial para ingresar una red social a nuestra cafeteria. 

-Por ultimo utilizamos el metodo toString para mostrar nuestra cafeteria y sus atributos con sus valores.