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

public class Events extends ActionBarActivity {
    private About dialog;
    private SlidingMenu s_menu;
    private ActionBarActivity thisActivity = this;

    class C00991 implements OnClickListener {
        C00991() {
        }

        public void onClick(View v) {
            Events.this.startActivity(new Intent("com.grapickel.utk15.CULTURAL"));
        }
    }

    class C01002 implements OnClickListener {
        C01002() {
        }

        public void onClick(View v) {
            Events.this.startActivity(new Intent("com.grapickel.utk15.LITERARY"));
        }
    }

    class C01013 implements OnClickListener {
        C01013() {
        }

        public void onClick(View v) {
            Events.this.startActivity(new Intent("com.grapickel.utk15.DEXTERIA"));
        }
    }

    class C01024 implements OnClickListener {
        C01024() {
        }

        public void onClick(View v) {
            Events.this.startActivity(new Intent("com.grapickel.utk15.ALTANTUS"));
        }
    }

    class C01035 implements OnClickListener {
        C01035() {
        }

        public void onClick(View v) {
            Events.this.startActivity(new Intent("com.grapickel.utk15.EVENTS"));
        }
    }

    class C01046 implements OnClickListener {
        C01046() {
        }

        public void onClick(View v) {
            Intent startIntent = new Intent(Events.this.thisActivity, MainActivity.class);
            startIntent.addFlags(67108864);
            Events.this.thisActivity.startActivity(startIntent);
        }
    }

    class C01057 implements OnClickListener {
        C01057() {
        }

        public void onClick(View v) {
            Events.this.startActivity(new Intent("com.grapickel.utk15.REGISTER"));
        }
    }

    class C01068 implements OnClickListener {
        C01068() {
        }

        public void onClick(View v) {
            Events.this.startActivity(new Intent("com.grapickel.utk15.LOCATION"));
        }
    }

    class C01079 implements OnClickListener {
        C01079() {
        }

        public void onClick(View v) {
            Events.this.dialog = new About(Events.this.thisActivity);
            Events.this.dialog.show();
        }
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0127R.layout.events);
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
        Button blit = (Button) findViewById(C0127R.id.blit);
        Button bDex = (Button) findViewById(C0127R.id.bdex);
        Button btech = (Button) findViewById(C0127R.id.btech);
        Button bEvents = (Button) findViewById(C0127R.id.bEvents);
        Button bUtkarsh = (Button) findViewById(C0127R.id.bUtkarsh);
        Button bReg = (Button) findViewById(C0127R.id.bReg);
        Button bLoc = (Button) findViewById(C0127R.id.bLoc);
        Button bInfo = (Button) findViewById(C0127R.id.bInfo);
        Button bWeb = (Button) findViewById(C0127R.id.bWeb);
        Button bSpons = (Button) findViewById(C0127R.id.bSpons);
        Button bContacts = (Button) findViewById(C0127R.id.bContacts);
        ((Button) findViewById(C0127R.id.bcult)).setOnClickListener(new C00991());
        blit.setOnClickListener(new C01002());
        bDex.setOnClickListener(new C01013());
        btech.setOnClickListener(new C01024());
        bEvents.setOnClickListener(new C01035());
        bUtkarsh.setOnClickListener(new C01046());
        bReg.setOnClickListener(new C01057());
        bLoc.setOnClickListener(new C01068());
        bInfo.setOnClickListener(new C01079());
        bWeb.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Events.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.utkarsh2k15.com/")));
            }
        });
        bSpons.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Events.this.startActivity(new Intent("com.grapickel.utk15.SPONSORS"));
            }
        });
        bContacts.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Events.this.startActivity(new Intent("com.grapickel.utk15.CONTACTS"));
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
