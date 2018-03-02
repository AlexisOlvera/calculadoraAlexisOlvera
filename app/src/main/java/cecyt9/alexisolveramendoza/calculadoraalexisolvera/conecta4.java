package cecyt9.alexisolveramendoza.calculadoraalexisolvera;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class conecta4 extends AppCompatActivity implements View.OnClickListener{

    Button botones[][]=new Button[7][6];
    String sBtns[][] = {{"btn00", "btn01", "btn02", "btn03","btn04", "btn05"}, {"btn10", "btn11", "btn12", "btn13", "btn14", "btn15"},
            {"btn20", "btn21", "btn22", "btn23", "btn24", "btn25"}, {"btn30", "btn31", "btn32", "btn33", "btn34", "btn35"}, {"btn40", "btn41",
            "btn42", "btn43", "btn44", "btn45"}, {"btn50", "btn51", "btn52", "btn53", "btn54", "btn55"}, {"btn60", "btn61", "btn62", "btn63", "btn64", "btn65"}};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conecta4);
        for (int i = 0; i<7; i++){
            for (int j = 0; j<6; j++){
                botones[i][j] = findViewById(R.id.btn00);
            }
        }
    }

    @Override
    public void onClick(View v) {
    }
}
