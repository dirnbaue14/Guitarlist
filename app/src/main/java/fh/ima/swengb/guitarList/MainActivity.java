package fh.ima.swengb.guitarList;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import fh.ima.swengb.guitarList.model.ElectricGuitar;
import fh.ima.swengb.guitarlist.R;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {


    private List<ElectricGuitar> listGuitars;
    private ListView myListView;
    private CustomAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myListView = (ListView) findViewById(R.id.myGuitarList);

        listGuitars = new ArrayList<>();
        listGuitars.add(new ElectricGuitar("Ibanez", "RG2228", "galaxy black", 8, "EMG 808", true));
        listGuitars.add(new ElectricGuitar("Fender", "Classic Strat 60s", "sunburst", 6, "Vintage Single Coil", false));
        listGuitars.add(new ElectricGuitar("ESP", "E-II Horizon", "tiger eye-sunburst", 6, "EMG 57", true));
        listGuitars.add(new ElectricGuitar("ESP LTD", "SC-607", "black", 7, "EMG 707", true));
        listGuitars.add(new ElectricGuitar("Gibson", "LP Classic", "fireburst", 6, "'57 Classic", false));


        myAdapter = new CustomAdapter(this,listGuitars);

        myListView.setAdapter(myAdapter);

        myListView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

        ElectricGuitar selectedGuitar = listGuitars.get(i);

        Intent intent = new Intent(view.getContext(),ShowUserActivity.class);
        intent.putExtra("guitar",selectedGuitar);
        startActivity(intent);

    }
}
