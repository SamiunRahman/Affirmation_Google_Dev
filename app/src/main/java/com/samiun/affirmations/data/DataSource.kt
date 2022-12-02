package com.samiun.affirmations.data

import com.samiun.affirmations.R
import com.samiun.affirmations.model.Affirmation

class DataSource {
    fun loadAffirmations():List<Affirmation>{
        return listOf(
            Affirmation(R.string.affirmation1, R.drawable.affirmantions1),
            Affirmation(R.string.affirmation2,R.drawable.affirmantions2),
            Affirmation(R.string.affirmation3,R.drawable.affirmantions3),
            Affirmation(R.string.affirmation4, R.drawable.affirmantions4),
            Affirmation(R.string.affirmation5, R.drawable.affirmantions5),
            Affirmation(R.string.affirmation6, R.drawable.affirmantions6),
            Affirmation(R.string.affirmation7, R.drawable.affirmantions7),
            Affirmation(R.string.affirmation8, R.drawable.affirmantions8),
            Affirmation(R.string.affirmation9, R.drawable.affirmantions9),
            Affirmation(R.string.affirmation10, R.drawable.affirmantions10),
        )
    }

}