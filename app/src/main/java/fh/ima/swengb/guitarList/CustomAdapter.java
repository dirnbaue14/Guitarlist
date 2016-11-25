package fh.ima.swengb.guitarList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import fh.ima.swengb.guitarList.model.ElectricGuitar;
import fh.ima.swengb.guitarlist.R;

/**
 * Created by DC on 18.11.16.
 */

public class CustomAdapter extends BaseAdapter {

    List<ElectricGuitar> listGuitars;
    Context context;
    LayoutInflater inflter;

    public CustomAdapter(Context applicationContext, List<ElectricGuitar> listGuitars) {
        this.context = applicationContext;
        this.listGuitars= listGuitars;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return listGuitars.size();
    }

    @Override
    public Object getItem(int i) {
        return listGuitars.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }


    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view==null) {view = inflter.inflate(R.layout.row_item, null);//set layout for displaying items
        }
        TextView viewModel=(TextView)view.findViewById(R.id.textViewListModel);
        TextView viewPickups=(TextView)view.findViewById(R.id.textViewListPickups);
        TextView viewColor=(TextView)view.findViewById(R.id.textViewListColor);
        TextView viewStrings=(TextView) view.findViewById(R.id.textViewListStrings);
        TextView viewDjent=(TextView) view.findViewById(R.id.textViewDjent);

        ElectricGuitar guitar = listGuitars.get(i);
        viewModel.setText(guitar.getManufacturer()+" "+guitar.getModelName());
        viewPickups.setText(guitar.getPickup());
        viewColor.setText(guitar.getColor());
        String stringsString = String.valueOf(guitar.getNumberOfStrings());
        viewStrings.setText(stringsString);
        String djentString = String.valueOf(guitar.isDoesItDjent());
        viewDjent.setText(djentString);

        return view;
    }
}
