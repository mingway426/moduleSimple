package com.mingway.basic;

import android.app.Application;

import com.mingway.smartloginfo_tool.LogCallBack;
import com.mingway.smartloginfo_tool.SLog;

/***
 * file name: BaseApplicaition
 * @author： lumingwei
 * @date: 2020/7/2 18:14
 * e-mail: mingwei1.lu@tcl.com
 */
class BaseApplicaition extends Application implements LogCallBack {
    final String TAG = "ModuleExample";

    @Override
    public void onCreate() {
        super.onCreate();
        SLog.init(this, TAG, this);
        SLog.d("BaseApplication", "base application init");
    }

    @Override
    public void onLog(String tag, String message, Throwable throwable) {

    }
}
