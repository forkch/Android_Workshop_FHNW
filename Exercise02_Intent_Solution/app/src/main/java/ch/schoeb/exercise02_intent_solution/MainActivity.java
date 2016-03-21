package ch.schoeb.exercise02_intent_solution;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find button to navigate to detail view
        Button navigateButton = (Button) findViewById(R.id.buttonNavigate);
        navigateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToDetail();
            }
        });
    }

    private void navigateToDetail() {
        // Create a new explicit intent with target "DetailActivity"
        Intent intent = new Intent(this, DetailActivity.class);

        // Add custom data we want to pass to the DetailActivity
        intent.putExtra("demoKey", "My super value");

        // Tell android to start the Activity defined by the intent
        startActivity(intent);
    }
}
