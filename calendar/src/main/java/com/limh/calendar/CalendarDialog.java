package com.limh.calendar;

import android.app.Dialog;
import android.content.Context;
import androidx.annotation.NonNull;

/**
 * @author limh
 * @function
 * @date 2019/4/21 17:53
 */
public class CalendarDialog extends Dialog {
    public CalendarDialog(@NonNull Context context) {
        super(context, R.style.styleDialog);
    }
}
