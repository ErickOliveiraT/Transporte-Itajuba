package transporteitajuba.criptosa.com.transporteitajuba;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.github.barteksc.pdfviewer.PDFView;

public class mapa1 extends Activity {

    private WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa1);

        //Pega a intent de outra activity
        Intent it = getIntent();

        //Recuperei a string da outra activity
        String mapa = it.getStringExtra("mapa");

        web = (WebView) findViewById(R.id.Webview);

        WebSettings webSettings = web.getSettings(); //<<-- Retorna configurações
        webSettings.setJavaScriptEnabled(true); //<-- Ativa o javascript da webview

        web.loadUrl(mapa);
    }
}
