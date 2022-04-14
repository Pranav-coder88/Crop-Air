package airlinereserveationsystem.softwareengenerring.cropair;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {


    TextView dontHaveAccount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        FirebaseFirestore db = FirebaseFirestore.getInstance();

        TextView userName;
        TextView password;
        MaterialButton submitButton;

        dontHaveAccount = findViewById(R.id.newAccount);

        userName = findViewById(R.id.userName);
        password = findViewById(R.id.password);
        submitButton = findViewById(R.id.submitButton);

        submitButton.setOnClickListener(v -> {

            if (userName.getText().toString().equals("") && password.getText().toString().equals("")) {
                Toast.makeText(MainActivity.this, "Login Failed ", Toast.LENGTH_SHORT).show();

            } else if (userName.getText().toString().equals("admin") && password.getText().toString().equals("admin")) {
                Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, HomePage.class);
                startActivity(intent);

            } else {
                Toast.makeText(MainActivity.this, "Login Failed", Toast.LENGTH_SHORT).show();
                hideSoftKeyboard();
            }


        });

        dontHaveAccount.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Sign_Up_Page.class);
            startActivity(intent);
        });

    }


    private void hideSoftKeyboard() {
        InputMethodManager inputManager = (InputMethodManager)
                getSystemService(Context.INPUT_METHOD_SERVICE);
        inputManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(),
                InputMethodManager.HIDE_NOT_ALWAYS);


    }

}