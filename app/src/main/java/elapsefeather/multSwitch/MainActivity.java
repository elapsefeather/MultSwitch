package elapsefeather.multSwitch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.elapsefeather.lib.MultTabLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PVAdapter adapter = new PVAdapter(this);

        ViewPager2 vp2 = findViewById(R.id.vp2);
        vp2.setAdapter(adapter);
        MultTabLayout tabLayout = findViewById(R.id.multSwitch12);
        String[] tabs = getResources().getStringArray(R.array.tab2);
        tabLayout.setText(tabs);
        adapter.setList(initPage(tabs));
        tabLayout.setViewPager(vp2);
    }

    private List<Fragment> initPage(String[] tabs) {
        List<Fragment> fragments = new ArrayList<>();
        for (int i = 0; i < tabs.length; i++) {
            fragments.add(new BlankFragment(tabs[i]));
        }
        return fragments;
    }
}