package com.reven.cfop;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import com.joanzapata.android.BaseAdapterHelper;
import com.joanzapata.android.QuickAdapter;

import java.util.ArrayList;

public class FragmentOLL extends Fragment
{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_oll, container, false);
        initLayout(view);
        return view;
    }

    @SuppressWarnings("SpellCheckingInspection")
    private void initLayout(View view)
    {
        final ArrayList<Integer> images = new ArrayList<>(57);
        final ArrayList<String> steps = new ArrayList<>(57);

        images.add(R.drawable.o01);
        steps.add("(R2D)(RU2R'D'RU2R)");
        images.add(R.drawable.o02);
        steps.add("(rUR'<u>U'</u>)(r'FR)F'");
        images.add(R.drawable.o03);
        steps.add("F'(rUR'<u>U'</u>)(r'FR)");
        images.add(R.drawable.o04);
        steps.add("(RU2)(R'<u>U'</u>RUR'U')(RU'R')");
        images.add(R.drawable.o05);
        steps.add("(RU2)(R2U')2(R'2U2R)");
        images.add(R.drawable.o06);
        steps.add("(R'U2)(RUR')(UR)");
        images.add(R.drawable.o07);
        steps.add("(RU2R'<u>U'</u>)(R<u>U'</u>R')");
        images.add(R.drawable.o08);
        steps.add("(rR'2U')(RU'R'U2RU'r'R)");
        images.add(R.drawable.o09);
        steps.add("(r'R2UR')(UR<u>U'</u>2R'U)(rR')");
        images.add(R.drawable.o10);
        steps.add("(r'U2)(RUR')(Ur)");
        images.add(R.drawable.o11);
        steps.add("(rU2)(R'<u>U'</u>R<u>U'</u>r')");
        images.add(R.drawable.o12);
        steps.add("(r'<u>U'</u>RU'R')(U2r)");
        images.add(R.drawable.o13);
        steps.add("(rUR')(UR<u>U'</u>2r')");
        images.add(R.drawable.o14);
        steps.add("(r<u>U'</u>r'<u>U'</u>)(rUr')(<em>F'UF</em>)");
        images.add(R.drawable.o15);
        steps.add("R'FRUR'F'R(F<u>U'</u>F')");
        images.add(R.drawable.o16);
        steps.add("(r'<u>U'</u>r)(R'<u>U'</u>RU)(r'Ur)");
        images.add(R.drawable.o17);
        steps.add("RBR'LUL'U'R<u>B</u>'R'");
        images.add(R.drawable.o18);
        steps.add("(R'U'R)y'x'(R<u>U'</u>)(R'F)(RUR')");
        images.add(R.drawable.o19);
        steps.add("(RUR')(UR'FRF')(RU'<u>U'</u>R')");
        images.add(R.drawable.o20);
        steps.add("F(RUR'<u>U'</u>)F'");
        images.add(R.drawable.o21);
        steps.add("f(RUR'<u>U'</u>)f'");
        images.add(R.drawable.o22);
        steps.add("(R'<u>U'</u>)R'FRF'(UR)");
        images.add(R.drawable.o23);
        steps.add("x'<u>U'F'</u>R'FRU");
        images.add(R.drawable.o24);
        steps.add("f(RUR'<u>U'</u>)f'<u>U'</u>(FRUR'<u>U'</u>)F'");
        images.add(R.drawable.o25);
        steps.add("f(RUR'<u>U'</u>)f'U(FRUR'<u>U'</u>)F'");
        images.add(R.drawable.o26);
        steps.add("(RU'<u>U'</u>)(R'2FRF')U2(R'FRF')");
        images.add(R.drawable.o27);
        steps.add("(FRUR'<u>U'</u>F')(fRUR'<u>U'</u>f')");
        images.add(R.drawable.o28);
        steps.add("(RU2)(R2U')(RU'R'U2)(FRF')");
        images.add(R.drawable.o29);
        steps.add("F(RUR'<u>U'</u>)2F'");
        images.add(R.drawable.o30);
        steps.add("<em>B</em>'(R'<u>U'</u>RU)2B");
        images.add(R.drawable.o31);
        steps.add("f(RUR'<u>U'</u>)2f'");
        images.add(R.drawable.o32);
        steps.add("(R'U'RU')(R'U)y'(R'URB)");
        images.add(R.drawable.o33);
        steps.add("F(RUR'<u>U'</u>)(RF')(rUR'<u>U'</u>)r'");
        images.add(R.drawable.o34);
        steps.add("R<em>B</em>'(R2F)(R2B)R2F'R");
        images.add(R.drawable.o35);
        steps.add("R'FR2B'R2F'R2BR'");
        images.add(R.drawable.o36);
        steps.add("(r'U2)(RUR'<u>U'</u>)(RUR')(Ur)");
        images.add(R.drawable.o37);
        steps.add("(rU2)(R'<u>U'</u>RUR'<u>U'</u>)(RU'r')");
        images.add(R.drawable.o38);
        steps.add("(rUR'<u>U'</u>)(r'RU)(RU'R')");
        images.add(R.drawable.o39);
        steps.add("(RUR'<u>U'</u>)(rR'U)(RU'r')");
        images.add(R.drawable.o40);
        steps.add("(R'<u>U'</u>RU)y(rUR'<u>U'</u>)r'R");
        images.add(R.drawable.o41);
        steps.add("RU'<u>U'</u>R'2FRF'(RU'<u>U'</u>R')");
        images.add(R.drawable.o42);
        steps.add("F(R<u>U'</u>R'<u>U'</u>RU)(R'F')");
        images.add(R.drawable.o43);
        steps.add("(RUR'<u>U'</u>)(R'FRF')");
        images.add(R.drawable.o44);
        steps.add("(r'RU)(RUR'<u>U'</u>)(r2R'2)(UR<u>U'</u>r')");
        images.add(R.drawable.o45);
        steps.add("(r'RU)(RUR'<u>U'</u>)(rR'2FRF')");
        images.add(R.drawable.o46);
        steps.add("(RUR')(UR'FRF')(U2R'FRF')");
        images.add(R.drawable.o47);
        steps.add("(RUR')(UR'FRF')U2(rR'URU'r')");
        images.add(R.drawable.o48);
        steps.add("(R2U'R)F(R'U)(R2<u>U'</u>)(R'F'R)");
        images.add(R.drawable.o49);
        steps.add("(R2UR'B'RU')(R'2URBR')");
        images.add(R.drawable.o50);
        steps.add("RU'R'U2RUyR<u>U'</u>R'<u>U'</u>F'");
        images.add(R.drawable.o51);
        steps.add("(R'URU'<u>U'</u>R'<u>U'</u>)(F'U)(FUR)");
        images.add(R.drawable.o52);
        steps.add("(RU)(<em>B</em>'U')(R'URBR')");
        images.add(R.drawable.o53);
        steps.add("(R'U'F)(URU'R'F'R)");
        images.add(R.drawable.o54);
        steps.add("(R'FRUR'<u>U'</u>)(F'UR)");
        images.add(R.drawable.o55);
        steps.add("(rU'r'U'r)y(RUR'f')");
        images.add(R.drawable.o56);
        steps.add("(RUR')(UR<u>U'</u>R'<u>U'</u>)(R'FRF')");
        images.add(R.drawable.o57);
        steps.add("(R'<u>U'</u>RU')(R'UR)(URB'R'B)");

        QuickAdapter<Integer> adapter = new QuickAdapter<Integer>(getActivity(), R.layout.item)
        {
            @Override
            protected void convert(BaseAdapterHelper helper, Integer resId)
            {
                helper.setImageResource(R.id.iv_step, resId);

                TextView tvStep = helper.getView(R.id.tv_step);
                int position = helper.getPosition();
                String step = (position + 1) + "> " + steps.get(position);
                tvStep.setText(Html.fromHtml(step));
            }
        };
        adapter.addAll(images);

        ListView gridView = (ListView) view.findViewById(R.id.lv_oll);
        gridView.setAdapter(adapter);
    }
}
