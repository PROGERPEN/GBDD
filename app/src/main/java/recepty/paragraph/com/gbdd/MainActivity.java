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
    static String TCnumber="";
    static String CTCnumber="";
    static String Pravanumber="";

    SharedPreferences sPref;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences sp = getSharedPreferences(MY_SETTINGS,
                Context.MODE_PRIVATE);

        boolean hasVisited = sp.getBoolean("hasVisited", false);

        if (!hasVisited) {


                Intent intent = new Intent(this, FirstrunActivity.class);
                startActivity(intent);
        }

            loadText1();
            loadText2();
            loadText3();

        textView1 = (TextView) findViewById(R.id.textview1);
        textView2 = (TextView) findViewById(R.id.textview2);
        textView3 = (TextView) findViewById(R.id.textview3);
        if (!TCnumber.equals("")) {
            textView1.setText(TCnumber);
        }else {
            textView1.setText("Данные не введены");
        }
        if (!CTCnumber.equals("")) {
            textView2.setText(CTCnumber);
        }else {
            textView2.setText("Данные не введены");
        }
        if (!Pravanumber.equals("")) {
            textView3.setText(Pravanumber);
        }else {
            textView3.setText("Данные не введены");
        }
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
        if (TCnumber.equals("")) {
            TCnumber = "Данные не введены";
        }
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
        if (CTCnumber.equals("")) {
            CTCnumber = "Данные не введены";
        }
    }

    private void loadText3() {
        sPref = getSharedPreferences("main", MODE_PRIVATE);
        String savedText2 = sPref.getString("Pravanumber", "Данные не введены");
        Pravanumber = savedText2;
        if (Pravanumber.equals("")) {
            Pravanumber = "Данные не введены";
        }
    }

    @Override
    protected void onResume() {
        loadText1();
        loadText2();
        loadText3();
        if (!TCnumber.equals("")) {
            textView1.setText(TCnumber);
        }else {
            textView1.setText("Данные не введены");
        }
        if (!CTCnumber.equals("")) {
            textView2.setText(CTCnumber);
        }else {
            textView2.setText("Данные не введены");
        }
        if (!Pravanumber.equals("")) {
            textView3.setText(Pravanumber);
        }else {
            textView3.setText("Данные не введены");
        }
        super.onResume();
    }

    @Override
    protected void onDestroy() {

        super.onDestroy();
    }
}