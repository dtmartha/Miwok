package com.example.android.miwok;

/**
 * Created by gebruiker on 6-3-2017.
 */

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageId = NO_IMAGE_PROVIDED;
    private int mSoundId;
    private static final int NO_IMAGE_PROVIDED = -1;


    public Word(int imageResourceId, int SoundId, String DefaultTranslation, String MiwokTranslation) {
        mImageId = imageResourceId;
        mDefaultTranslation = DefaultTranslation;
        mMiwokTranslation = MiwokTranslation;
        mSoundId = SoundId;


    }

    public Word(String DefaultTranslation, String MiwokTranslation, int SoundId) {
        mDefaultTranslation = DefaultTranslation;
        mMiwokTranslation = MiwokTranslation;
        mSoundId = SoundId;



    }

    public int getImageResourceId() {
        return mImageId;
    }


    public String getDefaultTranslation() {
        return mDefaultTranslation;

    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public Boolean hasImage() {
        return mImageId != NO_IMAGE_PROVIDED;


    }



    public int getmSoundId() {
        return mSoundId;

    }


}





