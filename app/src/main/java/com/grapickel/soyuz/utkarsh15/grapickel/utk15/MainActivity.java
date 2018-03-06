package com.grapickel.soyuz.utkarsh15.grapickel.utk15;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.ActionBarActivity;
import android.text.format.Time;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import com.grapickel.soyuz.utkarsh15.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends ActionBarActivity {
    private String beginDate = "05/16/2015 08:00:00";
    private Date f5d;
    private About dialog;
    private SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
    private final long interval = 1000;
    private SlidingMenu s_menu;
    private long startTime;
    private ActionBarActivity thisActivity = this;
    private TextView time_text;
    private CountDownTimer uTimer;

    class C01181 implements OnClickListener {
        C01181() {
        }

        public void onClick(View v) {
            MainActivity.this.startActivity(new Intent("com.grapickel.utk15.EVENTS"));
        }
    }

    class C01192 implements OnClickListener {
        C01192() {
        }

        public void onClick(View v) {
            MainActivity.this.startActivity(new Intent("com.grapickel.utk15.INTRO"));
        }
    }

    class C01203 implements OnClickListener {
        C01203() {
        }

        public void onClick(View v) {
            Intent startIntent = new Intent(MainActivity.this.thisActivity, MainActivity.class);
            startIntent.addFlags(67108864);
            MainActivity.this.thisActivity.startActivity(startIntent);
        }
    }

    class C01214 implements OnClickListener {
        C01214() {
        }

        public void onClick(View v) {
            MainActivity.this.startActivity(new Intent("com.grapickel.utk15.REGISTER"));
        }
    }

    class C01225 implements OnClickListener {
        C01225() {
        }

        public void onClick(View v) {
            MainActivity.this.startActivity(new Intent("com.grapickel.utk15.LOCATION"));
        }
    }

    class C01236 implements OnClickListener {
        C01236() {
        }

        public void onClick(View v) {
            MainActivity.this.dialog = new About(MainActivity.this.thisActivity);
            MainActivity.this.dialog.show();
        }
    }

    class C01247 implements OnClickListener {
        C01247() {
        }

        public void onClick(View v) {
            MainActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.utkarsh2k15.com/")));
        }
    }

    class C01258 implements OnClickListener {
        C01258() {
        }

        public void onClick(View v) {
            MainActivity.this.startActivity(new Intent("com.grapickel.utk15.SPONSORS"));
        }
    }

    class C01269 implements OnClickListener {
        C01269() {
        }

        public void onClick(View v) {
            MainActivity.this.startActivity(new Intent("com.grapickel.utk15.CONTACTS"));
        }
    }

    class Utimer extends CountDownTimer {
        public Utimer(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        public void onTick(long millisUntilFinished) {
            long secondsUntilFinished = millisUntilFinished / 1000;
            long days_left = secondsUntilFinished / 86400;
            long hours_left = (secondsUntilFinished - ((24 * days_left) * 3600)) / 3600;
            long mins_left = ((secondsUntilFinished - ((24 * days_left) * 3600)) - (3600 * hours_left)) / 60;
            MainActivity.this.time_text.setText(days_left + " : " + hours_left + " : " + mins_left + " : " + (((secondsUntilFinished - ((24 * days_left) * 3600)) - (3600 * hours_left)) - (60 * mins_left)));
        }

        public void onFinish() {
            MainActivity.this.time_text.setText(C0127R.string.up_now);
        }
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0127R.layout.activity_main);
        getActionBar().setHomeButtonEnabled(true);
        this.s_menu = new SlidingMenu(this);
        this.s_menu.setMode(0);
        this.s_menu.setTouchModeAbove(1);
        this.s_menu.setShadowWidthRes(C0127R.dimen.sliding_menu_shadow_width);
        this.s_menu.setShadowDrawable((int) C0127R.drawable.sliding_menu_shadow);
        this.s_menu.setBehindOffsetRes(C0127R.dimen.sliding_menu_offset);
        this.s_menu.setFadeDegree(0.35f);
        this.s_menu.attachToActivity(this, 1);
        this.s_menu.setMenu((int) C0127R.layout.activity_menu);
        try {
            this.f5d = this.format.parse(this.beginDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Time time = new Time(Time.getCurrentTimezone());
        time.setToNow();
        Date currentDate = new Date();
        Date d2 = null;
        try {
            d2 = this.format.parse("4/24/2015 08:00:00");
        } catch (ParseException e2) {
            e2.printStackTrace();
        }
        if (currentDate.getTime() < d2.getTime()) {
            this.time_text = (TextView) findViewById(C0127R.id.time);
            this.time_text.setText(C0127R.string.up_now);
        } else {
            this.startTime = this.f5d.getTime() - time.toMillis(true);
            this.time_text = (TextView) findViewById(C0127R.id.time);
            this.uTimer = new Utimer(this.startTime, 1000);
            this.uTimer.start();
        }
        Button intro_btn = (Button) findViewById(C0127R.id.intro_btn);
        Button bUtkarsh = (Button) findViewById(C0127R.id.bUtkarsh);
        Button bReg = (Button) findViewById(C0127R.id.bReg);
        Button bLoc = (Button) findViewById(C0127R.id.bLoc);
        Button bInfo = (Button) findViewById(C0127R.id.bInfo);
        Button bWeb = (Button) findViewById(C0127R.id.bWeb);
        Button bSpons = (Button) findViewById(C0127R.id.bSpons);
        Button bContacts = (Button) findViewById(C0127R.id.bContacts);
        ((Button) findViewById(C0127R.id.bEvents)).setOnClickListener(new C01181());
        intro_btn.setOnClickListener(new C01192());
        bUtkarsh.setOnClickListener(new C01203());
        bReg.setOnClickListener(new C01214());
        bLoc.setOnClickListener(new C01225());
        bInfo.setOnClickListener(new C01236());
        bWeb.setOnClickListener(new C01247());
        bSpons.setOnClickListener(new C01258());
        bContacts.setOnClickListener(new C01269());
    }

    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C0127R.menu.actionbar_actions, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == C0127R.id.action_list_events) {
            startActivity(new Intent("com.grapickel.utk15.EVENTS"));
        }
        if (id == 16908332) {
            this.s_menu.toggle();
        }
        return super.onOptionsItemSelected(item);
    }
}
