package pildoras.app.compose.tutorialappone.views

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun BoxComposableView(){

    Column{

        Spacer(Modifier.height(35.dp))
        Box(modifier = Modifier.fillMaxSize()){

            Text(text = "Celda 1", modifier = Modifier.align(alignment = Alignment.TopStart))

            Text(text = "Celda 2", modifier = Modifier.align(alignment = Alignment.CenterStart))

            Text(text = "Celda 3", modifier = Modifier.align(alignment = Alignment.BottomStart))

        }

    }

}