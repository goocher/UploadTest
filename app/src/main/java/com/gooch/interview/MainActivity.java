package com.gooch.interview;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.webkit.JsPromptResult;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "111111111111111111";
    private WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button action = findViewById(R.id.btn_action);
        final AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this)
                .setTitle("12344555")
                .create();
        action.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialog.show();
            }
        });
        mWebView = new WebView(getApplicationContext());
        WebSettings settings = mWebView.getSettings();
        mWebView.setWebViewClient(new WebViewClient() {

        });
        mWebView.setWebChromeClient(new WebChromeClient() {
            @Override
            public boolean onJsPrompt(WebView view, String url, String message, String defaultValue, JsPromptResult result) {
                result.confirm("12");
                return super.onJsPrompt(view, url, message, defaultValue, result);
            }

        });
        Log.d(TAG, "onCreate: ==--------------------");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: ---------------");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: -------------------");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: -----------------");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: ------------------");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: ------------------");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ---------------------");
    }
}
