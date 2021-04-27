package sewar_1170001.android.aaaignment1;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.preference.PreferenceManager;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.security.Key;
import java.util.ArrayList;
import java.util.jar.Attributes;

public class MainActivity2 extends AppCompatActivity {
    public static final String SPECIALIZATION = "SPECIALIZATION";
    public static final String LANGUAGE= "LANGUAGE";
    public static final String SKILLS = "SKILLS";
    public static final String INFO = "INFO";


    public static final String FLAG= "FLAG";
    private boolean flag =false;

    private EditText spetial;
    private EditText lang;
    private EditText skill,info;

    private SharedPreferences.Editor editor;
    private SharedPreferences prefs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setupViews();
        setupSharedPrefs();
        checkPrefs();


    }

    public void saveData(View view) {
        String value=spetial.getText().toString();
        String value1=lang.getText().toString();
        String value2=skill.getText().toString();
        String value3=info.getText().toString();

            editor.putString(SPECIALIZATION,value);
            editor.putString(LANGUAGE,value2);
            editor.putString(SKILLS,value3);
            editor.putString(INFO,value1);
            editor.putBoolean(FLAG,true);
            editor.commit();

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }



    private void checkPrefs() {


        flag =prefs.getBoolean(FLAG, false);

        if (flag){
            String special2 =prefs.getString(SPECIALIZATION, "");
            String lang2=prefs.getString(LANGUAGE,  "");
            String skill2=prefs.getString(SKILLS,  "");

            String info2=prefs.getString(INFO, "");
//            Toast t=  Toast.makeText(this,"RRRRRRRRRRRRRRRRRRR"+name+"ffff",Toast.LENGTH_LONG);
//            t.show();
            spetial.setText(special2);
            lang.setText(lang2);
            skill.setText(skill2);
            info.setText(info2);

        }

    }

    private void setupViews() {
        spetial = findViewById(R.id.edtspecialization);
        lang = findViewById(R.id.edtlanguage);
        skill = findViewById(R.id.edtskills);
        info = findViewById(R.id.edtInformation);

    }
    private void setupSharedPrefs(){
        prefs = PreferenceManager.getDefaultSharedPreferences(this);
        editor = prefs.edit();
    }



}