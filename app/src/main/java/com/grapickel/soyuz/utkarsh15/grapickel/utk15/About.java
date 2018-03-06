package com.grapickel.soyuz.utkarsh15.grapickel.utk15;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class About extends Dialog implements OnClickListener {
    private Activity f1c;
    private Dialog f2d;
    private Button ok;

    public About(Activity a) {
        super(a);
        this.f1c = a;
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(1);
        setContentView(C0127R.layout.custom_dialog);
        this.ok = (Button) findViewById(C0127R.id.bOk);
        this.ok.setOnClickListener(this);
    }

    public void onClick(View v) {
        if (v.getId() == C0127R.id.bOk) {
            dismiss();
        }
    }
}
