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

public class SelecaoChegada extends Activity {

    private ListView lstRef;
    private static String recebido = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selecao_chegada);

        //Pega a intent de outra activity
        Intent it = getIntent();

        //Recuperei a string da outra activity
        recebido = it.getStringExtra("ponto");
        recebido += ".";

        lstRef = (ListView) findViewById(R.id.listaRef2);

        String[] pontosRef = {"Estrada para Maria da Fé", //0
                "Novo Horizonte", //1
                "Vila Isabel", //2
                "Boa Vista", //3
                "Rodoviária", //4
                "Morro Chic",
                "Sambódromo",
                "Praça Getúlio Vargas",
                "BPS",
                "UNIFEI",
                "Igreja Cruzeiro",
                "Prefeitura",
                "Estiva", //12
                "INSS",
                "Barraquinhas",
                "Comsil",
                "Praça Correios",
                "Paróquia São Benedito",
                "Batalhão",
                "Posto P4", //19
                "Rodovia",
                "Condomínio Ipê",
                "Imbel",
                "FMIT",
                "Estrada para Anhumas",
                "Itavel",
                "Mercado", //26
                "Praça Dona Alice Mandolesi",
                "Santo Antônio",
                "Vila Poddis",
                "Bretas",
                "Parque de Exposições",
                "Distrito Industrial",
                "Frivasa",
                "Jd. das Colinas",
                "Jd. das Nações",
                "Cafona",
                "Piedade",
                "Rebourgeon"};

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                pontosRef
        );
        lstRef.setAdapter(adaptador);

        lstRef.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent it = new Intent(getApplicationContext(), ResultadoRota.class);
                switch (position) {
                    case 0:
                        it.putExtra("ponto", recebido+"1");
                        startActivity(it);
                        break;
                    case 1:
                        it.putExtra("ponto", recebido+"11b,11a,11c");
                        startActivity(it);
                        break;
                    case 2:
                        it.putExtra("ponto", recebido+"1,11b");
                        startActivity(it);
                        break;
                    case 3:
                        it.putExtra("ponto", recebido+"11a,11c");
                        startActivity(it);
                        break;
                    case 4:
                        it.putExtra("ponto", recebido+"1,11b");
                        startActivity(it);
                        break;
                    case 5:
                        it.putExtra("ponto", recebido+"1,11b");
                        startActivity(it);
                        break;
                    case 6:
                        it.putExtra("ponto", recebido+"1,11b,17,2,7,8,11a,6,3,4,5,11b,11c");
                        startActivity(it);
                        break;
                    case 7:
                        it.putExtra("ponto", recebido+"7,2,17");
                        startActivity(it);
                        break;
                    case 8:
                        it.putExtra("ponto", recebido+"7,2,17");
                        startActivity(it);
                        break;
                    case 9:
                        it.putExtra("ponto", recebido+"7,2,17");
                        startActivity(it);
                        break;
                    case 10:
                        it.putExtra("ponto", recebido+"7,2,17");
                        startActivity(it);
                        break;
                    case 11:
                        it.putExtra("ponto", recebido+"7,2,17");
                        startActivity(it);
                        break;
                    case 12:
                        it.putExtra("ponto", recebido+"7,17");
                        startActivity(it);
                        break;
                    case 13:
                        it.putExtra("ponto", recebido+"17");
                        startActivity(it);
                        break;
                    case 14:
                        it.putExtra("ponto", recebido+"1,11b,17,2,7,8,11a,6,3,4,5,11b,11c");
                        startActivity(it);
                        break;
                    case 15:
                        it.putExtra("ponto", recebido+"4,5,11b,11c,3,6,11a");
                        startActivity(it);
                        break;
                    case 16:
                        it.putExtra("ponto", recebido+"3,6,4,5,11a,11b,11c");
                        startActivity(it);
                        break;
                    case 17:
                        it.putExtra("ponto", recebido+"4,5,11b,11c");
                        startActivity(it);
                        break;
                    case 18:
                        it.putExtra("ponto", recebido+"3,6,4,5,11a,11b,11c");
                        startActivity(it);
                        break;
                    case 19:
                        it.putExtra("ponto", recebido+"11a,6,3,1,2");
                        startActivity(it);
                        break;
                    case 20:
                        it.putExtra("ponto", recebido+"11a,6,3,1,2");
                        startActivity(it);
                        break;
                    case 21:
                        it.putExtra("ponto", recebido+"11a,6,3,1,2,4,5,11c,11b");
                        startActivity(it);
                        break;
                    case 22:
                        it.putExtra("ponto", recebido+"11a,6,3,1,2,4,5,11c,11b");
                        startActivity(it);
                        break;
                    case 23:
                        it.putExtra("ponto", recebido+"8");
                        startActivity(it);
                        break;
                    case 24:
                        it.putExtra("ponto", recebido+"8");
                        startActivity(it);
                        break;
                    case 25:
                        it.putExtra("ponto", recebido+"8,17,1,2,7");
                        startActivity(it);
                        break;
                    case 26:
                        it.putExtra("ponto", recebido+"8,17,1,2,7");
                        startActivity(it);
                        break;
                    case 27:
                        it.putExtra("ponto", recebido+"8,17,1,2,7,3,6,4,5,11a,11b,11c");
                        startActivity(it);
                        break;
                    case 28:
                        it.putExtra("ponto", recebido+"17");
                        startActivity(it);
                        break;
                    case 29:
                        it.putExtra("ponto", recebido+"3,4");
                        startActivity(it);
                        break;
                    case 30:
                        it.putExtra("ponto", recebido+"11a,11c");
                        startActivity(it);
                        break;
                    case 31:
                        it.putExtra("ponto", recebido+"5,6,7,8");
                        startActivity(it);
                        break;
                    case 32:
                        it.putExtra("ponto", recebido+"5,6,7,8");
                        startActivity(it);
                        break;
                    case 33:
                        it.putExtra("ponto", recebido+"5,6,7");
                        startActivity(it);
                        break;
                    case 34:
                        it.putExtra("ponto", recebido+"5,6,7");
                        startActivity(it);
                        break;
                    case 35:
                        it.putExtra("ponto", recebido+"5,6");
                        startActivity(it);
                        break;
                    case 36:
                        it.putExtra("ponto", recebido+"7");
                        startActivity(it);
                        break;
                    case 37:
                        it.putExtra("ponto", recebido+"8");
                        startActivity(it);
                        break;
                    case 38:
                        it.putExtra("ponto", recebido+"8,3,4,17");
                        startActivity(it);
                        break;
                }
            }
        });
    }
}
