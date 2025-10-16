//EJERCICIO 1

def quitarnprimeros[A](n:Int ,l:List[A]): List[A] =
  if n<=0 then
    l
  else l match
    case Nil=> throw new Exception(noSuchElementException)
    case h::t => quitarnprimeros(n-1,l.tail)

quitarnprimeros(5,List(1,2,3,4,5,6,7,8,9))

def dejarnprimeros[A](n:Int ,l:List[A]): List[A] =
  def dejaaux(n:Int ,l:List[A], res:List[A]):List[A]= (n,l) match
    //la _ ES UN COMIDIN VALE POR CUALQUIER COSA
    case (_, Nil) => res.reverse
    case(0,_) => res.reverse
    case(n, h::t) => dejaaux(n-1, t , h::res)

  if n<=0 then throw new IllegalArgumentException("bla")
  else

    dejaaux(n,l,Nil)

quitarnprimeros(5,List(1,2,3,4,5,6,7,8,9))

//EJERCICIO 2
//no es recursiva de cola
def seleccionar[A](lBool:List[Boolean],lBase:List[A]):List[A]= (lBool, lBase) match
  case (Nil, Nil)=> Nil
  case(Nil,_)| (_,Nil)=> throw new Error("Distinto num elementos")
  case(true::tBool, hBase::tBase) => hBase::seleccionar(tBool,tBase)
  case(false::tBool, hBase::tBase) => seleccionar(tBool,tBase)

seleccionar(List(true,false,true),List(1,2,3))

//ahora la hacemos recursiva de cola
def selec[A](lBool:List[Boolean],lBase:List[A]):List[A]=
  def selecAux(lBool:List[Boolean],lBase:List[A], temp:List[A]):List[A]= lBool match
    case Nil =>
      if lBase.isEmpty then
        temp.reverse //devuelvo el .reverse cuando llego la fina de la lista
      //caso que me faltaba
      else
        throw new Error ("no mismo num elem ")

    case hBool::tBool=>
      if lBase.isEmpty then
        throw new Error("No mismo num elem")
      else if hBool then
        selecAux(lBool.tail, lBase.tail , lBase.head::temp)
      else
        selecAux(lBool.tail, lBase.tail , temp )
  selecAux(lBool,lBase, Nil)

selec(List(false,false,true, true),List(1,2,3))
//no deberia funcionar por que la segunda es mas larga y ese caso realmente no le hemos contemplado
selec(List(false,false,true, true),List(1,2,3, 4))



//EJERCICIO 3 

def mezclarListas[A](l1: List[A], l2 :List[A] ): List[A] =
  def mezclarAux[A](l1: List[A], l2 :List[A], temp:List[A] ): List[A] =(l1,l2) match
    case(h1::t1, h2::t2)=> mezclarAux(t1,t2,h2::h1::temp)
    case (Nil, Nil)=> temp.reverse
    case(Nil, _)=> temp.reverse:::l2
    case(_, Nil)=> temp.reverse:::l1

  mezclarAux(l1,l2,Nil)

mezclarListas(List(1,3,5), List (2,4,6))
