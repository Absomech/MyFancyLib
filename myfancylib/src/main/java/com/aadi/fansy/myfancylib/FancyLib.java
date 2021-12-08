package com.aadi.fansy.myfancylib;

import android.content.Context;
import android.widget.Toast;

public class FancyLib {
    public  static void showName(Context context , String name){
        Toast.makeText(context, name, Toast.LENGTH_SHORT).show();
    }
}
