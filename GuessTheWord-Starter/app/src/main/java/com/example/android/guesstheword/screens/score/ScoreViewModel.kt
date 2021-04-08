package com.example.android.guesstheword.screens.score

import android.util.Log
import androidx.lifecycle.ViewModel

/**
 * Created by nampham on 4/8/21.
 */
class ScoreViewModel(finalScore : Int) : ViewModel() {
    var score = finalScore
    init {
        Log.i("ScoreViewModel", "Final score $finalScore")
    }


}