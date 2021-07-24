package _02_array_list_guestbook;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GuestBook implements ActionListener {
    public static void main(String[] args) {
        GuestBook gg = new GuestBook();
        gg.setup();
    }
    // Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names".

    // When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
    // that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
    // all the names added to the list. Format the list as follows:
    // Guest #1: Bob Banders
    // Guest #2: Sandy Summers
    // Guest #3: Greg Ganders
    // Guest #4: Donny Doners
    ArrayList<String> names = new ArrayList<String>();
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JButton addbutton = new JButton();
    JButton viewbutton = new JButton();

    public void setup() {
        addbutton.addActionListener(this);
        viewbutton.addActionListener(this);
        frame.setVisible(true);
        frame.add(panel);
        panel.add(addbutton);
        panel.add(viewbutton);
        addbutton.setText("Add Name");
        viewbutton.setText("View Names");
        frame.pack();
    }
    public void displayAllNames(){
        //iterate all the names in the Arraylist, then show it in Message dialogue
        for(int i=0;i<names.size();i++){
            String e=names.get(i);
            JOptionPane.showMessageDialog(null, "Guest #"+i+": "+e);
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addbutton) {
            String moniker;
            moniker = JOptionPane.showInputDialog("Please enter a name!");
            names.add(moniker);
        } else if (e.getSource() == viewbutton) {
            displayAllNames();
        }

    }
}


