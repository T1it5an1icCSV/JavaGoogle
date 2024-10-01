package com.example.java7;

import android.os.Bundle;
import android.webkit.WebView;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    //Получает ссылки на WebView (webView) и ProgressBar (progressBar).
    WebView webView;
    ProgressBar progressBar;
    String url = "https://www.google.com";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = findViewById(R.id.web_view);
        progressBar = findViewById(R.id.progress_bar);

//Устанавливает webViewClient для webView, который будет обрабатывать загрузку веб-страницы.
        webView.setWebViewClient(new webViewClient(progressBar));
//Загружает страницу по URL (url).
        webView.loadUrl(url);
//Включает поддержку JavaScript в webView.
        webView.getSettings().setJavaScriptEnabled(true);
    }
}
//MainActivity передает ссылку на ProgressBar в webViewClient.
//webViewClient использует эту ссылку для управления видимостью
//ProgressBar во время загрузки страницы