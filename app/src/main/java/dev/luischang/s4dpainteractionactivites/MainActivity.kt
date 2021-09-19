package dev.luischang.s4dpainteractionactivites

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etMessage: EditText= findViewById(R.id.etMessage)
        val btnSend: Button = findViewById(R.id.btnSend)

        btnSend.setOnClickListener {
            Toast.makeText(this,
                "Hello World",
                Toast.LENGTH_LONG).show()
            val messageDetail = etMessage.text.toString()
            this.sendMessage(messageDetail)
        }

    }

    private fun sendMessage(message: String)
    {
        val intent = Intent(this,ResultActivity::class.java)
        intent.putExtra("param",message)
        startActivity(intent);
    }


}