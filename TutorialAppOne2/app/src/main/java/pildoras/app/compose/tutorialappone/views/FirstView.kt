package pildoras.app.compose.tutorialappone.views

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalProvider
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun FirstView(){


    Column() {

        Spacer(Modifier.height(35.dp))

        Row{

            Text( text = "Nombre de usuario: Mario ")

            Spacer(Modifier.width(5.dp))

            Text( text = "Location: Dominicana")
        }

        Column(modifier = Modifier.fillMaxSize()) {

            Spacer(Modifier.height(15.dp))

            Text( text = "Estoy en una columna primero..")

            Text( text = "Estoy en una columna despues..")

        }


    }



}



@Preview(showBackground = true)
@Composable
fun PreviewFirstView() {
    MaterialTheme {
        Surface {
            FirstView()
        }
    }
}