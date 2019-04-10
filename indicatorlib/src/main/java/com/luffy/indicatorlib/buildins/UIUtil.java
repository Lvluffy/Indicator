package com.luffy.indicatorlib.buildins;

import android.content.Context;

/**
 * Created by lvlufei on 2019/4/10
 *
 * @desc ui转换工具
 */
public final class UIUtil {

    public static int dip2px(Context context, double dpValue) {
        float density = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * density + 0.5);
    }

    public static int getScreenWidth(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }
}