package com.luffy.indicatorlib.abs;

/**
 * Created by lvlufei on 2019/4/10
 *
 * @desc 抽象的ViewPager导航器
 */
public interface IPagerNavigator {

    // Start——ViewPager的3个回调
    void onPageScrolled(int position, float positionOffset, int positionOffsetPixels);

    void onPageSelected(int position);

    void onPageScrollStateChanged(int state);
    // End——ViewPager的3个回调

    /**
     * 当IPagerNavigator被添加到MagicIndicator时调用
     */
    void onAttachToMagicIndicator();

    /**
     * 当IPagerNavigator从MagicIndicator上移除时调用
     */
    void onDetachFromMagicIndicator();

    /**
     * ViewPager内容改变时需要先调用此方法，自定义的IPagerNavigator应当遵守此约定
     */
    void notifyDataSetChanged();
}
