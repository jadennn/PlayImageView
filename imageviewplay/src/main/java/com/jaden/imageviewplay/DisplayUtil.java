package com.jaden.imageviewplay;

import android.content.res.Resources;
import android.util.DisplayMetrics;

/**
 * Created Date: 2018/12/12
 * Description:
 */
public class DisplayUtil {
    public static float dp2Pixel(float dp){
        DisplayMetrics metrics = Resources.getSystem().getDisplayMetrics();
        return dp * metrics.density;
    }
}
