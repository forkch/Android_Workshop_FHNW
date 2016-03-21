package ch.schoeb.demoapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class PriceActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set layout defined in layout resource folder
        setContentView(R.layout.activity_price);

        // When the layout is set we can access the Views using findViewById(...)
        TextView textView = (TextView)findViewById(R.id.demoTextView);
        textView.setText("Blubdiblub");
    }
}
