package com.example.android.guesstheword.binding

import android.view.View
import androidx.core.view.marginLeft
import androidx.databinding.BindingAdapter

/**
 * Created by nampham on 4/8/21.
 */

@BindingAdapter("paddingHorizontal")
fun setPaddingHorizontal(view : View, padding : Int){
    view.setPadding(padding, view.paddingTop, padding, view.paddingBottom)
}

@BindingAdapter("paddingVertical")
fun setPaddingVertical(view : View, padding : Int){
    view.setPadding(view.paddingLeft, padding, view.paddingRight, padding)
}

@BindingAdapter(value = ["android:paddingLeft", "android:paddingTop"], requireAll =  true)
fun setPadding(view : View, paddingLeft : Int, paddingTop: Int){
    view.setPadding(paddingLeft, paddingTop, view.paddingRight, view.paddingBottom)
}

