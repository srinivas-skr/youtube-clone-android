package com.example.youtubeapp

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.viewinterop.AndroidView
import com.example.youtubeapp.ui.theme.YoutubeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            YoutubeAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    YoutubeWebView(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun YoutubeWebView(modifier: Modifier = Modifier) {
    AndroidView(
        modifier = modifier.fillMaxSize(),
        factory = { context ->
            WebView(context).apply {
                settings.javaScriptEnabled = true
                webViewClient = WebViewClient()
                loadUrl("https://www.google.com")
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    YoutubeAppTheme {
        YoutubeWebView()
    }
}
