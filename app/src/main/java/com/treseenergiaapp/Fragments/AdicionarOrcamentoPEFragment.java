package com.treseenergiaapp.Fragments;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatDelegate;
import android.text.InputType;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;

import com.treseenergiaapp.R;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by andre on 25/05/2017.
 */

public class AdicionarOrcamentoPEFragment extends Fragment implements View.OnClickListener, DatePickerDialog.OnDateSetListener, TimePickerDialog.OnTimeSetListener {
    private View rootView;
    private EditText time;
    private EditText date;
    private DatePickerDialog datePickerDialog;
    private TimePickerDialog timePickerDialog;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        this.rootView = inflater.inflate(R.layout.projeto_eletrico_form, container, false);
        getActivity().setTitle(getString(R.string.adicionar_orcamento));
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
        time = (EditText) this.rootView.findViewById(R.id.time);
        date = (EditText) this.rootView.findViewById(R.id.date);

        time.setOnClickListener(this);
        date.setOnClickListener(this);

        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        int minute = cal.get(Calendar.MINUTE);
        this.datePickerDialog = new DatePickerDialog(getActivity(), this, year, month, day);
        this.timePickerDialog = new TimePickerDialog(getActivity(), this, hour, minute, false);

        return rootView;
    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        Calendar newDate = Calendar.getInstance();
        newDate.set(year, month, dayOfMonth);
        SimpleDateFormat dateFormatter = new SimpleDateFormat("dd-MM-yyyy");
        this.date.setText(dateFormatter.format(newDate.getTime()));
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.time) {
            timePickerDialog.show();
        } else if(v.getId()==R.id.date) {
            datePickerDialog.show();
        }
    }

    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        this.time.setText(hourOfDay + ":" + minute);
    }
}
