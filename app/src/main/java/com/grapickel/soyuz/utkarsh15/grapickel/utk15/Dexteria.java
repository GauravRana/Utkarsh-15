package com.grapickel.soyuz.utkarsh15.grapickel.utk15;

import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.ActionBar.TabListener;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.SimpleOnPageChangeListener;
import android.view.Menu;
import android.view.MenuItem;

public class Dexteria extends FragmentActivity {
    private final int FRAGMENT_MANAGER_IDX = 3;
    ViewPager Tab;
    TabPagerAdapter TabAdapter;
    ActionBar actionBar;

    class C00982 implements TabListener {
        C00982() {
        }

        public void onTabReselected(Tab tab, FragmentTransaction ft) {
        }

        public void onTabSelected(Tab tab, FragmentTransaction ft) {
            Dexteria.this.Tab.setCurrentItem(tab.getPosition());
        }

        public void onTabUnselected(Tab tab, FragmentTransaction ft) {
        }
    }

    class C01781 extends SimpleOnPageChangeListener {
        C01781() {
        }

        public void onPageSelected(int position) {
            Dexteria.this.actionBar = Dexteria.this.getActionBar();
            Dexteria.this.actionBar.setSelectedNavigationItem(position);
        }
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(C0127R.layout.dexteria);
        this.TabAdapter = new TabPagerAdapter(getSupportFragmentManager(), 3, 9);
        this.Tab = (ViewPager) findViewById(C0127R.id.pager);
        this.Tab.setOnPageChangeListener(new C01781());
        this.Tab.setAdapter(this.TabAdapter);
        this.actionBar = getActionBar();
        this.actionBar.setHomeButtonEnabled(false);
        this.actionBar.setDisplayHomeAsUpEnabled(true);
        this.actionBar.setLogo(C0127R.drawable.logo_n);
        this.actionBar.setNavigationMode(2);
        TabListener tabListener = new C00982();
        this.actionBar.addTab(this.actionBar.newTab().setText("Introduction").setTabListener(tabListener));
        this.actionBar.addTab(this.actionBar.newTab().setText("WTB").setTabListener(tabListener));
        this.actionBar.addTab(this.actionBar.newTab().setText("WEB WEAVER").setTabListener(tabListener));
        this.actionBar.addTab(this.actionBar.newTab().setText("LOGO LOGIC").setTabListener(tabListener));
        this.actionBar.addTab(this.actionBar.newTab().setText("CANVASIA").setTabListener(tabListener));
        this.actionBar.addTab(this.actionBar.newTab().setText("VIDEO SEQUENCE").setTabListener(tabListener));
        this.actionBar.addTab(this.actionBar.newTab().setText("PIXELS").setTabListener(tabListener));
        this.actionBar.addTab(this.actionBar.newTab().setText("TECH QUIZ").setTabListener(tabListener));
        this.actionBar.addTab(this.actionBar.newTab().setText("FIX IT").setTabListener(tabListener));
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C0127R.menu.main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == C0127R.id.action_settings) {
            new About(this).show();
        }
        if (id == C0127R.id.action_list_events) {
            startActivity(new Intent("com.lund.ActionBarExample.EVENTS"));
        }
        if (id == 16908332) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }

    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(this, Events.class));
        finish();
    }
}
