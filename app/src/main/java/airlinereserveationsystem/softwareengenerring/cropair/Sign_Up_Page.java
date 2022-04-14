package airlinereserveationsystem.softwareengenerring.cropair;

import android.content.Context;
import android.os.Bundle;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.button.MaterialButton;

import java.util.Objects;


public class Sign_Up_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_page);


        TextView newUserName = findViewById(R.id.newUserName);
        TextView newPassword = findViewById(R.id.newPassword);
        TextView confirmPassword = findViewById(R.id.confirmPassword);

        MaterialButton newSubmitButton = findViewById(R.id.newSubmitButton);
        newSubmitButton.setOnClickListener(v -> {

            if (newUserName.getText().toString().equals("") || newPassword.getText().toString().equals("") ||
                    confirmPassword.getText().toString().equals("")) {
                Toast.makeText(Sign_Up_Page.this, "Invalid Values , Please Retry ", Toast.LENGTH_LONG).show();

            } else if (!Objects.equals(newPassword.getText().toString(), confirmPassword.getText().toString())) {
                Toast.makeText(Sign_Up_Page.this, "Not the same Password ", Toast.LENGTH_LONG).show();

            } else if (Objects.equals(newPassword.getText().toString(), confirmPassword.getText().toString())) {
                Toast.makeText(Sign_Up_Page.this, "Account Created ", Toast.LENGTH_LONG).show();
                hideSoftKeyboard();
            }

        });

    }

    private void hideSoftKeyboard() {
        InputMethodManager inputManager = (InputMethodManager)
                getSystemService(Context.INPUT_METHOD_SERVICE);
        inputManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(),
                InputMethodManager.HIDE_NOT_ALWAYS);


    }


}