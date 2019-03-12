<h1 align="center">
  <img src="src/logo.png">
  <br>
  Curso de Java Standart Edition
</h1>
<div align="center">
  <img src="src/java.png"> 
</div>

### Arrays

Los arreglos se pueden definir como objetos en los que podemos guardar más de una variable.

En Java tenemos 2 formas de declarar arreglos donde la parte clave que divide las dos maneras de declararlos es:

"TipoDato[] nombreVariable;"

```java
int[] donas;
int _donas[];
```
Puedes colocar los corchetes antes o despues del nombre de la variable.

Es muy importante siempre definir su tamaño, si no colcamos su tamaño nunca podremos utilizar el arreglo, tenemos que decirle la capacidad o tamaño de los arreglos.

En un arreglo siempre todos los datos deben ser del mismo tipo.

Hasta este momento solo estoy declarando los arreglos, solo están presentes, pero dijimos en clases anteriores que siempre es muy importante definirle el tamaño al arreglo, si nosotros no defimos el tamaño, el arreglo no vive. Como es una variable más compleja que las otras es muy importante definirle el tamño y además colocarle la palabra reserva new.

Cuando nosotros colocamos new enseguida de la declaración del arreglo, en ese momento estamos dandole vida al arreglo, si no le ponemos eso el arreglo está muerto, y no nos funciona y tampoco podemos hacer nada con el.

#### inicializar array

``nombreVariable = new TipoDato[capacidad]``;

La cantidad de dimensiones que tiene el arreglo será definido apartir de la cantidad de corchetes que colo  ques, y la cantidad de elementos será definio por la cantidad que agregues adentro de los corchetes

ejemplo:

```java
// Iniciación de array
int[] arregloInt = new int[2];
double arregloDouble[] = new double[45];

// Array de 2 dimensiones
int[][] array2D = new int[2][3]; // caben 6 elementos

// array de 3 dimensiones
int[][][] array3D = new int[3][3][2]; // caben 18 elementos

// array de 4 dimensiones
int[][][][] array4D = new int[1][2][3][4];
```

Otra manera de declarar arreglos.

```java
char[][] names = { {'M','T','W'}, {'M','T','W'}};
```

### Tipos de Operadores en Java

operadores aritmeticos:

Operador    Nombre        Ejemplo
  +       adición         a+b
  -       sustracción     a-b
  *       Multiplicación  a*b
  /       División        a/b
  %       Modulo          a%b

El operador + puede usarse para agregar o concatenar cadenas.

Operadores de asignación

Operador    Aplicación        Desglose
  +=         a += b           a = a + b
  -=         a -= b           a = a - b
  *=         a *= b           a = a * b
  /=         a /= b           a = a / b
  %=         a %= b           a = a % b

### Operadores incremento - decremento

Operador    Nombre        Ejemplo     Desglose
  ++        incremento      i++       i = i + 1
  --        decremento      i--       i = i - 1

Prefijo: ++i operador antes de la i

Posfijo: i++ operador antes de la i 

La diferencia de estos 2 operadores es el momento en cuando ocurren las operaciones, en la primera parte cuando estoy trabajando con esté primer prefijo 

1. Prefijo: Incrementar el valor es decir lo primero que hace es sumar 1 a la variable en esté caso i.

2. Posfijo: Asignar el valor a i.

Operador    Nombre       Ejemplo
  ==       igualdad      a == b
  !=       desigualdad   a != b

Donde los datos que obtendremos serán valores booleanos, es decir verdadero o falso.

Operadores lógicos:

Operador Nombre Ejemplo
  &&      AND   a && b
  ||      OR    a || b
  !       Not     !a

### Control De Flujo

La sentencia **if/else**

La sentencia if/else nos permite ejecutar un bloque de código o no, dependiendo de una condición que se evalúa justo antes de este bloque.
Esta condición se evalúa a un valor booleano, es decir, su resultado solo puede tomar dos valores, true o false.

La sentencia **switch**

Esta sentencia permite elegir múltiples caminos a seguir por el flujo de ejecución de nuestro programa.
En este caso, el camino a seguir se selecciona basándose en el valor de una expresión que se evalúa a un valor entero
En este caso, la salida sería "Es agosto"(en el primer ejemplo que hace la miss ).

### Programación Orientada a Objetos

Pensar en POO es una nueva forma de pensar, una nueva forma de analizar y entender el mundo que nos rodea.
Se trata de descomponer un problema en subproblemas y más subproblemas (Divide y vencerás).

Cuando nosotros lleguemos a estó, esto se llamará un **PROBLEM DOMAIN** o dominio del problema donde básicamente recopilamos los requisitos del cliente y entonces tenemos por escrito un alcance.

¿Como podemos empezar a pensar en POO?

La idea es ver el problema como un escenario, entonces ver ese escenario y tratar de simularlo con objetos. Es decir si yo tengó un problema no pensar rápidamente en la solución porque aveces podriá ser así, tener una solución muy lógica pero en realidad no podría ser la mejor solución o la solución adecuada cuando aveces es muy obvia, lo mejor es ver el problema en un escenario y entonces tratar de simular el problema pero ahora con objetos 

Imagina que el cliente necesita retirar dinero de un banco y entonces empieza a recrear todo un escenario y empieza a etiquetar objetos que puedan estar ahí.

¿Como identificar Objetos?

Los objetos pueden ser: Físicos :) o Conceptuales

Físicos: Es algo que puedes tocar, una persona podría ser un objeto, una taza, una camará, tu computadora, etc. Es todo lo que puedas tocar.

Conceptual: Es algo que podría vivir solamente en nuestra mente, lo que realmente no lo podemos tocar.

Los objetos deben cumplir con estás caracterísiticas:

- Deben tener atributos (un objeto será un objeto si tiene atributos). como: tamaño, nombre, forma o incluso si representa el estado de un objeto.

Cuando definimos los nombres de los atributos, los nombres de los atributos en general deben ser Sustantivos, tanto el nombre del Objeto como el nombre del atributo, deben ser puramente Sustativos. 

ejemplos:

User, Session.

El primero es un objeto físico, un User puedo tocarlo o puedo identificarlo o tal vez de forma virtual no, pero si existe, es una persona. Sin embargo una session es algo conceptual es algo que no puedo tocar aunque conzca al usuario. Tiene atributos una session de usuario y además vamos a ver que los objetos también van a tener operaciones o todas las funcionalidades que puede tener ese objeto que estamos analizando 

**Importante:** Los nombres de los objetos deben ser Sustantivos y además sus **atributos** también deben ser sustantivos. Además los objetos deben tener comportamientos o funcionalidades 

Las **Operciones** sulen ser Verbos o Sustantivos o Sustantivo y Verbo.

**Sustantivo:** Los sustantivos son palabras con las que se designan y clasifican los seres y las entidades de la realidad, pensándolos como conceptos independientes. Según su significado, los sustantivos se clasifican en:
- comunes 
- propios
- idividuales
- colectivos
- concretos
- abstractos
- contables
- No contables

Los sutantivos comunes: son los nombres que les ponemos a los seres u objetos en GENERAL como por ejemplo: niño, tiburón, nube.

Los sustantivos propios: se refieren a seres u objetos en Particular es decir diferenciandolos de los demás, por ejemplo: "daniela" "toby",

Los sustantivos individuales: designan a un solo ser u objeto en singular por ejemplo: gato, balón o bicicleta

Los sustantivos colectivos: nombran en singular a un conjunto de seres o cosas como: rebaño, ganado, manada 

Los sustantivos concretos: son palabras que se refieren a seres u objetos que pertenecen al mundo Físico, son cosas que se pueden ver, oír o tocar, como por ejemplo: avión, lluvia o hamburguesa

Los sustantivos abstractos: son palabras que no pertenecen al mundo físico y se refieren a IDEAS O SENTIMIENTOS, como por ejemplo: alegría, hambre o belleza.

Los sustantivos contables: designan algó que puede ser contado como: UN delfín, DOS monos, TRES sillas.

Los sustantivos NO contables: se refieren a algó que no se puede contar como por ejemplo: viento, arena, o música.

resumen: palabras que definien o nombran: personas, animales, plantas o cosas.


### Análisis De Un Objeto

Ejemplo: Objeto Auto

Atributos: matricula, marca, modelo, color 

Comportamientos: arrancar, frenar, reversa 

Un error muy común que generalmente ocurre es que cuando analizamos los atributos normalmente la gente piensa, bueno que atributos tiene esté auto; esté auto es: verde, grande, tiene llantas y lo que hacemos con estó es que en realidad damos la respuesta  al atributo y no tanto analizamos el atributo como tal. Si quisieramos trabajar con la característica del color verde. Aquí nuestro atributo o característica sería color. 

Podríamos pensar que esto no nos es util. Como pongo esto cuando quiero hacer un sistema, cuando quiero hacer una app, cuando quiero hacer algo con objetos, como voy a arrancar literamente un coche o como voy a frenar literalmente un coche en el Software. 

Bueno pues estó es dependiendo en la manera en que utilizamos un objeto; en esté caso estamos analizando el objeto auto en un contexto aislado, osea el objeto como entidad, como ente aislado de todo lo demás, pero si nosotros necesitamos trabajar el objeto en un escenario especifico, esa es la forma en la que podemos empezar a analizarlo. Es decir: ponemos el objeto en escenarios especificos dependiendo del objetivo de mi DOMAIN PROBLEM


### Clases

La clase: Una Clase es la forma en como defines tu objeto para generar más objetos.
Una forma efectiva para analizar estó es empezar por objetos, empezar a idealizar o visualizar los objetos que tengo en el escenario y apartir de ellos crear clases. Es decir crear Moldes que me permitan generar más objetos, abstraer los datos del objeto para entonces crear plantillas.

**Las clases son descriptivas, son plantillas**

Para abstraer una clase:

- Definir todos los posibles atributos
- Comportamientos

Está plantilla me va a ayudar a generar más objetos, podemos generar un auto rojo, azul, etc.

### Estructura de una clase en JAVA

```java
public class Auto {
  atributos:
    private int id;
    private String matricula;
    private String marca;
    private String modelo
  
  comportamientos: // o Métodos
  public void mostrarDatos() {

  }
  public void esVendido() {

  }
 }
```
Para declararlo estó es muy similar a una receta de cocina primeramente en una receta primero colocamos todos los ingredientes y despues colocamos la forma en la que se realiza la receta.

### La Sentencia Import

_import _define a las clases o grupos de clases externas que utilices en tu clase, ésta es una palabra reservada y la verás siempre en el encabezado del archivo de la clase, por ejemplo:

``import java.util.Date;``

Puedes importar tan solo una clase como en el ejemplo anterior o un paquete de clases:

import java.util.*;

Además que puedes incluir múltiples sentencias import:

``import java.util.Date;``
``import java.util.Calendar;``

Es una buena práctica especificar la importación completa del paquete de clases *, sin embargo puede causar conflictos con clases que vivan en diferentes paquetes pero tengan el mismo nombre por ejemplo:

``java.util.Date;``
``java.sql.Date;``

Cuando tengamos algo similar podemos usar la siguiente sintaxis para diferenciar.
Elegimos qué import conservar:

``import java.util.Date;``

Y la otra clase la llamamos de la siguiente forma

``java.sql.Date date = new java.sql.Date();``

En el caso de miembros static que veremos más adelante se importarán de la siguiente forma:

``import static java.lang.Math.PI; // importa solo la variable estática PI``
``import static java.lang.Math.*; // importa todos los elementos estáticos de la clase``

Por lo tanto podrás usarlos así:

``double r = cos(PI * theta);``

Cosas que debes saber:

Por default siempre se importa java.lang.*
No necesitas importar las clases que estén en el mismo paquete.

### Métodos

En JAVA la funcionalidades y comportamientos de un Objeto se conocen como Métodos, y un métodos tiene la siguiente estructura:

```java
// Firma del Método
// Método Suma

public int suma(int a, int b) {
  return a+b;
}

/* Modificador de acceso */ /*Valor de retorno*/  /*Nombre del Metodo*/
public                            int                   suma        

/*Argumentos*/
(int a, int b) 

{
  // Cuerpo del Método.
  return a+b;
}
```
Este método lo que ará será sumar 2 números por lo tanto tendra que recibir los 2 número en algún momento en la parte de la firma del método.

¿Qué es la firma del método?

Básicamente es la estructura del método, lo que tenemos en la estructura de arriba. Donde colocamos las palabras clave, donde:
1. Primero viene el modificador de acceso.
2. valor de retorno; es decir si es una suma nos devolverá el resultado.

Aquí es donde nosotros asignamos el tipo de valor de retorno en la firma del metodo.

3. Nombre del método; donde utilizaremos la sintaxis de Lower Camel Case. (es decir empezamos con minuscula y si el nombre se compone de 2 o más palabras las iniciales las pondremos con Mayúsculas.)

4. Argumentos: serán los datos que entran al método.

Imaginemos que el método es como una cajita donde nosotros ponemos cosas, en esté caso queremos que sumen algo, entonces le colocamos 2 elementos o dos datos y la cajita lo que hará internamente será sumar esos 2 elementos y por ultimo será devolver el resultado.

Los argumentos que en este caso son (int a, int b) siempre deberán estar separados por comas, y esté puede recibir NADA de ARGUMENTOS o puede recibir UNO o DOS o N elementos. Pero siempre se deben separar los argumentos con una coma, y si no vamos a poner nada simplemente colocaremos los argumentos vacíos sin Nada. 

5. Interiormente estara el cuerpo del Método envuelto entre parentesis, donde estará toda la implementación del código.

Si nosotros devolvemos un dato de regreso es importante utilizar la palabra **return** con el dato que estamos devolviendo, pero aquí la operación se está ejecutando en el return.

Si no estamos devolviendo nada, en vez de **int** devolveremos la palabra **void** y entonces omitiremos la palabra **return**.

NO puede declararse un método dentro de otro Método, está es una restricción, No podemos tener método anidados, Pero si podemos tener Clases anidadas.

Clases anidadas: También se le conoce como **Inner Class** 

### Declaración De Un Objeto.

Inmediatamente cuando queremos que la clase cobre vida está va a decir que la utilizaremos atraves de un objeto. 

Ejemplo:

// Tipo de Objeto   // Nombre del Objeto
        Auto                 miAuto

Estó sucede lo mismo que con los arreglos, si solo lo dejamos declarado y no lo utilizamos o queremos utilizar, es decir no le hemos dado vida a esté objeto por ahi nos va a mandar un error o un exception y no podremos utilizarlo.

### Instanciando un Objeto 

Básicamente cuando le damos vida un objeto, esto significará que estamos instanciando un objeto. Cuando nosotros decimos que creamos una instancia de una clase nos estamos refiriendo a que creamos una instancia de una clase, es decir que le estamos dando vida al objeto de un clase.

Cuando nosotros utilizamos la sintaxis:

``miAuto = new Auto()``

Estó significa que nuestro objeto en esté momento empieza a abarcar espacio de memoria, esto significa que empieza a consumir memoria de la computadora. 

### Declarar En Instanciar Un Objeto En una Sola Linea

``Auto miAuto = new Auto();``

Recordemos que los métodos deben tener **Lower Camel Case** es decir que deben comenzar con minuscula, pero arriba lo estamos haciendo con mayuscula cuando usamos ``Auto()``.
Esté es el conocido **Método Constructor** 

#### Método Constructor

El método constructor va a ser diferente a los demás métodos que hemos visto.

Esté método tendrá el **mismo nombre** de la **clase que se inicializa**. Y esté nos va a servir para crear nuevas instancias de clase. Sin el no podemos crear un Objeto.

El método Constructor es provisto por el compilador y es previsto por Java por default, cuando nosotros agregamos los atributos a nuestra clase.

Además utilizará utilizará **Cero o más argumentos** Y **Nunca regresará un Valor** 

¿Como utilizamos un Objeto?

Una vez inicializado el Objeto
`Auto miAuto = new Auto();`

Estaremos llamando al objeto y apartir de la sintaxis '.' Nosotros podemos tener acceso a sus atributos y asignarle datos.
`miAuto.marca = "Ferrari";`

Además podemos tener acceso a sus métodos.
`miAuto.mostrarDatos();`

### Métodos Estáticos 

Los métodos static se pueden usar en toda la clase y también en otras clases. Está definido por la palabra reservada **static**, hasta ahora el único momento que hemos utilizado la palabra static es en el método **main**.

Puede ser *accesado utilizando el nombre de la clase* , la notación punto y el nombre del método.

Ejemplos:

```java
Math.random();
Math.sqrt(25);
Math.PI;
```
Estó quiere decir qu ya no necesitamos crear un Objeto para tener acceso al método de la clase. Simplemente definiendo el método como estático o definiendo el atributo como estático es la manera en como puedo tener acceso.

A continuación tenemos un ejemplo de un método **static** dentró de la clase calculadora la cual tiene el método suma.

```java
public class Calculadora {
  public static suma(int a, int b) {
    return a+b;
  }
}
```
¿Como llamaríamos a este método desde otra clase?

de la siguiente manera:

`Calculadora.suma(5,3);`

1. Primeramente el nombre de la clase
2. Seguido del nombre de el método
3. Recibe párametro 

Esté método puede ser invocado en una clase que no tiene instancias de la clase. Esto quiere decir que si podemos invocar si necesidad de utilizar un objeto o una instancia quiere decir que estoy ahorrando memoria. Los métodos *static* me ayudan a ahorrar memoria incluso también las variables static porque no tengo que crear objetos y poner en orbita objetos con memoria.

Podemos tener métodos static y también podemos tener atributos static.
```java
public class Calculadora {
  public static final double PI = 3.141592;
  public static int valor = 0;
}
```
¿Como acceder a miembros de la clase? 

Es decir a tributos que está aquí, estó es atraves de el nombre de la clase seguido del punto y el nombre del atributo, igual que los métodos.

`Calculadora.valor;`

¿Como funcionan en memoria?

Ya vimos que podemos tener clases y las clases pueden tener atributos al mismo tiempo los atributos pueden tener métodos y los métodos atraves de si pueden tener declarados adentro variable. Esto quiere decir que estamos viendo una especie de jerarquia al nivel de acceso de las variables, por una parte declaramos variables globales que estan accesibles para la clase y cuando declaremos los méotodos de la clase, dentro de cada método podremos declarar más variables que estén accesibles unicamente para el método, el caso de los elementos static, no solo está estan accesibles para miembros de la clase sino también están accesibles para miembros de otras clases.

Ejemplo:

Tenemos un Clase C que tiene: 
- 1 variable static
- 2 método static

También tenemos 2 clases más A y B.
- Estás clases A y B pueden tener acceso al método y a la clase pero no solo al dato, si no incluso puede tener acceso a editar el valor de la variable.

Es decir mientras los elementos estén static en el caso de las variables, tanto la clase A y B pueden editar el valor de la clase C.

### Sobrecarga de Métodos 

A veces necesitamos que dos o más métodos tengan el mismo nombre pero con diferentes argumentos.

Es decir que tengan diferentes tipos de argumentos y que incluso puedan devolver algo diferente pero que conserven el nombre.

Ejemplos:

```Java
public class Calculadora() {
  public int suma(int a, int b) {
    return a+b;
  }
  public float suma(float a, float b) {
    return a+b;
  }
  public float suma(int a, float b) {
    return a+b;
  }
}
```
Cuando decimos que hay una sobrecarga es justamente cuando tenemos el mismo nombre del método con diferentes argumentos o incluso podría ser el mismo comportamiento, la única diferencia es la cantidad de argumentos.

Los Métodos Constructores no se salvan de la sobrecarga y ellos también pueden tener una característica como está, como ya vimos la sobrecarga de constructores los utilizaremos para inicializar objetos, estó es interesante porque un método constructor vacío vimos que es para poner al objeto en orbita pero todos los parametros que componen el objeto al momento de crearse se crean vacíos hasta que nosotros empecemos a añadirles elementos.

Sobrecarga en Constructor. Ejemplo:

```Java
public class Auto {
  private int id;
  private String matricula;
  private String marca;
  private String modelo;
  private double precio;
  private boolean vendido;

  // Método Constructor Default, el que ya nos proveé Java 
  public Auto(){

  }

  // Método Constructor que también se llamá Auto y además estamos pasandole estos parametros más
  public Auto(int id, String matricula, String precio) {
    this.id = id;
    this.matricula = matricula;
    this.precio = precio;
  }
 }
```

Estó es comumente utilizado para decir algo similar como los atributos obligatorios del objeto, porque si yo no le paso estos elementos cuando estoy creando el objeto como lo creamos en el segundo, entonces el objeto no se podra crear.

### Modificadores de Acceso

Tenemos una manera de esconder los datos de nuestros atributos y esto es usando los modificadores de acceso.

X = Permitido.

Modificador   clase   Package   SubClase    Otros
  public        X        X          X         X
  protected     X        X          X
  default       X        X
  private       X        

Estos modificadores tienen un nivel de acceso dependiendo de donde estemos ubicados. 

**public:** all access
**protected:** para la clase, clases que estén en otros packages y para clases hijas.
**default:** para la clase, clases que estén en otros packages
**private:** para la clase.

Cuando escondemos un dato a esto se le llamá encapsulamiento, encapsulamiento es un sinónimo de esconder. Cuando escondas un dato ya sea al nivel que uses por aquí ya sea: protected, defult o private. En caso de public no, en ese momento estás aplicando encapsulamiento, en ese momento estas aplicando el dato para que nadie más lo vea.

### Getters y Setters

La mejor forma de tener acceso a los atributos y miembros de una clase es utilizando métodos getters y setters.

Los métodos getters y setters nos ayudan leer y a escribir especificamente los valores de las variables miembro, estos nos van a ayudar Leer/Escribir y/u actualizar.

¿Como Funciona un Getter y un Setter?

Getter: Vamos a tener una variable objetivo y atraves de un método Getter vamos a obtener el valor de la variable.

Setter: A traves de un método Setter vamos a asignar o asignar el valor de una variable.

Si nosotros queremos hacer validaciones como por ejemplo: que el title tenga menos de 5 letras o que corte una palabra larga y me deje 5 plabras. Pues estó lo puedo colocar en un método. En el método SET y entonces en el método Set ahí puedo poner la implementación y estar cada vez que llamé a ese método set, todo el tiempo se estará ejecutando esa linea de código.

RECUERDA: Cuando empieces a copiar y pegar código en Java querrá decir que siempre hay una mejor forma de hacerlo utilzando las buenas practicas. Así que copiar y pegar código no es para nada, nada bueno.

### Variables != Objetos

Hasta esté momento ya podemos ir entendiendo que las variables primitivas son diferentes que los objetos. En las variables primitivas vamos a encontrar que tenemos su equivalente en Objeto primitivo:

Clasess Wrapper / Objeto primitivo

- Byte
- Short
- Integer
- Long
- Float
- Double
- Characer
- Boolean 
- String

De todas estas tenemos su equivalente en un dato primitivo. 

Importante: String no es un tipo de dato primitivo, el único primitivo es char que es el más semejante a string, pero para mostrar un mensaje teniamos que hacer un array de chars tan solo una palabra.

Java desde la versión 1, desde su JDK 1 incluyo la clase String la cual está lista para recibir cadenas de caracteres y no tener que estar implementando chars con un array y luego estar metiendo en cada indice para formar finalmente una palabra.

Asi mismo como tenemos la clase String tenemos una clase equivalente para cada dato primitivo.

La unica diferencia visible es que las de tipo objeto primitivo la inicial estará en Mayúscula y los de tipo primitivo sin objeto serán con minusculas, pero aún así le diferencia va mucho más allá de eso.

Las variables primitivas son entidades muy elementales(muy sencillas) como por ejemplo: un número, un caractér, un valor falso o verdadero.

Objeto: Son entidades más complejas, estás pueden estar formadas por la agrupación de muchas variables y métodos. Tal cual como hicimos nuestro objeto Auto donde tenemos variables(atributos) y métodos(comportamientos). está es la principal diferencia entre un objeto y una variable, una variable jamás va a ser tan compleja como un objeto.

### Memoria Stack vs Memoria Heap

La principal diferencia es donde se almacena un tipo de dato primitivo y donde se almacena un tipo de dato Objeto.

ejemplo:

`int i = 0;`

Esté valor se va almacenar en el Stack. **Los primitivos siempre están almacenados en el Stack**.

Y **los tipos de Dato Objeto van a estar en el Heap**

`Auto miAuto = new Auto();`

Lo que quiere decir es que todas las variables que tengan un tiempon corto de vida estarán siempre viviendo en el Stack, por ejemplo variables que estén definidas en un método o variables que estén definidas dentro de un objeto, etc. 

Pero los tipo de dato Objeto que esten definidos para tener un tiempo de vida más largo estarán almacenadas en el heap. ¿Qué es lo que se guarda en el Stack? 
Tan solo es la referencia del objeto es decir la dirección de memoria.
Pero cuando vamos al **heap**, esté objeto que es más complejo donde tiene todos sus datos "atributos", **lo que guarda el Stack es la dirección de memoria del heap de ese Objeto**. Entonces lo unico que mapea el Stack es la dirección de memoria. 

Pero para el caso de un tipo de **dato primitivo**: lo que está registrado en el **Stack** es el **valor del Dato**.

Por eso muchas veces cuando hacemos una igualdad donde queremos comparar 2 objetos del mismo tipo, que aunque sean iguales internamente de datos, estó nos dará un error porque lo que hace el compilador internamente es comparar las referencias de memoria. Y nunca van a ser iguales porque está alojadas en diferente referencia de memoria.

### Herencia 

En algunas circunstancias es necesario utilizar el estado y comportamiento de una clase en conjunto de otras clases 

De acuerdo al analisis que estuvimos viendo en algunas clases anteriores vimo que algunos atributos se estaban repitiendo y eran redundantes entre sí entre las diferentes clases que teníamos.

Es en esté momentos cuando empezamos a detectar redundancia cuando debemos de aplicar herencia. Recordemos que una de las principales filosofías de la Programación Orientada a Objetos es la reutilización de código para escribir lo menos posible.

La herencia es lo que vivimos en nuestra vida diaria, cuando nosotros tenemos una familia, tenemos un padre el cual nos ha heredado geneticamnete algunas facciones geneticas como: color de ojos, tono de piel, etc. Así mismo yo puedo heredar estas facciones geneticas a mis hijos, en un ejemplo.

La idea es establecer un jerarquía de forma padre he hijo y aplicando todos los atributos se estarán heredando a sus clases hijos y como vemos la clase puede ser secuencial, es decir que se puede dar más de una vez.

La idea de la herencia es permitir la creación de nuevas clases basadas en las clases existentes.

### Super Y This

Cuando empecemos a trazar nuestro código en nuestro editor vamos a ver un par de palabras interesantes lo cual será Super y This. 

La Film en esté caso será la clase padre y la clase hijo en esté caso será la clase movie, y se verán en código de la siguiente manera:

```java
public class Film {
  // SÚPER CLASE
}
public class Movie extends Film {
  // SUBCLASE O
  // CLASE HIJO
}
```
Film al ser la clase padre se converirá en la superclase. Siempre que encuentremos la palabra Super nos estaremos refiriendo a la clase padre. 

Cuando apliquemos la herencia tendremos nuestra clase Movie y la palabra clave que define la herencia entre una clase y otra es **extends**. En esté caso movie estará extendiendose atraves de Film, todos los atributos que tiene Film automaticamente le serán heredados y los tendrá en su clase al momento de crear la clase, pero están ahí. A la clase hija le llamaremos *Subclase* 

Una Subclase hereda todos los miembros de su súper clase y unicamente estarán heredandose los elementos cuyos modificadores de acceso sean **public** o **protected**.

### This

Permite especificar que la variable que esta señalando es de la misma clase de la que se usa. This serán los elementos miembros de la clase hijo. Entonces siempre que quiera referirme a los elementos de la clase hijo, mientras esté en la clase hijo le diré this.elemento, es decir el elemento de la clase en la que estoy ubicado.

Si estoy en la clase movie y quiero referenciar a la clase film utilizaré Super, si estoy en la clase movie y quiero referenciar algún atributo de la clase movie utilizaré la palabra **this** 

### Polimorfismo

Cuando una clase hereda de otra, y en está clase hija se redefine un método con una implementación distinta a la de la clase padre.

Es justamente lo que hicimos con el método toString, que el método toString provenía de la clase Object, y entonces le estamos dando otro comportamiento.

**Restriccion para el Polimorfismo:** Los métodos que están marcados como final o static no se pueden sobrescribir.

Otra cosa que podemos Sobrescribir son los constructores que les podemos dar otro comportamiento, podemos darle argumentos diferentes.

Si yo tengo un método o un comportamiento de una clase padre y ahora al momento de sobrescribirlo le estoy dando otro comportamiento, estamos llegando a un **concepto muy clave en en Programación Orientada a Objetos** lo cúal es el **Polimorfismo**. 

El Polimorfismo significa "Muchas Formas".

El Polimorfismo nos dá la posibilidad de construir métodos, varios métodos con el mismo nombre pero con diferente comportamiento siempre y cuando esté aplicandose la herencia.

Cuando sobrescribimos el método toString() estamos haciendo polimorfismo, cuando sobrescribimos el método constructor estamos aplicando Polimorfismo y cuando sobrescribamos cualquier otro método que esté heredando de otra clase.

### Colecciones De Datos (collections)

En JAVA tenemos los collections o como manejar colecciones de datos, sobre todo cuando trabajamos con coleciones de objetos que es en nuestro caso. Las Colections se diferencian de los Arrays en que su tamaño no es fijo, es decir **son DINAMICOS**.

Se pueden realizar operaciones de: añadir, eliminar, obtener, encontrar y recorrer una colección.

Estás operaciones nosotros lo estuvimos haciendo manualmente, cuando vimos el tema de arreglos, todas las operaciones las haciamos atraves del indice. 

Pero aquí vamos a tener métodos para la utilización de estos comportamientos.

<div align="center">
  <img src="colections.png"> 
</div>

Todas estas clases vienen implementadas en el JDK de JAVA. 

Empieza todo desde la Interfaz collection. De la Interfaz collection se hereda a: interface-Set, interface-List, y la interface-Queue. Aunque en Queue no es muy utilizada.

Las principales que vamos a encontrar son SET y List, y de ahí se van a derivar algunas otras interfaces y clases que van heredando o implementandose unas a otras. 

Todos los colections se van a utilizar para trabajar con coleciones de objetos. Es decir nosotros no podemos trabajar con datos primitivos aca. 

Pero en otro caso podríamos usar los Objetos de tipo primitivo o mejor conocidos como **grappers** lo que hace es envolver el tipo de dato primitivo y lo hace pasar por un objeto.

### Interface List Y Set

Es una interfaz que extiende de la interfaz Collection, se utiliza para almacenar coleciones de objetos, proviene del paquete *java.util*

*La diferencia entre List y Set:*

- En List los elementos van a estar ordenados y además tenemos la posibilidad de que halla elementos repetidos en la coleccion de datos.

- En Set los elementos pueden estar o No ordenados y además los elementos No pueden repetirse

#### Métodos

**add(Object o):** Añade un objeto al final de la lista.

**add(int indice, Object o):** Añade un objeto a la lista en la posición indicada.

**get(int indice):** Devuelve el objeto de la lista de la posición indicada

**remove(int indice):** Elimina el objeto de la lista pasado por párametro.

**clear():** Elimina todos los elementos de la lista.

**indexOf(Object o):** Devuelve la posición de la **primera vez** que un elemento coincida con el objeto pasado por párametro. Si el elemento no se encuentra devuelve -1.

**lastIndexOf(Object o):** Devuelve la posición de la **última vez** que in elemento coincida con el objeto pasado por párametro. Si el elemento no se encuentra devuelve -1.
}
**size():** Devuelve el número de elementos de la lista. Es equivalente con lenght.

**contains(Object o):** Devuelve verdadero si en la lista aparece el objeto pasado por párametro, para lo cual se utiliza intrínsecamente el método equals(). 

### ArrayList

Almacena un arreglo de objetos que **puede cambiar de tamaño**, tiene una capacidad que crece automáticamente. 

en codigo:

```Java
ArrayList<String> androids = new ArrayList<String>();

androids.add("Jelly Bean");
androids.add("Kit Kat");
androids.add("Lollipop");
```

Donde aquí ponemos el nombre de la coleción androids, recuerda que en coleccion y arreglos lo mejor es utilizar nombres en plural. 

Donde está sintaxis que se llamá Diamante<TipoDeObjeto> colocaremos el tipo de objeto. Lo que estamos haciendo en el ejemplo es generar una coleción de objetos de Strings.

### Vector

Un vector es similar a un array, la diferencia estriba en que un vector usa **hilos** y **está sincronizado** y un array no.





