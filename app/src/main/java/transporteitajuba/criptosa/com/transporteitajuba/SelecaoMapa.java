package transporteitajuba.criptosa.com.transporteitajuba;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

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
    }
}
