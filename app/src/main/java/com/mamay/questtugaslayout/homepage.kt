package com.mamay.questtugaslayout

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Homepage(modifier: Modifier){
    Column(
        modifier = Modifier
    ) {
        Box(modifier = Modifier)
        {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 70.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
            ){
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
            }

        }
    }
}