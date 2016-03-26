package com.bignerdranch.android.criminalintent;

import android.content.Context;

/**
 * Created by timur on 26.03.2016.
 */
public class CrimeLab {
    private static CrimeLab sCrimeLab;
    public static CrimeLab get(Context context)
    {
        if (sCrimeLab == null) {
            sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;
    }
    CrimeLab(Context context){

    }
}
