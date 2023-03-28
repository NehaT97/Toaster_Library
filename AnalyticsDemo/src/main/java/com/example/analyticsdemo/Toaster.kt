package com.example.analyticsdemo

import android.content.Context
import android.widget.Toast


object MyFirstLibrary {


        fun toastDummy(context: Context, msg:String){
            Toast.makeText(context,msg,Toast.LENGTH_SHORT).show()
        }
    }



