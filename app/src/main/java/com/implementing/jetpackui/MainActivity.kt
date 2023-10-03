package com.implementing.jetpackui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.google.relay.compose.BoxScopeInstance.columnWeight
import com.google.relay.compose.BoxScopeInstance.rowWeight
import com.implementing.jetpackui.cards.Cards
import com.implementing.jetpackui.cards.Design
import com.implementing.jetpackui.hellorelaywithbutton.HelloRelayWithButton
import com.implementing.jetpackui.samplecard.Samplecard
import com.implementing.jetpackui.ui.theme.UIJetpackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UIJetpackTheme {
                val scrollState = rememberScrollState()
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column(modifier = Modifier
                        .verticalScroll(state = scrollState)
                        .padding(15.dp)) {
                        HelloRelayWithButton(greeting = "Hello Brindha", modifier = Modifier.padding(10.dp))
                        HelloRelayWithButton(greeting = "Hello Satti", modifier = Modifier.padding(10.dp))
                        HelloRelayWithButton(greeting = "I'm Here ghuisfjksb", modifier = Modifier.padding(10.dp))


                        Samplecard(title ="First Card", description = "Description of first card", thumbnail = painterResource(id = R.drawable.apple),  modifier = Modifier.padding(10.dp))

                        Cards(title = "Hello",
                            description = "Happy Birthday",
                            date = "1-2-2002",
                            design = Design.ThirdCard,
                            thumbnail = painterResource(id = R.drawable.pillow),
                            modifier = Modifier.padding(bottom = 10.dp)
                        )
                        Cards(title = "Hello",
                            description = "Mothereh!",
                            date = "1-9-1970",
                            design = Design.ThirdCard,
                            thumbnail = painterResource(id = R.drawable.coffee),
                            modifier = Modifier.padding(bottom = 10.dp)
                        )

                    }
                }
            }
        }
    }
}



@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    UIJetpackTheme {

    }
}


