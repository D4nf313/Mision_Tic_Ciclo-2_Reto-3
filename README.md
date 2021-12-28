# Mision_Tic_Ciclo-2_Reto-3

Adquisición o Intercambio de Partes o Accesorios

En la empresa se cuenta con los elementos suficientes para el desempeño de las tareas y funciones diarias de los diferentes colaboradores y se lleva un inventario de los elementos que hacen falta adquirir y otro de los elementos que hace falta reemplazar, divididos ambos listados por categorías o clases. En el caso de los reemplazos de partes o suministros, estos sólo se pueden realizar por piezas de igual tipo que pertenezcan a la misma categoría.

Con el propósito de sistematizar este proceso se deben construir las funciones que se indican:

Se debe crear una clase principal (sin main) llamada “Partes” que contenga, como mínimo de las siguientes funciones, que posibiliten todo lo que se desea en términos de adquisiciones e intercambios (Vale 1).

1. La función "clases" que, dada una lista de los grupos o clases de todos los suministros o repuestos, se obtenga una lista con elementos únicos, lo que significa que no se repite ninguno. (Vale 1)

Si por ejemplo se tiene la siguiente situación:

[“electrónicos”, “ópticos”, “ópticos”, “software”, “software”, “comunicaciones”, “electrónicos”, “software”, “ópticos”, “comunicaciones”, “software”]

La función debe retornar la lista con las clases o tipos que no admiten duplicados

[“electrónicos”, “ópticos”, “software”, “comunicaciones”] 

2. La función "meFaltanDelaClase" que dada una lista con los números de partes que hace faltan, la lista de las clases de cada parte y una clase de parte (en ese orden), retorne una lista con los números de dicha clase que faltan. (Vale 1)

a). Por ejemplo, si se ejecuta la función con los siguientes parámetros:

meFaltanDelaClase([2,3,5,7],

[“electrónicos”, “ópticos”, “ópticos”, “software”, “software”, “comunicaciones”, “electrónicos”, “software”, “ópticos”, “comunicaciones”, “software”], “software”)

debe retornar la lista

[3,7]

Nótese que los números de partes empiezan en cero (0) y van hasta el diez (10), siempre empiezan en cero. 

b). Por ejemplo, si ejecutan la función con los parámetros:

meFaltanDelaClase ([0,3,6],

[“electrónicos”, “ópticos”, “ópticos”, “software”, “software”, “comunicaciones”, “electrónicos”, “software”, “ópticos”, “comunicaciones”, “software”], “electrónicos”)

Se debe retornar la lista:  

[0,6] 

3. La función "noTengo" que dada una lista con partes o accesorios que tienen en otro almacén y una lista con las partes que la empresa tiene, retornar en una lista, las partes o accesorios que nos interesan del otro almacén. (Vale 1)

Por ejemplo, si se llama:

noTengo([1,3,4,6,7,8], [2,3,5,7])

Se debe retornar la lista:

[1,4,6,8] 

4. Para simplificar la primera versión de la librería se quiere pensar que todas las partes son de un mismo tipo y que la lista que maneja cada persona indica los números de las partes o accesorios que tienen para cambiar y aquellos números que no están en dicha lista son los que necesitan. De esta manera deben crear una función llamada "puedoCambiar" que reciba la lista de los elementos que tiene en otro almacén y la lista de partes que se tienen la empresa, y que retorne el número de partes (cantidad) que pueden cambiar. (Vale 1) 

Por ejemplo, llamar la función:

puedoCambiar([0,2,3,5,7,10,11,12,13], [2,4,8,6,5])

Debe retornar

3

Porque al otro almacén solo le interesan tres (3) partes:

[4,6,8]

mientras que a ellos les interesan cuatro partes que el otro almacén tiene:

[0,3,7,10,11,12,13]
