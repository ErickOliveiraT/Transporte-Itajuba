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
                Intent it = new Intent(getApplicationContext(), mapa1.class);
                String link = "https://www.google.com/maps/d/embed?mid=";
                switch (position) {
                    case 0:
                        link += "1Ebd6t4wgoAL9ut1sro7XerRi0ceWf3u3";
                        it.putExtra("mapa", link);
                        startActivity(it);
                        break;
                    case 1:
                        link += "1sHe22V-RqzffeD_cOxOzzybil2LQnIHb";
                        it.putExtra("mapa", link);
                        startActivity(it);
                        break;
                    case 2:
                        link += "1XJ8SFwrGgL-ld6k869_r7_BbTaFAcRTf";
                        it.putExtra("mapa", link);
                        startActivity(it);
                        break;
                    case 3:
                        link += "13C1cGttidJXzKunsnNFSpI4hI1D8h1h2";
                        it.putExtra("mapa", link);
                        startActivity(it);
                        break;
                    case 4:
                        link += "1QXBMa6-tkaryldc60UoWTwo6AfQL7zti";
                        it.putExtra("mapa", link);
                        startActivity(it);
                        break;
                    case 5:
                        link += "1deH30LIYhKXI4kM3m9wjeo_gHCo0C7Lv";
                        it.putExtra("mapa", link);
                        startActivity(it);
                        break;
                    case 6:
                        link += "1urOuFF8AS3iwvPujDHYxaohcnAZkponr";
                        it.putExtra("mapa", link);
                        startActivity(it);
                        break;
                    case 7:
                        link += "11uaGrjOAVi84PCs9aMAAlxqAhkYr1Kvl";
                        it.putExtra("mapa", link);
                        startActivity(it);
                        break;
                    case 8:
                        link += "1TRuEHYS_r1FnW6qAlDTF6n7b6UeNWwzJ";
                        it.putExtra("mapa", link);
                        startActivity(it);
                        break;
                    case 9:
                        link += "1sK_DwY-kD8i7Ah1e-FEc_K4FWtRWggme";
                        it.putExtra("mapa", link);
                        startActivity(it);
                        break;
                    case 10:
                        link += "1wVpMUmcJ-m8GjNDeUAtJyPnVgHHXf49r";
                        it.putExtra("mapa", link);
                        startActivity(it);
                        break;
                    case 11:
                        link += "1BPnr_XPJqfnXqfLEPd5fy34FmpFGFLiA";
                        it.putExtra("mapa", link);
                        startActivity(it);
                        break;
                    case 12:
                        link += "1yISKYDcht9S6QNvOAys45U9wLhHUJbtM";
                        it.putExtra("mapa", link);
                        startActivity(it);
                        break;
                    case 13:
                        link += "1GgI7rNp0c9ZIvFIV3uv1TurPAV_l7c4V";
                        it.putExtra("mapa", link);
                        startActivity(it);
                        break;
                    case 14:
                        link += "17mdfgcwJvWUm16bgNREvoTflyALkLoK8";
                        it.putExtra("mapa", link);
                        startActivity(it);
                        break;
                    case 15:
                        link += "1du3JpYs88G9_QABK0mWTzBXHEuHlMgkt";
                        it.putExtra("mapa", link);
                        startActivity(it);
                        break;
                    case 16:
                        link += "1WbMSZhxHnC78fJni8iN_02hjPCzyJaN7";
                        it.putExtra("mapa", link);
                        startActivity(it);
                        break;
                    case 17:
                        Toast.makeText(getApplicationContext(), "Mapa indisponível no momento", Toast.LENGTH_LONG).show();
                        break;
                    case 18:
                        link += "1tUz_RlD9P81yPsqUB8EMq-VAp2D34S0u";
                        it.putExtra("mapa", link);
                        startActivity(it);
                        break;
                    case 19:
                        link += "1VVIvxPzMhCxNe_csnzWrlDfKFAiHzBXq";
                        it.putExtra("mapa", link);
                        startActivity(it);
                        break;
                }
            }
        });


    }
}
