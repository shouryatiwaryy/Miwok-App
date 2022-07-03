
package com.example.android.trymiwok;


public class word {

    /** Default translation for the word */
    private String mDefaultTranslation;

    /** Miwok translation for the word */
    private String mMiwokTranslation;
    private int mAudioResourceId;
    private int mImageResourceId=NO_IMAGE_PROVIDED;
    private static int NO_IMAGE_PROVIDED=-1;

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     *
     */
    public word(String defaultTranslation, String miwokTranslation,int AudioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    mAudioResourceId=AudioResourceId;}

    public word(String defaultTranslation, String miwokTranslation,int imageResourceId,int AudioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId=imageResourceId;
        mAudioResourceId=AudioResourceId;

    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
    public int getImageResourceId(){return mImageResourceId;}
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;}

    @Override
    public String toString() {
        return "word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mAudioResourceId=" + mAudioResourceId +
                ", mImageResourceId=" + mImageResourceId +
                '}';
    }

    public int getAudioResourceId()
        {return mAudioResourceId;

        }
    }
