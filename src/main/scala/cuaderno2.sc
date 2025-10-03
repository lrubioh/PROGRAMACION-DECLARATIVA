//RECURSIVA
def sumaMal(l:List[Int]):Int = l match
  case h :: t => h + sumaMal(t )
  case Nil => 0

//RECURSIVA DE COLA
def sumadecola(l:List[Int]):Int =
  def sumaAux(l: List[Int], acc: Int): Int= l match
    case h::t  => sumaAux(t, acc + h)
    case Nil =>  acc
  sumaAux(l,0)

//CON OTROS CASOS(solo funciona con listas pares, si es impar de error)

def sumapar(l: List[Int]): Int =
    def sumaAux(l: List[Int], acc: Int): Int = l match
      case el1 :: el2 :: t => sumaAux(t, acc + el1 + el2)
      case Nil => acc

    sumaAux(l, 0)

//Ahora añado otro caso para que funcione con impares

def sumalista(l: List[Int]): Int =
    def sumaAux(l: List[Int], acc: Int): Int = l match
      case el1 :: el2 :: t => sumaAux(t, acc + el1 + el2)
      case el1:: Nil => el1+ acc
      case Nil => acc

    sumaAux(l, 0 )


//probamos las funciones
    
sumaMal(List(1,2,3,4))
sumadecola(List(1, 2, 3, 4))
sumapar(List(1, 2, 3, 4))
sumalista(List(1, 2, 3, 4, 5))

