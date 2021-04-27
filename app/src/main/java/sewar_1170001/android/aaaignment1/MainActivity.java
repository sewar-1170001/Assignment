package sewar_1170001.android.aaaignment1;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private static final String TAG = "SignUpActivity";
    public static final String NAME = "NAME";
    public static final String EMAIL= "EMAIL";
    public static final String PASS = "PASS";
    public static final String HOBB = "HOBB";

    public static final String GENDER = "GENDER";
    public static final String FLAG= "FLAG";
    private boolean flag =false;
    private Button signUpButton ,button;
    private EditText signUpEmailTextInput;
    private EditText signUpPasswordTextInput;
    private EditText edtFirstName, edtLastName;
    private CheckBox agreementCheckbox ;
    Spinner spinner;
    private SharedPreferences.Editor editor;
    private SharedPreferences prefs;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //populatespinner();
        setupViews();
        populatespinner();
        setupSharedPrefs();
        checkPrefs();


    }
    public void loginData(View view) {
        String value=edtFirstName.getText().toString();
        String value1=edtLastName.getText().toString();
        String value2=signUpEmailTextInput.getText().toString();
        String value3=signUpPasswordTextInput.getText().toString();
        String value4=spinner.getSelectedItem().toString();

        if (agreementCheckbox.isChecked()){
//            Toast t2=  Toast.makeText(this,"MMMMM"+flag,Toast.LENGTH_LONG);
//            t2.show();
//            if (!flag){
                editor.putString(NAME,value);
                editor.putString(EMAIL,value2);
                editor.putString(PASS,value3);
                editor.putString(HOBB,value1);
                editor.putString(GENDER,value4);
                editor.putBoolean(FLAG,true);
                editor.commit();
//                Toast t1=  Toast.makeText(this,"HHHHHHH",Toast.LENGTH_LONG);
//                t1.show();
//            }
        }
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);

    }


    private void checkPrefs() {


        flag =prefs.getBoolean(FLAG, false);

        if (flag){
            String name =prefs.getString(NAME, "");
            String email=prefs.getString(EMAIL,  "");
            String pass=prefs.getString(PASS,  "");

            String hobb=prefs.getString(HOBB, "");
            String gender =prefs.getString(GENDER,  "");
//            Toast t=  Toast.makeText(this,"RRRRRRRRRRRRRRRRRRR"+name+"ffff",Toast.LENGTH_LONG);
//            t.show();
            edtFirstName.setText(name);
            signUpEmailTextInput.setText(email);
            signUpPasswordTextInput.setText(pass);
            edtLastName.setText(hobb);

            agreementCheckbox.setChecked(true);
        }

    }

    private void setupViews() {
        signUpEmailTextInput = findViewById(R.id.signUpEmailTextInput);
        signUpPasswordTextInput = findViewById(R.id.signUpPasswordTextInput);
        signUpButton = findViewById(R.id.signUpButton);
        edtFirstName = findViewById(R.id.edtFirstName);
        edtLastName = findViewById(R.id.edtLastName);
        spinner = (Spinner) findViewById(R.id.spinner);
        agreementCheckbox =findViewById(R.id.agreementCheckbox);

    }
    private void setupSharedPrefs(){
        prefs = PreferenceManager.getDefaultSharedPreferences(this);
        editor = prefs.edit();
    }


    private void populatespinner() {
        ArrayList<String> string = new ArrayList<>();
        string.add("femele");
        string.add("male");
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, string);

     spinner.setAdapter(adapter);
    }







}