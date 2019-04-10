package com.luffy.indicatorlib.buildins.commonnavigator.abs;

import com.luffy.indicatorlib.buildins.commonnavigator.model.PositionData;

import java.util.List;

/**
 * Created by lvlufei on 2019/4/10
 *
 * @desc 抽象的viewpager指示器，适用于CommonNavigator
 */
public interface IPagerIndicator {
    void onPageScrolled(int position, float positionOffset, int positionOffsetPixels);

    void onPageSelected(int position);

    void onPageScrollStateChanged(int state);

    void onPositionDataProvide(List<PositionData> dataList);
}
