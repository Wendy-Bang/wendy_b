package com.gam4.sampleapplication;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.DynamicDrawableSpan;
import android.text.style.ImageSpan;
import android.util.Log;

public class TabActionActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager; //ViewPager 참조변수


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_action);

        viewPager = (ViewPager) findViewById(R.id.main_view_pager);
        viewPager.setAdapter(new CustomAdapter(getSupportFragmentManager(), getApplicationContext()));
        tabLayout = (TabLayout) findViewById(R.id.main_tab_layout);
        tabLayout.setupWithViewPager(viewPager);

        /**
         * TabLayout의 동작을 설정하는 부분
         */
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }
        });
    }

    /**
     * ViewPager의 동작을 설정하는 부분
     */
    private class CustomAdapter extends FragmentPagerAdapter {
        private String fragments[] = {"flag1", "flag2", "flag3"};

        public CustomAdapter(FragmentManager supportFragmentManager, Context applicationContext) {
            super(supportFragmentManager);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0:
                    return new Fragment1();
                case 1:
                    return new Fragment2();
                case 2:
                    return new Fragment3();
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            return fragments.length;
        }

        Drawable myDrawable;
        String title;

        @Override
        public CharSequence getPageTitle(int position) {
            return fragments[position];
//            switch (position) {
//                case 0:
//                    myDrawable = getResources().getDrawable(R.drawable.img_section1);
//                    title = fragments[position];
//                    break;
//                case 1:
//                    myDrawable = getResources().getDrawable(R.drawable.img_section2);
//                    title = fragments[position];    //getResources().getString(R.string.title_section2);
//                    break;
//                case 2:
//                    myDrawable = getResources().getDrawable(R.drawable.img_section3);
//                    title = fragments[position];    //getResources().getString(R.string.title_section3);
//                    break;
//                default:
//                    break;
//            }
//
//            SpannableStringBuilder sb = new SpannableStringBuilder("   " + title); // space added before text for convenience
//
//            //try {
//                myDrawable.setBounds(5, 5, myDrawable.getIntrinsicWidth(), myDrawable.getIntrinsicHeight());
//                ImageSpan span = new ImageSpan(myDrawable, DynamicDrawableSpan.ALIGN_BASELINE);
//                sb.setSpan(span, 0, 1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
//            //} catch (Exception e) {
//                // TODO: handle exception
//            }
//
//            return sb;//fragments[position];
        }


    }
}
