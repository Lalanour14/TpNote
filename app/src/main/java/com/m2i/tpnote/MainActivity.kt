package com.m2i.tpnote



import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

import com.m2i.tpnote.screens.NoteScreen
import com.m2i.tpnote.screens.NoteScreenPreview
import com.m2i.tpnote.ui.theme.TpNoteTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           TpNoteTheme {
                // A surface container using the 'background' color from the theme
                NoteScreen(notes = emptyList(), onAddNote = {}, onRemoveNote = {})
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TpNoteTheme{
        NoteScreenPreview()

    }
}



