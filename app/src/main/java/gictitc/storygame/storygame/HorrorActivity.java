package gictitc.storygame.storygame;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HorrorActivity extends BaseGameActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horror);
    }

    public void checkItOut(View view) {
        Intent intent = new Intent(this, Hprror1_1Activity.class);
        startActivity(intent);
        finish();
    }

    public void keepGoing(View view) {
        Intent intent = new Intent(this, Hprror1_2Activity.class);
        startActivity(intent);
        finish();
    }
}
