package com.example.composelayouttugas

import androidx.annotation.DimenRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit

@Composable
fun MainScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(colorResource(R.color.screen_background))
            .systemBarsPadding()
            .padding(dimensionResource(R.dimen.screen_padding)),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(R.string.title_jurusan),
            color = colorResource(R.color.text_title),
            fontWeight = FontWeight.Bold,
            fontSize = textSizeResource(R.dimen.text_size_title)
        )
        Text(
            text = stringResource(R.string.title_kampus),
            color = colorResource(R.color.text_title),
            fontWeight = FontWeight.Bold,
            fontSize = textSizeResource(R.dimen.text_size_subtitle)
        )
        Spacer(modifier = Modifier.height(dimensionResource(R.dimen.header_spacing)))

        Column(
            verticalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.card_spacing))
        ) {
            ProfileCard(
                name = stringResource(R.string.name_bambang),
                address = stringResource(R.string.address_bambang),
                cardColor = colorResource(R.color.card_gray),
                nameColor = colorResource(R.color.text_white),
                addressColor = colorResource(R.color.text_yellow),
                nameFontFamily = FontFamily.Cursive
            )
            ProfileCard(
                name = stringResource(R.string.name_gibran),
                phone = stringResource(R.string.phone_gibran),
                address = stringResource(R.string.address_gibran),
                cardColor = colorResource(R.color.card_purple),
                nameColor = colorResource(R.color.text_white),
                phoneColor = colorResource(R.color.text_cyan),
                addressColor = colorResource(R.color.text_yellow)
            )
            ProfileCard(
                name = stringResource(R.string.name_arya),
                phone = stringResource(R.string.phone_arya),
                address = stringResource(R.string.address_arya),
                cardColor = colorResource(R.color.card_blue),
                nameColor = colorResource(R.color.text_white),
                phoneColor = colorResource(R.color.text_cyan),
                addressColor = colorResource(R.color.text_white)
            )
            ProfileCard(
                name = stringResource(R.string.name_syahjehan),
                phone = stringResource(R.string.phone_syahjehan),
                address = stringResource(R.string.address_syahjehan),
                cardColor = colorResource(R.color.card_green),
                nameColor = colorResource(R.color.text_white),
                phoneColor = colorResource(R.color.text_cyan),
                addressColor = colorResource(R.color.text_white)
            )
        }
        Spacer(modifier = Modifier.weight(1f))

        Text(
            text = stringResource(R.string.footer_copyright),
            color = colorResource(R.color.text_title),
            fontSize = textSizeResource(R.dimen.text_size_footer)
        )
    }
}