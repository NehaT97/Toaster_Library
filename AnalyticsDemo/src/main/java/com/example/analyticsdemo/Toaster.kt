package com.example.analyticsdemo

import android.content.Context
import android.widget.Toast


class MyFirstLibrary {

    companion object {
        fun toastDummy(context: Context, msg:String){
            Toast.makeText(context,msg,Toast.LENGTH_SHORT).show()
        }
    }



}