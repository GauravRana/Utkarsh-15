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

public class Altantus extends FragmentActivity {
    private final int FRAGMENT_MANAGER_IDX = 2;
    ViewPager Tab;
    TabPagerAdapter TabAdapter;
    ActionBar actionBar;

    class C00872 implements TabListener {
        C00872() {
        }

        public void onTabReselected(Tab tab, FragmentTransaction ft) {
        }

        public void onTabSelected(Tab tab, FragmentTransaction ft) {
            Altantus.this.Tab.setCurrentItem(tab.getPosition());
        }

        public void onTabUnselected(Tab tab, FragmentTransaction ft) {
        }
    }

    class C01761 extends SimpleOnPageChangeListener {
        C01761() {
        }

        public void onPageSelected(int position) {
            Altantus.this.actionBar = Altantus.this.getActionBar();
            Altantus.this.actionBar.setSelectedNavigationItem(position);
        }
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(C0127R.layout.altantus);
        this.TabAdapter = new TabPagerAdapter(getSupportFragmentManager(), 2, 5);
        this.Tab = (ViewPager) findViewById(C0127R.id.pager);
        this.Tab.setOnPageChangeListener(new C01761());
        this.Tab.setAdapter(this.TabAdapter);
        this.actionBar = getActionBar();
        this.actionBar.setHomeButtonEnabled(false);
        this.actionBar.setDisplayHomeAsUpEnabled(true);
        this.actionBar.setLogo(C0127R.drawable.logo_n);
        this.actionBar.setNavigationMode(2);
        TabListener tabListener = new C00872();
        this.actionBar.addTab(this.actionBar.newTab().setText("Introduction").setTabListener(tabListener));
        this.actionBar.addTab(this.actionBar.newTab().setText("Counter Strike 1.6").setTabListener(tabListener));
        this.actionBar.addTab(this.actionBar.newTab().setText("FIFA 14").setTabListener(tabListener));
        this.actionBar.addTab(this.actionBar.newTab().setText("NFS").setTabListener(tabListener));
        this.actionBar.addTab(this.actionBar.newTab().setText("Tekken tag").setTabListener(tabListener));
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
