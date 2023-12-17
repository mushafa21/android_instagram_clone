package com.andiraapps.instagramclone.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.andiraapps.instagramclone.R


val sfUITextFamily = FontFamily(
    Font(R.font.sf_ui_text_regular, FontWeight.Normal),
    Font(R.font.sf_ui_text_medium, FontWeight.Medium),
    Font(R.font.sf_ui_text_bold, FontWeight.Bold),
)

val regular10 = TextStyle(
    fontFamily = sfUITextFamily,
    fontWeight = FontWeight.Normal,
    fontSize = 10.sp
)

val regular12 = TextStyle(
    fontFamily = sfUITextFamily,
    fontWeight = FontWeight.Normal,
    fontSize = 12.sp
)

val regular14 = TextStyle(
    fontFamily = sfUITextFamily,
    fontWeight = FontWeight.Normal,
    fontSize = 14.sp
)

val medium10 = TextStyle(
    fontFamily = sfUITextFamily,
    fontWeight = FontWeight.Medium,
    fontSize = 10.sp
)

val medium12 = TextStyle(
    fontFamily = sfUITextFamily,
    fontWeight = FontWeight.Medium,
    fontSize = 12.sp
)

val medium14 = TextStyle(
    fontFamily = sfUITextFamily,
    fontWeight = FontWeight.Medium,
    fontSize = 14.sp
)


val bold10 = TextStyle(
    fontFamily = sfUITextFamily,
    fontWeight = FontWeight.Medium,
    fontSize = 10.sp
)

val bold12 = TextStyle(
    fontFamily = sfUITextFamily,
    fontWeight = FontWeight.Medium,
    fontSize = 12.sp
)

val bold14 = TextStyle(
    fontFamily = sfUITextFamily,
    fontWeight = FontWeight.Medium,
    fontSize = 14.sp
)



// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = regular14
    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)