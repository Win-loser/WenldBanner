package com.wenld.wenldbanner;

import android.content.Context;
import android.view.ViewGroup;

/**
 * <p/>
 * Author: 温利东 on 2017/11/2 16:20.
 * blog: http://blog.csdn.net/sinat_15877283
 * github: https://github.com/LidongWen
 */

public interface Holder<T>{
    ViewHolder createView(Context context,
                          ViewGroup parent);
    void UpdateUI(Context context, ViewHolder viewHolder, int position, T data);
}