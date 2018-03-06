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

public class Cultural extends FragmentActivity {
    private final int FRAGMENT_MANAGER_IDX = 0;
    ViewPager Tab;
    TabPagerAdapter TabAdapter;
    ActionBar actionBar;

    class C00972 implements TabListener {
        C00972() {
        }

        public void onTabReselected(Tab tab, FragmentTransaction ft) {
        }

        public void onTabSelected(Tab tab, FragmentTransaction ft) {
            Cultural.this.Tab.setCurrentItem(tab.getPosition());
        }

        public void onTabUnselected(Tab tab, FragmentTransaction ft) {
        }
    }

    class C01771 extends SimpleOnPageChangeListener {
        C01771() {
        }

        public void onPageSelected(int position) {
            Cultural.this.actionBar = Cultural.this.getActionBar();
            Cultural.this.actionBar.setSelectedNavigationItem(position);
        }
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(C0127R.layout.cultural);
        ActionBar actionbar = getActionBar();
        actionbar.setLogo(C0127R.drawable.logo_n);
        actionbar.setHomeButtonEnabled(false);
        actionbar.setDisplayHomeAsUpEnabled(true);
        this.TabAdapter = new TabPagerAdapter(getSupportFragmentManager(), 0, 6);
        this.Tab = (ViewPager) findViewById(C0127R.id.pager);
        this.Tab.setOnPageChangeListener(new C01771());
        this.Tab.setAdapter(this.TabAdapter);
        this.actionBar = getActionBar();
        this.actionBar.setHomeButtonEnabled(true);
        this.actionBar.setLogo(C0127R.drawable.logo_n);
        this.actionBar.setNavigationMode(2);
        TabListener tabListener = new C00972();
        this.actionBar.addTab(this.actionBar.newTab().setText("Vogue").setTabListener(tabListener));
        this.actionBar.addTab(this.actionBar.newTab().setText("Unplugged").setTabListener(tabListener));
        this.actionBar.addTab(this.actionBar.newTab().setText("Footloose").setTabListener(tabListener));
        this.actionBar.addTab(this.actionBar.newTab().setText("Dharohar").setTabListener(tabListener));
        this.actionBar.addTab(this.actionBar.newTab().setText("Dramaturgy").setTabListener(tabListener));
        this.actionBar.addTab(this.actionBar.newTab().setText("Aesthetica").setTabListener(tabListener));
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
            startActivity(new Intent("com.grapickel.utk15.EVENTS"));
        }
        if (id != 16908332) {
            return super.onOptionsItemSelected(item);
        }
        onBackPressed();
        return true;
    }

    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(this, Events.class));
        finish();
    }
}
