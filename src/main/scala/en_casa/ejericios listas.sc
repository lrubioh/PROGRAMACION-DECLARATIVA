//EJERCICIO 1
"preguntar al profe si esta bien y si es recursiva de cola"
//Una función último que devuelva el último elemento de una lista

def ultimo(l:List[Int]):Int= l match
  case Nil => throw new NoSuchElementException()
  //caso en el que solamente haya un elemento
  //x::Nil indica que la lista tiene un solo elemento
  case x::Nil =>  x
  // h::t, h es un elemento(el primero)(cabeza) y t es una lista que lo sigue(cola)
  case h::t => ultimo(t)

ultimo(List(3, 4, 5, 6))
ultimo(List( ))
ultimo(List(3))


//EJERCICIO 2
//Una funcion penultimo que devuelva el penultimo elemento y me devuelva una excepcion si este no existe

def penultimo(l:List[Int]):Int= l match
  case Nil => throw new NoSuchElementException()
  case x::_::Nil => x
  case h::t => penultimo(t)

penultimo(List(1,2,3,4))

//EJERCICIO 3
//Una funcion kesimo que me devuelva el kesimo elemento de una lista y lance una excepcion si no existe

def kesimo(k:Int, l:List[Int]):Int =
  if (l== Nil) then
    throw new NoSuchElementException()
  else if (k==1)
    l.head //me devuelve la cabeza de la lista
  else
    kesimo(k-1, l.tail)

kesimo(2,List(1,2,3))
kesimo(5,List(1,2,3))
kesimo(3,List(1,2,3,5,6,7,8,9))

//intento de hacerlo con match (creo que está bien)
"preguntar al profe que diferencia hay entre hacerlo con el if y con el match"

def kesimocases(k:Int, l:List[Int]):Int = l match
  case Nil => throw new NoSuchElementException()
  case h::t => if(k==1) then h else kesimocases(k-1,t)

kesimocases(2,List(1,2,3))
kesimocases(5,List(1,2,3))
kesimocases(3,List(1,2,3,5,6,7,8,9))

//EJERCICIO 4
//Una función longitud que devuelve el número de elementos de una lista

def longitud (l:List[Int]):Int =
  def longitudAux (l:List[Int], acum:Int):Int= l match
    case Nil => acum
    case h::t => longitudAux(t, acum+1 )

  longitudAux(l,0)

longitud(List(1,2,3,4))
longitud(List(1,2,3,4,5,6,7,8))
longitud(List())
longitud(List(1))
longitud(List(1,2,3,4,4,5,6,7,8,9,7,6,6,6,4,3,2,1,1,2,4,5))

//EJERCICIO 5
//Una función delreves que de la vuelta a una lista
"preguntar al profe si esta bien y para que usa el el resto si en realidad es lo mismo que la lista l(se va reduciendo"
"con las vueltas de la funcion h::t"
def delreves(l:List[Int]) : List[Int]=
  def delrevesaux(l:List[Int],ltemp:List[Int]) : List[Int]= l match
    case Nil=> ltemp
    case h::t => delrevesaux(t,h::ltemp)

  delrevesaux(l,Nil)

delreves(List(1,2,3,4))
delreves(List(1,2,3,4,6,7))
delreves(List(1))
delreves(List())

//EJERCICIO 6
//es palindromo que verifique si una lista es un palindromo es decir si la lista y la lista al reves son iguales
def espalindromo(l:List[Int]):Boolean =
  l==delreves(l)

espalindromo(List(1,2,3,4))
espalindromo(List(1,2,2,1))