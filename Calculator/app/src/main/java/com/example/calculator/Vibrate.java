package com.example.calculator;

import android.content.Context;
import android.os.Vibrator;

/**
 * Created by littlecorgi_a1203991686 on 2018/08/02 15:56.
 */
public class Vibrate {
    private static Vibrator vibrator;
    /**
     * 简单震动
     * @param context     调用震动的Context
     * @param millisecond 震动的时间，毫秒
     */
    @SuppressWarnings("static-access")
    public static void vSimple(Context context, int millisecond) {
        vibrator = (Vibrator) context.getSystemService(context.VIBRATOR_SERVICE);
        vibrator.vibrate(millisecond);
    }
    /**
     * 停止震动
     */
    public static void stop() {
        if (vibrator != null) {
            vibrator.cancel();
        }
    }
}
