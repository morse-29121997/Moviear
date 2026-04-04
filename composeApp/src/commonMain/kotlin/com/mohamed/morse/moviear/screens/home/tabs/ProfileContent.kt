package com.mohamed.morse.moviear.screens.home.tabs

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mohamed.morse.moviear.theme.Colors
import moviear.composeapp.generated.resources.Res
import moviear.composeapp.generated.resources.credit_card_outline
import moviear.composeapp.generated.resources.me
import moviear.composeapp.generated.resources.morse
import moviear.composeapp.generated.resources.notification
import moviear.composeapp.generated.resources.outline_lock
import moviear.composeapp.generated.resources.privacy_tip_outline
import moviear.composeapp.generated.resources.profile_bg
import moviear.composeapp.generated.resources.profile_light
import moviear.composeapp.generated.resources.question_mark_circle_outline
import moviear.composeapp.generated.resources.tabler_circle_letter
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview



@Preview
@Composable
fun ProfileContent() {
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(resource = Res.drawable.profile_bg),
            contentDescription = null,
            modifier = Modifier.fillMaxWidth().height(200.dp),
            contentScale = ContentScale.FillBounds
        )

        Box(
            Modifier.padding(top = 100.dp).size(150.dp)
                .background(Colors.FontColors.black, shape = CircleShape)
                .align(Alignment.TopCenter)
        )

        Image(
            painter = painterResource(resource = Res.drawable.me),
            contentDescription = null,
            modifier = Modifier.padding(top = 120.dp).size(120.dp)
                .align(Alignment.TopCenter),
            contentScale = ContentScale.FillBounds
        )
        Column(modifier = Modifier.fillMaxWidth().align(Alignment.TopCenter)) {

            Text(
                "Account",
                color = Colors.FontColors.white,
                modifier = Modifier.padding(horizontal = 10.dp).padding(top = 250.dp),
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp
            )

            SettingBox(
                arrayListOf(
                    Option(Res.drawable.profile_light, "Edit Profile"),
                    Option(Res.drawable.outline_lock, "Security"),
                    Option(Res.drawable.notification, "Notifications"),
                    Option(Res.drawable.privacy_tip_outline, "Privacy"),
                )
            )

            Text(
                "Support & About",
                color = Colors.FontColors.white,
                modifier = Modifier.padding(horizontal = 10.dp).padding(top = 20.dp),
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp
            )

            SettingBox(
                arrayListOf(
                    Option(Res.drawable.credit_card_outline, "My Subscribtion"),
                    Option(Res.drawable.question_mark_circle_outline, "Help & Support"),
                    Option(Res.drawable.tabler_circle_letter, "Terms & Policies"),
                )
            )

        }

    }
}

data class Option(
    val icon: DrawableResource,
    val name: String
)

@Composable
fun SettingBox(options: List<Option>) {
    Column(
        modifier = Modifier.fillMaxWidth().padding(10.dp)
            .background(
                color = Colors.FontColors.white.copy(alpha = 0.1f),
                shape = RoundedCornerShape(15.dp)
            )
    ) {
        options.onEach {

            Row(modifier = Modifier.fillMaxWidth().padding(10.dp)) {

                Image(
                    painter = painterResource(resource = it.icon),
                    contentDescription = null,
                    modifier = Modifier.size(25.dp),
                )

                Text(
                    it.name,
                    color = Colors.FontColors.white.copy(alpha = 0.8f),
                    modifier = Modifier.padding(start = 10.dp),
                    fontWeight = FontWeight.Medium,
                    fontSize = 12.sp
                )

            }
        }
    }
}