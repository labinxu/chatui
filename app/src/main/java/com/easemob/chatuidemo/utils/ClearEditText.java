package com.easemob.chatuidemo.utils;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.view.View.OnFocusChangeListener;
/**
 * Created by cninlaxu on 2015/4/13.

public class ClearEditText extends EditText implements
        OnFocusChangeListener, TextWatcher {

    private Drawable mClearDrawable;
    public ClearEditText(Context context){super(context, null);}
    public ClearEditText(Context context, AttributeSet attrs){
        super(context,attrs, android.R.attr.editTextStyle);}

    private void init(){

    }
    @Override
    public void onFocusChange(View view, boolean b) {

    }

    public ClearEditText(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {

    }

    @Override
    public void afterTextChanged(Editable editable) {

    }
}
 */