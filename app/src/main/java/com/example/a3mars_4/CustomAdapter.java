package com.example.a3mars_4;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.util.ArrayList;
public class CustomAdapter extends ArrayAdapter<DataRow> {
    private final int resourceId;
    public CustomAdapter(Context context, int resourceId, ArrayList<DataRow> data) {
        super(context, resourceId, data);
        this.resourceId = resourceId;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        DataRow dataRow = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(resourceId, parent, false);
        }
        TextView titleTextView = convertView.findViewById(R.id.text_title);
        TextView descriptionTextView = convertView.findViewById(R.id.text_description);
        assert dataRow != null;
        titleTextView.setText(dataRow.getTitle());
        descriptionTextView.setText(dataRow.getDescription());
        return convertView;
    }
}
