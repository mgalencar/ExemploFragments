package br.com.senaijandira.exemplofragment.fragments;
//garantia de que vai funcionar em todas as versões anteriores com extensão SUPORTE

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.com.senaijandira.exemplofragment.R;

public class Fragment1 extends Fragment {

    //para pegar o contexto dentro do fragment, usar o comando:
    //getContext()

    //metodo obrigatorio OnCreateView
    @Nullable //pode retornar nulo
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_layout1, container, false);




        return v;
    }
}
