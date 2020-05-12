package com.ztmg.cicmorgan.view;

/**
 * Created by dongdong on 2018/6/29.
 * 背景虚化
 */

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

import com.ztmg.cicmorgan.R;

public class CustomShadowView extends View {
    private Paint mPaint;

    public CustomShadowView(Context context, AttributeSet attrs) {
        super(context, attrs);
        mPaint = new Paint();
        mPaint.setColor(Color.WHITE);
        //mPaint.setColor(getResources().getColor(R.color.white));
        this.setLayerType(View.LAYER_TYPE_SOFTWARE, null);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //绘制阴影，param1：模糊半径；param2：x轴大小：param3：y轴大小；param4：阴影颜色
        mPaint.setShadowLayer(10F, 15F, 15F, Color.GRAY);
        RectF rect = new RectF(0, 0, 200, 200);
        canvas.drawRoundRect(rect, (float) 75, (float) 75, mPaint);
    }

}