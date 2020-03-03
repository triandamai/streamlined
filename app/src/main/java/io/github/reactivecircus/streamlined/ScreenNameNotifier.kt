package io.github.reactivecircus.streamlined

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import io.github.reactivecircus.analytics.AnalyticsApi
import io.github.reactivecircus.streamlined.ui.Screen
import javax.inject.Inject

/**
 * Notify the analytics framework when a new [Screen] is displayed.
 */
class ScreenNameNotifier @Inject constructor(
    private val analyticsApi: AnalyticsApi
) : FragmentManager.FragmentLifecycleCallbacks() {
    override fun onFragmentResumed(fragmentManager: FragmentManager, fragment: Fragment) {
        super.onFragmentResumed(fragmentManager, fragment)
        if (fragment is Screen) {
            analyticsApi.setCurrentScreenName(
                fragment.requireActivity(),
                fragment.javaClass.simpleName,
                fragment.javaClass.simpleName
            )
        }
    }
}
