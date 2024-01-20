package com.compose.tastebook.cards

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.compose.tastebook.R
import com.compose.tastebook.data.TasteData
import com.compose.tastebook.ui.theme.TasteBookTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TasteCard(data: TasteData) {
    TasteBookTheme {
        ElevatedCard(
            onClick = { /* TODO */ },
            elevation = CardDefaults.cardElevation(
                defaultElevation = 3.dp,
                pressedElevation = 2.dp
            ),
            colors = CardDefaults.elevatedCardColors(
                containerColor = MaterialTheme.colorScheme.surface,
                contentColor = MaterialTheme.colorScheme.onSurface,
            )
        ) {
            Column {
                Image(
                    painter = painterResource(id = R.drawable.dragon),
                    contentDescription = "Image of taste",
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier.height(100.dp)
                )
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(7.dp)
                ) {
                    Text(
                        text = data.title,
                        style = TextStyle(
                            fontSize = 14.sp,
                            fontFamily = FontFamily(Font(R.font.raleway)),
                            fontWeight = FontWeight(400),
                            color = MaterialTheme.colorScheme.onSurface,
                            letterSpacing = 0.42.sp,
                        )
                    )
                    Text(
                        text = data.date,
                        style = TextStyle(
                            fontSize = 8.sp,
                            fontFamily = FontFamily(Font(R.font.raleway)),
                            fontWeight = FontWeight(400),
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            letterSpacing = 0.56.sp,
                        )
                    )
                    Row(
                        modifier = Modifier.padding(2.dp),

                    ) {
                        for(image in 1..data.rating ) {
                            Image(
                                imageVector = ImageVector.vectorResource(id = R.drawable.ic_filled_star),
                                contentDescription = "Filled star",
                                contentScale = ContentScale.None
                            )
                        }
                        for(image in data.rating + 1..5) {
                            Image(
                                imageVector = ImageVector.vectorResource(id = R.drawable.ic_empty_star),
                                contentDescription = "Empty star",
                                contentScale = ContentScale.None
                            )

                        }
                    }
                }
            }
        }
    }
}