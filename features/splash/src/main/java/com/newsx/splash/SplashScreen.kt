package com.newsx.splash

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableLongStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.rememberLottieComposition
import kotlinx.coroutines.delay

@Composable
internal fun SplashScreenRoute(
    onCompletedTimer: () -> Unit
) {
    SplashScreen(
        onCompletedTimer = onCompletedTimer,
    )
}

@Composable
fun SplashScreen(onCompletedTimer: () -> Unit) {
    val delayDuration by remember { mutableLongStateOf(3000L) }

    LaunchedEffect(Unit) {
        delay(delayDuration)
        onCompletedTimer.invoke()
    }

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
    ) {

        val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.splash))

        LottieAnimation(
            composition,
            restartOnPlay = true,
            iterations = 10,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
        )

        Text(
            text = "NewsX",
            color = Color.White,
            fontSize = 34.sp,
            modifier = Modifier.align(Alignment.Center)
        )
    }
}


@Preview
@Composable
fun PreviewSplash() {
    SplashScreen({})

}



