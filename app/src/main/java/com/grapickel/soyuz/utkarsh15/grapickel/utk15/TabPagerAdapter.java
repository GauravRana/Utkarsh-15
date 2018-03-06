package com.grapickel.soyuz.utkarsh15.grapickel.utk15;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class TabPagerAdapter extends FragmentStatePagerAdapter {
    private int fragment_count;
    private int fragment_manager_index;

    public TabPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    public TabPagerAdapter(FragmentManager fm, int fm_index, int f_count) {
        super(fm);
        this.fragment_count = f_count;
        this.fragment_manager_index = fm_index;
    }

    public Fragment getItem(int i) {
        if (this.fragment_manager_index == 0) {
            switch (i) {
                case 0:
                    return new Vogue();
                case 1:
                    return new Unplug();
                case 2:
                    return new FootLoose();
                case 3:
                    return new Dharohar();
                case 4:
                    return new Dramaturgy();
                case 5:
                    return new Aesthetica();
                default:
                    return null;
            }
        } else if (this.fragment_manager_index == 1) {
            switch (i) {
                case 0:
                    return new Rhetorical();
                case 1:
                    return new Spiel();
                case 2:
                    return new TrivPursuit();
                default:
                    return null;
            }
        } else if (this.fragment_manager_index == 2) {
            switch (i) {
                case 0:
                    return new AltIntro();
                case 1:
                    return new Cs();
                case 2:
                    return new Fifa();
                case 3:
                    return new Nfs();
                case 4:
                    return new Tekken();
                default:
                    return null;
            }
        } else if (this.fragment_manager_index != 3) {
            return null;
        } else {
            switch (i) {
                case 0:
                    return new Dex_intro();
                case 1:
                    return new Wtb();
                case 2:
                    return new Webw();
                case 3:
                    return new Logo_logic();
                case 4:
                    return new Canvasia();
                case 5:
                    return new Video();
                case 6:
                    return new Hack();
                case 7:
                    return new Crack();
                case 8:
                    return new Fix();
                default:
                    return null;
            }
        }
    }

    public int getCount() {
        return this.fragment_count;
    }
}
