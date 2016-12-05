package com.android.example.simpletransition;

import android.support.constraint.ConstraintLayout;
import android.support.constraint.ConstraintSet;
import android.support.transition.TransitionManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


//https://developer.android.com/reference/android/support/constraint/ConstraintSet.html
public class TestApplyTo extends AppCompatActivity {

    Button mApplyConstraintSetButton;
    ConstraintSet mSet;
    ConstraintLayout mConstraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mConstraintLayout = (ConstraintLayout) findViewById(R.id.activity_test_apply_to);
        mApplyConstraintSetButton = (Button) findViewById(R.id.apply_costraint_set);
        mApplyConstraintSetButton.setOnClickListener(mApplyConstraintSetListener);
        setContentView(R.layout.activity_test_apply_to);

        mSet = new ConstraintSet();
        mSet.clone(this, R.layout.activity_test_apply_to);
        mSet.setHorizontalBias(R.id.apply_costraint_set, (float)0.1);
    }

    View.OnClickListener mApplyConstraintSetListener = new View.OnClickListener(){

        @Override
        public void onClick(View v) {
            mSet.applyTo(mConstraintLayout);
        }
    };
}
