package adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import fragments.Fragment_OfficeSchedules;
import fragments.Fragment_PersonalSchedules;

public class Adapter_ScheduleTypesViewPager extends FragmentStatePagerAdapter {


    private int mTabCount;

    public Adapter_ScheduleTypesViewPager(FragmentManager fm, int tabCount) {
        super(fm);
        mTabCount = tabCount;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {

            case 0:
                return new Fragment_PersonalSchedules();
            case 1:
                return new Fragment_OfficeSchedules();
            default:
                return null;

        }
    }

    @Override
    public int getCount() {
        return mTabCount;
    }
}
