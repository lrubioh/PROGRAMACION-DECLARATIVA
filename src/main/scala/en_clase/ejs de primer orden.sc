//EJERCICIO 1 
def sumaFunAtoB(f: Int => Int, a: Int, b:Int ):Int =
  def aux(f:Int=>Int, a:Int , b:Int ,acc:Int):Int =
    if a>b then
      acc
      
    else
      aux(f, a+1,b , acc+f(a))
      
  aux(f,a,b,0) 
  
def inc(x:Int): Int = x+1

sumaFunAtoB(x=>x+2,1,3)


//otro ej creo
def sumaFiltAtoB(f: Int => Boolean, a: Int, b:Int ):Int =
  def aux(f:Int=>Boolean, a:Int , b:Int ,acc:Int):Int =
    if a>b then
      acc

    else
      if f(a) then 
        aux(f, a+1,b , acc+a)
      else 
        aux(f, a + 1, b, acc )

  aux(f,a,b,0)


def espar(x: Int):Boolean = (x%2)==0
sumaFiltAtoB(x=>x%10==3,1,5)

