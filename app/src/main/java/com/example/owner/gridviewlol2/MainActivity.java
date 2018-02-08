package com.example.owner.gridviewlol2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

/**
 * Created by Owner on 2/7/2018.
 */


public class MainActivity extends AppCompatActivity {

    GridView gvImage;

    int[] idImage = {
            R.drawable.cait,
            R.drawable.fiona,
            R.drawable.kotek,
            R.drawable.leo,
            R.drawable.ls,
            R.drawable.mal,
            R.drawable.nami,
            R.drawable.syn,
            R.drawable.tf,
            R.drawable.vi,
    };
    public MainActivity(GridView gvImage, int[] idImage) {
        this.gvImage = gvImage;
        this.idImage = idImage;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridviewAdapter gridviewAdapter = new GridviewAdapter(MainActivity.this,idImage);
        gvImage = findViewById(R.id.gv_image);
        gvImage.setAdapter(gridviewAdapter);
    }
}
