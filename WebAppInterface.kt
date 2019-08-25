package com.example.xenops_1

import android.content.Context
import android.webkit.JavascriptInterface
import android.widget.Toast

// Copyright (c) 2019 Leonid Titov, Mentions Highly Appreciated

class WebAppInterface(private val mContext: Context) {
    /** Show a toast from the web page  */
    @JavascriptInterface
    fun showToast(toast: String) {
        Toast.makeText(mContext, toast, Toast.LENGTH_SHORT).show()
        //  mAct.mWebView           // works
        //  MainActivity.mWebView2  // works

        (mContext as MainActivity).mWebView?.post {
            (mContext as MainActivity).mWebView?.evaluateJavascript("f1();") { retv ->
                Toast.makeText(mContext, retv, Toast.LENGTH_LONG).show()
            }
        }
    }
}
