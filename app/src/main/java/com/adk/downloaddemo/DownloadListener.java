package com.adk.downloaddemo;

/**
 * Created by Administrator on 2017/7/21.
 */

public interface DownloadListener {

    void onProgress(int progress);

    void onSuccess();

    void onFailed();

    void onPause();

    void onCancel();

}
