package ch.schoeb.exercise05_adapterview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class PersonAdapter extends BaseAdapter {

    private Context context;
    private List<Person> persons;

    public PersonAdapter(Context context, List<Person> persons) {
        this.context = context;
        this.persons = persons;
    }

    @Override
    public int getCount() {
        return persons.size();
    }

    @Override
    public Object getItem(int position) {
        return persons.get(position);
    }

    @Override
    public long getItemId(int position) {
        Person person = (Person) getItem(position);
        return person.getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(getLayoutIdForViewType(position), parent, false);
        }

        Person person = (Person) getItem(position);

        TextView idTextView = (TextView) convertView.findViewById(R.id.id);
        idTextView.setText(person.getId() +"");

        return convertView;
    }

    @Override
    public int getViewTypeCount() {
        return 2;
    }

    @Override
    public int getItemViewType(int position) {
        return position % 2;
    }

    private int getLayoutIdForViewType(int position) {
        int viewType = getItemViewType(position);
        switch (viewType) {
            case 0:
                return R.layout.listitem_id_left;
        }

        return R.layout.listitem_id_right;
    }

}