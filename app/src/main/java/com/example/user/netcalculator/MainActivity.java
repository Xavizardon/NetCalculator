package com.example.user.netcalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;


public class MainActivity extends AppCompatActivity {
    EditText ipdir, mask;
    TextView shid, shbroad, shnet, shhost, nhost;

    HashMap<Integer, String> equiv = new HashMap<Integer, String>();
    equiv.put(32, "255.255.255.255");
    equiv.put(31, "255.255.255.254");
    equiv.put(30, "255.255.255.252");
    equiv.put(29, "255.255.255.248");
    equiv.put(28, "255.255.255.240");
    equiv.put(27, "255.255.255.224");
    equiv.put(26, "255.255.255.192");
    equiv.put(25, "255.255.255.128");
    equiv.put(24, "255.255.255.0");
    equiv.put(23, "255.255.254.0");
    equiv.put(22, "255.255.252.0");
    equiv.put(21, "255.255.248.0");
    equiv.put(20, "255.255.240.0");
    equiv.put(19, "255.255.224.0");
    equiv.put(18, "255.255.192.0");
    equiv.put(17, "255.255.128.0");
    equiv.put(16, "255.255.0.0");
    equiv.put(15, "255.254.0.0");
    equiv.put(14, "255.252.0.0");
    equiv.put(13, "255.248.0.0");
    equiv.put(12, "255.240.0.0");
    equiv.put(11, "255.224.0.0");
    equiv.put(10, "255.192.0.0");
    equiv.put(9, "255.128.0.0");
    equiv.put(8, "255.0.0.0");
    equiv.put(7, "254.0.0.0");
    equiv.put(6, "252.0.0.0");
    equiv.put(5, "248.0.0.0");
    equiv.put(4, "240.0.0.0");
    equiv.put(3, "224.0.0.0");
    equiv.put(2, "192.0.0.0");
    equiv.put(1, "128.0.0.0");
    equiv.put(0, "0.0.0.0");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ipdir = (EditText) findViewById(R.id.ip);
        mask = (EditText) findViewById(R.id.mask);

        Button convert = findViewById(R.id.Convertir);
        Button restart = findViewById(R.id.Reiniciar);

        final TextView mostid = (TextView) findViewById(R.id.showid);
        final TextView mostbroad = (TextView) findViewById(R.id.showbroadcast);
        final TextView mostnet = (TextView) findViewById(R.id.shownet);
        final TextView mosthost = (TextView) findViewById(R.id.showhost);
        final TextView mostnum = (TextView) findViewById(R.id.numhost);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int mascara = Integer.valueOf(mask.getText().toString());
                String dirip = String.valueOf(ipdir.getText());
                String[] octales = dirip.split(".");
                String octal1 = octales[0];
                String octal2 = octales[1];
                String octal3 = octales[2];
                String octal4 = octales[3];

            }
        });

        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ipdir.setText("");
                mask.setText("");

                mostid.setText("");
                mostbroad.setText("");
                mostnet.setText("");
                mosthost.setText("");
                mostnum.setText("");

            }
        });


    }
}
