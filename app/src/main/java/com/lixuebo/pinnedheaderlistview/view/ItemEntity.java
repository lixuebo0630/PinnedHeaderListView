package com.lixuebo.pinnedheaderlistview.view;

/**
 * Created by lixuebo on 17/5/8.
 */
 public class ItemEntity {
    private String mTitle;
    private String mContent;

    public ItemEntity(String pTitle, String pContent) {
        mTitle = pTitle;
        mContent = pContent;
    }

    public String getTitle() {
        return mTitle;
    }
    public String getContent() {
        return mContent;
    }
}

