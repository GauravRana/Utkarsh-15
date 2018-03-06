package com.grapickel.soyuz.utkarsh15.grapickel.utk15;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;

public class Register extends ActionBarActivity {
    private About dialog;
    private SlidingMenu s_menu;
    private ActionBarActivity thisActivity = this;

    class C01281 implements OnClickListener {
        C01281() {
        }

        public void onClick(View v) {
            Register.this.startActivity(new Intent("com.grapickel.utk15.EVENTS"));
        }
    }

    class C01292 implements OnClickListener {
        C01292() {
        }

        public void onClick(View v) {
            Intent startIntent = new Intent(Register.this.thisActivity, MainActivity.class);
            startIntent.addFlags(67108864);
            Register.this.thisActivity.startActivity(startIntent);
        }
    }

    class C01303 implements OnClickListener {
        C01303() {
        }

        public void onClick(View v) {
            Register.this.startActivity(new Intent("com.grapickel.utk15.REGISTER"));
        }
    }

    class C01314 implements OnClickListener {
        C01314() {
        }

        public void onClick(View v) {
            Register.this.startActivity(new Intent("com.grapickel.utk15.LOCATION"));
        }
    }

    class C01325 implements OnClickListener {
        C01325() {
        }

        public void onClick(View v) {
            Register.this.dialog = new About(Register.this.thisActivity);
            Register.this.dialog.show();
        }
    }

    class C01336 implements OnClickListener {
        C01336() {
        }

        public void onClick(View v) {
            Register.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.utkarsh2k15.com/")));
        }
    }

    class C01347 implements OnClickListener {
        C01347() {
        }

        public void onClick(View v) {
            Register.this.startActivity(new Intent("com.grapickel.utk15.SPONSORS"));
        }
    }

    class C01358 implements OnClickListener {
        C01358() {
        }

        public void onClick(View v) {
            Register.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://register.utkarsh2k15.com/")));
        }
    }

    class C01369 implements OnClickListener {
        C01369() {
        }

        public void onClick(View v) {
            Register.this.startActivity(new Intent("com.grapickel.utk15.CONTACTS"));
        }
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0127R.layout.register);
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
        Button bUtkarsh = (Button) findViewById(C0127R.id.bUtkarsh);
        Button bReg = (Button) findViewById(C0127R.id.bReg);
        Button bLoc = (Button) findViewById(C0127R.id.bLoc);
        Button bInfo = (Button) findViewById(C0127R.id.bInfo);
        Button bWeb = (Button) findViewById(C0127R.id.bWeb);
        Button bSpons = (Button) findViewById(C0127R.id.bSpons);
        Button bContacts = (Button) findViewById(C0127R.id.bContacts);
        Button bReg_action = (Button) findViewById(C0127R.id.bReg_action);
        ((Button) findViewById(C0127R.id.bEvents)).setOnClickListener(new C01281());
        bUtkarsh.setOnClickListener(new C01292());
        bReg.setOnClickListener(new C01303());
        bLoc.setOnClickListener(new C01314());
        bInfo.setOnClickListener(new C01325());
        bWeb.setOnClickListener(new C01336());
        bSpons.setOnClickListener(new C01347());
        bReg_action.setOnClickListener(new C01358());
        bContacts.setOnClickListener(new C01369());
    }

    public void onBackPressed() {
        super.onBackPressed();
        Intent startIntent = new Intent(this.thisActivity, MainActivity.class);
        startIntent.addFlags(67108864);
        this.thisActivity.startActivity(startIntent);
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
