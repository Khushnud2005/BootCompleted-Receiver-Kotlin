package uz.example.bootcompleted_receiver_kotlin

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class BootCompletedReceiver:BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        if (intent!!.action == "android.intent.action.BOOT_COMPLETED") {
            Toast.makeText(context, "Kotlin Device restarted", Toast.LENGTH_LONG).show()
        }
    }
}