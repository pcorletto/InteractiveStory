package com.example.android.interactivestory.model;

import com.example.android.interactivestory.R;

/**
 * Created by hernandez on 11/26/2015.
 */
public class Story {

    private Page[] mPages;

    // Add a method to initialize our story.
    // Add a new constructor.
    public Story(){

        // Start the story with seven pages
        mPages = new Page[7];

        //Start with page 0
        //Initialize it
        mPages[0] = new Page();
        mPages[0].setImageId(R.drawable.page0);
        mPages[0].setText("test");
        mPages[0].setChoice1(new Choice());
        mPages[0].setChoice2(new Choice());

    }
}
