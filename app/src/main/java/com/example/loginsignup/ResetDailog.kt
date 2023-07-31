package com.example.loginsignup

import android.app.Activity
import android.widget.Button
import android.widget.EditText
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog

fun Activity.setupBottomSheetDialog(
    onSendClick:(String) -> Unit,
){
    val dialog = BottomSheetDialog(this)
    val view= layoutInflater.inflate(R.layout.reset_password,null)
    dialog.setContentView(view)
    dialog.behavior.state=BottomSheetBehavior.STATE_EXPANDED
    dialog.show()

    val edEmail = view.findViewById<EditText>(R.id.edEmail)
    val btnSend = view.findViewById<Button>(R.id.btn_send)
    val btnCancel=view.findViewById<Button>(R.id.btn_cancel)

    btnSend.setOnClickListener {
        val email = edEmail.text.toString().trim()
        onSendClick(email)
    }
    btnCancel.setOnClickListener {
        dialog.dismiss()
    }
}