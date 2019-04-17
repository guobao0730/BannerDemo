package com.casic.bannerdemo;

import android.content.Context;
import android.widget.ImageView;

import com.youth.banner.loader.ImageLoader;

/**
 * @author 郭宝
 * @project： BannerDemo
 * @package： com.casic.bannerdemo
 * @date： 2019/4/17 0017 15:00
 * @brief: 自定义ImageLoader
 */
public class MyImageLoader extends ImageLoader {


    @Override
    public void displayImage(Context context, Object path, ImageView imageView) {
        imageView.setImageResource(((BannerItem) path).pic);
    }


}
