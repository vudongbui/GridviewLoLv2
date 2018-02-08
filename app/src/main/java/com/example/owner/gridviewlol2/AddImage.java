package com.example.owner.gridviewlol2;

/**
 * Created by Owner on 2/8/2018.
 */

public class AddImage {
    String[] listname = {
            "cait",
            "fiona",
            "kotek",
            "leo",
            "ls",
            "mal",
            "nami",
            "syn",
            "tf",
            "vi",

    };
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
    public AddImage(int[] idImage, String[] listname) {
        this.idImage = idImage;
        this.listname = listname;
    }
}
