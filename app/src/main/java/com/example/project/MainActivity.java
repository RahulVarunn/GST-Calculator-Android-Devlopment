package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText amount;
    private EditText gst;
    private EditText tranport;
    private EditText qty;
    private TextView cc;
    public static
    String GST_a="rertgr";
    public static  String GST_b="reryyyr";
    public static  String GST_c="ryyyyyegr";
    public static  String GST_d="resgthyj";
    public static  String GST_e="terhetrh";
    public static  String GST_f="trhterhty";
    public static  String GST_g="trhtregtyrt";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        amount=findViewById(R.id.editTextNumber);
        gst = findViewById(R.id.editTextNumber2);
        tranport= findViewById(R.id.editTextNumber3);
        qty=findViewById(R.id.editTextNumber4);


    }
    public void button(View view){

        String a=amount.getText().toString();
        String b=gst.getText().toString();
        String d=tranport.getText().toString();
        String e=qty.getText().toString();

        int amount_=Integer.parseInt(a);
        int rate_gst=Integer.parseInt(b);
        int quantity=Integer.parseInt(d);
        int tran = Integer.parseInt(e);

        float x=(tran*rate_gst)/100 ;
        float transport_amount=(tran+x);
        float c=amount_*(100/((float)100+rate_gst));
        float gst_amount=amount_-(float)c  ;
        float net_amount=amount_-gst_amount;
        float c_sgst=gst_amount*quantity;
        float cgst=c_sgst/2;
//        float sgst=c_sgst/2;
        float total_net=quantity*net_amount;
        float total_amount=total_net+c_sgst+transport_amount  ;
        String GST_am=Float.toString(gst_amount);
        String GST_net=Float.toString(net_amount);
        String GST_c=Float.toString(cgst);
        String GST_s=Float.toString(cgst);
        String GST_t=Float.toString(transport_amount);
        String GST_tot=Float.toString(total_net);
        String GST_nettotal=Float.toString(total_amount);



        Intent intent= new Intent(MainActivity.this,MainActivity2.class);
        intent.putExtra(GST_a,GST_am);
        intent.putExtra(GST_b,GST_net);
        intent.putExtra(GST_c,GST_c);
        intent.putExtra(GST_d,GST_c);
        intent.putExtra(GST_e,GST_t);
        intent.putExtra(GST_f,GST_tot);
        intent.putExtra(GST_g,GST_nettotal);
        startActivity(intent);
    }
    public void secbutton(View view){
        String a=amount.getText().toString();
        String b=gst.getText().toString();
        String d=tranport.getText().toString();
        String e=qty.getText().toString();

        int amount_=Integer.parseInt(a);
        int rate_gst=Integer.parseInt(b);
        int quantity=Integer.parseInt(d);
        int tran = Integer.parseInt(e);

        float gst_amount=(amount_*rate_gst)/(float)100;
        float  gross_amount=(amount_+(float)gst_amount) ;
        float  net_amount=(float)gross_amount-(float)gst_amount;
        float total_net=quantity*net_amount;
        float  c_sgst=gst_amount*quantity;
        float  cgst=c_sgst/2 ;
//        float   sgst=c_sgst/2;
        float x=(tran*rate_gst)/100 ;
        float transport_amount=(tran+x);
        float total_amount=total_net+c_sgst+transport_amount;

        String GST_am=Float.toString(gst_amount);
        String GST_net=Float.toString(net_amount);
        String GST_c=Float.toString(cgst);
        String GST_s=Float.toString(cgst);
        String GST_t=Float.toString(transport_amount);
        String GST_tot=Float.toString(total_net);
        String GST_nettotal=Float.toString(total_amount);


        Intent intent= new Intent(MainActivity.this,MainActivity2.class);
        intent.putExtra(GST_a,GST_am);
        intent.putExtra(GST_b,GST_net);
        intent.putExtra(GST_c,GST_c);
        intent.putExtra(GST_d,GST_c);
        intent.putExtra(GST_e,GST_t);
        intent.putExtra(GST_f,GST_tot);
        intent.putExtra(GST_g,GST_nettotal);
        startActivity(intent);

    }
}