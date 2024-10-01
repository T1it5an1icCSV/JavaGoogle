package com.example.java7;

import android.graphics.Bitmap;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class webViewClient extends WebViewClient {
//Сохраняет ссылку на ProgressBar (progressBar).
    private ProgressBar progressBar;

    public webViewClient(ProgressBar progressBar) {
        this.progressBar = progressBar;
    }
//onPageStarted(WebView view, String url, Bitmap favicon):Вызывается при начале загрузки страницы.
    @Override
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        //Отображает ProgressBar (progressBar.setVisibility(View.VISIBLE)).
        progressBar.setVisibility(View.VISIBLE);
        super.onPageStarted(view, url, favicon);
    }
//• onPageFinished(WebView view, String url):Вызывается по завершении загрузки страницы.
    @Override
    public void onPageFinished(WebView view, String url) {
        //* Скрывает ProgressBar (progressBar.setVisibility(View.GONE)).
        progressBar.setVisibility(View.GONE);
        super.onPageFinished(view, url);
    }
}
