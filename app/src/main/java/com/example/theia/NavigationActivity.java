package com.example.theia;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class NavigationActivity extends AppCompatActivity {
    private ListActivity mClass;

    String[] listItemsPreferred = { "ECSS 3.217", "ECSW 1.132", "ECSN 2.230", "ECSN 3.430", "JO 2.136"};
    String[] listItemsClosest = { "ECSS 2.201", "ECSS 2.202", "ECSS 2.203", "ECSS 2.204", "ECSS 2.205",
            "ECSS 2.206", "ECSS 2.207", "ECSS 2.208", "ECSS 2.209", "ECSS 2.210", "ECSS 2.211",
            "ECSS 2.212", "ECSS 2.213", "ECSS 2.214", "ECSS 2.215", "ECSS 2.216", "ECSS 2.217",
            "ECSS 2.218", "ECSS 2.219", "ECSS 2.220", "ECSS 2.221"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);

        ArrayAdapter<String> adapterClosest = new ArrayAdapter<String>(this, R.layout.list_black_text, listItemsClosest);
        ListView listViewClosest = (ListView) findViewById(R.id.closestList);
        listViewClosest.setAdapter(adapterClosest);

        ArrayAdapter<String> adapterPreferred = new ArrayAdapter<String>(this, R.layout.list_black_text, listItemsPreferred);
        ListView listViewPreferred = (ListView) findViewById(R.id.preferedList);
        listViewPreferred.setAdapter(adapterPreferred);
    }
}
