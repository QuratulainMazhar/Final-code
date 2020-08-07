package com.example.food;
import android.content.Context;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.BaseAdapter;
        import android.widget.ImageView;
        import android.widget.TextView;
        import android.widget.Toast;

public class customAdapter extends BaseAdapter {
    Context context;
    LayoutInflater layoutInflater = null;

   int images[];

    String discription[];

    public customAdapter(Context context,

                       int images[], String discription[]) {
        this.context = context;

        this.images = images;


        this.discription = discription;

    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int i) {
        return getItemId(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View row = view;
        if (row == null) {
            layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = layoutInflater.inflate(R.layout.drinks, null);
        }
        ImageView img = (ImageView) row.findViewById(R.id.images);

        TextView tv = (TextView) row.findViewById(R.id.discription);


        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        img.setImageResource(images[i]);
        tv.setText(discription[i]);

        return row;
    }
}
