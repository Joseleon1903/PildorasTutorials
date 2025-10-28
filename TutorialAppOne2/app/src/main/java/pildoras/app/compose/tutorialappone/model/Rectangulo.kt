package pildoras.app.compose.tutorialappone.model

class Rectangulo (var color: Int, var ancho:Int ,var alto :Int){

  // coordenadas
  var _x :Int = 0;
  var _y :Int = 0;

  // metodos para mover el rectangulos

  fun moverUp(){
    _y-=10;
  }

  /**
   *
   */
  fun moverDown(){
    _y+=10;
  }

  fun moverRight(){
    _x+=10;
  }

  fun moverLeft(){
    _x+=10;
  }

  fun incresedSize( nAncho:Int,  nAlto:Int){
    ancho=nAncho
    alto=nAlto
  }

}