package transporteitajuba.criptosa.com.transporteitajuba;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity {

    //Imagens (botões) do Menu Principal
    private ImageView btnHorarios;
    private ImageView btnParadas;
    private ImageView btnMapas;
    private ImageView btnRota;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Capturando botões do menu
        btnHorarios = (ImageView) findViewById(R.id.imgHorario);
        btnParadas = (ImageView) findViewById(R.id.imgParadas);
        btnMapas = (ImageView) findViewById(R.id.imgMapas);
        btnRota = (ImageView) findViewById(R.id.imgRotas);

        //Listeners botões Menu
        btnHorarios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SelecaoHorario.class));
            }
        });
        btnMapas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SelecaoMapa.class));
            }
        });
        btnParadas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getApplicationContext(), mapa1.class);
                it.putExtra("mapa", "https://www.google.com/maps/d/embed?mid=1NofCdop56LvziM-sqLwMkwrlAAVwsulz");
                startActivity(it);
            }
        });
        btnRota.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //startActivity(new Intent(MainActivity.this, mapa1.class));
            }
        });
    }
}
