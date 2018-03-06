package com.grapickel.soyuz.utkarsh15.grapickel.utk15;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Splash extends Activity {

    class C01371 extends Thread {
        C01371() {
        }

        public void run() {
            try {
                C01371.sleep(7000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                Splash.this.startActivity(new Intent("com.grapickel.utk15.MAINACTIVITY"));
            }
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getWindow().setFormat(1);
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(C0127R.layout.splash);
        StartAnimations();
        new C01371().start();
    }

    protected void onPause() {
        super.onPause();
        finish();
    }

    private void StartAnimations() {
        Animation anim = AnimationUtils.loadAnimation(this, C0127R.anim.alpha);
        anim.reset();
        LinearLayout l = (LinearLayout) findViewById(C0127R.id.lin_lay);
        l.clearAnimation();
        l.startAnimation(anim);
        anim = AnimationUtils.loadAnimation(this, C0127R.anim.translate);
        anim.reset();
        ImageView iv = (ImageView) findViewById(C0127R.id.s_logo);
        iv.clearAnimation();
        iv.startAnimation(anim);
    }
}
