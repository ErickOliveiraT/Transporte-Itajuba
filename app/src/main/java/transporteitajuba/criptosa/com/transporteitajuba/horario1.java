package transporteitajuba.criptosa.com.transporteitajuba;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class horario1 extends Activity {

    private PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horario1);

        pdfView = (PDFView) findViewById(R.id.pdf);

        //Pega a intent de outra activity
        Intent it = getIntent();

        //Recuperei a string da outra activity
        String horario = it.getStringExtra("linha");

        pdfView.fromAsset(horario).load();
    }
}
