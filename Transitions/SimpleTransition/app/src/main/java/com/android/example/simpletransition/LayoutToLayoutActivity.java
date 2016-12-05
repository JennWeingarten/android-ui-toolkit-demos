//https://www.bignerdranch.com/blog/building-animations-android-transition-framework-part-1/

package com.android.example.simpletransition;

import android.support.transition.ChangeBounds;
import android.support.transition.Scene;
import android.support.transition.Transition;
import android.support.transition.TransitionManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class LayoutToLayoutActivity extends AppCompatActivity {

    ViewGroup mSceneRoot;
    Scene mFirstScene;
    Scene mSecondScene;
    Button mButtonToMove;
    Button mFirstSceneButtonToMove;
    Button mSecondButtonToMove;
    Transition mChangeBoundsTransition;
    LayoutInflater mLayoutInflater;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mLayoutInflater = getLayoutInflater();

        setContentView(R.layout.sceen_holder);
        mSceneRoot = (ViewGroup) findViewById(R.id.scene_root);
        mButtonToMove = (Button) findViewById(R.id.button_to_move);
        mButtonToMove.setOnClickListener(mFirstClickLisener);


        View mFirstLayout = mLayoutInflater.inflate(R.layout.activity_layout_to_layout_1, mSceneRoot, false);
        mFirstScene = new Scene(mSceneRoot, mFirstLayout);
        mFirstSceneButtonToMove = (Button)mFirstLayout.findViewById(R.id.button_to_move);
        mFirstSceneButtonToMove.setOnClickListener(mFirstClickLisener);

        View mSecondLayout = mLayoutInflater.inflate(R.layout.activity_layout_to_layout_2, mSceneRoot , false);
        mSecondScene = new Scene(mSceneRoot, (ViewGroup) mSecondLayout);
        mSecondButtonToMove = (Button)mSecondLayout.findViewById(R.id.second_button_to_move);
        mSecondButtonToMove.setOnClickListener(mSecondClickLisenter);

        mChangeBoundsTransition = new ChangeBounds();
    }




    View.OnClickListener mFirstClickLisener = new View.OnClickListener(){

        @Override
        public void onClick(View v) {
            TransitionManager.go(mSecondScene, mChangeBoundsTransition);
           // setOnClickSecondButton();
        }
    };

    View.OnClickListener mSecondClickLisenter = new View.OnClickListener(){

        @Override
        public void onClick(View v) {
            TransitionManager.go(mFirstScene, mChangeBoundsTransition);
        }
    };

}
