package com.example.mr_g.heart;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Mr_g on 2016/10/14.
 */

public class HeartView extends View {

    private Paint paint;

    public HeartView(Context context) {

        this(context, null);
    }

    public HeartView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    public HeartView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

    }

    public HeartView(Context context, AttributeSet attrs) {
        super(context, attrs);
        paint = new Paint();
        paint.setColor(getResources().getColor(R.color.colorAccent));

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.rotate(-45,300,100);
        canvas.drawCircle(300, 100, 100, paint);

        canvas.drawRect(200, 100, 400, 340, paint);
        canvas.rotate(45,300,100);
        canvas.rotate(45,500,100);
          canvas.drawCircle(500,100,100,paint);
        canvas.drawRect(400,100,600,340,paint);


    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);

    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(MeasureSpec.getSize(heightMeasureSpec), MeasureSpec.getSize(widthMeasureSpec));
    }

}
