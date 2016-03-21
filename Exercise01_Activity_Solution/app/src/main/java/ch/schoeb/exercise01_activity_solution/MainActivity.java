package ch.schoeb.exercise01_activity_solution;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find button on layout
        Button button = (Button) findViewById(R.id.buttonShowText);

        // Register a click listener to be notified when the user clicks the button
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // On every click call the method to show the toast
                showToast();
            }
        });
    }

    private void showToast() {
        // Create a new Toast and show it "Long"
        Toast.makeText(this, "Das ist ein Toast", Toast.LENGTH_LONG).show();
    }
}