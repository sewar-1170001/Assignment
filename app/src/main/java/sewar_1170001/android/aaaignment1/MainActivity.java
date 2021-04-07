package sewar_1170001.android.aaaignment1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private static final String TAG = "SignUpActivity";

   public Button signUpButton;
   public EditText signUpEmailTextInput;
    public EditText signUpPasswordTextInput;
   public EditText edtFirstName, edtLastName;
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        signUpEmailTextInput = findViewById(R.id.signUpEmailTextInput);
        signUpPasswordTextInput = findViewById(R.id.signUpPasswordTextInput);
        signUpButton = findViewById(R.id.signUpButton);
        edtFirstName = findViewById(R.id.edtFirstName);
        edtLastName = findViewById(R.id.edtLastName);
        spinner = (Spinner) findViewById(R.id.spinner);

      populatespinner();


    }

    private void populatespinner() {
       ArrayList<String> string = new ArrayList<>();
        string.add("femele");
        string.add("male");
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, string);

        spinner.setAdapter(adapter);
    }

    public void sendData(View view) {
//        Toast toast = Toast.makeText(this, "tetadststt", Toast.LENGTH_LONG);
//        toast.show();







        Intent i = new Intent(MainActivity.this, MainActivity2.class);
        String value=edtFirstName.getText().toString();
        String value1=edtLastName.getText().toString();
        String value2=signUpEmailTextInput.getText().toString();
        String value3=signUpPasswordTextInput.getText().toString();
        String value4=spinner.getSelectedItem().toString();
        i.putExtra("FirstName",value);

        i.putExtra("LastName",value1);

        i.putExtra("Email",value2);

        i.putExtra("Passwor",value3);
        i.putExtra("spinner",value4);
        startActivity(i);

    }


}