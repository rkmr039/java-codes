import javax.swing.*; // Imports all the classes of Swing package 

class FirstFrame

{
	public static void main(String []args)
	{
 	
	// creating object of JFrame class
 	JFrame frame = new JFrame("First Frame");

 	//  to make the frame visible on screen
 	frame.setVisible(true);

 	// terminate programe while clicking on close button of frame
 	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


 	/*	// height x width of frame
 	frame.setSize(700,500);

 	// set location on screen left-matgin , top-margin  (optional)
 	frame.setLocation(100,80);
 	*/

 	// setBounds() = setLocation() + setSize()
 	// left-matgin , top-margin width,height
 	frame.setBounds(100,80,700,500);

 	// creating a buttton
 	JButton btn = new JButton("Button");

 	frame.add(btn);

 	//btn.setVisible(true);

	}

}
