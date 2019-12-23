package ouyj.hyena.com.testnavigation;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Fragment> fragments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
    }

    private void initData() {
        fragments = new ArrayList<>(3);
        fragments.add(new HomeFragment());
        fragments.add(new SaveFragment());
        fragments.add(new FindFragment());
        fragments.add(new MimeFragment());
    }



    /**
     * 分页视图的适配器
     */
    private static class VpAdapter extends FragmentPagerAdapter {
        private List<Fragment> data;
        public VpAdapter(FragmentManager fm, List<Fragment> data) {
            super(fm);
            this.data = data;
        }
        @Override
        public int getCount() {
            return data.size();
        }
        @Override
        public Fragment getItem(int position) {
            return data.get(position);
        }
    }
}
