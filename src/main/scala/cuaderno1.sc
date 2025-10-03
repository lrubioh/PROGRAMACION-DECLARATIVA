//FORMA RECURSIVA
def suma0toN_mal(n:Int): Int =
  if (n == 0) then
    0
  else {
    n + suma0toN_mal(n - 1)
  }

suma0toN(4)

//FORMA RECURSIVA CON RECURSION DE COLA
def suma0toN(n:Int): Int=
  def sumaAux(n: Int, acc: Int): Int=
    if (n==0) then acc
    else sumaAux(n-1, acc + n)

  if n>0 then
    sumaAux(n,0)
  else
    0

suma0toN(100000)

//EJERCICIO 1
def esPar(n:Int): Boolean =
  if n == 0 then
    true
  else if n == 1 then
    false
  else
    esPar(n-2)

esPar(3)
esPar(12)

//EJERCICIO 2
//Opcion 1
def potencia(base: Int, exp: Int): Int=
  def potenciaAux(base: Int, exp: Int, acum: Int): Int =
    if exp == 0 then
      acum
    else
      potenciaAux(base, exp-1, acum * base)

  if exp == 0 then 1 else potenciaAux(base, exp-1, base)

potencia(3,0)
potencia(2,2)

//Opcion 2
def potencia2(base: Int, exp: Int): Int=
  def potenciaAux2(base: Int, exp: Int, acum: Int): Int =
    if exp == 0 then
      acum
    else
      potenciaAux2(base, exp-1, acum * base)

  potenciaAux2(base, exp, 1)

potencia(3,3)

//EJERCICIO 3
def suma0toNpar(n:Int): Int=
  def sumaAuxpar(n: Int, acc: Int): Int=
    if (n==0) then acc
    else
      if(n % 2 == 0)
        sumaAuxpar(n-1, acc + n)
      else
        sumaAuxpar(n-1, acc)

  if n>0 then
    sumaAuxpar(n,0)
  else
    0

  //EJERCICIO 4
  def sumaAtoB(a:Int, b:Int):Int =
    def sumaAtoBaux(a:Int, b:Int, acum: Int): Int =
      if a == b then
        acum
      else
        sumaAtoBaux(a, b-1, acum+b)

    sumaAtoBaux(a,b,0)

  sumaAtoB(1,2)

//EJERCICIO 5
def numDigitos(n:Int):Int =
  def numDigitosaux(n:Int, acum: Int):Int =
    if n<10 then
      acum + 1
    else
      numDigitosaux(n/10, acum + 1)

  if n<0 then
    numDigitosaux(-n,0)
  else
    numDigitosaux(n,0)

numDigitos(1111)


//EJERCICIO 6
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

numDigitos(1111)