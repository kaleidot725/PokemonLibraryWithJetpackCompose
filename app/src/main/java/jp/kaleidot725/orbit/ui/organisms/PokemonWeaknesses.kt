package jp.kaleidot725.orbit.ui.organisms

import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import jp.kaleidot725.orbit.R
import jp.kaleidot725.orbit.ui.molecules.PokemonWeakness

@Composable
fun PokemonWeaknesses(weaknesses: List<String>, modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text(
            text = stringResource(R.string.weakness_title),
            style = MaterialTheme.typography.h5,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(16.dp))

        Row {
            weaknesses.forEach { weakness ->
                PokemonWeakness(weakness = weakness, modifier = Modifier.padding(end = 8.dp))
            }
        }
    }
}

@Preview
@Composable
private fun PokemonWeaknesses_Preview() {
    PokemonWeaknesses(
        weaknesses = listOf("ABCD", "BCDE", "CDEF"),
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
    )
}