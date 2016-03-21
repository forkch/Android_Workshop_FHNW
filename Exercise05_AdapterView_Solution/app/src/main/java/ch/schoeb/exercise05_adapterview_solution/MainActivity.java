package ch.schoeb.exercise05_adapterview_solution;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ListView;


public class MainActivity extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.listView);

        PersonAdapter adapter = new PersonAdapter(this, PersonRepository.getPersons());
        listView.setAdapter(adapter);
    }
}
