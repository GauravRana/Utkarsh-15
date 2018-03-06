package com.grapickel.soyuz.utkarsh15.grapickel.utk15;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Intro extends ActionBarActivity {
    private String text;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String text = "";
        setContentView((int) C0127R.layout.intro);
        ActionBar actionbar = getActionBar();
        actionbar.setLogo(C0127R.drawable.logo_n);
        actionbar.setHomeButtonEnabled(false);
        actionbar.setDisplayHomeAsUpEnabled(true);
        TextView tvIntro = (TextView) findViewById(C0127R.id.tvIntro);
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(getResources().openRawResource(C0127R.raw.utkarsh)));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String line = br.readLine();
                if (line == null) {
                    break;
                }
                sb.append(line);
            }
            text = sb.toString();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        tvIntro.setText(Html.fromHtml(text));
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
        if (id != 16908332) {
            return super.onOptionsItemSelected(item);
        }
        onBackPressed();
        return true;
    }

    public void onBackPressed() {
        super.onBackPressed();
        Intent openActivity = new Intent(this, MainActivity.class);
        openActivity.addFlags(67108864);
        startActivity(openActivity);
    }
}
