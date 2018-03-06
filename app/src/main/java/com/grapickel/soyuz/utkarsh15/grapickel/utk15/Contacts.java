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

public class Contacts extends ActionBarActivity {
    private About dialog;
    private SlidingMenu s_menu;
    private ActionBarActivity thisActivity = this;

    class C00881 implements OnClickListener {
        C00881() {
        }

        public void onClick(View v) {
            Contacts.this.startActivity(new Intent("com.grapickel.utk15.EVENTS"));
        }
    }

    class C00892 implements OnClickListener {
        C00892() {
        }

        public void onClick(View v) {
            Intent startIntent = new Intent(Contacts.this.thisActivity, MainActivity.class);
            startIntent.addFlags(67108864);
            Contacts.this.thisActivity.startActivity(startIntent);
        }
    }

    class C00903 implements OnClickListener {
        C00903() {
        }

        public void onClick(View v) {
            Contacts.this.startActivity(new Intent("com.grapickel.utk15.REGISTER"));
        }
    }

    class C00914 implements OnClickListener {
        C00914() {
        }

        public void onClick(View v) {
            Contacts.this.startActivity(new Intent("com.grapickel.utk15.LOCATION"));
        }
    }

    class C00925 implements OnClickListener {
        C00925() {
        }

        public void onClick(View v) {
            Contacts.this.dialog = new About(Contacts.this.thisActivity);
            Contacts.this.dialog.show();
        }
    }

    class C00936 implements OnClickListener {
        C00936() {
        }

        public void onClick(View v) {
            Contacts.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.utkarsh2k15.com/")));
        }
    }

    class C00947 implements OnClickListener {
        C00947() {
        }

        public void onClick(View v) {
            Contacts.this.startActivity(new Intent("com.grapickel.utk15.SPONSORS"));
        }
    }

    class C00958 implements OnClickListener {
        C00958() {
        }

        public void onClick(View v) {
            Contacts.this.startActivity(new Intent("com.grapickel.utk15.CONTACTS"));
        }
    }

    class C00969 implements OnClickListener {
        C00969() {
        }

        public void onClick(View v) {
            new CallDialog(Contacts.this.thisActivity, C0127R.id.bcall_a).show();
        }
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(C0127R.layout.contacts);
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
        Button bCallA = (Button) findViewById(C0127R.id.bcall_a);
        Button bCallB = (Button) findViewById(C0127R.id.bcall_b);
        Button bCallC = (Button) findViewById(C0127R.id.bcall_c);
        Button bCallD = (Button) findViewById(C0127R.id.bcall_d);
        Button bCallE = (Button) findViewById(C0127R.id.bcall_e);
        ((Button) findViewById(C0127R.id.bEvents)).setOnClickListener(new C00881());
        bUtkarsh.setOnClickListener(new C00892());
        bReg.setOnClickListener(new C00903());
        bLoc.setOnClickListener(new C00914());
        bInfo.setOnClickListener(new C00925());
        bWeb.setOnClickListener(new C00936());
        bSpons.setOnClickListener(new C00947());
        bContacts.setOnClickListener(new C00958());
        bCallA.setOnClickListener(new C00969());
        bCallB.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                new CallDialog(Contacts.this.thisActivity, C0127R.id.bcall_b).show();
            }
        });
        bCallC.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                new CallDialog(Contacts.this.thisActivity, C0127R.id.bcall_c).show();
            }
        });
        bCallD.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                new CallDialog(Contacts.this.thisActivity, C0127R.id.bcall_d).show();
            }
        });
        bCallE.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                new CallDialog(Contacts.this.thisActivity, C0127R.id.bcall_e).show();
            }
        });
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
