package com.treseenergiaapp.Fragments;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatDelegate;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;

import com.treseenergiaapp.R;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by andre on 20/05/2017.
 */

public class ProjetoEletricoFragment extends Fragment implements View.OnClickListener {
    private View rootView;
    private CardView card1;
    private CardView card2;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        this.rootView = inflater.inflate(R.layout.projeto_eletrico, container, false);
        getActivity().setTitle(getString(R.string.menu2));
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
        card1 = (CardView) this.rootView.findViewById(R.id.projeto_eletrico);
        card2 = (CardView) this.rootView.findViewById(R.id.orcamento);

        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        return rootView;
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.projeto_eletrico){
            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.content_fragment,new AdicionarOrcamentoPEFragment()).commit();
        } else if(v.getId()==R.id.orcamento) {
            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.content_fragment,new ProjetoEletricoFragment()).commit();
        }
    }
}
