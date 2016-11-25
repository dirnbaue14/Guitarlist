package fh.ima.swengb.guitarList;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import fh.ima.swengb.guitarList.model.ElectricGuitar;
import fh.ima.swengb.guitarlist.R;

public class ShowUserActivity extends AppCompatActivity {

    private ElectricGuitar guitar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_user);

        Intent intent = getIntent();
        guitar = (ElectricGuitar) intent.getExtras().get("guitar");

        TextView viewManufacturer = (TextView) findViewById(R.id.textViewManufacturer);
        TextView viewModel = (TextView) findViewById(R.id.textViewModel);
        TextView viewColor = (TextView) findViewById(R.id.textViewColor);

        viewManufacturer.setText(guitar.getManufacturer());
        viewModel.setText(guitar.getModelName());
        viewColor.setText(guitar.getColor());
    }

    public void googleSearch(View view) {
        Uri location = Uri.parse("https://www.google.com/#q="+guitar.getManufacturer()+" "+guitar.getModelName());
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
        startActivity(mapIntent);
    }

}
