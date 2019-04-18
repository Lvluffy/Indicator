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
![ohval-hppf0](https://user-images.githubusercontent.com/34730376/56332119-a5d08780-61c1-11e9-8415-9f6227433596.gif)
