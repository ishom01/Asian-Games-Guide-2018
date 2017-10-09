package com.user.wirawiri.aseangames2018;

import android.support.annotation.IdRes;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.user.wirawiri.aseangames2018.View.AccomodationFragement;
import com.user.wirawiri.aseangames2018.View.HomeFragement;
import com.user.wirawiri.aseangames2018.View.MapsFragement;
import com.user.wirawiri.aseangames2018.View.SettingFragement;
import com.user.wirawiri.aseangames2018.View.SportsFragement;

import it.sephiroth.android.library.bottomnavigation.BottomNavigation;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private TextView toolbarTittle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbarTittle = (TextView) findViewById(R.id.toolbarTitle);
        toolbar.setBackgroundColor(getResources().getColor(R.color.merah));
        toolbarTittle.setText("Home");

        final BottomNavigation bottomNavigationView = (BottomNavigation) findViewById(R.id.navigation);
        bottomNavigationView.setOnMenuItemClickListener(new BottomNavigation.OnMenuItemSelectionListener() {
            @Override
            public void onMenuItemSelect(@IdRes int i, int i1, boolean b) {
                if (b){
                    bottomNavigationView.getBadgeProvider().remove(i);
                    Fragment selected = null;
                    switch (i1){
                        case 0:
                            toolbar.setBackgroundColor(getResources().getColor(R.color.merah));
                            toolbarTittle.setText("Home");
                            selected = HomeFragement.newInstance();
                            break;
                        case 1:
                            toolbarTittle.setText("Sports");
                            toolbar.setBackgroundColor(getResources().getColor(R.color.kuning));
                            selected = SportsFragement.newInstance();
                            break;
                        case 2:
                            toolbarTittle.setText("Maps");
                            toolbar.setBackgroundColor(getResources().getColor(R.color.hijau));
                            selected = MapsFragement.newInstance();
                            break;
                        case 3:
                            toolbarTittle.setText("Accomodation");
                            toolbar.setBackgroundColor(getResources().getColor(R.color.biru));
                            selected = AccomodationFragement.newInstance();
                            break;
                        case 4:
                            toolbarTittle.setText("Setting");
                            toolbar.setBackgroundColor(getResources().getColor(R.color.orange));
                            selected = SettingFragement.newInstance();
                            break;
                    }
                    FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame_layout, selected);
                    transaction.commit();
                }

            }

            @Override
            public void onMenuItemReselect(@IdRes int i, int i1, boolean b) {

            }
        });

        //Manually displaying the first fragment - one time only
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_layout, HomeFragement.newInstance());
        transaction.commit();

    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}
