package recepty.paragraph.com.gbdd;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static recepty.paragraph.com.gbdd.MainActivity.MY_SETTINGS;

public class PravaActivity extends AppCompatActivity {

    EditText editText;
    Button button;
    Button button2;

    static String Pravanumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prava);

        final SharedPreferences sp = getSharedPreferences(MY_SETTINGS,
                Context.MODE_PRIVATE);

        final Context context = this;

        editText = (EditText) findViewById(R.id.edittext1);

        button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor e = sp.edit();
                e.putBoolean("hasVisited", true);
                e.commit();
                Pravanumber = editText.getText().toString();
                SharedPreferences pref = getSharedPreferences("main", MODE_PRIVATE);
                SharedPreferences.Editor editPref = pref.edit();
                editPref.putString("Pravanumber", Pravanumber);
                editPref.commit();
                Intent intent = new Intent(context, IntoActivity.class);
                startActivity(intent);
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor e = sp.edit();
                e.putBoolean("hasVisited", true);
                e.commit();
                Intent intent = new Intent(context, IntoActivity.class);
                startActivity(intent);
            }
        });



    }
}
