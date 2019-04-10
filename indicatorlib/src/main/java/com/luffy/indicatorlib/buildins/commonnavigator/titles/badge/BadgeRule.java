package com.luffy.indicatorlib.buildins.commonnavigator.titles.badge;

/**
 * Created by lvlufei on 2019/4/10
 *
 * @desc 角标的定位规则
 */
public class BadgeRule {
    private BadgeAnchor mAnchor;
    private int mOffset;

    public BadgeRule(BadgeAnchor anchor, int offset) {
        mAnchor = anchor;
        mOffset = offset;
    }

    public BadgeAnchor getAnchor() {
        return mAnchor;
    }

    public void setAnchor(BadgeAnchor anchor) {
        mAnchor = anchor;
    }

    public int getOffset() {
        return mOffset;
    }

    public void setOffset(int offset) {
        mOffset = offset;
    }
}
