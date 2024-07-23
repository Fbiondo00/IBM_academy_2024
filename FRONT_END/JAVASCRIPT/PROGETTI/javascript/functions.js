function arrayBuild1() {

    var courses = ["Java SE", "Angular"];
    // PUSH = AGGIUNGERE
    courses.push("React", "Spark");
    courses.forEach((course) => console.log(course));


}

function arrayBuild2() {

    var letters = new Array();
    letters[0] = "a";
    letters[1] = "b";
    letters[2] = "c";
    letters.pop();
    letters.forEach(letter => console.log(letter));



}


function arrayMap() {

    var numbers = [1, 2, 3, 4];
    /*
    L'operatore funzionale map può 
    essere utilizzato in due vesti
    differenti:
    - come un forEach
    - come operatore di transformation
    (per ottenere un array con elementi
    diversi rispetto a quelli originari
    tramite l'applicazione di una logica)
    */

    // PRE TRANFORMATION
    numbers.map(number => console.log(number));

    /*
    restituisce un array della stessa dimensione
    rispetto a quello originario ma trasformato
    NEL CASO DELLA TRANSORMATION IL MAP RESTITUISCE
    UNA NUOVA OCCORRENZA DELLA STRUTTURA DATI
    */
    numbers = numbers.map(number => number * 2);

    // POST TRANSFORMATION
    numbers.map(number => console.log(number));

}

/*
SPREAD OPERATOR USATO PER MERGIARE
DUE STRUTTURE DATI
*/
function arrayMerge() {

    var letters1 = ['a', 'b', 'c'];
    var letters2 = ['d', 'e', 'f'];

    var letters3 = [...letters1, ...letters2];
    console.log(letters3);
    console.log(letters1);
    console.log(letters2);

}

/*
SPREAD OPERATOR PER CLONARE 
UNA STRUTTURA DATI
*/
function arrayCopy() {

    var books = ['book1', 'book2'];
    var booksNew = [...books];
    console.log(booksNew);


}

/*
MERGE TRA OGGETTI LIVE
TRAMITE OPERATORE SPREAD
*/
function objectMerge() {

    var object1 = {

        name: "Marco"

    }

    var object2 = {

        email: "mrossi@libero.it"
    }

    var object3 = { ...object1, ...object2 };
    console.log(object1);
    console.log(object2);
    console.log(object3);



}

/*
CLONAZIONE DI UN OGGETTO LIVE
TRAMITE OPERATORE SPREAD
*/
function objectCopy() {

    var object1 = {

        book: "bookX"

    }

    var object2 = { ...object1 };
    console.log(object1);
    console.log(object2);
}

/*
MERGE TRA DUE OGGETTI
UTILIZZANDO METODOLOGIA
Object assign (storica pre ECMA Script 6)
*/
function objectAssign() {

    var object1 = {

        name: "Marco"

    }

    var object2 = {

        email: "mrossi@libero.it"
    }

    /*
    In questo caso invocando il metodo di API
    Object assign si passano in input le
    reference agli Oggetti che si desiderano
    mergiare

    L'utilizzo del metodo assign può
    comportare dei side effects
    infatti assign altera la struttura
    del primo oggetto passato in input

    */
    var object3 = Object.assign(object1, object2);
    console.log(object1);
    console.log(object2);
    console.log(object3);


}

/*
DESTRUCTURING DI UN ARRAY
TRAMITE REST OPERATOR
*/
function arrayDestructuring(){

  /*
  L'utilizzo dell'operatore rest (...rest)
  viene interpretato dal Javascript Engine
  come un Array da strutturare con gli elementi
  che risultano dalla differenza con le occorrenze
  che lo precedono
  */
   var [letter1,letter2,...rest] = ['a','b','c','d','e'];
   console.log(letter1);
   console.log(letter2);
   console.log(...rest);


}

function setBuild(){

    var courses = new Set();
    courses.add("Java");
    courses.add("Java");
    courses.add("Angular");
    courses.add("React");

    console.log(courses.has("Angular"));
    console.log(courses.size);
    console.log(courses.keys());


}

/*
La Map Javascript viene
denominata Struttura
dati like-set in quanto
l'api Map espone dei metodi
uguali all'API Set:
has(); size; keys(); values()
has() controlla l'esistenza di una occorrenza per la Set, di una chiave per la Map;
size sia per la Set che per la Map restituisce la dimensione della struttura dati
keys() e values() per Set restituiscono entrambi i valori, 
mentre keys() per la Map restituisce le chiavi e values() restituisce i valori



*/
function setMap(){


    var courses = new Map();
    courses.set(1,"Java");
    courses.set(2,"Java");
    courses.set(3,"Angular");
    courses.set(4,"React");

    console.log(courses.has(1));
    console.log(courses.size);
    console.log(courses.keys());
    console.log(courses.values());

}

function setMapBuild(){

    var courses1 = new Set();
    courses1.add("Java");
    courses1.add("Angular");

    var courses2 = new Map();
    courses2.set(1,"React");
    courses2.set(2,"Spark");
    

    var courses = [courses1,...courses2];

    console.log(courses);

}

