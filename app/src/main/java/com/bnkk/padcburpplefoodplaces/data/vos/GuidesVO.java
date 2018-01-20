package com.bnkk.padcburpplefoodplaces.data.vos;

import android.content.ContentValues;
import android.database.Cursor;

import com.bnkk.padcburpplefoodplaces.persistence.BurppleContract;
import com.google.gson.annotations.SerializedName;

/**
 * Created by E5-575G on 1/18/2018.
 */

public class GuidesVO {

    @SerializedName("burpple-guide-id")
    private String burppleGuideId;

    @SerializedName("burpple-guide-image")
    private String burppleGuideImage;

    @SerializedName("burpple-guide-title")
    private String burppleGuideTitle;

    @SerializedName("burpple-guide-desc")
    private String burppleGuideDesc;

    public String getBurppleGuideId() {
        return burppleGuideId;
    }

    public String getBurppleGuideImage() {
        return burppleGuideImage;
    }

    public String getBurppleGuideTitle() {
        return burppleGuideTitle;
    }

    public String getBurppleGuideDesc() {
        return burppleGuideDesc;
    }

    public ContentValues parseToContentValues() {
        ContentValues contentValues = new ContentValues();

        contentValues.put(BurppleContract.GuidesEntry.COLUMN_GUIDE_ID, burppleGuideId);
        contentValues.put(BurppleContract.GuidesEntry.COLUMN_GUIDE_IMAGE, burppleGuideImage);
        contentValues.put(BurppleContract.GuidesEntry.COLUMN_GUIDE_TITLE, burppleGuideTitle);
        contentValues.put(BurppleContract.GuidesEntry.COLUMN_GUIDE_DESC, burppleGuideDesc);

        return contentValues;
    }

    public static GuidesVO parseFromCursor(Cursor cursor) {
        GuidesVO guides = new GuidesVO();

        guides.burppleGuideId = cursor.getString(cursor.getColumnIndex(BurppleContract.GuidesEntry.COLUMN_GUIDE_ID));
        guides.burppleGuideImage = cursor.getString(cursor.getColumnIndex(BurppleContract.GuidesEntry.COLUMN_GUIDE_IMAGE));
        guides.burppleGuideTitle = cursor.getString(cursor.getColumnIndex(BurppleContract.GuidesEntry.COLUMN_GUIDE_TITLE));
        guides.burppleGuideDesc = cursor.getString(cursor.getColumnIndex(BurppleContract.GuidesEntry.COLUMN_GUIDE_DESC));

        return guides;
    }
}
