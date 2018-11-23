package transporteitajuba.criptosa.com.transporteitajuba;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class SelecaoMapa extends Activity {

    //Lista de Linhas
    private ListView lstLinhas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selecao_mapa);

        lstLinhas = (ListView) findViewById(R.id.listaLinhas);

        String[] linhas = {"L1 - Santa Rosa X Vila Isabel",
                "L2 - Cruzeiro X Santa Rosa",
                "L3 - Rebourgeon X Santa Rosa (via Rodovia)",
                "L4 - Santa Rosa X Rebourgeon (via Varginha)",
                "L5 - Jd. das Colinas X Sta Rosa (via Varginha)",
                "L6 - Jd. das Colinas X Sta Rosa (via Rodovia)",
                "L7A - Cafona X Cruzeiro (via Jd. das Colinas)",
                "L7B - Figueiras X Mercado",
                "L8 - Rebourgeon X Medicina (via Piedade)",
                "L9 - Rodoviaria X Ano Bom",
                "L9B - Goiabal X Rodoviaria",
                "L11A - Novo Horizonte X Sta Rosa (via Rodovia)",
                "L11B - Novo Horizonte X Sta Rosa (via Bahamas)",
                "L11C - Novo Horizonte X Sta Rosa (via Varginha)",
                "L12 - Mercado X Freire (via São Pedro)",
                "L13 - Mercado X Anhumas (via Medicina)",
                "L14 - Mecado X Barra (via Rio Manso)",
                "L15 - Água Limpa X Mercado",
                "L17 - Rebourgeon X Cruzeiro",
                "L18 - Rancho Grande X Mercado",
                "Todas as Linhas"};

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                linhas
        );
        lstLinhas.setAdapter(adaptador);

        lstLinhas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent it = new Intent(getApplicationContext(), mapa1.class);
                switch (position) {
                    case 0:
                        it.putExtra("mapa", "1.pdf");
                        startActivity(it);
                        break;
                    case 1:
                        it.putExtra("mapa", "2.pdf");
                        startActivity(it);
                        break;
                    case 2:
                        it.putExtra("mapa", "3.pdf");
                        startActivity(it);
                        break;
                    case 3:
                        it.putExtra("mapa", "4.pdf");
                        startActivity(it);
                        break;
                    case 4:
                        it.putExtra("mapa", "5.pdf");
                        startActivity(it);
                        break;
                    case 5:
                        it.putExtra("mapa", "6.pdf");
                        startActivity(it);
                        break;
                    case 6:
                        it.putExtra("mapa", "7.pdf");
                        startActivity(it);
                        break;
                    case 7:
                        it.putExtra("mapa", "7.pdf");
                        startActivity(it);
                        break;
                    case 8:
                        it.putExtra("mapa", "8.pdf");
                        startActivity(it);
                        break;
                    case 9:
                        Toast.makeText(getApplicationContext(), "Mapa indisponível no momento", Toast.LENGTH_LONG).show();
                        break;
                    case 10:
                        Toast.makeText(getApplicationContext(), "Mapa indisponível no momento", Toast.LENGTH_LONG).show();
                        break;
                    case 11:
                        it.putExtra("mapa", "11a.pdf");
                        startActivity(it);
                        break;
                    case 12:
                        it.putExtra("mapa", "11b.pdf");
                        startActivity(it);
                        break;
                    case 13:
                        it.putExtra("mapa", "11c.pdf");
                        startActivity(it);
                        break;
                    case 14:
                        Toast.makeText(getApplicationContext(), "Mapa indisponível no momento", Toast.LENGTH_LONG).show();
                        break;
                    case 15:
                        Toast.makeText(getApplicationContext(), "Mapa indisponível no momento", Toast.LENGTH_LONG).show();
                        break;
                    case 16:
                        Toast.makeText(getApplicationContext(), "Mapa indisponível no momento", Toast.LENGTH_LONG).show();
                        break;
                    case 17:
                        Toast.makeText(getApplicationContext(), "Mapa indisponível no momento", Toast.LENGTH_LONG).show();
                        break;
                    case 18:
                        it.putExtra("mapa", "17.pdf");
                        startActivity(it);
                        break;
                    case 19:
                        Toast.makeText(getApplicationContext(), "Mapa indisponível no momento", Toast.LENGTH_LONG).show();
                        break;
                    case 20:
                        it.putExtra("mapa", "completo.pdf");
                        startActivity(it);
                        break;
                }
            }
        });


    }
}
