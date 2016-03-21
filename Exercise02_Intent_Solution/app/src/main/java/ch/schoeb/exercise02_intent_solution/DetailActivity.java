package ch.schoeb.exercise02_intent_solution;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class DetailActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // Get Intent which has started this Activity
        Intent intent = getIntent();

        // Get Data passed with the intent
        String passedData = intent.getStringExtra("demoKey");

        // Set passed data in the UI
        TextView textView = (TextView)findViewById(R.id.receivedData);
        textView.setText(passedData);
    }
}
