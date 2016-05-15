package com.reven.cfop;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class ActivityMain extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.actionbar);
        setSupportActionBar(toolbar);

        final ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);
        final View tvOLL = findViewById(R.id.tv_oll);
        final View tvPLL = findViewById(R.id.tv_pll);
        tvOLL.setSelected(true);
        tvOLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvOLL.setSelected(true);
                tvPLL.setSelected(false);
                viewPager.setCurrentItem(0);
            }
        });
        tvPLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvOLL.setSelected(false);
                tvPLL.setSelected(true);
                viewPager.setCurrentItem(1);
            }
        });

        PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager());
        adapter.add(new FragmentOLL());
        adapter.add(new FragmentPLL());
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
            @Override
            public void onPageSelected(int position) {
                tvPLL.setSelected(position == 1);
                tvOLL.setSelected(position != 1);
            }
        });
    }
}
