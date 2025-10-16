//EJERCICIO 1
//Escribe una función que indique si un num positivo es par sin usar %

def espar(num:Int):Boolean =
  if (num==0 )then true
  else if (num==1) false
  else espar(num-2)

espar(2)
espar(7)

//EJERCICIO 2
//Una función que realice una potencia ddo una base y un exponente enteros y positivos

def potencia(base:Int,exponente:Int):Int=
  def potenciaAux(base:Int,exponente:Int, acum :Int):Int =
    //uso una funcion auxiliar con un acumulador donde voy guardando las multiplicaciones, por defecto en un inicio vale 1 
    if (exponente ==0) then acum
    else
      potenciaAux(base,exponente-1 , acum*base )
    
  //pone exp-1 ya que mete la base en acum entonces deja ya hecha una de las multiplicaciones de la potencia 
  if (exponente==0) then 1 else potenciaAux(base, exponente-1 , base )
  
  
//EJERCICIO 3
//funcion que escriba los numeros pares de 0 a N 
  
def suma0toN( n:Int):Int =
  def suma0toNAux(n:Int, acum :Int ):Int=
    if (n==0) then acum
    else suma0toNAux(n-2,n+acum)
    
  if (espar(n)==true) then suma0toNAux(n-2,n)
  else suma0toNAux(n-1,0)
  
//pruebas 
  
suma0toN (3)
suma0toN (4)
suma0toN(10)
suma0toN(13)

///EJERCICIO 4
//Una funcion que sume los enteros entres dos numeros a y b con a<b 
def sumaAtoB(a:Int,b:Int):Int=
  def sumaAtoBAux(a:Int, b:Int, acum:Int):Int=
    if (a==b) then
      acum
    else
      sumaAtoBAux(a,b-1,b+acum)

  sumaAtoBAux(a,b,0)

sumaAtoB(1,2)

//EJERCICIO 5
//Una función que diga el número de dígitos de un número dado
def numDigitos(n:Int):Int=
  def numDigitosAux(n:Int,acum:Int):Int=
    if (n<=9) then acum+1
    else
      numDigitosAux(n/10,acum+1)
  //aqui hago la funcion de n/10 que es quitarle el ultimo digito y de acumulador pongo el que ya hubiese + 1 (creo)


  if (n<0) then
    numDigitosAux(-n,0)
  else
    numDigitosAux(n,0)

numDigitos(1111)

//EJERCICIO 6
// una funcion que sume el número de digitos de un num dado

def SumaDigitos(n:Int):Int =
  def SumaDigitosaux(n:Int, acum: Int):Int =
    if n<10 then
      acum + 1
    else
      SumaDigitosaux(n/10, acum + (n%10) )

  if n<0 then
    SumaDigitosaux(-n,0)
  else
    SumaDigitosaux(n,0)

SumaDigitos(1111)


