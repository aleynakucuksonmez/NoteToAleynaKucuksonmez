package ise308.kucuksonmez.aleyna.notetoaleynakucuksonmez

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button;


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun sendNoteSelected(noteSelected: Note) {
         Note = noteSelected
         private var tempNote = Note()

    private var tempNote = Note()
    fun createNewNote(n: Note) {
        // Temporary code
        tempNote = n
    }
        // Temporary code
        val button = findViewById<View>
        (R.id.button) as Button
        button.setOnClickListener {
            // Create a new DialogShowNote called
            dialog
            val dialog = DialogShowNote()
            // Send the note via the
            sendNoteSelected function dialog.sendNoteSelected(tempNote)
            // Create the dialog
            dialog.show(supportFragmentManager, "123")
        }
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your
                    own action",
                    Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
        val dialog = DialogNewNote()
        dialog.show(supportFragmentManager, "")
        // Temporary code
        val button = findViewById<View>
        (R.id.button) as Button
        button.setOnClickListener {
            // Create a new DialogShowNote
            called dialog
            val dialog = DialogShowNote()
            // Send the note via the
            sendNoteSelected function
                    dialog.sendNoteSelected(tempNote)
            // Create the dialog

            dialog.show(supportFragmentManager, "123")
        }

































    }