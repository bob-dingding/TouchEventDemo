package com.hxzk.bj.toucheventdemo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.TextView;

/**
 * 作者：created by ${zjt} on 2018/9/14
 * 描述:
 */
@SuppressLint("AppCompatCustomView")
public class TextViewCustom extends TextView {

    private static final String TAG = "View";

    public TextViewCustom(Context context) {
        super(context);
    }

    public TextViewCustom(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public TextViewCustom(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public TextViewCustom(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }


    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.e(TAG, "dispatchTouchEvent-------------->ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.e(TAG, "dispatchTouchEvent-------------->ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.e(TAG, "dispatchTouchEvent-------------->ACTION_UP");
                break;
        }
        return super.dispatchTouchEvent(event);
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {

        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.e(TAG, "onTouchEvent-------------->ACTION_DOWN");
                //return true;
                //return false;
                 break;
            case MotionEvent.ACTION_MOVE:
                Log.e(TAG, "onTouchEvent-------------->ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.e(TAG, "onTouchEvent-------------->ACTION_UP");
                break;
            case MotionEvent.ACTION_CANCEL:
                Log.e(TAG, "onTouchEvent-------------->ACTION_CANCEL");
                break;
            default:
                Log.e(TAG, "onTouchEvent-------------->default");
                break;

        }
        return true;
        //return super.onTouchEvent(event);
    }



}
