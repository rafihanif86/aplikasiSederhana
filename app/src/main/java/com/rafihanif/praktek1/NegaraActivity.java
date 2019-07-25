package com.rafihanif.praktek1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class NegaraActivity extends AppCompatActivity {

    ListView listView;
    TextView textView;

    String [] negaraArray = {
            "Indonesia",
            "Malaysia",
            "Singapura",
            "Brunei Darussalam",
            "Papua New Ginie",
            "Timur Leste",
            "Thailand",
            "Vietnam",
            "China",
            "Korea",
            "Jepang",
            "Philiphina",
            "Laos",
            "Rusia"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_negara);

        listView = (ListView) findViewById(R.id.listView_negara);
        textView = (TextView) findViewById(R.id.textView_Item_negara);

        final ArrayAdapter adapter =new ArrayAdapter<String>(
                this,R.layout.list_item_negara, R.id.textView_Item_negara,negaraArray);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String value = "Aku memilih " + adapter.getItem(position);
                /* Display the Toast */
                Toast.makeText(getApplicationContext(), value, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
