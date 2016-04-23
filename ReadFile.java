/*
 * Simple Web Browser feature's an address bar for query search and 
the main window that display's search results.
 */
package readfile;

/**
 *
 * @author Marty
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;


public class ReadFile  extends JFrame{  // extend's JFrame in order to make the GUI
    
    private JTextField addressBar;
   // private jEditorPane display;
    private JEditorPane display;
    private JTextField outPut;
    
    //constructor
    public ReadFile(){
        super("Marty Browser");  //show's in title of frame 
        
        outPut = new JTextField(); // textfield for displaying success or error msg on GUI...
        addressBar = new JTextField("enter a URL...include full URL http:// ect...");        
        addressBar.addActionListener(
               new ActionListener(){  // inner class
               public void actionPerformed(ActionEvent event){ 
                   loadSearchResults(event.getActionCommand());  // get string from jTextField: addressBar                   
               }         
               });
        add(addressBar, BorderLayout.NORTH); // laying out the GUI components...
       // add(display, BorderLayout.CENTER);
       display = new JEditorPane();
       display.setEditable(false);
       display.addHyperlinkListener(  // a listener that sit's on top of every single link returned from search
               new HyperlinkListener(){  // and waits for you to click one of those links...
                    public void hyperlinkUpdate(HyperlinkEvent event){ // hyperlink events are click, rollover, rollaway
                        if(event.getEventType()==HyperlinkEvent.EventType.ACTIVATED)
                        {  // did user click link?
                            loadSearchResults(event.getURL().toString());                        
                        }
                    }
               } // END OF HyperlinkListener inner class
           );   // END OF LISTENER (contain's an inner class)
           add(new JScrollPane(display), BorderLayout.CENTER); // inserting display with an added scroll object in GUI
           setSize(800,400);
           setVisible(true); // set's the JScrollPane object to visible(scrollbar)-- display object embedded inside the 
           add(outPut, BorderLayout.SOUTH);                                                                // scroll object
        
       //        addressBar.setToolTipText("Enter URL String ");
       //     }
           
    }   // END OF CONSTRUCTOR SCOPE
    
    // method that display's  search results...
    private void  loadSearchResults(String userQueryText){
        try{   
            outPut.setText(" ");  // clears outPut field when doing a new search...
            display.setPage(userQueryText);
            addressBar.setText(userQueryText);
            outPut.setText(" Successful Search Result! ");
           
            
        }catch(Exception e){   // try - catch blocks keep your app from crashing due to invalid user input...
            System.out.println("Couldn't fetch URL. ");  // output to console
            outPut.setText("Couldn't fetch URL. ");  // output to GUI
        }
    } 
} // END OF CLASS SCOPE
