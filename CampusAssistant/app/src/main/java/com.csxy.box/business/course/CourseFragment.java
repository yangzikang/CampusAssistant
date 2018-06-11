package com.csxy.box.business.course;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.csxy.box.R;
import com.csxy.box.base.BaseTabFragment;

import butterknife.ButterKnife;

/**
 * Created by lihongxin on 2018/5/6.
 */
public class CourseFragment extends BaseTabFragment implements CourseContract.View {

    private CourseContract.Presenter mPresenter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View mRootView = inflater.inflate(R.layout.fragment_course, container, false);
        ButterKnife.bind(this, mRootView);
        new CoursePresenter(this);
        return mRootView;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void setPresenter(CourseContract.Presenter presenter) {
        mPresenter = presenter;
    }
}
