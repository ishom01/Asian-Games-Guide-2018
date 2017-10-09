package com.user.wirawiri.aseangames2018.View;

import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.user.wirawiri.aseangames2018.R;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by asmarasusanto on 10/7/17.
 */

public class SportsFragement extends Fragment{

    private View viewAsli;
    private TextView txtUserName, txtUserEmail, txtUserPhone;
    private LinearLayout btnUbahPass, btnUbahPhone;
    private LinearLayout btnLogout;
    private CircleImageView userImage;

    public static SportsFragement newInstance() {
        SportsFragement fragment = new SportsFragement();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        viewAsli = inflater.inflate(R.layout.sports_fragment, container, false);
        return viewAsli;
    }

}
