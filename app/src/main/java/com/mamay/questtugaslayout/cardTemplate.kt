package com.mamay.questtugaslayout

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun templateCard(
    nama: String,
    nim: String,
    daerah: String,
    warnaNama: Color,
    warnaNim: Color,
    warnaDaerah: Color,
    warnaCard: Color,
    modifier : Modifier = Modifier

) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(10.dp),
        shape = RoundedCornerShape(20.dp),
        colors = CardDefaults.cardColors(containerColor = warnaCard)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.umy),
                contentDescription = "logo umy",
                modifier = Modifier
                    .padding(end = 10.dp)
            )
            Column {
                Text(
                    text = nama,
                    color = warnaNama,
                    modifier = Modifier,
                    fontFamily = FontFamily.Monospace,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp
                )
                Text(
                    text = nim,
                    color = warnaNim,
                    modifier = Modifier,
                    fontFamily = FontFamily.Monospace,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp
                )
                Text(
                    text = daerah,
                    color = warnaDaerah,
                    modifier = Modifier,
                    fontFamily = FontFamily.Monospace,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp
                )
            }
            Image(
                painter = painterResource(id = R.drawable.umy),
                contentDescription = "logo umy",
                modifier = Modifier
                    .padding(start = 10.dp)
            )
        }
    }
}