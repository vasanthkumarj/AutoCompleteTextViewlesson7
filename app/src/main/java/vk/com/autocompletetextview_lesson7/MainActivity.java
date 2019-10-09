package vk.com.autocompletetextview_lesson7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    private AutoCompleteTextView autoCompleteTextView;
    private ArrayAdapter<CharSequence> adapter;
    private String[] countryList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        autoCompleteTextView = findViewById(R.id.country);
        adapter = ArrayAdapter.createFromResource(this, R.array.country_list, android.R.layout.simple_list_item_1);
        autoCompleteTextView.setAdapter(adapter);
//        countryList = getResources().getStringArray(R.array.country_list);
//        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, countryList);
        autoCompleteTextView.setAdapter(adapter);
    }
}
