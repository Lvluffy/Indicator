package com.luffy.indicatorlib.buildins.commonnavigator.abs;

/**
 * Created by lvlufei on 2019/4/10
 *
 * @desc 可测量内容区域的指示器标题
 */
public interface IMeasurablePagerTitleView extends IPagerTitleView {
    int getContentLeft();

    int getContentTop();

    int getContentRight();

    int getContentBottom();
}
