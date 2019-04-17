package com.casic.bannerdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.Transformer;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public static List<BannerItem> BANNER_ITEMS = new ArrayList<BannerItem>(){{
        add(new BannerItem( R.mipmap.image_movie_header_48621499931969370));
        add(new BannerItem( R.mipmap.image_movie_header_12981501221820220));
        add(new BannerItem(R.mipmap.image_movie_header_12231501221682438));
    }};

    public static List<String> titles = new ArrayList<String>(){{
        add("最后的骑士");
        add("三生三世十里桃花");
        add("豆福传");
    }};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

    }

    private void initView() {

        Banner banner = findViewById(R.id.banner);
        //设置banner样式
        banner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR_TITLE_INSIDE);
        //设置图片加载器
        banner.setImageLoader(new MyImageLoader());
        //设置图片集合
        banner.setImages(BANNER_ITEMS);
        //设置banner动画效果
        banner.setBannerAnimation(Transformer.BackgroundToForeground);
        //设置标题集合（当banner样式有显示title时）
        banner.setBannerTitles(titles);
        //设置自动轮播，默认为true
        banner.isAutoPlay(true);
        //设置轮播时间
        banner.setDelayTime(1500);
        //设置指示器位置（当banner模式中有指示器时）
        banner.setIndicatorGravity(BannerConfig.CENTER);
        //banner设置方法全部调用完毕时最后调用
        banner.start();



    }



}
