package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Form
            extends JFrame
            implements ActionListener {

        private Container c;
        private JLabel title;
        private JLabel firstname;
        private JTextField tname;
        private JLabel lastname;
        private JTextField tname2;
        private JLabel gender;
        private JRadioButton male;
        private JRadioButton female;
        private ButtonGroup gengp;
        private JLabel married;
        private JRadioButton yes;
        private JRadioButton no;
        private ButtonGroup marriedgp;
        private JLabel dob;
        private JComboBox date;
        private JComboBox month;
        private JComboBox year;
        private JLabel add;
        private JTextArea tadd;
        private JCheckBox term;
        private JButton sub;
        private JButton reset;
        private JLabel res;
        private String dates[]
            = { "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15",
            "16", "17", "18", "19", "20",
            "21", "22", "23", "24", "25",
            "26", "27", "28", "29", "30",
            "31" };
        private String months[]
            = { "Jan", "feb", "Mar", "Apr",
            "May", "Jun", "July", "Aug",
            "Sup", "Oct", "Nov", "Dec" };
         private String years[]
            = { "1995", "1996", "1997", "1998",
            "1999", "2000", "2001", "2002",
            "2003", "2004", "2005", "2006",
            "2007", "2008", "2009", "2010",
            "2011", "2012", "2013", "2014",
            "2015", "2016", "2017", "2018",
            "2019" };

    public Form()
        {
            setTitle("Registration Form");
            setBounds(150, 90, 600, 600);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setResizable(false);

            c = getContentPane();
            c.setLayout(null);

            title = new JLabel("Form");
            title.setFont(new Font("Arial", Font.PLAIN, 30));
            title.setSize(300, 30);
            title.setLocation(280, 30);
            c.add(title);

            firstname = new JLabel("First Name");
            firstname.setFont(new Font("Arial", Font.PLAIN, 20));
            firstname.setSize(100, 20);
            firstname.setLocation(100, 100);
            c.add(firstname);

            tname = new JTextField();
            tname.setFont(new Font("Arial", Font.PLAIN, 15));
            tname.setSize(190, 20);
            tname.setLocation(200, 100);
            c.add(tname);

            lastname = new JLabel("Last Name");
            lastname.setFont(new Font("Arial", Font.PLAIN, 20));
            lastname.setSize(100, 20);
            lastname.setLocation(100, 150);
            c.add(lastname);

            tname2 = new JTextField();
            tname2.setFont(new Font("Arial", Font.PLAIN, 15));
            tname2.setSize(190, 20);
            tname2.setLocation(200, 150);
            c.add(tname2);

            gender = new JLabel("Gender:");
            gender.setFont(new Font("Arial", Font.PLAIN, 20));
            gender.setSize(100, 20);
            gender.setLocation(100, 200);
            c.add(gender);

            male = new JRadioButton("Male");
            male.setFont(new Font("Arial", Font.PLAIN, 15));
            male.setSelected(true);
            male.setSize(75, 20);
            male.setLocation(200, 200);
            c.add(male);

            female = new JRadioButton("Female");
            female.setFont(new Font("Arial", Font.PLAIN, 15));
            female.setSelected(false);
            female.setSize(80, 20);
            female.setLocation(275, 200);
            c.add(female);

            gengp = new ButtonGroup();
            gengp.add(male);
            gengp.add(female);

            married = new JLabel("Married:");
            married.setFont(new Font("Arial", Font.PLAIN, 20));
            married.setSize(100, 20);
            married.setLocation(100, 250);
            c.add(married);

            yes = new JRadioButton("Yes");
            yes.setFont(new Font("Arial", Font.PLAIN, 15));
            yes.setSelected(true);
            yes.setSize(75, 20);
            yes.setLocation(200, 250);
            c.add(yes);

            no = new JRadioButton("No");
            no.setFont(new Font("Arial", Font.PLAIN, 15));
            no.setSelected(false);
            no.setSize(80, 20);
            no.setLocation(275, 250);
            c.add(no);

            marriedgp = new ButtonGroup();
            marriedgp.add(yes);
            marriedgp.add(no);

            dob = new JLabel("DOB");
            dob.setFont(new Font("Arial", Font.PLAIN, 20));
            dob.setSize(100, 20);
            dob.setLocation(100, 300);
            c.add(dob);

            date = new JComboBox(dates);
            date.setFont(new Font("Arial", Font.PLAIN, 15));
            date.setSize(50, 20);
            date.setLocation(200, 300);
            c.add(date);

            month = new JComboBox(months);
            month.setFont(new Font("Arial", Font.PLAIN, 15));
            month.setSize(60, 20);
            month.setLocation(260, 300);
            c.add(month);

            year = new JComboBox(years);
            year.setFont(new Font("Arial", Font.PLAIN, 15));
            year.setSize(60, 20);
            year.setLocation(330, 300);
            c.add(year);

            add = new JLabel("Address");
            add.setFont(new Font("Arial", Font.PLAIN, 20));
            add.setSize(100, 20);
            add.setLocation(100, 350);
            c.add(add);

            tadd = new JTextArea();
            tadd.setFont(new Font("Arial", Font.PLAIN, 15));
            tadd.setSize(200, 75);
            tadd.setLocation(200, 350);
            tadd.setLineWrap(true);
            c.add(tadd);

            term = new JCheckBox("Accept Terms And Conditions.");
            term.setFont(new Font("Arial", Font.PLAIN, 15));
            term.setSize(250, 20);
            term.setLocation(150, 440);
            c.add(term);

            sub = new JButton("Submit");
            sub.setFont(new Font("Arial", Font.PLAIN, 15));
            sub.setSize(100, 20);
            sub.setLocation(150, 470);
            sub.addActionListener(this);
            c.add(sub);

            reset = new JButton("Reset");
            reset.setFont(new Font("Arial", Font.PLAIN, 15));
            reset.setSize(100, 20);
            reset.setLocation(270, 470);
            reset.addActionListener(this);
            c.add(reset);

            res = new JLabel("");
            res.setFont(new Font("Arial", Font.PLAIN, 20));
            res.setSize(500, 25);
            res.setLocation(100, 500);
            c.add(res);

            setVisible(true);
        }

        public void actionPerformed(ActionEvent e)
        {
            if (e.getSource() == sub) {
                if (term.isSelected()) {
                    String data1;
                    String datafn = "First Name : " + tname.getText() + "\n";
                    String dataln = "Last Name : " + tname2.getText() + "\n";
                    if (male.isSelected())
                        data1 = "Gender : Male"
                                + "\n";
                    else
                        data1 = "Gender : Female"
                                + "\n";
                    String data2;
                    if (yes.isSelected())
                        data2 = "Married : Yes"
                                + "\n";
                    else
                        data2 = "Married : No"
                                + "\n";
                    String data3
                            = "DOB : "
                            +date.getSelectedItem()
                            + "/" +month.getSelectedItem()
                            + "/" + year.getSelectedItem()
                            + "\n";
                    String data4 = "Address : " + tadd.getText();
                    c.removeAll();
                    c.revalidate();
                    c.repaint();

                    JLabel titlel = new JLabel("Your info.");
                    titlel.setFont(new Font("Arial", Font.PLAIN, 30));
                    titlel.setSize(300, 30);
                    titlel.setBounds(250, 0, 600, 50);
                    c.add(titlel);

                    JLabel dataFN = new JLabel(""+datafn);
                    dataFN.setFont(new Font("Arial", Font.PLAIN, 20));
                    dataFN.setBounds(25, 50, 600, 50);
                    c.add(dataFN);

                    JLabel dataLN = new JLabel(""+dataln);
                    dataLN.setFont(new Font("Arial", Font.PLAIN, 20));
                    dataLN.setBounds(25, 100, 600, 50);
                    c.add(dataLN);

                    JLabel data1l = new JLabel(""+data1);
                    data1l.setFont(new Font("Arial", Font.PLAIN, 20));
                    data1l.setBounds(25, 150, 600, 50);
                    c.add(data1l);

                    JLabel data2l = new JLabel("\r\n"+data2);
                    data2l.setFont(new Font("Arial", Font.PLAIN, 20));
                    data2l.setBounds(25, 200, 600, 50);
                    c.add(data2l);

                    JLabel data3l = new JLabel(""+data3);
                    data3l.setFont(new Font("Arial", Font.PLAIN, 20));
                    data3l.setBounds(25, 250, 600, 50);
                    c.add(data3l);

                    JLabel data4l = new JLabel(""+data4);
                    data4l.setFont(new Font("Arial", Font.PLAIN, 20));
                    data4l.setBounds(25, 300, 600, 50);
                    c.add(data4l);
                }
                else{
                    res.setText("Please accept Terms and Conditions..");
                }
            }
            else if (e.getSource() == reset) {
                String def = "";
                tname.setText(def);
                tadd.setText(def);
                tname2.setText(def);
                res.setText(def);
                term.setSelected(false);
                date.setSelectedIndex(0);
                month.setSelectedIndex(0);
                year.setSelectedIndex(0);
            }
        }
}

