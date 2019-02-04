package com.mercadolibre.android.ui.example.ui.widgets.dialog;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.mercadolibre.android.ui.example.R;
import com.mercadolibre.android.ui.example.ui.SimpleAdapter;
import com.mercadolibre.android.ui.widgets.dialogs.MeliDialog;

public class DummyListDialog extends MeliDialog {

    @Override
    public int getContentView() {
        return R.layout.dummy_recyclerview;
    }

    @Override
    public void onViewCreated(final View view,final Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        final RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.dummy_recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(new SimpleAdapter(15));
    }
}
