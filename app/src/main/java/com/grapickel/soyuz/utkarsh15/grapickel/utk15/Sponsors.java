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
import android.widget.GridView;
import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;

public class Sponsors extends ActionBarActivity {
    private About dialog;
    private SlidingMenu s_menu;
    private ActionBarActivity thisActivity = this;

    class C01381 implements OnClickListener {
        C01381() {
        }

        public void onClick(View v) {
            Sponsors.this.startActivity(new Intent("com.grapickel.utk15.EVENTS"));
        }
    }

    class C01392 implements OnClickListener {
        C01392() {
        }

        public void onClick(View v) {
            Intent startIntent = new Intent(Sponsors.this.thisActivity, MainActivity.class);
            startIntent.addFlags(67108864);
            Sponsors.this.thisActivity.startActivity(startIntent);
        }
    }

    class C01403 implements OnClickListener {
        C01403() {
        }

        public void onClick(View v) {
            Sponsors.this.startActivity(new Intent("com.grapickel.utk15.REGISTER"));
        }
    }

    class C01414 implements OnClickListener {
        C01414() {
        }

        public void onClick(View v) {
            Sponsors.this.startActivity(new Intent("com.grapickel.utk15.LOCATION"));
        }
    }

    class C01425 implements OnClickListener {
        C01425() {
        }

        public void onClick(View v) {
            Sponsors.this.dialog = new About(Sponsors.this.thisActivity);
            Sponsors.this.dialog.show();
        }
    }

    class C01436 implements OnClickListener {
        C01436() {
        }

        public void onClick(View v) {
            Sponsors.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.utkarsh2k15.com/")));
        }
    }

    class C01447 implements OnClickListener {
        C01447() {
        }

        public void onClick(View v) {
            Sponsors.this.startActivity(new Intent("com.grapickel.utk15.SPONSORS"));
        }
    }

    class C01458 implements OnClickListener {
        C01458() {
        }

        public void onClick(View v) {
            Sponsors.this.startActivity(new Intent("com.grapickel.utk15.CONTACTS"));
        }
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0127R.layout.sponsors);
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
        ((Button) findViewById(C0127R.id.bEvents)).setOnClickListener(new C01381());
        bUtkarsh.setOnClickListener(new C01392());
        bReg.setOnClickListener(new C01403());
        bLoc.setOnClickListener(new C01414());
        bInfo.setOnClickListener(new C01425());
        bWeb.setOnClickListener(new C01436());
        bSpons.setOnClickListener(new C01447());
        bContacts.setOnClickListener(new C01458());
        ((GridView) findViewById(C0127R.id.grid_view)).setAdapter(new ImageAdapter(this));
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
