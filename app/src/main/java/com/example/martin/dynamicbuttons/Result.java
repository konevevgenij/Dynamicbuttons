package com.example.martin.dynamicbuttons;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.TimeFormatException;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.text.DateFormat;

public class Result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout2);

        String MACaddr="asd";
        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if(extras == null) {
                MACaddr= null;
            } else {
                MACaddr= extras.getString("STRING_I_NEED");
            }
        } else {
            MACaddr= (String) savedInstanceState.getSerializable("STRING_I_NEED");
        }

      String result="{\n" +
              "  \"AC:9A:22:93:58:5A\": [\n" +
              "    {\n" +
              "      \"timestamp\": \"2018-05-31T15:39:16Z\",\n" +
              "      \"no.\": 216,\n" +
              "      \"temp\": \"25.93\",\n" +
              "      \"hum\": \"47.37\"\n" +
              "    },\n" +
              "    {\n" +
              "      \"timestamp\": \"2018-05-31T15:39:33Z\",\n" +
              "      \"no.\": 217,\n" +
              "      \"temp\": \"25.93\",\n" +
              "      \"hum\": \"50.25\"\n" +
              "    },\n" +
              "    {\n" +
              "      \"timestamp\": \"2018-05-31T15:39:48Z\",\n" +
              "      \"no.\": 218,\n" +
              "      \"temp\": \"26.0\",\n" +
              "      \"hum\": \"45.29\"\n" +
              "    },\n" +
              "    {\n" +
              "      \"timestamp\": \"2018-05-31T15:40:05Z\",\n" +
              "      \"no.\": 219,\n" +
              "      \"temp\": \"25.96\",\n" +
              "      \"hum\": \"42.41\"\n" +
              "    },\n" +
              "    {\n" +
              "      \"timestamp\": \"2018-05-31T15:40:20Z\",\n" +
              "      \"no.\": 220,\n" +
              "      \"temp\": \"25.95\",\n" +
              "      \"hum\": \"40.63\"\n" +
              "    },\n" +
              "    {\n" +
              "      \"timestamp\": \"2018-05-31T15:40:37Z\",\n" +
              "      \"no.\": 221,\n" +
              "      \"temp\": \"25.89\",\n" +
              "      \"hum\": \"39.13\"\n" +
              "    },\n" +
              "    {\n" +
              "      \"timestamp\": \"2018-05-31T15:54:25Z\",\n" +
              "      \"no.\": 222,\n" +
              "      \"temp\": \"24.61\",\n" +
              "      \"hum\": \"52.59\"\n" +
              "    },\n" +
              "    {\n" +
              "      \"timestamp\": \"2018-05-31T15:54:26Z\",\n" +
              "      \"no.\": 223,\n" +
              "      \"temp\": \"24.65\",\n" +
              "      \"hum\": \"55.1\"\n" +
              "    },\n" +
              "    {\n" +
              "      \"timestamp\": \"2018-05-31T15:54:27Z\",\n" +
              "      \"no.\": 224,\n" +
              "      \"temp\": \"24.63\",\n" +
              "      \"hum\": \"57.13\"\n" +
              "    },\n" +
              "    {\n" +
              "      \"timestamp\": \"2018-05-31T15:54:43Z\",\n" +
              "      \"no.\": 225,\n" +
              "      \"temp\": \"24.79\",\n" +
              "      \"hum\": \"60.26\"\n" +
              "    }\n" +
              "  ],\n" +
              "  \"AC:9A:22:93:5A:19\": [\n" +
              "    {\n" +
              "      \"timestamp\": \"2018-05-31T15:39:17Z\",\n" +
              "      \"no.\": 109,\n" +
              "      \"temp\": \"26.0\",\n" +
              "      \"hum\": \"49.86\"\n" +
              "    },\n" +
              "    {\n" +
              "      \"timestamp\": \"2018-05-31T15:39:49Z\",\n" +
              "      \"no.\": 111,\n" +
              "      \"temp\": \"26.21\",\n" +
              "      \"hum\": \"48.20\"\n" +
              "    },\n" +
              "    {\n" +
              "      \"timestamp\": \"2018-05-31T15:40:05Z\",\n" +
              "      \"no.\": 112,\n" +
              "      \"temp\": \"26.17\",\n" +
              "      \"hum\": \"43.97\"\n" +
              "    },\n" +
              "    {\n" +
              "      \"timestamp\": \"2018-05-31T15:40:22Z\",\n" +
              "      \"no.\": 113,\n" +
              "      \"temp\": \"26.17\",\n" +
              "      \"hum\": \"41.62\"\n" +
              "    },\n" +
              "    {\n" +
              "      \"timestamp\": \"2018-05-31T15:40:37Z\",\n" +
              "      \"no.\": 114,\n" +
              "      \"temp\": \"26.10\",\n" +
              "      \"hum\": \"39.65\"\n" +
              "    },\n" +
              "    {\n" +
              "      \"timestamp\": \"2018-05-31T15:54:25Z\",\n" +
              "      \"no.\": 115,\n" +
              "      \"temp\": \"24.73\",\n" +
              "      \"hum\": \"53.91\"\n" +
              "    },\n" +
              "    {\n" +
              "      \"timestamp\": \"2018-05-31T15:54:26Z\",\n" +
              "      \"no.\": 116,\n" +
              "      \"temp\": \"24.76\",\n" +
              "      \"hum\": \"57.5\"\n" +
              "    },\n" +
              "    {\n" +
              "      \"timestamp\": \"2018-05-31T15:54:27Z\",\n" +
              "      \"no.\": 117,\n" +
              "      \"temp\": \"24.77\",\n" +
              "      \"hum\": \"59.57\"\n" +
              "    },\n" +
              "    {\n" +
              "      \"timestamp\": \"2018-05-31T15:54:43Z\",\n" +
              "      \"no.\": 118,\n" +
              "      \"temp\": \"24.93\",\n" +
              "      \"hum\": \"62.41\"\n" +
              "    }\n" +
              "  ]\n" +
              "}";


        try {

            JSONObject jsonObj = new JSONObject(result);
            JSONArray jsonArray = jsonObj.getJSONArray(MACaddr);


            for (int i=0; i < jsonArray.length(); i++) {

                JSONObject jsonSensor = jsonArray.getJSONObject(i);
                TextView resultTextView = new TextView(this);

                GraphView graph = (GraphView) findViewById(R.id.graph);
                LineGraphSeries<DataPoint> series = new LineGraphSeries<>(new DataPoint[] {

                        new DataPoint(1, 1),
                        new DataPoint(1, 1),
                        new DataPoint(1, 1)

                });
                graph.addSeries(series);
            }



        }
        catch (JSONException e) {
            //some exception handler code.
        }


      //  TextView printId = (TextView) findViewById(R.id.textView);
     //   printId.setText(newString);
    }
}