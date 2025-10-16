//EJERCICIO 1
def ultimo (l:List[Int]): Int =



ultimo(List(3,4,5,6))
//EJERCICIO 2




//EJERCICIO 3

def k_esimo( l:List[Int], k:Int ) :Int =
  if (l == Nil) then
    throw new NoSuchElementException()
  else if (k ==1) then
    l.head
  else
    k_esimo(l.tail,k-1)

k_esimo(List(1,2,3,4),3)

//EJERCICIO 4
//esta regular no es recursiva de cola


//recursiva de cola
def longuitud(l:List[Int]) : Int=
    def aux(l:List[Int], cont:Int ):Int = l match
        case  Nil=> cont
        case h ::t => aux(t , cont+1)

    aux(l,0)

longuitud (List(1,2,3,4))

//EJERCICIO 5
//da la vuelta a la cadena
def delreves(l:List[Int]) : List[Int]=
    def aux(resto:List[Int], temp: List[Int] ):List[Int] = resto match
        case  Nil=> temp
        case h ::t => aux(t , h::temp)

    aux(l,Nil)

delreves (List(1,2,3,4))

//EJERCICIO 6

def palindromo (l: List[Int]):Boolean = l == delreves(l)

palindromo(List(1,2,1))

