package sewar_1170001.android.aaaignment1;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.security.Key;
import java.util.jar.Attributes;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

     Intent i=getIntent();
        String value = i.getStringExtra( "FirstName");
        String value2 = i.getStringExtra( "LastName");
        String value3 = i.getStringExtra( "Email");
        String value4 = i.getStringExtra( "Passwor");
        String value5 = i.getStringExtra( "spinner");
        TextView edt= findViewById(R.id.textView2);
        edt.setText("FirstName:   "+value +"\nLastName: "+value2+"\nEmail: "+value3+"\nPasswor: "+value4+"\ngender: "+value5);


    }
}