package jp.techacademy.yoshitsugu.chap0509

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class TimezoeBroadcastReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        Toast.makeText(context, "タイムゾーンが変化しました", Toast.LENGTH_LONG).show()
    }
}
