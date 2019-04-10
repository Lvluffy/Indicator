package com.luffy.indicatorlib;

/**
 * Created by lvlufei on 2019/4/10
 *
 * @desc 自定义滚动状态，消除对ViewPager的依赖
 */
public interface ScrollState {
    int SCROLL_STATE_IDLE = 0;
    int SCROLL_STATE_DRAGGING = 1;
    int SCROLL_STATE_SETTLING = 2;
}
