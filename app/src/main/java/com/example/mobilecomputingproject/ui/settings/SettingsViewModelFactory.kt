import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

import com.example.mobilecomputingproject.database.KeyDatabaseDao
import com.example.mobilecomputingproject.ui.settings.SettingsViewModel


/**
 * This is pretty much boiler plate code for a ViewModel Factory.
 *
 * Provides the SleepDatabaseDao and context to the ViewModel.

class SettingsViewModelFactory(
    private val dataSource: KeyDatabaseDao) : ViewModelProvider.Factory {
    //, private val application: Application
    @Suppress("unchecked_cast")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(SettingsViewModel::class.java)) {
            return SettingsViewModel(dataSource) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
 */
