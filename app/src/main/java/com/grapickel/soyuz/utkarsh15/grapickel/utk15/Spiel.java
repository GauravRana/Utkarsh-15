package com.grapickel.soyuz.utkarsh15.grapickel.utk15;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Spiel extends Fragment {
    private String text = "";

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View android = inflater.inflate(C0127R.layout.spiel, container, false);
        TextView tvIntro = (TextView) android.findViewById(C0127R.id.tvSpiel);
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(getResources().openRawResource(C0127R.raw.spiel)));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String line = br.readLine();
                if (line == null) {
                    break;
                }
                sb.append(line);
            }
            this.text = sb.toString();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        tvIntro.setText(Html.fromHtml(this.text));
        return android;
    }
}
