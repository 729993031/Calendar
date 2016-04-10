package com.example.Calendar;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.Toast;

public class MyActivity extends Activity {
    CalendarView cv;
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        cv=(CalendarView)findViewById(R.id.calendarView);
        cv.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView calendarView, int year, int month, int dayofMonth) {
                Toast.makeText(MyActivity.this,"你生日是"+year+"年"+month+"月"+dayofMonth+"日",Toast.LENGTH_SHORT).show();

            }
        });
    }
}
