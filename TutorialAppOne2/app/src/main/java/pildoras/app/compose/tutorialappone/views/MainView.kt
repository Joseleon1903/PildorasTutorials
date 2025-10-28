package pildoras.app.compose.tutorialappone.views
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun MainView(
    buttonTexts: List<String> = listOf("Arriba", "Abajo", "Derecha", "Isquierda"),
    onClick: (index: Int) -> Unit = {}
){

    Column( modifier = Modifier
        .fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(20.dp), // espacio entre filas
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.fillMaxWidth().height(580.dp).padding(top = 50.dp),
        ) {


            Button(
                onClick = { },
                colors = ButtonDefaults.buttonColors(containerColor = Color.Blue),
                modifier =   Modifier.width(150.dp).height(150.dp),
                shape = RectangleShape
            ) {
                Text(text = "", color = Color.White)
            }

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
                    buttonTexts.forEachIndexed { index, text ->
                        Button(
                            onClick = { onClick(index) },
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 8.dp)
                        ) {
                            Text(text)
                        }
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
            MainView(onClick = { idx -> /* prueba: idx */ })
        }
    }
}