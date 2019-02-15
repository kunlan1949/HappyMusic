package com.zlm.hp.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import com.zlm.hp.util.ColorUtil;


/**
 * 白色半透明
 */
public class WhiteTranLinearLayout extends LinearLayout {

    private int defColor;
    private int pressColor;


    public WhiteTranLinearLayout(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(context);
    }

    public WhiteTranLinearLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public WhiteTranLinearLayout(Context context) {
        super(context);
        init(context);
    }

    private void init(Context context) {
        defColor = ColorUtil.parserColor("#ffffff", 0);
        pressColor = ColorUtil.parserColor("#ffffff", 50);
        setBackgroundColor(defColor);
    }


    public void setPressed(boolean pressed) {
        super.setPressed(pressed);
        if (pressed) {
            setBackgroundColor(pressColor);
        } else {

            setBackgroundColor(defColor);

        }
    }

}
