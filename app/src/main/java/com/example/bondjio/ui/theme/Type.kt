package com.example.bondjio.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.bondjio.R

val SFPro = FontFamily(
    Font(R.font.sf_regular, FontWeight.Normal),
    Font(R.font.sf_semibold, FontWeight.SemiBold),
    Font(R.font.sf_bold, FontWeight.Bold),
)

// Set of Material typography styles to start with
val Typography = Typography(
    // paragraph (text)
    bodyLarge = TextStyle(
        fontFamily = SFPro,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp, //12, 16, .5
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    ),

    // header #1
    titleLarge = TextStyle(
        fontFamily = SFPro,
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp, //24, 32, .15
        lineHeight = 32.sp,
        letterSpacing = 0.15.sp
    ),

    // subtitle
    labelLarge = TextStyle(
        fontFamily = SFPro,
        fontWeight = FontWeight.SemiBold,
        fontSize = 20.sp, // 20, 28, .15 // 14, 20, .1
        lineHeight = 28.sp,
        letterSpacing = 0.15.sp
    ),

    // subtitle (small)
    labelSmall = TextStyle(
        fontFamily = SFPro,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp, //16, 24, 0.5
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )

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