package recepty.paragraph.com.gbdd;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Binder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegnumberActivity extends AppCompatActivity {

    EditText editText;
    Button button;
    Button button2;

    static String TCnumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regnumber);

        final Context context = this;

        editText = (EditText) findViewById(R.id.edittext1);

        button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TCnumber = editText.getText().toString();
                SharedPreferences pref = getSharedPreferences("main", MODE_PRIVATE);
                SharedPreferences.Editor editPref = pref.edit();
                editPref.putString("TCnumber", TCnumber);
                editPref.commit();
                Intent intent = new Intent(context, CTCnumberActivity.class);
                startActivity(intent);
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, CTCnumberActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
