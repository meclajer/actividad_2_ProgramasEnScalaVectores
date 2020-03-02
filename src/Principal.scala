import scala.util.Random
import scala.collection.mutable.ArrayBuffer

object Principal {
  def main(args: Array[String]): Unit = {

    // ============================================== PAGINA 17 ==============================================
    print("\n\n\t ====== PAGINA 17 ====== \n\n")
    print("\n\tSERVICIOS ESCOLARES\n\tPromedio de alumno\n")

    var servicioEscolares = Array(
      Array(60,89,90,100,0,59),
      Array(70,50,80,90,90,100),
      Array(100,100,100,100,100,100),
      Array(90,90,90,90,90,90)
    );

    //Para calculo de promedios parciales
    var promediosParciales = new Array[Double](4)
    var sumatoria: Double = 0
    var apuntadorParcial: Int = 0

    //para mostrar calificciones y calcular promedios parciales
    println("\n\tMatris de calificaciones:")
    for (e <- servicioEscolares){
      for (calif <- e){
        print(calif+" ")
        sumatoria = sumatoria + calif
      }
      sumatoria = (sumatoria / 6)
      promediosParciales(apuntadorParcial) = sumatoria
      sumatoria = 0
      apuntadorParcial = apuntadorParcial + 1
      println()
    }

    //Para calculo de promedio general
    var sumatoriaGeneral: Double = 0

    println("\nPromedios parciales: ")
    for (prom <- promediosParciales){
      print(prom+"  ")
      sumatoriaGeneral = sumatoriaGeneral + prom
    }
    sumatoriaGeneral = sumatoriaGeneral / 4

    //promedio por materia
    print("\n\nPromedio de parcial:\n")
    for (posicion <- 0 to 3){
      print(
            ( servicioEscolares(posicion)(0) + servicioEscolares(posicion)(1) + servicioEscolares(posicion)(2) + servicioEscolares(posicion)(3) )/4 +"  "
            )
    }

    //Promedio genelar
    print("\n\nPromedio general: \n"+sumatoriaGeneral+"\n\n")

    // ============================================== PAGINA 18 ==============================================
    print("\n\n\t ====== PAGINA 18 ====== \n\n")

    var temperaturasHora = new Array[Int](48)
    var hora:Int = 0

    for (posicion <- 0 to 47){
      if( posicion%2 == 0 ){
        temperaturasHora(posicion) = hora
        hora = hora + 1
      } else {
        temperaturasHora(posicion) = Random.nextInt(50)
      }
    }

    //Mostrar registro
    for (p <- temperaturasHora){
      print(p+" | ")
    }

    //vector dinamico para almacenar horas coincidentes
    var mach = new ArrayBuffer[Int]()

    //Mostrar temperaturas y horas en que coincidan
    print("\n\nHoras que coinciden con 25°: \n")
    for (posicion <- temperaturasHora){
      if(temperaturasHora(posicion) == 25){
        print("Hora: "+temperaturasHora(posicion-1)+". Temperatura: "+temperaturasHora(posicion))
        mach += temperaturasHora(posicion-1)
        mach += temperaturasHora(posicion)
      }
    }

    //Mostrar registro de mach's
    print("\nHoras mach")
    for (p <- mach){
      print(p+" | ")
    }


  }
}
