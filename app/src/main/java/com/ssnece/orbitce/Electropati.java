package com.ssnece.orbitce;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class Electropati extends Fragment {


    private OnFragmentInteractionListener mListener;



    ImageView logo;
    TextView title,subtitle,desc,rules,prelims,inter,finals,organisers;

    public static Electropati newInstance() {
        Electropati fragment = new Electropati();
        return fragment;
    }

    public Electropati() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.events, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        logo= (ImageView) getActivity().findViewById(R.id.logo);
        title= (TextView) getActivity().findViewById(R.id.title);
        subtitle=(TextView) getActivity().findViewById(R.id.subtitle);
        desc=(TextView) getActivity().findViewById(R.id.description);
        prelims=(TextView) getActivity().findViewById(R.id.prelimscontent);
        inter=(TextView) getActivity().findViewById(R.id.intermediatecontent);
        rules=(TextView) getActivity().findViewById(R.id.rulescontent);
        finals=(TextView) getActivity().findViewById(R.id.finalscontent);
        organisers=(TextView) getActivity().findViewById(R.id.organiserscontent);

        logo.setImageDrawable(getResources().getDrawable(R.mipmap.ele));
        title.setText(R.string.electropathiTitle);
        subtitle.setText(R.string.electropathiSubtitle);
        desc.setVisibility(View.INVISIBLE);
        prelims.setText(R.string.electropathiPrelims);
        inter.setText(R.string.electropathiInter);
        rules.setText(R.string.electropathiRules);
        finals.setText(R.string.electropathiFinal);
        organisers.setText(R.string.electropathiOrganizers);

    }

    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mListener = (OnFragmentInteractionListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }


    public interface OnFragmentInteractionListener {

        public void onFragmentInteraction(Uri uri);
    }

}
