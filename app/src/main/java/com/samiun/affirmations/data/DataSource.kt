package com.samiun.affirmations.data

import com.samiun.affirmations.R
import com.samiun.affirmations.model.Affirmation

class DataSource {
    fun loadAffirmations():List<Affirmation>{
        return listOf(
            Affirmation(R.string.affirmation1, R.drawable.affirmantions4,R.string.affirmation1Broad),
            Affirmation(R.string.affirmation2,R.drawable.affirmantions2,R.string.affirmation2Broad),
            Affirmation(R.string.affirmation3,R.drawable.affirmantions3,R.string.affirmation3Broad),
            Affirmation(R.string.affirmation4, R.drawable.affirmantions10,R.string.affirmation4Broad),
            Affirmation(R.string.affirmation5, R.drawable.affirmantions5,R.string.affirmation5Broad),
            Affirmation(R.string.affirmation6, R.drawable.affirmantions6,R.string.affirmation6Broad),
            Affirmation(R.string.affirmation7, R.drawable.affirmantions7,R.string.affirmation7Broad),
            Affirmation(R.string.affirmation8, R.drawable.affirmantions8,R.string.affirmation8Broad),
            Affirmation(R.string.affirmation9, R.drawable.affirmantions9,R.string.affirmation9Broad),
            Affirmation(R.string.affirmation10, R.drawable.affirmantions1,R.string.affirmation10Broad),
        )
    }

}