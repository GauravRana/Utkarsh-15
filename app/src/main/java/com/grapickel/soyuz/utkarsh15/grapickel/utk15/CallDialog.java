package com.grapickel.soyuz.utkarsh15.grapickel.utk15;

import android.app.Activity;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class CallDialog extends Dialog implements OnClickListener {
    private Activity f3c;
    private Button call;
    private Button cancel;
    private String cell_no_a = this.f3c.getResources().getString(C0127R.string.a_cell_no);
    private String cell_no_b = this.f3c.getResources().getString(C0127R.string.b_cell_no);
    private String cell_no_c = this.f3c.getResources().getString(C0127R.string.c_cell_no);
    private String cell_no_d = this.f3c.getResources().getString(C0127R.string.d_cell_no);
    private String cell_no_e = this.f3c.getResources().getString(C0127R.string.e_cell_no);
    private Dialog f4d;
    private int resId;

    public CallDialog(Context context, int ResId) {
        super(context);
        this.f3c = (Activity) context;
        this.resId = ResId;
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(1);
        setContentView(C0127R.layout.call_dialog);
        this.call = (Button) findViewById(C0127R.id.call);
        this.cancel = (Button) findViewById(C0127R.id.cancel);
        this.call.setOnClickListener(this);
        this.cancel.setOnClickListener(this);
    }

    public void onClick(View v) {
        String phoneNumber = "";
        if (v.getId() == C0127R.id.call) {
            if (this.resId == C0127R.id.bcall_a) {
                phoneNumber = this.cell_no_a;
            } else if (this.resId == C0127R.id.bcall_b) {
                phoneNumber = this.cell_no_b;
            } else if (this.resId == C0127R.id.bcall_c) {
                phoneNumber = this.cell_no_c;
            } else if (this.resId == C0127R.id.bcall_d) {
                phoneNumber = this.cell_no_d;
            } else if (this.resId == C0127R.id.bcall_e) {
                phoneNumber = this.cell_no_e;
            }
            Intent callIntent = new Intent("android.intent.action.CALL");
            callIntent.setData(Uri.parse("tel:" + phoneNumber));
            Log.d("GOT", phoneNumber.toString());
            try {
                this.f3c.startActivity(callIntent);
                dismiss();
            } catch (ActivityNotFoundException e) {
                Toast.makeText(this.f3c, "Call failed, please try again later.", 0).show();
            }
        }
        if (v.getId() == C0127R.id.cancel) {
            dismiss();
        }
    }
}
