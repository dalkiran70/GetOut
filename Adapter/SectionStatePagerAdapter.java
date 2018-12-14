package Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.bilkent.subfly.getout.FragmentCategories;
import com.bilkent.subfly.getout.FragmentCreate;
import com.bilkent.subfly.getout.FragmentMain;

import java.util.ArrayList;
/**
 * @author : Caglar Cankaya
 */
public class SectionStatePagerAdapter extends FragmentPagerAdapter {

    private ArrayList<Fragment> pages;

    public SectionStatePagerAdapter(FragmentManager fm) {
        super(fm);
        pages = new ArrayList<>();
        FragmentMain main = new FragmentMain();
        pages.add(main.newIntance());
        FragmentCategories categories = new FragmentCategories();
        pages.add(categories.newInstance());
        FragmentCreate create = new FragmentCreate();
        pages.add(create.newInstance());
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return pages.get(2);
            case 1:
                return pages.get(0);
            case 2:
                return pages.get(1);
            default:
                return pages.get(0);
        }
    }

    @Override
    public int getCount(){
       return 3;
    }
}
