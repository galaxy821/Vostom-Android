package kangparks.android.vostom.screens.learning

import android.util.Log
import androidx.activity.compose.BackHandler
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import kangparks.android.vostom.components.template.LearningLayoutTemplate
import kangparks.android.vostom.navigations.Content

@Composable
fun AddFileScreen(navController : NavHostController) {

    val pickAudioFile = rememberLauncherForActivityResult(contract = ActivityResultContracts.GetMultipleContents(), onResult = {
        Log.d("AddFileScreen", "onResult: $it")
    })

    BackHandler(enabled = true) { }

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ){
        LearningLayoutTemplate(
            mainContent = "학습에 도움되는 목소리 녹음 파일이 있으면 추가해 주세요!",
            nextButtonContent = "녹음 파일 추가 완료",
            nextButtonAction = {
                navController.navigate(Content.GuideFinishLearning.route)
            }, // 임시 이동
            othersOptionButtonContent = "추가할 파일이 없어요!",
            othersOptionButtonAction = {
                navController.navigate(Content.GuideFinishLearning.route)
            } // 임시 이동
        ){
            Button(onClick = {
                pickAudioFile.launch("audio/*")
            }) {
                Text(text = "녹음 파일 추가하기")
            }
        }
    }
}