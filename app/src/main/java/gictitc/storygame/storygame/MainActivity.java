package gictitc.storygame.storygame;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button bHorror, bDrama, bSciFi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bHorror = findViewById(R.id.bHorror);
        bHorror.setOnClickListener(this);

        bDrama = findViewById(R.id.bDrama);
        bDrama.setOnClickListener(this);

        bSciFi = findViewById(R.id.bSciFi);
        bSciFi.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view == bHorror){
            // start HorrorActivity
            Intent i = new Intent(this,HorrorActivity.class);
            startActivity(i);
            finish();// close current activity
        }
    }


}
