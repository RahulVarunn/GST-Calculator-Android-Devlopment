package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.net.HttpRetryException;


public class MainActivity2 extends AppCompatActivity {
    private TextView net;
    private TextView total0;
    private TextView total_net0;
    private TextView c0;
    private TextView s0;
    private TextView tran_gst;
    private TextView total_am;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        net=findViewById(R.id.textView20);
        total0=findViewById(R.id.textView30);
        total_net0=findViewById(R.id.textView40);
        c0=findViewById(R.id.textView50);
        s0=findViewById(R.id.textView60);
        tran_gst=findViewById(R.id.textView70);
        total_am=findViewById(R.id.textView80);

        Intent intent=getIntent();
        String gst_amount= intent.getStringExtra(MainActivity.GST_a);
        String net_amount= intent.getStringExtra(MainActivity.GST_b);
        String cgst= intent.getStringExtra(MainActivity.GST_d);
        String sgst= intent.getStringExtra(MainActivity.GST_d);
        String transport= intent.getStringExtra(MainActivity.GST_e);
        String total_net= intent.getStringExtra(MainActivity.GST_f);
        String total= intent.getStringExtra(MainActivity.GST_g);
        net.setText(net_amount);
        total0.setText(gst_amount);
        total_net0.setText(total_net);
        c0.setText(cgst);
        s0.setText(sgst);
        tran_gst.setText(transport);
        total_am.setText(total);




    }

}