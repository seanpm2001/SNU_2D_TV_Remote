// Start of script
/* Java remote script for virtual and physical Smart TV remotes 
Written in Java to fulfill the legacy of Java improving TV remotes
*/
/* Import section */
import java.util.Scanner // For input methods
/* import */ // Some library that allows hyperlinks
/* Divider */
// Smart button mapping
/* Smart button basic rules:
* Images don't have to be SVG (allowed formats: SVG, PNG, JPG, JPEG, TIFF, HEIF, HEIC, GIF, TIF, JPE, JFIF, JP2, PNS, PSD, JIF, etc.);
* Restrictions can be made to only allow https sites (or if a site isn't https, extensions like HTTPSEverywhere can be used);
* Link should be tested first (non-functional links are allowed, but are useless to the user, so they should just reprogram them if they want them to work);
* Buttons should always be reprogrammable by the user (companies should NOT restrict this. This would make the remote non-compliant with SNU Remote standards);
* Try not to modify the test button (you can if you need an extra button, but it is good for testing);
*/
testButton1MapImage = str("/Images/Example.svg"); // It is recommended to not modify the test button, but you can anyway if you need an extra button
testButton1MapURL = str("https://www.example.com"); // See above
smartButton1MapImage = str("/Images/.svg"); // Applies an image to the first smart button when displaying the button editor/button map
smartButton1MapURL = str("https://") // The hyperlink the first button goes to
smartButton2MapImage = str("/Images/.svg"); // Applies an image to the second smart button when displaying the button editor/button map
smartButton2MapURL = str("https://"); // The hyperlink the second button goes to
smartButton3MapImage = str("/Images/.svg"); // Applies an image to the third smart button when displaying the button editor/button map
smartButton3MapURL = str("https://"); // The hyperlink the third button goes to
smartButton4MapImage = str("/Images/.svg"); // Applies an image to the fourth smart button when displaying the button editor/button map
smartButton4MapURL = str("https://"); // The hyperlink the fourth button goes to
/* Locked buttons
* Most smart TV remotes only have 4 smart buttons. The buttons below should be up to customize by the user if the remote has 5 or more buttons, if not, they should not be used
* The above test button can be the 1st or the 5th button
* End of info */
smartButton5MapImage = str("/Images/.svg"); // Applies an image to the fifth smart button when displaying the button editor/button map
smartButton5MapURL = str("https://") // The hyperlink the fifth button goes to
smartButton6MapImage = str("/Images/.svg"); // Applies an image to the sixth smart button when displaying the button editor/button map
smartButton6MapURL = str("https://"); // The hyperlink the sixth button goes to
smartButton7MapImage = str("/Images/.svg"); // Applies an image to the seventh smart button when displaying the button editor/button map
smartButton7MapURL = str("https://"); // The hyperlink the seventh button goes to
smartButton8MapImage = str("/Images/.svg"); // Applies an image to the eighth smart button when displaying the button editor/button map
smartButton8MapURL = str("https://"); // The hyperlink the eighth button goes to
// I won't add buttons 9 and up for now. Raise an issue if this is necessary
/* Divider */
public class main { // Main method. Everything connects here
    public static void main(String[] args) {
    	System.out.println("SNU TV Remote");
	return SNURemoteMap(); // A method
	return smartButtonMap(); // B method
	return buttonEditor(); // C method
	break; // My firs time using break; in Java, recently learned about it. Will remove if it is unnecessary
}} // End of main method
public class SNURemoteMap { // A method
    public static void main(String[] args) {
        System.out.println("Remote map - SNU TV Remote"); // Prints the string to the console.
        System.out.println(""); // Display same results as method C 
        // Incomplete
        break;
}} // End of A method
public class smartButtonMap(); // B method
    public static void main(String[] args) {
	System.out.println("Smart button map - SNU TV Remote");
	System.out.println("Smart buttons give quick access to websites and reduce the cost of your TV hardware via sponsorships");
	// Incomplete
	break;
}} // End of B method
public class buttonEditor(); // C method
    public static void main(String[] args) {
	System.out.println("Button editor - SNU TV Remote");
	System.out.println("Power button: ");
	System.out.println("Up arrow: ");
	System.out.println("Down arrow: ");
	System.out.println("Left arrow: ");
	System.out.println("Right arrow: ");
	System.out.println("OK button: ");
	System.out.println("Back button: ");
	System.out.println("Refresh button: ");
	System.out.println("Pause button: ");
	System.out.println("Play button: ");
	System.out.println("Home button: ");
	System.out.println("Fast forward button: ");
	System.out.println("Rewind button: ");
	System.out.println("Asterisk button: ");
	System.out.println("Smart button E (Example/test button): ");
	System.out.println("Smart button 1: ");
	System.out.println("Smart button 2: ");
	System.out.println("Smart button 3: ");
	System.out.println("Smart button 4: ");
	System.out.println("Smart button 5: ");
	System.out.println("Smart button 6: ");
	System.out.println("Smart button 7: ");
	System.out.println("Smart button 8: ");
	// Incomplete
	break;
}} // End of C method
/* File info
* File version: 1 (Friday, January 8th 2021 at 7:22 pm)
* File type: Java source file (*.java)
* Line count (including blank lines and compiler line): 98
*/
// End of script
