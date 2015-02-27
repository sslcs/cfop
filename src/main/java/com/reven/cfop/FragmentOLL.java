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

        //1: 7 cross
        images.add(R.drawable.o_01);
        steps.add("(R'U2)(RUR')(UR)");
        images.add(R.drawable.o_02);
        steps.add("(RU2R'<u>U'</u>)(RU'R')");
        images.add(R.drawable.o_03);
        steps.add("(rUR'<u>U'</u>)(r'FR)F'");
        images.add(R.drawable.o_04);
        steps.add("F'(rUR'<u>U'</u>)(r'FR)");
        images.add(R.drawable.o_05);
        steps.add("(R2D)(RU2R'D'RU2R)");
        images.add(R.drawable.o_06);
        steps.add("(RU2)(R'<u>U'</u>RUR'U')(RU'R')");
        images.add(R.drawable.o_07);
        steps.add("RU'2(R'2<u>U'</u>)(R2<u>U'</u>)R'2(U2R)");

        //2: 7 easy
        images.add(R.drawable.o_08);
        steps.add("F(RUR'<u>U'</u>)F'");
        images.add(R.drawable.o_09);
        steps.add("f(RUR'<u>U'</u>)f'");
        images.add(R.drawable.o_10);
        steps.add("f'(L'U'LU)<em>f</em>");
        images.add(R.drawable.o_11);
        steps.add("(RUR'<u>U'</u>)(R'FRF')");
        images.add(R.drawable.o_12);
        steps.add("F(RUR'<u>U'</u>)2F'");
        images.add(R.drawable.o_13);
        steps.add("<em>B</em>'(R'<u>U'</u>RU)2B");
        images.add(R.drawable.o_14);
        steps.add("f(RUR'<u>U'</u>)2f'");

        //3: 8 relative cross
        images.add(R.drawable.o_15);
        steps.add("(FRUR'<u>U'</u>F')(fRUR'<u>U'</u>f')");
        images.add(R.drawable.o_16);
        steps.add("f(RUR'<u>U'</u>)f'<u>U'</u>(FRUR'<u>U'</u>)F'");
        images.add(R.drawable.o_17);
        steps.add("f(RUR'<u>U'</u>)f'U(FRUR'<u>U'</u>)F'");
        images.add(R.drawable.o_18);
        steps.add("(RU'<u>U'</u>)(R2'FRF')U2(R'FRF')");
        images.add(R.drawable.o_19);
        steps.add("(r'U2)(RUR'U)r");
        images.add(R.drawable.o_20);
        steps.add("(rU'<u>U'</u>)(R'<u>U'</u>RU'r')");
        images.add(R.drawable.o_21);
        steps.add("rUR'URU'<u>U'</u>r'");
        images.add(R.drawable.o_22);
        steps.add("r'<u>U'</u>RU'R'U2r");

        //4: 9 OLL
        images.add(R.drawable.o_23);
        steps.add("F(R<u>U'</u>R'<u>U'</u>RU)(R'F')");
        images.add(R.drawable.o_24);
        steps.add("RU'<u>U'</u>R2'FRF'(RU'<u>U'</u>R')");
        images.add(R.drawable.o_25);
        steps.add("R<em>B</em>'(R2F)(R2B)R2F'R");
        images.add(R.drawable.o_26);
        steps.add("R'FR2B'R2F'R2BR'");
        images.add(R.drawable.o_27);
        steps.add("(r'U2)(RUR'<u>U'</u>)(RUR'U)r");
        images.add(R.drawable.o_28);
        steps.add("(rU'2)(R'<u>U'</u>RUR'<u>U'</u>)(RU'r')");
        images.add(R.drawable.o_29);
        steps.add("(RUR'U)(R'FRF'U2)R'FRF'");
        images.add(R.drawable.o_30);
        steps.add("(RUR'U)(R'FRF')U2r(R'U)RU'r'");
        images.add(R.drawable.o_31);
        steps.add("r'(RU)(RUR'<u>U'</u>)(rR'2FRF')");

        //5: 10 OLL
        images.add(R.drawable.o_32);
        steps.add("(R'U'R)y'x'(R<u>U'</u>)(R'F)(RUR')");
        images.add(R.drawable.o_33);
        steps.add("(RUR'U)(R'FRF')(RU'<u>U'</u>R')");
        images.add(R.drawable.o_34);
        steps.add("(rUR'<u>U'</u>)(r'RU)(RU'R')");
        images.add(R.drawable.o_35);
        steps.add("(RUR'<u>U'</u>r)(R'U)(RU'r')");
        images.add(R.drawable.o_36);
        steps.add("(R'<u>U'</u>)R'FRF'(UR)");
        images.add(R.drawable.o_37);
        steps.add("(R'<u>U'</u>RU)y(rUR'<u>U'</u>)r'R");
        images.add(R.drawable.o_38);
        steps.add("(RUR'U)(R<u>U'</u>R'<u>U'</u>)(R'FRF')");
        images.add(R.drawable.o_39);
        steps.add("R'U'RU'R'URUl<u>U'</u>R'U");
        images.add(R.drawable.o_40);
        steps.add("L2lU'z(UR'<u>U'</u>)(R2UR')z'rR'");
        images.add(R.drawable.o_41);
        steps.add("r'(R2UR'U)(RU'<u>U'</u>R'U)(rR')");

        //6: 8 OLL
        images.add(R.drawable.o_42);
        steps.add("(RU)(<em>B</em>'U')(R'URBR')");
        images.add(R.drawable.o_43);
        steps.add("(r'<em>F</em>'<em>U</em><em>F</em>)(LF'L'U'r)");
        images.add(R.drawable.o_44);
        steps.add("(R'FRUR'<u>U'</u>)(F'UR)");
        images.add(R.drawable.o_45);
        steps.add("(L<u>F</u>'L'<u>U'</u>LU)(FU'L')");
        images.add(R.drawable.o_46);
        steps.add("RU'R'U2RUyR<u>U'</u>R'<u>U'</u>F'");
        images.add(R.drawable.o_47);
        steps.add("(R'URU'<u>U'</u>R'<u>U'</u>)(F'U)(FUR)");
        images.add(R.drawable.o_48);
        steps.add("(R2U'R)F(R'U)(R2<u>U'</u>)(R'F'R)");
        images.add(R.drawable.o_49);
        steps.add("(R2UR'B')(RU')(R2'U)(lUl')");

        //7: 8 OLL
        images.add(R.drawable.o_50);
        steps.add("(r<u>U'</u>r'<u>U'</u>)(rUr')(<em>F'UF</em>)");
        images.add(R.drawable.o_51);
        steps.add("R'FRUR'F'R(F<u>U'</u>F')");
        images.add(R.drawable.o_52);
        steps.add("(r'<u>U'</u>r)(R'<u>U'</u>RU)(r'Ur)");
        images.add(R.drawable.o_53);
        steps.add("RBR'LUL'U'R<u>B</u>'R'");
        images.add(R.drawable.o_54);
        steps.add("(R'U'RU')(R'U)y'(R'URB)");
        images.add(R.drawable.o_55);
        steps.add("(RU'<u>U'</u>)(R'2<u>U'</u>)RU'R'U2(FRF')");
        images.add(R.drawable.o_56);
        steps.add("F(RUR'<u>U'</u>)(RF')(rUR'<u>U'</u>)r'");
        images.add(R.drawable.o_57);
        steps.add("r'(RU)(RUR'<u>U'</u>r2)(R2'U)(R<u>U'</u>)r'");

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
