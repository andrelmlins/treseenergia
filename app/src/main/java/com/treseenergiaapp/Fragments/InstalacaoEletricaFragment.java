package com.treseenergiaapp.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatDelegate;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.treseenergiaapp.R;

/**
 * Created by andre on 20/05/2017.
 */

public class InstalacaoEletricaFragment extends Fragment implements View.OnClickListener {
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
        this.rootView = inflater.inflate(R.layout.instalacao_eletrica, container, false);
        getActivity().setTitle(getString(R.string.menu1));
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
        card1 = (CardView) this.rootView.findViewById(R.id.instalacao_eletrica);
        card2 = (CardView) this.rootView.findViewById(R.id.orcamento);
        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        return rootView;
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.instalacao_eletrica){
            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.content_fragment,new AdicionarOrcamentoIEFragment()).commit();
        } else if(v.getId()==R.id.orcamento) {
            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.content_fragment,new ProjetoEletricoFragment()).commit();
        }
    }
}
