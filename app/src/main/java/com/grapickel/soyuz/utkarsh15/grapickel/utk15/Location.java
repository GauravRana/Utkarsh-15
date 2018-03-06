package com.grapickel.soyuz.utkarsh15.grapickel.utk15;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import java.util.Locale;

public class Location extends ActionBarActivity {
    private About dialog;
    private SlidingMenu s_menu;
    private ActionBarActivity thisActivity = this;

    class C01091 implements OnClickListener {
        C01091() {
        }

        public void onClick(View v) {
            Location.this.startActivity(new Intent("com.grapickel.utk15.EVENTS"));
        }
    }

    class C01102 implements OnClickListener {
        C01102() {
        }

        public void onClick(View v) {
            Intent startIntent = new Intent(Location.this.thisActivity, MainActivity.class);
            startIntent.addFlags(67108864);
            Location.this.thisActivity.startActivity(startIntent);
        }
    }

    class C01113 implements OnClickListener {
        C01113() {
        }

        public void onClick(View v) {
            Location.this.startActivity(new Intent("com.grapickel.utk15.REGISTER"));
        }
    }

    class C01124 implements OnClickListener {
        C01124() {
        }

        public void onClick(View v) {
            Location.this.startActivity(new Intent("com.grapickel.utk15.LOCATION"));
        }
    }

    class C01135 implements OnClickListener {
        C01135() {
        }

        public void onClick(View v) {
            Location.this.dialog = new About(Location.this.thisActivity);
            Location.this.dialog.show();
        }
    }

    class C01146 implements OnClickListener {
        C01146() {
        }

        public void onClick(View v) {
            Location.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.utkarsh2k15.com/")));
        }
    }

    class C01157 implements OnClickListener {
        C01157() {
        }

        public void onClick(View v) {
            Location.this.startActivity(new Intent("com.grapickel.utk15.SPONSORS"));
        }
    }

    class C01168 implements OnClickListener {
        C01168() {
        }

        public void onClick(View v) {
            Location.this.click();
        }
    }

    class C01179 implements OnClickListener {
        C01179() {
        }

        public void onClick(View v) {
            Location.this.startActivity(new Intent("com.grapickel.utk15.CONTACTS"));
        }
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0127R.layout.location);
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
        Button bMap = (Button) findViewById(C0127R.id.bMap);
        ((Button) findViewById(C0127R.id.bEvents)).setOnClickListener(new C01091());
        bUtkarsh.setOnClickListener(new C01102());
        bReg.setOnClickListener(new C01113());
        bLoc.setOnClickListener(new C01124());
        bInfo.setOnClickListener(new C01135());
        bWeb.setOnClickListener(new C01146());
        bSpons.setOnClickListener(new C01157());
        bMap.setOnClickListener(new C01168());
        bContacts.setOnClickListener(new C01179());
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

    public void click() {
        try {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.ENGLISH, "geo:12,34?q=31.1117,77.1401", new Object[0]))));
        } catch (ActivityNotFoundException e) {
            try {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.google.co.in/maps/place/University+Institute+Of+Information+Technology/@31.111795,77.140157,17z/data=!3m1!4b1!4m2!3m1!1s0x390579068129b8df:0x5129fb51de21079b?hl=en")));
            } catch (ActivityNotFoundException e2) {
                Toast.makeText(this, "Please install a maps application", 1).show();
            }
        }
    }
}
