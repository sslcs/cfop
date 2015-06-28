package com.reven.cfop;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;

import jp.wasabeef.recyclerview.animators.SlideInLeftAnimator;

public class FragmentBLD extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_pll, container, false);
        initLayout(view);
        return view;
    }
    
    @SuppressWarnings("SpellCheckingInspection")
    private void initLayout(View view) {
        final ArrayList<Integer> images = new ArrayList<>(4);
        final ArrayList<String> steps = new ArrayList<>(4);
        images.add(R.drawable.bld_1);
        steps.add("RUR'URU2R'L'U'LU'L'U2L");
        images.add(R.drawable.bld_2);
        steps.add("L'U2LULULRU2R'U'RU'R'");
        images.add(R.drawable.bld_3);
        steps.add("(M'U)2M'U2(MU)2MU2");
        images.add(R.drawable.bld_4);
        steps.add("R U'L'U R'U2 L U'L'U2 L");

        RecyclerView rvPLL = (RecyclerView) view.findViewById(R.id.rv_pll);
        rvPLL.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayout.VERTICAL, false));

        FormulaAdapter adapter = new FormulaAdapter(getActivity(), images, steps);
        rvPLL.setAdapter(adapter);
    }
}
