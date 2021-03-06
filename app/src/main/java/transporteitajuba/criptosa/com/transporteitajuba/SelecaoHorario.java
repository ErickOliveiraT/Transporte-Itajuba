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

public class SelecaoHorario extends Activity {

    //Lista de Linhas
    private ListView lstLinhas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selecao_horario);

        lstLinhas = (ListView) findViewById(R.id.listaLinhas);

        String[] linhas = {"L1 - Santa Rosa X Vila Isabel",
                "L2 - Cruzeiro X Santa Rosa",
                "L3 - Rebourgeon X Santa Rosa (via Rodovia)",
                "L4 - Santa Rosa X Rebourgeon (via Varginha)",
                "L5 - Jd. das Colinas X Sta Rosa (via Varginha)",
                "L6 - Jd. das Nações X Sta Rosa (via Rodovia)",
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
                "L18 - Rancho Grande X Mercado"};

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
                Intent it = new Intent(getApplicationContext(), horario1.class);
                switch (position) {
                    case 0:
                        it.putExtra("linha", "h1.pdf");
                        startActivity(it);
                        break;
                    case 1:
                        it.putExtra("linha", "h2.pdf");
                        startActivity(it);
                        break;
                    case 2:
                        it.putExtra("linha", "h3.pdf");
                        startActivity(it);
                        break;
                    case 3:
                        it.putExtra("linha", "h4.pdf");
                        startActivity(it);
                        break;
                    case 4:
                        it.putExtra("linha", "h5.pdf");
                        startActivity(it);
                        break;
                    case 5:
                        it.putExtra("linha", "h6.pdf");
                        startActivity(it);
                        break;
                    case 6:
                        it.putExtra("linha", "h7.pdf");
                        startActivity(it);
                        break;
                    case 7:
                        it.putExtra("linha", "h7b.pdf");
                        startActivity(it);
                        break;
                    case 8:
                        it.putExtra("linha", "h8.pdf");
                        startActivity(it);
                        break;
                    case 9:
                        it.putExtra("linha", "h9.pdf");
                        startActivity(it);
                        break;
                    case 10:
                        it.putExtra("linha", "h9b.pdf");
                        startActivity(it);
                        break;
                    case 11:
                        it.putExtra("linha", "h11a.pdf");
                        startActivity(it);
                        break;
                    case 12:
                        it.putExtra("linha", "h11b.pdf");
                        startActivity(it);
                        break;
                    case 13:
                        it.putExtra("linha", "h11c.pdf");
                        startActivity(it);
                        break;
                    case 14:
                        it.putExtra("linha", "h12.pdf");
                        startActivity(it);
                        break;
                    case 15:
                        it.putExtra("linha", "h13.pdf");
                        startActivity(it);
                        break;
                    case 16:
                        it.putExtra("linha", "h14.pdf");
                        startActivity(it);
                        break;
                    case 17:
                        it.putExtra("linha", "h15.pdf");
                        startActivity(it);
                        break;
                    case 18:
                        it.putExtra("linha", "h17.pdf");
                        startActivity(it);
                        break;
                    case 19:
                        it.putExtra("linha", "h18.pdf");
                        startActivity(it);
                        break;
                }
            }
        });



    }
}
