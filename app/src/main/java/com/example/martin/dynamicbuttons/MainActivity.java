package com.example.martin.dynamicbuttons;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Parameter;
import java.lang.reflect.ParameterizedType;
import java.security.Policy;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String jsonString =  "{\n" +
                "   \"temp_hum_sensors\": [\n" +
                "    {\n" +
                "      \"name\": \"iSensor\",\n" +
                "      \"addr\": \"AC:9A:22:93:58:5A\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"name\":\"iSensor\",\n" +
                "      \"addr\":\"AC:9A:22:93:5A:19\"\n" +
                "    }\n" +
                "   ]\n" +
                " }";



        try {
            JSONObject jsonObj = new JSONObject(jsonString);
            JSONArray jsonArray = jsonObj.getJSONArray("temp_hum_sensors");


            LinearLayout myLayout = findViewById(R.id.linearid);
            for (int i=0; i < jsonArray.length(); i++) {

                final JSONObject jsonSensor = jsonArray.getJSONObject(i);
                Button myButton = new Button(this);
              final  String MACaddr = jsonSensor.getString("addr");
                myButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent myIntent = new Intent(v.getContext(),Result.class);

                        myIntent.putExtra("STRING_I_NEED",MACaddr);
                        startActivityForResult(myIntent,0);
                    }
                });
                myButton.setText(jsonSensor.getString("name") + '\n' + jsonSensor.getString("addr"));
                myLayout.addView(myButton);
            }



        }
        catch (JSONException e) {
            //some exception handler code.
        }



    }
 }
