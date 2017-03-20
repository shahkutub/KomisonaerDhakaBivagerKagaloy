package com.komisonaerdhakabivagerkagaloy;

import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * Created by User on 7/20/2016.
 */
public class JelaSomuhoFragement extends BaseFragment {
    Context con;

    private TextView tvDhaka;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.jelasomuho, container, false);
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        con = getActivity();
        tvDhaka = (TextView)getView().findViewById(R.id.tvDhaka);

       // menuListView.setVisibility(View.GONE);
        tvDhaka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                JelaDialogFragment motamotDialogFragment = new JelaDialogFragment();
                motamotDialogFragment.setStyle(DialogFragment.STYLE_NORMAL, android.R.style.Theme_Black_NoTitleBar);
                motamotDialogFragment.show(getActivity().getFragmentManager(), "");
            }
        });


    }



}
