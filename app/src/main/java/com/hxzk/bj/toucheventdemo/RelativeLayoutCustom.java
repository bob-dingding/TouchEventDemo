package com.hxzk.bj.toucheventdemo;

import android.content.Context;
import android.nfc.Tag;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

/**
 * 作者：created by ${zjt} on 2018/9/14
 * 描述:
 */
public class RelativeLayoutCustom extends RelativeLayout {

    private static final String TAG = "ViewGroup";

    public RelativeLayoutCustom(Context context) {
        super(context);
    }

    public RelativeLayoutCustom(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public RelativeLayoutCustom(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public RelativeLayoutCustom(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }


    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        switch (ev.getAction()) {
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
        return super.dispatchTouchEvent(ev);
       // return true;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.e(TAG, "onInterceptTouchEvent-------------->ACTION_DOWN");
               // return true;
                break;
            case MotionEvent.ACTION_MOVE:
                Log.e(TAG, "onInterceptTouchEvent-------------->ACTION_MOVE");
                return true;
                //break;
            case MotionEvent.ACTION_UP:
                Log.e(TAG, "onInterceptTouchEvent-------------->ACTION_UP");
                break;
        }

       return super.onInterceptTouchEvent(ev);
        //return true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.e(TAG, "onTouchEvent-------------->ACTION_DOWN");
                //return true;
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
     //return super.onTouchEvent(event);
        return true;
    }

    @Override
    public void requestDisallowInterceptTouchEvent(boolean disallowIntercept) {
        super.requestDisallowInterceptTouchEvent(disallowIntercept);
    }

}
