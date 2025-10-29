package pildoras.app.compose.tutorialappone.views
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun MainView(){

    var targetX by remember { mutableStateOf(0.dp) }
    var targetY by remember { mutableStateOf(0.dp) }

    var squareSize by remember { mutableStateOf(50.dp) }

    // animaciones suaves hacia el objetivo
    val animatedX: Dp by animateDpAsState(targetValue = targetX)
    val animatedY: Dp by animateDpAsState(targetValue = targetY)

    var squareColor by remember { mutableStateOf(Color(0xFF1E88E5)) }

    // distancia que mueve cada pulsación
    val step = 40.dp

    val colors = listOf(
        Color(0xFF1E88E5), // azul
        Color(0xFFE53935), // rojo
        Color(0xFF43A047), // verde
        Color(0xFFFDD835), // amarillo
        Color(0xFF8E24AA), // morado
        Color(0xFFFF7043)  // naranja
    )

    Column( modifier = Modifier
        .fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(20.dp), // espacio entre filas
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.fillMaxWidth().height(500.dp).padding(top = 50.dp),
        ) {

            Box(
                modifier = Modifier
                    .offset(x = animatedX, y = animatedY)
                    .size(squareSize)
                    .background(squareColor)
            )
        }

        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.fillMaxWidth()
        ) {

            Box(modifier = Modifier.fillMaxSize()) {
                Column(
                    modifier = Modifier
                        .align(Alignment.BottomCenter)
                        .fillMaxWidth()
                        .padding(16.dp),
                    verticalArrangement = Arrangement.spacedBy(5.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    // boton UP
                    Button(
                        onClick = { targetY -= step },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 8.dp)
                    ) {
                        Text("Arriba")
                    }

                    // boton DOWN
                    Button(
                        onClick = { targetY += step },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 8.dp)
                    ) {
                        Text("Abajo")
                    }

                    // boton Left
                    Button(
                        onClick = { targetX -= step },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 8.dp)
                    ) {
                        Text("Izquierda")
                    }

                    // boton Right
                    Button(
                        onClick = { targetX += step },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 8.dp)
                    ) {
                        Text("Derecha")
                    }

                    // boton tamaño
                    Button(
                        onClick = { squareSize += 5.dp },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 8.dp)
                    ) {
                        Text("Increase Size")
                    }

                    // boton Color
                    Button(
                        onClick = {
                            val newColor = colors.filter { it != squareColor }.random()
                            squareColor = newColor },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 8.dp)
                    ) {
                        Text("Color")
                    }

                }
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun PreviewBottomFourButtonsRow() {
    MaterialTheme {
        Surface {
            MainView()
        }
    }
}