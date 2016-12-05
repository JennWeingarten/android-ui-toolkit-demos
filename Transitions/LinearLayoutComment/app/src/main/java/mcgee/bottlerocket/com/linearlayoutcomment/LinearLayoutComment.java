package mcgee.bottlerocket.com.linearlayoutcomment;

import java.util.logging.Logger;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.LinearLayout;

/**
 * Created by jennifer.mcgee on 11/26/16.
 */

public class LinearLayoutComment extends LinearLayout {

    public LinearLayoutComment(Context context) {
        super(context);
    }

    public LinearLayoutComment(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public LinearLayoutComment(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public LinearLayoutComment(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        Log.e("testLogging","onMeasure");
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

}
