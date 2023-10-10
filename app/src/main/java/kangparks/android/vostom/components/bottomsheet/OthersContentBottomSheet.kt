package kangparks.android.vostom.components.bottomsheet

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.BottomSheetScaffold
import androidx.compose.material3.BottomSheetScaffoldState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.rememberBottomSheetScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import drawVerticalScrollbar
import kangparks.android.vostom.components.content.OthersContentList

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OthersContentBottomSheet(
    bottomSheetScaffoldState : BottomSheetScaffoldState = rememberBottomSheetScaffoldState()
) {

    val scrollState = rememberScrollState()

    BottomSheetScaffold(
        sheetShadowElevation = 10.dp,
        scaffoldState = bottomSheetScaffoldState,
        sheetContent = {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(600.dp)
                    .padding(horizontal = 20.dp)
                    .drawVerticalScrollbar(scrollState)
                    .verticalScroll(scrollState),
                horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.Top
            ) {
                OthersContentList()
            }
        },
        sheetPeekHeight = 120.dp,
        sheetSwipeEnabled = true
    ) {}


}