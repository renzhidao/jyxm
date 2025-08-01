package com.junge.algorithmAidePro.Fragment;

public interface BaseLogFragment {
    void clearData();

    void loadLog();

    boolean onBackPressed();

    void onLoadMore();

    void onRefresh();

    void saveLog();

    void setSearchText(String str);
}
