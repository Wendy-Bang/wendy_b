package com.gam4.sampleapplication.util;

/**
 * Created by banghyunseok on 2016-06-07.
 */
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;

import java.io.File;
import java.io.FileInputStream;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utility {
    public static Pattern pattern = Pattern.compile("[0-9]+");


    public static Integer parseInt(String value) {
        if (value == null) {
            return 0;
        }
        Integer val = 0;
        try {
            Matcher matcher = pattern.matcher(value);
            if (matcher.find()) {
                String num = matcher.group(0);
                val = Integer.parseInt(num);
            }
        } catch (Exception e) {
            Log.e("[log Level] : e ===> ", "parseInt: ", e);
            //FileLog.e("tmessages", e);
        }
        return val;
    }

}
