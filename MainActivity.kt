package com.example.xenops_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.webkit.WebView
import kotlinx.android.synthetic.main.activity_main.*

// Copyright (c) 2019 Leonid Titov, Mentions Highly Appreciated

class MainActivity : AppCompatActivity() {
    private val mHandler = Handler()
    private val WV_Startup_Show = Runnable {
        L1.visibility = View.INVISIBLE
        L2.visibility = View.INVISIBLE
        WV1.visibility = View.VISIBLE
    }

    var mWebView: WebView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        supportActionBar?.setDisplayHomeAsUpEnabled(false)

        mWebView = WV1
        mWebView2 = WV1

        hide()

        mHandler.removeCallbacks(WV_Startup_Show)
        mHandler.postDelayed(WV_Startup_Show, 5432)

        WV1.settings.javaScriptEnabled = true
        WV1.loadUrl("file:///android_asset/index.html")

        var mWAI = WebAppInterface(this, this)
        WV1.addJavascriptInterface(mWAI, "Android")
    }

    private fun hide() {
        // Hide UI first
        supportActionBar?.hide()

        // Hide UI first
        supportActionBar?.hide()

        FS1.systemUiVisibility =
            View.SYSTEM_UI_FLAG_LOW_PROFILE or
                    View.SYSTEM_UI_FLAG_FULLSCREEN or
                    View.SYSTEM_UI_FLAG_LAYOUT_STABLE or
                    View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY or
                    View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION or
                    View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
    }
    companion object {
        var mWebView2: WebView? = null

    }
}

