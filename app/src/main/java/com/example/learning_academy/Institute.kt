package com.example.learning_academy

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun InstituteScreen() {

    Card(modifier =Modifier.clip(MaterialTheme.shapes.medium)
        .padding(start = 40.dp, end = 40.dp)) {
        Column(modifier = Modifier.clip(RoundedCornerShape(topStart = 15.dp)))

        {
            Image(
                painter = painterResource(id = R.drawable.profile),
                contentDescription = null
            )
            Text(text = "This is the little description about our glorious institute .",
                style = MaterialTheme.typography.bodySmall)


        }
    }

}