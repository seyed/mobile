package com.presentter.presentter_web

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val webView =  WebView(this)
        wClient(webView, "https://presentter.com")
        setContentView(webView)
    }

    private fun wClient(w: WebView, url: String){
        w.setWebViewClient(WebViewClient())
        w.loadUrl(url)
    }

}
