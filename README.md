# Indicator
指示器

## gradle使用：

一、Project下的build.gradle文件下添加

allprojects {
    repositories {
      ...
      maven { url 'https://jitpack.io' }
    }
}

二、Module下的build.gradle文件下添加

dependencies {
          compile 'com.github.Lvluffy:Indicator:1.0.0'
}

或者

dependencies {
          implementation 'com.github.Lvluffy:Indicator:1.0.0'
}

## 录屏
![o7mkw-7pnpa](https://user-images.githubusercontent.com/34730376/56338540-03260200-61dd-11e9-84ad-02de9f4ccd1d.gif)
