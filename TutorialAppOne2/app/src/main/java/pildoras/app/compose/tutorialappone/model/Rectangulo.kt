package pildoras.app.compose.tutorialappone.model

import androidx.compose.animation.scaleOut
import androidx.compose.ui.graphics.Color

class Rectangulo (var color: Color, var ancho: Int, var alto: Int){

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
    println("execute incresedSize")
    ancho +=nAncho
    alto +=nAlto
    println("param: nAncho"+ ancho)
    println("param: nAlto"+ alto)
  }

  fun changeColor(){
    println("execute changeColor")
    if(color.equals(Color.Blue)){
      color= Color.White;
    }else{
      color = Color.Blue;
    }
  }

}