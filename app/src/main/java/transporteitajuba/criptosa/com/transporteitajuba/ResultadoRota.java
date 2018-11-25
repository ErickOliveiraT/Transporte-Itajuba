package transporteitajuba.criptosa.com.transporteitajuba;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class ResultadoRota extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_rota);

        //Pega a intent de outra activity
        Intent it = getIntent();

        //Recuperei a string da outra activity
        String pontos = it.getStringExtra("ponto");

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






        Toast.makeText(getApplicationContext(), res, Toast.LENGTH_LONG).show();
    }
}
