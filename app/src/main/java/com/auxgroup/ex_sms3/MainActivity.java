package com.auxgroup.ex_sms3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       Button btn_send= (Button) findViewById(R.id.btn_send);
        btn_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText et_number= (EditText) findViewById(R.id.et_phoneNumber);
                EditText et_sms= (EditText) findViewById(R.id.et_sms);
                String number = et_number.getText().toString();
                String sms = et_sms.getText().toString();
                SmsManager smsManager = SmsManager.getDefault();
                smsManager.sendTextMessage(number,null,sms,null,null);
            }
        });

    }
}
