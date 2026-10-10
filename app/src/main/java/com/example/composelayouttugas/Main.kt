package com.example.composelayouttugas

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource

@Composable
fun ProfileCard(
    name: String,
    address: String,
    cardColor: Color,
    nameColor: Color,
    addressColor: Color,
    modifier: Modifier = Modifier,
    phone: String? = null,
    phoneColor: Color = Color.Unspecified,
    nameFontFamily: FontFamily? = null,
) {
    Card(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(dimensionResource(R.dimen.card_corner_radius)),
        colors = CardDefaults.cardColors(containerColor = cardColor)
    ) {
        Row(
            modifier = Modifier.padding(dimensionResource(R.dimen.card_padding)),
            verticalAlignment = Alignment.CenterVertically
        ) {
            CardLogo()
            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = dimensionResource(R.dimen.card_content_spacing))
            ) {
                Text(
                    text = name,
                    color = nameColor,
                    fontFamily = nameFontFamily,
                    fontWeight = FontWeight.Bold,
                    fontSize = textSizeResource(R.dimen.text_size_name)
                )
                if (phone != null) {
                    Text(
                        text = phone,
                        color = phoneColor,
                        fontSize = textSizeResource(R.dimen.text_size_detail)
                    )
                }
                Text(
                    text = address,
                    color = addressColor,
                    fontSize = textSizeResource(R.dimen.text_size_detail)
                )
            }
            CardLogo()
        }
    }
}

