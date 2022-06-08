package com.example.thermometer;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.Display;

import java.util.Random;

public class Utils {
    private static Random random = new Random();
    public static float convertDpToPixel(float dp, Context context) {
        Resources resources = context.getResources();
        DisplayMetrics metrics = resources.getDisplayMetrics();
        return dp * ((float)metrics.densityDpi / DisplayMetrics.DENSITY_DEFAULT);
    }

    public static int randInt(int min, int max) {
        return random.nextInt(max - min + 1) + min;
    }
}

