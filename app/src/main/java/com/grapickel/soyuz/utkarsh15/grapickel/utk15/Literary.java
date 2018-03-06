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

public class Literary extends FragmentActivity {
    private final int FRAGMENT_MANAGER_IDX = 1;
    ViewPager Tab;
    TabPagerAdapter TabAdapter;
    ActionBar actionBar;

    class C01082 implements TabListener {
        C01082() {
        }

        public void onTabReselected(Tab tab, FragmentTransaction ft) {
        }

        public void onTabSelected(Tab tab, FragmentTransaction ft) {
            Literary.this.Tab.setCurrentItem(tab.getPosition());
        }

        public void onTabUnselected(Tab tab, FragmentTransaction ft) {
        }
    }

    class C01791 extends SimpleOnPageChangeListener {
        C01791() {
        }

        public void onPageSelected(int position) {
            Literary.this.actionBar = Literary.this.getActionBar();
            Literary.this.actionBar.setSelectedNavigationItem(position);
        }
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(C0127R.layout.literary);
        this.TabAdapter = new TabPagerAdapter(getSupportFragmentManager(), 1, 3);
        this.Tab = (ViewPager) findViewById(C0127R.id.pager);
        this.Tab.setOnPageChangeListener(new C01791());
        this.Tab.setAdapter(this.TabAdapter);
        this.actionBar = getActionBar();
        this.actionBar.setHomeButtonEnabled(false);
        this.actionBar.setDisplayHomeAsUpEnabled(true);
        this.actionBar.setLogo(C0127R.drawable.logo_n);
        this.actionBar.setNavigationMode(2);
        TabListener tabListener = new C01082();
        this.actionBar.addTab(this.actionBar.newTab().setText("Rhetorical").setTabListener(tabListener));
        this.actionBar.addTab(this.actionBar.newTab().setText("Spiel").setTabListener(tabListener));
        this.actionBar.addTab(this.actionBar.newTab().setText("Trivial pursuit").setTabListener(tabListener));
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
