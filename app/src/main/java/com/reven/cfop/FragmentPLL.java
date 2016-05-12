package com.reven.cfop;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.joanzapata.android.BaseAdapterHelper;
import com.joanzapata.android.QuickAdapter;

import java.util.ArrayList;

public class FragmentPLL extends Fragment
{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_pll, container, false);
        initLayout(view);
        return view;
    }

    private void initLayout(View view)
    {
        final ArrayList<Integer> images = new ArrayList<>(21);
        final ArrayList<String> steps = new ArrayList<>(21);
        images.add(R.drawable.p_01);
        steps.add("(RU'R)(URUR)(<u>U</u>'R'<u>U</u>'R2)");
        images.add(R.drawable.p_02);
        steps.add("(R2'U)(RUR'<u>U</u>')(R'<u>U</u>')(R'UR')");
        images.add(R.drawable.p_03);
        steps.add("R'2(r2U)R'2(r2U2)R'2(r2U)R'2r2");
        images.add(R.drawable.p_04);
        steps.add("(UR'<u>U</u>')(RU'R)(UR<u>U</u>'R')\n(URUR2)(<u>U</u>'R'U)");
        images.add(R.drawable.p_05);
        steps.add("x'R2D2(R'<u>U</u>'R)D2(R'UR')");
        images.add(R.drawable.p_06);
        steps.add("x'(RU'R)D2(R'UR)D2R2");
        images.add(R.drawable.p_07);
        steps.add("x'L(RUR')(<u>D</u>RU')(r'R'F)rD'r'F'");
        images.add(R.drawable.p_08);
        steps.add("(RUR'<u>U</u>')(R'F)(R2<u>U</u>'R'<u>U</u>')(RUR'F')");
        images.add(R.drawable.p_09);
        steps.add("(R'URU'R'2)y'(R'U'RU)\nyx(RUR'U'R2)");
        images.add(R.drawable.p_10);
        steps.add("(R'UR'<u>U</u>')yx2(R'UR'<u>U</u>'R2)xz'\n(R'<u>U</u>'RUR)");
        images.add(R.drawable.p_11);
        steps.add("F(R<u>U</u>'R'<u>U</u>')(RUR'F')(RUR'<u>U</u>')\n(R'FRF')");
        images.add(R.drawable.p_12);
        steps.add("z(<u>U</u>'<em>R</em>D')(R2UR'<u>U</u>'R2U)z'(RU')");
        images.add(R.drawable.p_13);
        steps.add("(RUR'F')(RUR'<u>U</u>')(R'FR2<u>U</u>'R'<u>U</u>')");
        images.add(R.drawable.p_14);
        steps.add("(R'U2)(RU'<u>U</u>')(R'FRUR'<u>U</u>')\n(R'F'R2<u>U</u>')");
        images.add(R.drawable.p_15);
        steps.add("(LU'2)(L'U2)(LF'L'U'LU)(L'FL2U)");
        images.add(R.drawable.p_16);
        steps.add("(R2<u>u</u>'RU'R)(UR'u)(R2yR<u>U</u>'R)");
        images.add(R.drawable.p_17);
        steps.add("(RUR')y'(R2u')(RU'R'UR')(uR2)");
        images.add(R.drawable.p_18);
        steps.add("(R2u)(R'UR'<u>U</u>')(Ru')(R2'<em>F</em>'<em>U</em><em>F</em>)");
        images.add(R.drawable.p_19);
        steps.add("(R'd'F)(R2u)(R'U)(RU'R<u>u</u>'R2)");
        images.add(R.drawable.p_20);
        steps.add("z(UR'D R2U' RD')2z'");
        images.add(R.drawable.p_21);
        steps.add("(R'UR'F)(RF')(RU'R'F')(UF)(RUR'<u>U</u>'R)");

        QuickAdapter<Integer> adapter = new QuickAdapter<Integer>(getActivity(), R.layout.item)
        {
            @Override
            protected void convert(BaseAdapterHelper helper, Integer resId)
            {
                helper.setImageResource(R.id.iv_step, resId);
                Spanned step = Html.fromHtml(steps.get(helper.getPosition()));
                helper.setText(R.id.tv_step, step.toString());
            }
        };
        adapter.addAll(images);

        ListView lvSteps = (ListView) view.findViewById(R.id.lv_pll);
        lvSteps.setAdapter(adapter);
    }
}
