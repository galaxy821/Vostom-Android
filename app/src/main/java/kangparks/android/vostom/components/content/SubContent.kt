package kangparks.android.vostom.components.content

import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun SubContent(content : String, modifier : Modifier = Modifier){
    Box {
        Text(text = content, fontSize = 14.sp, fontWeight = FontWeight.Bold)
    }

}