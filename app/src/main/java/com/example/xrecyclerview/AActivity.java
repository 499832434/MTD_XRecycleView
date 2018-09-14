package com.example.xrecyclerview;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.jcodecraeer.xrecyclerview.ProgressStyle;
import com.jcodecraeer.xrecyclerview.SimpleViewSwitcher;
import com.jcodecraeer.xrecyclerview.progressindicator.AVLoadingIndicatorView;

/**
 * Created by zongshuo on 2018/3/22.
 */

public class AActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a);

        SimpleViewSwitcher mProgressBar1 = (SimpleViewSwitcher)findViewById(R.id.listview_header_progressbar1);
        AVLoadingIndicatorView progressView1 = new AVLoadingIndicatorView(AActivity.this);
        progressView1.setIndicatorColor(0xffB5B5B5);
        progressView1.setIndicatorId(ProgressStyle.BallScaleMultiple);
        if(mProgressBar1 != null)
            mProgressBar1.setView(progressView1);

        SimpleViewSwitcher mProgressBar2 = (SimpleViewSwitcher)findViewById(R.id.listview_header_progressbar2);
        AVLoadingIndicatorView progressView2 = new AVLoadingIndicatorView(AActivity.this);
        progressView2.setIndicatorColor(0xffB5B5B5);
        progressView2.setIndicatorId(ProgressStyle.BallPulseSync);
        if(mProgressBar2 != null)
            mProgressBar2.setView(progressView2);

        SimpleViewSwitcher mProgressBar3= (SimpleViewSwitcher)findViewById(R.id.listview_header_progressbar3);
        AVLoadingIndicatorView progressView3= new AVLoadingIndicatorView(AActivity.this);
        progressView3.setIndicatorColor(0xffB5B5B5);
        progressView3.setIndicatorId(ProgressStyle.BallBeat);
        if(mProgressBar3 != null)
            mProgressBar3.setView(progressView3);

        SimpleViewSwitcher mProgressBar4 = (SimpleViewSwitcher)findViewById(R.id.listview_header_progressbar4);
        AVLoadingIndicatorView progressView4 = new AVLoadingIndicatorView(AActivity.this);
        progressView4.setIndicatorColor(0xffB5B5B5);
        progressView4.setIndicatorId(ProgressStyle.LineScalePulseOut);
        if(mProgressBar4 != null)
            mProgressBar4.setView(progressView4);

        SimpleViewSwitcher mProgressBar5= (SimpleViewSwitcher)findViewById(R.id.listview_header_progressbar5);
        AVLoadingIndicatorView progressView5 = new AVLoadingIndicatorView(AActivity.this);
        progressView5.setIndicatorColor(0xffB5B5B5);
        progressView5.setIndicatorId(ProgressStyle.LineScalePulseOutRapid);
        if(mProgressBar5 != null)
            mProgressBar5.setView(progressView5);

        SimpleViewSwitcher mProgressBar6 = (SimpleViewSwitcher)findViewById(R.id.listview_header_progressbar6);
        AVLoadingIndicatorView progressView6 = new AVLoadingIndicatorView(AActivity.this);
        progressView6.setIndicatorColor(0xffB5B5B5);
        progressView6.setIndicatorId(ProgressStyle.BallScaleRipple);
        if(mProgressBar6 != null)
            mProgressBar6.setView(progressView6);

        SimpleViewSwitcher mProgressBar7 = (SimpleViewSwitcher)findViewById(R.id.listview_header_progressbar7);
        AVLoadingIndicatorView progressView7 = new AVLoadingIndicatorView(AActivity.this);
        progressView7.setIndicatorColor(0xffB5B5B5);
        progressView7.setIndicatorId(ProgressStyle.BallScaleRippleMultiple);
        if(mProgressBar7 != null)
            mProgressBar7.setView(progressView7);
    }
}
