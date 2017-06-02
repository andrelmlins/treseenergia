package com.treseenergiaapp.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatDelegate;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.treseenergiaapp.R;

/**
 * Created by andre on 25/05/2017.
 */

public class AdicionarOrcamentoEFFragment extends Fragment {
    private View rootView;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        this.rootView = inflater.inflate(R.layout.energia_fotovoltaica_form, container, false);
        getActivity().setTitle(getString(R.string.adicionar_orcamento));
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
        return rootView;
    }
}
