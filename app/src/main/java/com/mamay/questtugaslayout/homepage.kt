package com.mamay.questtugaslayout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Homepage(
    modifier: Modifier = Modifier,
    nama: String,
    nim: String,
    daerah: String,
    warnaNama: Color,
    warnaNim: Color,
    warnaDaerah: Color,
    warnaCard: Color,
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 70.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
        ) {
            Text(
                text = stringResource(id = R.string.prodi),
                modifier = Modifier,
                fontFamily = FontFamily.Monospace,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )
            Spacer(
                modifier = Modifier.padding(10.dp)
            )
            Text(
                text = stringResource(id = R.string.univ),
                modifier = Modifier,
                fontFamily = FontFamily.Monospace,
                fontSize = 20.sp,
                letterSpacing = 0.1.sp
            )
            Column (modifier = Modifier.fillMaxWidth()
            ){
                templateCard(
                    nama = stringResource(id = R.string.nama1),
                    nim = stringResource(id = R.string.nim1),
                    daerah = stringResource(id = R.string.daerah1),
                    warnaCard = colorResource(id = R.color.coklatmuda),
                    warnaNama = colorResource(id = R.color.purple_700),
                    warnaNim = colorResource(id = R.color.mewrah),
                    warnaDaerah = colorResource(id = R.color.ijomuda),
                )
                templateCard(
                    nama = stringResource(id = R.string.nama2),
                    nim = stringResource(id = R.string.nim2),
                    daerah = stringResource(id = R.string.daerah2),
                    warnaCard = colorResource(id = R.color.purple_700),
                    warnaNama = colorResource(id = R.color.ping),
                    warnaNim = colorResource(id = R.color.teal_700),
                    warnaDaerah = colorResource(id = R.color.merah)
                )
                templateCard(
                    nama = stringResource(id = R.string.nama3),
                    nim = stringResource(id = R.string.nim3),
                    daerah = stringResource(id = R.string.daerah3),
                    warnaCard = colorResource(id = R.color.merah),
                    warnaNama = colorResource(id = R.color.ijo),
                    warnaNim = colorResource(id = R.color.krem),
                    warnaDaerah = colorResource(id = R.color.ijomuda)
                )
                templateCard(
                    nama = stringResource(id = R.string.nama4),
                    nim = stringResource(id = R.string.nim4),
                    daerah = stringResource(id = R.string.daerah4),
                    warnaCard = colorResource(id = R.color.mewrah),
                    warnaNama = colorResource(id = R.color.ijomuda),
                    warnaNim = colorResource(id = R.color.purple_200),
                    warnaDaerah = colorResource(id = R.color.biruabu)
                )
                Text(
                    text = stringResource(id = R.string.copy),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 150.dp),
                    textAlign = TextAlign.Center,
                    fontFamily = FontFamily.Monospace,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp
                )
            }
        }



    }
}