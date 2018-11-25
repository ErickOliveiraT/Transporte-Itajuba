package transporteitajuba.criptosa.com.transporteitajuba;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class ResultadoRota extends Activity {

    private TextView txtView;
    private Button btnHorario;
    private Button btnMap;
    String link = "https://www.google.com/maps/d/embed?mid=";
    private String first = "";
    private String hora = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_rota);

        //Pega a intent de outra activity
        Intent it = getIntent();
        String pontos = it.getStringExtra("ponto");

        txtView = (TextView) findViewById(R.id.txtResultado);
        btnMap = (Button) findViewById(R.id.btnMapa);
        btnHorario = (Button) findViewById(R.id.btnHora);

        String s1 = "";
        String s2 = "";
        int j = 0;

        for(int i = 0; i < pontos.length(); i++) {
            if (pontos.charAt(i) != '.') {
                s1 += pontos.charAt(i);
            } else {
                j = i+1;
                break;
            }
        }
        for(int i = j; i < pontos.length(); i++) s2 += pontos.charAt(i);

        ArrayList<String> v1 = new ArrayList<>();
        ArrayList<String> v2 = new ArrayList<>();
        String temp = "";

        for(int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != ',' && i != s1.length()-1) {
                temp += s1.charAt(i);
            }
            else {
                if (i == s1.length()-1) temp += s1.charAt(i);
                v1.add(temp);
                temp = "";
            }
        }
        temp = "";
        for(int i = 0; i < s2.length(); i++) {
            if (s2.charAt(i) != ',' && i != s2.length()-1) {
                temp += s2.charAt(i);
            }
            else {
                if (i == s2.length()-1) temp += s2.charAt(i);
                v2.add(temp);
                temp = "";
            }
        }

        ArrayList<String> match = new ArrayList<>();
        boolean found = false;

        for (int i = 0; i < v1.size(); i++) {
            s1 = (String) v1.get(i);
            for (j = 0; j < v2.size(); j++) {
                s2 = (String) v2.get(j);
                if(s1.equals(s2)) {
                    found = true;
                    match.add(s2);
                    break;
                }
            }
        }

        String res = "";

        for (int i = 0; i < match.size(); i++) {
            if (i != match.size()-1) res += "Linha " + (String) match.get(i).toUpperCase()+"\n";
            else res += "Linha " + (String) match.get(i).toUpperCase();
        }

        if(found) {
            txtView.setText(res);
            first = (String) match.get(0);
        }

        if (first.equals("1")) {
            link += "1Ebd6t4wgoAL9ut1sro7XerRi0ceWf3u3";
            hora = "h1.pdf";
        }
        else if (first.equals("2")) {
            link += "1sHe22V-RqzffeD_cOxOzzybil2LQnIHb";
            hora = "h2.pdf";
        }
        else if (first.equals("3")) {
            link += "1XJ8SFwrGgL-ld6k869_r7_BbTaFAcRTf";
            hora = "h3.pdf";
        }
        else if (first.equals("4")) {
            link += "13C1cGttidJXzKunsnNFSpI4hI1D8h1h2";
            hora = "h4.pdf";
        }
        else if (first.equals("5")) {
            link += "1QXBMa6-tkaryldc60UoWTwo6AfQL7zti";
            hora = "h5.pdf";
        }
        else if (first.equals("6")) {
            link += "1deH30LIYhKXI4kM3m9wjeo_gHCo0C7Lv";
            hora = "h6.pdf";
        }
        else if (first.equals("7a")) {
            link += "1urOuFF8AS3iwvPujDHYxaohcnAZkponr";
            hora = "h7.pdf";
        }
        else if (first.equals("7b")) {
            link += "11uaGrjOAVi84PCs9aMAAlxqAhkYr1Kvl";
            hora = "h7b.pdf";
        }
        else if (first.equals("8")) {
            link += "1TRuEHYS_r1FnW6qAlDTF6n7b6UeNWwzJ";
            hora = "h8.pdf";
        }
        else if (first.equals("9")) {
            link += "1sK_DwY-kD8i7Ah1e-FEc_K4FWtRWggme";
            hora = "h9.pdf";
        }
        else if (first.equals("9b")) {
            link += "1wVpMUmcJ-m8GjNDeUAtJyPnVgHHXf49r";
            hora = "h9b.pdf";
        }
        else if (first.equals("11a")) {
            link += "1BPnr_XPJqfnXqfLEPd5fy34FmpFGFLiA";
            hora = "h11a.pdf";
        }
        else if (first.equals("11b")) {
            link += "1yISKYDcht9S6QNvOAys45U9wLhHUJbtM";
            hora = "h11b.pdf";
        }
        else if (first.equals("11c")) {
            link += "1GgI7rNp0c9ZIvFIV3uv1TurPAV_l7c4V";
            hora = "h11c.pdf";
        }
        else if (first.equals("12")) {
            link += "17mdfgcwJvWUm16bgNREvoTflyALkLoK8";
            hora = "h12.pdf";
        }
        else if (first.equals("13")) {
            link += "1du3JpYs88G9_QABK0mWTzBXHEuHlMgkt";
            hora = "h13.pdf";
        }
        else if (first.equals("14")) {
            link += "1WbMSZhxHnC78fJni8iN_02hjPCzyJaN7";
            hora = "h14.pdf";
        }
        else if (first.equals("15")) {
            btnMap.setEnabled(false);
            hora = "h15.pdf";
        }
        else if (first.equals("17")) {
            link += "1tUz_RlD9P81yPsqUB8EMq-VAp2D34S0u";
            hora = "h17.pdf";
        }

        btnMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getApplicationContext(), mapa1.class);
                it.putExtra("mapa", link);
                startActivity(it);
            }
        });

        btnHorario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getApplicationContext(), horario1.class);
                it.putExtra("linha", hora);
                startActivity(it);
            }
        });

        //Toast.makeText(getApplicationContext(), res, Toast.LENGTH_LONG).show(); (Para debug)
    }
}
