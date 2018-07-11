package recepty.paragraph.com.gbdd;

import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView1;
    TextView textView2;
    TextView textView3;

    static final String MY_SETTINGS = "zapusk";
    static String TCnumber;
    static String CTCnumber;
    static String Pravanumber;

    SharedPreferences sPref;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences sp = getSharedPreferences(MY_SETTINGS,
                Context.MODE_PRIVATE);
        // проверяем, первый ли раз открывается программа
        boolean hasVisited = sp.getBoolean("hasVisited", false);

        if (!hasVisited) {
            // выводим нужную активность

                Intent intent = new Intent(this, FirstrunActivity.class);
                startActivity(intent);

            SharedPreferences.Editor e = sp.edit();
            e.putBoolean("hasVisited", true);
            e.commit(); // не забудьте подтвердить изменения
        }
        if (hasVisited) {
            loadText1();
            loadText2();
            loadText3();
        }
        textView1 = (TextView) findViewById(R.id.textview1);
        textView2 = (TextView) findViewById(R.id.textview2);
        textView3 = (TextView) findViewById(R.id.textview3);

        textView1.setText(TCnumber);
        textView2.setText(CTCnumber);
        textView3.setText(Pravanumber);
    }

    /*public void saveText1() {
        sPref = getSharedPreferences("MyPref", MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT, Number1);
        ed.commit();
    }*/


    private void loadText1() {
        sPref = getSharedPreferences("main", MODE_PRIVATE);
        String savedText = sPref.getString("TCnumber", "Данные не введены");
        TCnumber = savedText;
    }

    /*private void saveText2() {
        sPref = getSharedPreferences("MyPref", MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT2, Number2);
        ed.commit();
    }*/


    private void loadText2() {
        sPref = getSharedPreferences("main", MODE_PRIVATE);
        String savedText2 = sPref.getString("CTCnumber", "Данные не введены");
        CTCnumber = savedText2;
    }

    private void loadText3() {
        sPref = getSharedPreferences("main", MODE_PRIVATE);
        String savedText2 = sPref.getString("Pravanumber", "Данные не введены");
        Pravanumber = savedText2;
    }

    @Override
    protected void onResume() {
        loadText1();
        loadText2();
        loadText3();
        textView1.setText(TCnumber);
        textView2.setText(CTCnumber);
        textView3.setText(Pravanumber);
        super.onResume();
    }

    @Override
    protected void onDestroy() {

        super.onDestroy();
    }
}