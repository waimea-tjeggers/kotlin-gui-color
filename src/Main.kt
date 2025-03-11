/**
 * ===============================================================
 * Kotlin GUI Basic Starter
 * ===============================================================
 *
 * This is a starter project for a simple Kotlin GUI application.
 * The Java Swing library is used, plus the FlatLAF look-and-feel
 * for a reasonably modern look.
 */

import com.formdev.flatlaf.FlatDarkLaf
import java.awt.*
import java.awt.event.*
import javax.swing.*


/**
 * Launch the application
 */
fun main() {
    FlatDarkLaf.setup()     // Flat, dark look-and-feel
    MainWindow()            // Create and show the UI
}


/**
 * Main UI window (view)
 * Defines the UI and responds to events
 * The app model should be passwd as an argument
 */
class MainWindow : JFrame(), ActionListener {

    // Fields to hold the UI elements
    private lateinit var redDownButton: JButton
    private lateinit var redUpButton: JButton
    private lateinit var greenUpButton: JButton
    private lateinit var greenDownButton: JButton
    private lateinit var blueUpButton: JButton
    private lateinit var blueDownButton: JButton
    private lateinit var RLabel: JLabel
    private lateinit var GLabel: JLabel
    private lateinit var BLabel: JLabel


    /**
     * Configure the UI and display it
     */
    init {
        configureWindow()               // Configure the window
        addControls()                   // Build the UI

        setLocationRelativeTo(null)     // Centre the window
        isVisible = true                // Make it visible
    }

    /**
     * Configure the main window
     */
    private fun configureWindow() {
        title = "Kotlin Swing GUI Demo"
        contentPane.preferredSize = Dimension(500, 350)
        defaultCloseOperation = WindowConstants.EXIT_ON_CLOSE
        isResizable = false
        layout = null

        pack()
    }

    /**
     * Populate the UI with UI controls
     */
    private fun addControls() {
        val defaultFont = Font(Font.SANS_SERIF, Font.PLAIN, 30)

        redUpButton = JButton("+")
        redUpButton.bounds = Rectangle(220,40,30,30)
        redUpButton.font = defaultFont
        redUpButton.background = Color.RED
        redUpButton.addActionListener(this)     // Handle any clicks
        add(redUpButton)

        redDownButton = JButton("-")
        redDownButton.bounds = Rectangle(220, 80, 30 , 30)
        redDownButton.font = defaultFont
        redDownButton.background = Color.RED
        redDownButton.addActionListener(this)
        add(redDownButton)

        greenUpButton = JButton("+")
        greenUpButton.bounds = Rectangle(220,140,30,30)
        greenUpButton.font = defaultFont
        greenUpButton.background = Color.GREEN
        greenUpButton.addActionListener(this)     // Handle any clicks
        add(greenUpButton)

        greenDownButton = JButton("-")
        greenDownButton.bounds = Rectangle(220, 180, 30 , 30)
        greenDownButton.font = defaultFont
        greenDownButton.background = Color.GREEN
        greenDownButton.addActionListener(this)
        add(greenDownButton)

        blueUpButton = JButton("+")
        blueUpButton.bounds = Rectangle(220,240,30,30)
        blueUpButton.font = defaultFont
        blueUpButton.background = Color.BLUE
        blueUpButton.addActionListener(this)     // Handle any clicks
        add(blueUpButton)

        blueDownButton = JButton("-")
        blueDownButton.bounds = Rectangle(220, 280, 30 , 30)
        blueDownButton.font = defaultFont
        blueDownButton.background = Color.BLUE
        blueDownButton.addActionListener(this)
        add(blueDownButton)

        RLabel = JLabel("R")
        RLabel.bounds = Rectangle (40, 40, 70, 30 )
        RLabel.font = defaultFont
        RLabel.foreground = Color.RED
        add(RLabel)

        GLabel = JLabel("G")
        GLabel.bounds = Rectangle (40, 140, 70, 30)
        GLabel.font = defaultFont
        GLabel.foreground = Color.GREEN
        add(GLabel)

        BLabel = JLabel("B")
        BLabel.bounds = Rectangle (40 ,240 ,70 ,30 )
        BLabel.font = defaultFont
        BLabel.foreground = Color.BLUE
        add(BLabel)

    }


    /**
     * Handle any UI events (e.g. button clicks)
     */
    override fun actionPerformed(e: ActionEvent?) {
        when (e?.source) {

        }
    }

}

