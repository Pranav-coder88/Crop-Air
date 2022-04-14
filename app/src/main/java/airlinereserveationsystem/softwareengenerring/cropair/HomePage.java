package airlinereserveationsystem.softwareengenerring.cropair;

import android.content.Intent;
import android.os.Bundle;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;


public class HomePage extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

//        FirebaseFirestore db = FirebaseFirestore.getInstance();


//        TextView textTripLocationArrival = findViewById(R.id.textTripLocationArrival);

//        DocumentReference flightDetailsRef = db.collection("FlightDetails").document("2iHAXUWkIooMDj7Kx7SG");

//        flightDetailsRef.get().addOnCompleteListener(task -> {
//            if (task.isSuccessful()) {
//                DocumentSnapshot document = task.getResult();
//                if (document.exists()) {
//                    textTripLocationArrival.setText(document.getString("TripLocationDestination"));
//                } else {
//                    Log.d("docv", "No such document");
//                }
//            } else {
//                Log.d("docv", "get failed with ", task.getException());
//            }
//        });


        EditText destinationSearch = findViewById(R.id.destinationSearch);
        destinationSearch.setOnEditorActionListener((v, actionId, event) -> {
            if (actionId == EditorInfo.IME_ACTION_DONE) {
                Intent intent = new Intent(HomePage.this, ProfilePage.class);
                startActivity(intent);
                return true;
            }
            return false;
        });

    }


}