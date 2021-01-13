package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Quiz
    extends JFrame
        implements ActionListener {
    int counter=0,trueA,falseA,percent;
    private Container c;
    private JLabel title1;
    private JLabel title2;
    private JLabel title3;
    private JLabel title4;
    private JLabel title5;
    private JLabel titleFinal;
    private JLabel titleBetween;
    private JLabel question1;
    private JRadioButton answer1Q1;
    private JRadioButton answer2Q1;
    private JRadioButton answer3Q1;
    private JRadioButton answer4Q1;
    private ButtonGroup q1B;
    private JLabel question1TextC;
    private JLabel question1TextB;
    private JLabel question2;
    private JRadioButton answer1Q2;
    private JRadioButton answer2Q2;
    private JRadioButton answer3Q2;
    private JRadioButton answer4Q2;
    private ButtonGroup q2B;
    private JLabel question2TextC;
    private JLabel question2TextB1;
    private JLabel question2TextB2;
    private JLabel question2TextB3;
    private JLabel question3;
    private JRadioButton answer1Q3;
    private JRadioButton answer2Q3;
    private JRadioButton answer3Q3;
    private JRadioButton answer4Q3;
    private ButtonGroup q3B;
    private JLabel question3TextC;
    private JLabel question3TextB;
    private JLabel question4;
    private JRadioButton answer1Q4;
    private JRadioButton answer2Q4;
    private JRadioButton answer3Q4;
    private JRadioButton answer4Q4;
    private ButtonGroup q4B;
    private JLabel question4TextC;
    private JLabel question4TextB;
    private JLabel question5;
    private JRadioButton answer1Q5;
    private JRadioButton answer2Q5;
    private JRadioButton answer3Q5;
    private JRadioButton answer4Q5;
    private ButtonGroup q5B;
    private JLabel question5TextC;
    private JLabel question5TextB;
    private JButton next1;
    private JButton next2;
    private JButton next3;
    private JButton next4;
    private JButton next5;
    private JButton next6;
    private JButton next7;
    private JButton next8;
    private JButton next9;
    private JButton next10;
    private JButton exit;

    public Quiz() {
        setTitle("Quiz");
        setBounds(150, 90, 600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        c = getContentPane();
        c.setLayout(null);

        title1 = new JLabel("Question 1-5");
        title1.setFont(new Font("Arial", Font.PLAIN, 40));
        title1.setSize(300, 30);
        title1.setLocation(200, 30);
        c.add(title1);

        question1 = new JLabel("1.Who is the immortal queen?");
        question1.setFont(new Font("Arial", Font.PLAIN, 25));
        question1.setSize(600, 30);
        question1.setLocation(50, 80);
        c.add(question1);

        answer1Q1 = new JRadioButton("a. Mark Zuckerberg");
        answer1Q1.setFont(new Font("Arial", Font.PLAIN, 20));
        answer1Q1.setSize(600, 30);
        answer1Q1.setLocation(50, 120);
        c.add(answer1Q1);

        answer2Q1 = new JRadioButton("b. Elizabeth Alexandra Mary");
        answer2Q1.setFont(new Font("Arial", Font.PLAIN, 20));
        answer2Q1.setSize(600, 30);
        answer2Q1.setLocation(50, 150);
        c.add(answer2Q1);

        answer3Q1 = new JRadioButton("c. Donald John Trump");
        answer3Q1.setFont(new Font("Arial", Font.PLAIN, 20));
        answer3Q1.setSize(600, 30);
        answer3Q1.setLocation(50, 180);
        c.add(answer3Q1);

        answer4Q1 = new JRadioButton("d. Will Smith");
        answer4Q1.setFont(new Font("Arial", Font.PLAIN, 20));
        answer4Q1.setSize(600, 30);
        answer4Q1.setLocation(50, 210);
        c.add(answer4Q1);

        q1B = new ButtonGroup();
        q1B.add(answer1Q1);
        q1B.add(answer2Q1);
        q1B.add(answer3Q1);
        q1B.add(answer4Q1);

        next1 = new JButton("Next");
        next1.setFont(new Font("Arial", Font.PLAIN, 25));
        next1.setSize(100, 30);
        next1.setLocation(250, 250);
        next1.addActionListener(this);
        c.add(next1);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {



        //INTREBAREA1

        if (e.getSource() == next1) {
            if (answer2Q1.isSelected()) {
                counter=counter+1;
                c.removeAll();
                c.revalidate();
                c.repaint();

                titleBetween = new JLabel("Your answer");
                titleBetween.setFont(new Font("Arial", Font.PLAIN, 40));
                titleBetween.setSize(300, 30);
                titleBetween.setLocation(200, 30);
                c.add(titleBetween);

                JLabel answer1L= new JLabel("A: Elizabeth Alexandra Mary");
                answer1L.setFont(new Font("Arial", Font.PLAIN, 25));
                answer1L.setSize(600, 30);
                answer1L.setLocation(50, 80);
                c.add(answer1L);

                question1TextC = new JLabel("Ah yes,i see you are a man of culture.");
                question1TextC.setFont(new Font("Arial", Font.PLAIN, 25));
                question1TextC.setSize(600, 30);
                question1TextC.setLocation(50, 120);
                c.add(question1TextC);

                next2 = new JButton("Next");
                next2.setFont(new Font("Arial", Font.PLAIN, 25));
                next2.setSize(100, 30);
                next2.setLocation(250, 250);
                next2.addActionListener(this);
                c.add(next2);
            }
            else if(answer1Q1.isSelected()){
                c.removeAll();
                c.revalidate();
                c.repaint();

                titleBetween = new JLabel("Your answer");
                titleBetween.setFont(new Font("Arial", Font.PLAIN, 40));
                titleBetween.setSize(300, 30);
                titleBetween.setLocation(200, 30);
                c.add(titleBetween);

                JLabel answer1L= new JLabel("A: Mark Zuckerberg");
                answer1L.setFont(new Font("Arial", Font.PLAIN, 25));
                answer1L.setSize(600, 30);
                answer1L.setLocation(50, 80);
                c.add(answer1L);

                question1TextB = new JLabel("Man,i said QUEEN didn't I?");
                question1TextB.setFont(new Font("Arial", Font.PLAIN, 25));
                question1TextB.setSize(600, 30);
                question1TextB.setLocation(50, 120);
                c.add(question1TextB);

                JLabel answer1cL= new JLabel("Correct answer: Elizabeth Alexandra Mary");
                answer1cL.setFont(new Font("Arial", Font.PLAIN, 25));
                answer1cL.setSize(600, 30);
                answer1cL.setLocation(50, 160);
                c.add(answer1cL);

                next2 = new JButton("Next");
                next2.setFont(new Font("Arial", Font.PLAIN, 25));
                next2.setSize(100, 30);
                next2.setLocation(250, 250);
                next2.addActionListener(this);
                c.add(next2);
            }

            else if(answer1Q1.isSelected()){
                c.removeAll();
                c.revalidate();
                c.repaint();

                titleBetween = new JLabel("Your answer");
                titleBetween.setFont(new Font("Arial", Font.PLAIN, 40));
                titleBetween.setSize(300, 30);
                titleBetween.setLocation(200, 30);
                c.add(titleBetween);

                JLabel answer1L= new JLabel("A: Donald John Trump");
                answer1L.setFont(new Font("Arial", Font.PLAIN, 25));
                answer1L.setSize(600, 30);
                answer1L.setLocation(50, 80);
                c.add(answer1L);

                question1TextB = new JLabel("Man,i said QUEEN didn't I?");
                question1TextB.setFont(new Font("Arial", Font.PLAIN, 25));
                question1TextB.setSize(600, 30);
                question1TextB.setLocation(50, 120);
                c.add(question1TextB);

                JLabel answer1cL= new JLabel("Correct answer: Elizabeth Alexandra Mary");
                answer1cL.setFont(new Font("Arial", Font.PLAIN, 25));
                answer1cL.setSize(600, 30);
                answer1cL.setLocation(50, 160);
                c.add(answer1cL);

                next2 = new JButton("Next");
                next2.setFont(new Font("Arial", Font.PLAIN, 25));
                next2.setSize(100, 30);
                next2.setLocation(250, 250);
                next2.addActionListener(this);
                c.add(next2);
            }

            else {
                c.removeAll();
                c.revalidate();
                c.repaint();

                titleBetween = new JLabel("Your answer");
                titleBetween.setFont(new Font("Arial", Font.PLAIN, 40));
                titleBetween.setSize(300, 30);
                titleBetween.setLocation(200, 30);
                c.add(titleBetween);

                JLabel answer1L= new JLabel("A: Will Smith");
                answer1L.setFont(new Font("Arial", Font.PLAIN, 25));
                answer1L.setSize(600, 30);
                answer1L.setLocation(50, 80);
                c.add(answer1L);

                question1TextB = new JLabel("Man,i said QUEEN didn't I?");
                question1TextB.setFont(new Font("Arial", Font.PLAIN, 25));
                question1TextB.setSize(600, 30);
                question1TextB.setLocation(50, 120);
                c.add(question1TextB);

                JLabel answer1cL= new JLabel("Correct answer: Elizabeth Alexandra Mary");
                answer1cL.setFont(new Font("Arial", Font.PLAIN, 25));
                answer1cL.setSize(600, 30);
                answer1cL.setLocation(50, 160);
                c.add(answer1cL);

                next2 = new JButton("Next");
                next2.setFont(new Font("Arial", Font.PLAIN, 25));
                next2.setSize(100, 30);
                next2.setLocation(250, 250);
                next2.addActionListener(this);
                c.add(next2);
            }

        }

        //INTREBAREA2

        if (e.getSource() == next2) {
            c.removeAll();
            c.revalidate();
            c.repaint();

            title2 = new JLabel("Question 2-5");
            title2.setFont(new Font("Arial", Font.PLAIN, 40));
            title2.setSize(300, 30);
            title2.setLocation(200, 30);
            c.add(title2);

            question2 = new JLabel("2. Who will be USA president in 2020?");
            question2.setFont(new Font("Arial", Font.PLAIN, 25));
            question2.setSize(600, 30);
            question2.setLocation(50, 80);
            c.add(question2);

            answer1Q2 = new JRadioButton("a. Costinas Alexandru");
            answer1Q2.setFont(new Font("Arial", Font.PLAIN, 20));
            answer1Q2.setSize(600, 30);
            answer1Q2.setLocation(50, 120);
            c.add(answer1Q2);

            answer2Q2 = new JRadioButton("b. Donald John Trump");
            answer2Q2.setFont(new Font("Arial", Font.PLAIN, 20));
            answer2Q2.setSize(600, 30);
            answer2Q2.setLocation(50, 150);
            c.add(answer2Q2);

            answer3Q2 = new JRadioButton("c. Joe Biden");
            answer3Q2.setFont(new Font("Arial", Font.PLAIN, 20));
            answer3Q2.setSize(600, 30);
            answer3Q2.setLocation(50, 180);
            c.add(answer3Q2);

            answer4Q2 = new JRadioButton("d. Fernando Magellan");
            answer4Q2.setFont(new Font("Arial", Font.PLAIN, 20));
            answer4Q2.setSize(600, 30);
            answer4Q2.setLocation(50, 210);
            c.add(answer4Q2);

            q2B = new ButtonGroup();
            q2B.add(answer1Q2);
            q2B.add(answer2Q2);
            q2B.add(answer3Q2);
            q2B.add(answer4Q2);

            next3 = new JButton("Next");
            next3.setFont(new Font("Arial", Font.PLAIN, 25));
            next3.setSize(100, 30);
            next3.setLocation(250, 250);
            next3.addActionListener(this);
            c.add(next3);
        }
        if (e.getSource() == next3) {
            if (answer3Q2.isSelected()) {
                    counter=counter+1;
                    c.removeAll();
                    c.revalidate();
                    c.repaint();

                    titleBetween = new JLabel("Your answer");
                    titleBetween.setFont(new Font("Arial", Font.PLAIN, 40));
                    titleBetween.setSize(300, 30);
                    titleBetween.setLocation(200, 30);
                    c.add(titleBetween);

                    JLabel answer2L= new JLabel("A: Joe Biden");
                    answer2L.setFont(new Font("Arial", Font.PLAIN, 25));
                    answer2L.setSize(600, 30);
                    answer2L.setLocation(50, 80);
                    c.add(answer2L);

                    question2TextC = new JLabel("Sadly it is correct. :(");
                    question2TextC.setFont(new Font("Arial", Font.PLAIN, 25));
                    question2TextC.setSize(600, 30);
                    question2TextC.setLocation(50, 120);
                    c.add(question2TextC);

                    next4 = new JButton("Next");
                    next4.setFont(new Font("Arial", Font.PLAIN, 25));
                    next4.setSize(100, 30);
                    next4.setLocation(250, 250);
                    next4.addActionListener(this);
                    c.add(next4);
                }
                else if(answer1Q2.isSelected()){
                    c.removeAll();
                    c.revalidate();
                    c.repaint();

                    titleBetween = new JLabel("Your answer");
                    titleBetween.setFont(new Font("Arial", Font.PLAIN, 40));
                    titleBetween.setSize(300, 30);
                    titleBetween.setLocation(200, 30);
                    c.add(titleBetween);

                    JLabel answer2L= new JLabel("A: Costinas Alexandru");
                    answer2L.setFont(new Font("Arial", Font.PLAIN, 25));
                    answer2L.setSize(600, 30);
                    answer2L.setLocation(50, 80);
                    c.add(answer2L);

                    question2TextB1 = new JLabel("It would be hella nice,but that's not correct. :(");
                    question2TextB1.setFont(new Font("Arial", Font.PLAIN, 25));
                    question2TextB1.setSize(600, 30);
                    question2TextB1.setLocation(50, 120);
                    c.add(question2TextB1);

                    JLabel answer2cL= new JLabel("Correct answer: Joe Biden");
                    answer2cL.setFont(new Font("Arial", Font.PLAIN, 25));
                    answer2cL.setSize(600, 30);
                    answer2cL.setLocation(50, 160);
                    c.add(answer2cL);

                    next4 = new JButton("Next");
                    next4.setFont(new Font("Arial", Font.PLAIN, 25));
                    next4.setSize(100, 30);
                    next4.setLocation(250, 250);
                    next4.addActionListener(this);
                    c.add(next4);
                }

                else if(answer2Q2.isSelected()){
                    c.removeAll();
                    c.revalidate();
                    c.repaint();

                    titleBetween = new JLabel("Your answer");
                    titleBetween.setFont(new Font("Arial", Font.PLAIN, 40));
                    titleBetween.setSize(300, 30);
                    titleBetween.setLocation(200, 30);
                    c.add(titleBetween);

                    JLabel answer2L= new JLabel("A: Donald John Trump");
                    answer2L.setFont(new Font("Arial", Font.PLAIN, 25));
                    answer2L.setSize(600, 30);
                    answer2L.setLocation(50, 80);
                    c.add(answer2L);

                    question2TextB2 = new JLabel("Incorrect! Not this time Trump.");
                    question2TextB2.setFont(new Font("Arial", Font.PLAIN, 25));
                    question2TextB2.setSize(600, 30);
                    question2TextB2.setLocation(50, 120);
                    c.add(question2TextB2);

                    JLabel answer2cL= new JLabel("Correct answer: Joe Biden");
                    answer2cL.setFont(new Font("Arial", Font.PLAIN, 25));
                    answer2cL.setSize(600, 30);
                    answer2cL.setLocation(50, 160);
                    c.add(answer2cL);

                    next4 = new JButton("Next");
                    next4.setFont(new Font("Arial", Font.PLAIN, 25));
                    next4.setSize(100, 30);
                    next4.setLocation(250, 250);
                    next4.addActionListener(this);
                    c.add(next4);
                }
                else {
                    c.removeAll();
                    c.revalidate();
                    c.repaint();

                    titleBetween = new JLabel("Your answer");
                    titleBetween.setFont(new Font("Arial", Font.PLAIN, 40));
                    titleBetween.setSize(300, 30);
                    titleBetween.setLocation(200, 30);
                    c.add(titleBetween);

                    JLabel answer2L= new JLabel("A: Fernando Magellan");
                    answer2L.setFont(new Font("Arial", Font.PLAIN, 25));
                    answer2L.setSize(600, 30);
                    answer2L.setLocation(50, 80);
                    c.add(answer2L);

                    question2TextB3 = new JLabel("He should have met the immortal queen in 1480.");
                    question2TextB3.setFont(new Font("Arial", Font.PLAIN, 20));
                    question2TextB3.setSize(600, 30);
                    question2TextB3.setLocation(50, 120);
                    c.add(question2TextB3);

                    JLabel answer2cL= new JLabel("Correct answer: Joe Biden");
                    answer2cL.setFont(new Font("Arial", Font.PLAIN, 25));
                    answer2cL.setSize(600, 30);
                    answer2cL.setLocation(50, 160);
                    c.add(answer2cL);

                    next4 = new JButton("Next");
                    next4.setFont(new Font("Arial", Font.PLAIN, 25));
                    next4.setSize(100, 30);
                    next4.setLocation(250, 250);
                    next4.addActionListener(this);
                    c.add(next4);
                }
            }

        //INTREBAREA3

        if(e.getSource()==next4){
                c.removeAll();
                c.revalidate();
                c.repaint();

                title3 = new JLabel("Question 3-5");
                title3.setFont(new Font("Arial", Font.PLAIN, 40));
                title3.setSize(300, 30);
                title3.setLocation(200, 30);
                c.add(title3);

                question3 = new JLabel("3. How many hearts does an octopus have?");
                question3.setFont(new Font("Arial", Font.PLAIN, 25));
                question3.setSize(600, 30);
                question3.setLocation(50, 80);
                c.add(question3);

                answer1Q3 = new JRadioButton("a. 5");
                answer1Q3.setFont(new Font("Arial", Font.PLAIN, 20));
                answer1Q3.setSize(600, 30);
                answer1Q3.setLocation(50, 120);
                c.add(answer1Q3);

                answer2Q3 = new JRadioButton("b. 7");
                answer2Q3.setFont(new Font("Arial", Font.PLAIN, 20));
                answer2Q3.setSize(600, 30);
                answer2Q3.setLocation(50, 150);
                c.add(answer2Q3);

                answer3Q3 = new JRadioButton("c. 3");
                answer3Q3.setFont(new Font("Arial", Font.PLAIN, 20));
                answer3Q3.setSize(600, 30);
                answer3Q3.setLocation(50, 180);
                c.add(answer3Q3);

                answer4Q3 = new JRadioButton("d. 1");
                answer4Q3.setFont(new Font("Arial", Font.PLAIN, 20));
                answer4Q3.setSize(600, 30);
                answer4Q3.setLocation(50, 210);
                c.add(answer4Q3);

                q3B = new ButtonGroup();
                q3B.add(answer1Q3);
                q3B.add(answer2Q3);
                q3B.add(answer3Q3);
                q3B.add(answer4Q3);

                next5 = new JButton("Next");
                next5.setFont(new Font("Arial", Font.PLAIN, 25));
                next5.setSize(100, 30);
                next5.setLocation(250, 250);
                next5.addActionListener(this);
                c.add(next5);
            }
        if(e.getSource()==next5) {
            if (answer3Q3.isSelected()) {
                counter=counter+1;
                c.removeAll();
                c.revalidate();
                c.repaint();

                titleBetween = new JLabel("Your answer");
                titleBetween.setFont(new Font("Arial", Font.PLAIN, 40));
                titleBetween.setSize(300, 30);
                titleBetween.setLocation(200, 30);
                c.add(titleBetween);

                JLabel answer3L= new JLabel("A: 3");
                answer3L.setFont(new Font("Arial", Font.PLAIN, 25));
                answer3L.setSize(600, 30);
                answer3L.setLocation(50, 80);
                c.add(answer3L);

                question3TextC = new JLabel("Yep, that's correct.");
                question3TextC.setFont(new Font("Arial", Font.PLAIN, 25));
                question3TextC.setSize(600, 30);
                question3TextC.setLocation(50, 120);
                c.add(question3TextC);

                next6 = new JButton("Next");
                next6.setFont(new Font("Arial", Font.PLAIN, 25));
                next6.setSize(100, 30);
                next6.setLocation(250, 250);
                next6.addActionListener(this);
                c.add(next6);
            }
            else if(answer1Q3.isSelected()){
                c.removeAll();
                c.revalidate();
                c.repaint();

                titleBetween = new JLabel("Your answer");
                titleBetween.setFont(new Font("Arial", Font.PLAIN, 40));
                titleBetween.setSize(300, 30);
                titleBetween.setLocation(200, 30);
                c.add(titleBetween);

                JLabel answer3L= new JLabel("A: 5");
                answer3L.setFont(new Font("Arial", Font.PLAIN, 25));
                answer3L.setSize(600, 30);
                answer3L.setLocation(50, 80);
                c.add(answer3L);

                question3TextB = new JLabel("Nope.");
                question3TextB.setFont(new Font("Arial", Font.PLAIN, 25));
                question3TextB.setSize(600, 30);
                question3TextB.setLocation(50, 120);
                c.add(question3TextB);

                JLabel answer3cL= new JLabel("Correct answer: 3");
                answer3cL.setFont(new Font("Arial", Font.PLAIN, 25));
                answer3cL.setSize(600, 30);
                answer3cL.setLocation(50, 160);
                c.add(answer3cL);

                next6 = new JButton("Next");
                next6.setFont(new Font("Arial", Font.PLAIN, 25));
                next6.setSize(100, 30);
                next6.setLocation(250, 250);
                next6.addActionListener(this);
                c.add(next6);
            }

            else if(answer2Q3.isSelected()){
                c.removeAll();
                c.revalidate();
                c.repaint();

                titleBetween = new JLabel("Your answer");
                titleBetween.setFont(new Font("Arial", Font.PLAIN, 40));
                titleBetween.setSize(300, 30);
                titleBetween.setLocation(200, 30);
                c.add(titleBetween);

                JLabel answer3L= new JLabel("A: 7");
                answer3L.setFont(new Font("Arial", Font.PLAIN, 25));
                answer3L.setSize(600, 30);
                answer3L.setLocation(50, 80);
                c.add(answer3L);

                question3TextB = new JLabel("Nope.");
                question3TextB.setFont(new Font("Arial", Font.PLAIN, 25));
                question3TextB.setSize(600, 30);
                question3TextB.setLocation(50, 120);
                c.add(question3TextB);

                JLabel answer3cL= new JLabel("Correct answer: 3");
                answer3cL.setFont(new Font("Arial", Font.PLAIN, 25));
                answer3cL.setSize(600, 30);
                answer3cL.setLocation(50, 160);
                c.add(answer3cL);

                next6 = new JButton("Next");
                next6.setFont(new Font("Arial", Font.PLAIN, 25));
                next6.setSize(100, 30);
                next6.setLocation(250, 250);
                next6.addActionListener(this);
                c.add(next6);
            }
            else {
                c.removeAll();
                c.revalidate();
                c.repaint();

                titleBetween = new JLabel("Your answer");
                titleBetween.setFont(new Font("Arial", Font.PLAIN, 40));
                titleBetween.setSize(300, 30);
                titleBetween.setLocation(200, 30);
                c.add(titleBetween);

                JLabel answer3L= new JLabel("A: 1");
                answer3L.setFont(new Font("Arial", Font.PLAIN, 25));
                answer3L.setSize(600, 30);
                answer3L.setLocation(50, 80);
                c.add(answer3L);

                question3TextB = new JLabel("Nope.");
                question3TextB.setFont(new Font("Arial", Font.PLAIN, 25));
                question3TextB.setSize(600, 30);
                question3TextB.setLocation(50, 120);
                c.add(question3TextB);

                JLabel answer3cL= new JLabel("Correct answer: 3");
                answer3cL.setFont(new Font("Arial", Font.PLAIN, 25));
                answer3cL.setSize(600, 30);
                answer3cL.setLocation(50, 160);
                c.add(answer3cL);

                next6 = new JButton("Next");
                next6.setFont(new Font("Arial", Font.PLAIN, 25));
                next6.setSize(100, 30);
                next6.setLocation(250, 250);
                next6.addActionListener(this);
                c.add(next6);
            }
        }

        //INTREBAREA4

        if(e.getSource()==next6){
            c.removeAll();
            c.revalidate();
            c.repaint();

            title4 = new JLabel("Question 4-5");
            title4.setFont(new Font("Arial", Font.PLAIN, 40));
            title4.setSize(300, 30);
            title4.setLocation(200, 30);
            c.add(title4);

            question4 = new JLabel("4. In Bible, who is known for building an ark?");
            question4.setFont(new Font("Arial", Font.PLAIN, 25));
            question4.setSize(600, 30);
            question4.setLocation(50, 80);
            c.add(question4);

            answer1Q4 = new JRadioButton("a. Nemo");
            answer1Q4.setFont(new Font("Arial", Font.PLAIN, 20));
            answer1Q4.setSize(600, 30);
            answer1Q4.setLocation(50, 120);
            c.add(answer1Q4);

            answer2Q4 = new JRadioButton("b. Noah");
            answer2Q4.setFont(new Font("Arial", Font.PLAIN, 20));
            answer2Q4.setSize(600, 30);
            answer2Q4.setLocation(50, 150);
            c.add(answer2Q4);

            answer3Q4 = new JRadioButton("c. Chris Brown");
            answer3Q4.setFont(new Font("Arial", Font.PLAIN, 20));
            answer3Q4.setSize(600, 30);
            answer3Q4.setLocation(50, 180);
            c.add(answer3Q4);

            answer4Q4 = new JRadioButton("d. Harambe");
            answer4Q4.setFont(new Font("Arial", Font.PLAIN, 20));
            answer4Q4.setSize(600, 30);
            answer4Q4.setLocation(50, 210);
            c.add(answer4Q4);

            q4B = new ButtonGroup();
            q4B.add(answer1Q4);
            q4B.add(answer2Q4);
            q4B.add(answer3Q4);
            q4B.add(answer4Q4);

            next7 = new JButton("Next");
            next7.setFont(new Font("Arial", Font.PLAIN, 25));
            next7.setSize(100, 30);
            next7.setLocation(250, 250);
            next7.addActionListener(this);
            c.add(next7);
        }
        if(e.getSource()==next7) {
            if (answer2Q4.isSelected()) {
                counter=counter+1;
                c.removeAll();
                c.revalidate();
                c.repaint();

                titleBetween = new JLabel("Your answer");
                titleBetween.setFont(new Font("Arial", Font.PLAIN, 40));
                titleBetween.setSize(300, 30);
                titleBetween.setLocation(200, 30);
                c.add(titleBetween);

                JLabel answer4L= new JLabel("A: Noah");
                answer4L.setFont(new Font("Arial", Font.PLAIN, 25));
                answer4L.setSize(600, 30);
                answer4L.setLocation(50, 80);
                c.add(answer4L);

                question4TextC = new JLabel("Man you are good,that's correct.");
                question4TextC.setFont(new Font("Arial", Font.PLAIN, 25));
                question4TextC.setSize(600, 30);
                question4TextC.setLocation(50, 120);
                c.add(question4TextC);

                next8 = new JButton("Next");
                next8.setFont(new Font("Arial", Font.PLAIN, 25));
                next8.setSize(100, 30);
                next8.setLocation(250, 250);
                next8.addActionListener(this);
                c.add(next8);
            }
            else if(answer1Q4.isSelected()){
                c.removeAll();
                c.revalidate();
                c.repaint();

                titleBetween = new JLabel("Your answer");
                titleBetween.setFont(new Font("Arial", Font.PLAIN, 40));
                titleBetween.setSize(300, 30);
                titleBetween.setLocation(200, 30);
                c.add(titleBetween);

                JLabel answer4L= new JLabel("A: Nemo");
                answer4L.setFont(new Font("Arial", Font.PLAIN, 25));
                answer4L.setSize(600, 30);
                answer4L.setLocation(50, 80);
                c.add(answer4L);

                question4TextB = new JLabel("Really? =)) That's not correct.");
                question4TextB.setFont(new Font("Arial", Font.PLAIN, 25));
                question4TextB.setSize(600, 30);
                question4TextB.setLocation(50, 120);
                c.add(question4TextB);

                JLabel answer4cL= new JLabel("Correct answer: Noah");
                answer4cL.setFont(new Font("Arial", Font.PLAIN, 25));
                answer4cL.setSize(600, 30);
                answer4cL.setLocation(50, 160);
                c.add(answer4cL);

                next8 = new JButton("Next");
                next8.setFont(new Font("Arial", Font.PLAIN, 25));
                next8.setSize(100, 30);
                next8.setLocation(250, 250);
                next8.addActionListener(this);
                c.add(next8);
            }

            else if(answer3Q4.isSelected()){
                c.removeAll();
                c.revalidate();
                c.repaint();

                titleBetween = new JLabel("Your answer");
                titleBetween.setFont(new Font("Arial", Font.PLAIN, 40));
                titleBetween.setSize(300, 30);
                titleBetween.setLocation(200, 30);
                c.add(titleBetween);

                JLabel answer4L= new JLabel("A: Chris Brown");
                answer4L.setFont(new Font("Arial", Font.PLAIN, 25));
                answer4L.setSize(600, 30);
                answer4L.setLocation(50, 80);
                c.add(answer4L);

                question4TextB = new JLabel("Really? =)) That's not correct.");
                question4TextB.setFont(new Font("Arial", Font.PLAIN, 25));
                question4TextB.setSize(600, 30);
                question4TextB.setLocation(50, 120);
                c.add(question4TextB);

                JLabel answer4cL= new JLabel("Correct answer: Noah");
                answer4cL.setFont(new Font("Arial", Font.PLAIN, 25));
                answer4cL.setSize(600, 30);
                answer4cL.setLocation(50, 160);
                c.add(answer4cL);

                next8 = new JButton("Next");
                next8.setFont(new Font("Arial", Font.PLAIN, 25));
                next8.setSize(100, 30);
                next8.setLocation(250, 250);
                next8.addActionListener(this);
                c.add(next8);
            }
            else {
                c.removeAll();
                c.revalidate();
                c.repaint();

                titleBetween = new JLabel("Your answer");
                titleBetween.setFont(new Font("Arial", Font.PLAIN, 40));
                titleBetween.setSize(300, 30);
                titleBetween.setLocation(200, 30);
                c.add(titleBetween);

                JLabel answer4L= new JLabel("A: Harambe");
                answer4L.setFont(new Font("Arial", Font.PLAIN, 25));
                answer4L.setSize(600, 30);
                answer4L.setLocation(50, 80);
                c.add(answer4L);

                question4TextB = new JLabel("Really? =)) That's not correct.");
                question4TextB.setFont(new Font("Arial", Font.PLAIN, 25));
                question4TextB.setSize(600, 30);
                question4TextB.setLocation(50, 120);
                c.add(question4TextB);

                JLabel answer4cL= new JLabel("Correct answer: Noah");
                answer4cL.setFont(new Font("Arial", Font.PLAIN, 25));
                answer4cL.setSize(600, 30);
                answer4cL.setLocation(50, 160);
                c.add(answer4cL);

                next8 = new JButton("Next");
                next8.setFont(new Font("Arial", Font.PLAIN, 25));
                next8.setSize(100, 30);
                next8.setLocation(250, 250);
                next8.addActionListener(this);
                c.add(next8);
            }
        }

        //INTREBAREA5

        if(e.getSource()==next8){
            c.removeAll();
            c.revalidate();
            c.repaint();

            title5 = new JLabel("Question 5-5");
            title5.setFont(new Font("Arial", Font.PLAIN, 40));
            title5.setSize(300, 30);
            title5.setLocation(200, 30);
            c.add(title5);

            question5 = new JLabel("5. Where was the fortune cookie invented?");
            question5.setFont(new Font("Arial", Font.PLAIN, 25));
            question5.setSize(600, 30);
            question5.setLocation(50, 80);
            c.add(question5);

            answer1Q5 = new JRadioButton("a. San Francisco");
            answer1Q5.setFont(new Font("Arial", Font.PLAIN, 20));
            answer1Q5.setSize(600, 30);
            answer1Q5.setLocation(50, 120);
            c.add(answer1Q5);

            answer2Q5 = new JRadioButton("b. Beijing");
            answer2Q5.setFont(new Font("Arial", Font.PLAIN, 20));
            answer2Q5.setSize(600, 30);
            answer2Q5.setLocation(50, 150);
            c.add(answer2Q5);

            answer3Q5 = new JRadioButton("c. Oradea");
            answer3Q5.setFont(new Font("Arial", Font.PLAIN, 20));
            answer3Q5.setSize(600, 30);
            answer3Q5.setLocation(50, 180);
            c.add(answer3Q5);

            answer4Q5 = new JRadioButton("d. Tokyo");
            answer4Q5.setFont(new Font("Arial", Font.PLAIN, 20));
            answer4Q5.setSize(600, 30);
            answer4Q5.setLocation(50, 210);
            c.add(answer4Q5);

            q5B = new ButtonGroup();
            q5B.add(answer1Q5);
            q5B.add(answer2Q5);
            q5B.add(answer3Q5);
            q5B.add(answer4Q5);

            next9 = new JButton("Next");
            next9.setFont(new Font("Arial", Font.PLAIN, 25));
            next9.setSize(100, 30);
            next9.setLocation(250, 250);
            next9.addActionListener(this);
            c.add(next9);
        }
        if(e.getSource()==next9){
            if (answer1Q5.isSelected()) {
                counter=counter+1;
                c.removeAll();
                c.revalidate();
                c.repaint();

                titleBetween = new JLabel("Your answer");
                titleBetween.setFont(new Font("Arial", Font.PLAIN, 40));
                titleBetween.setSize(300, 30);
                titleBetween.setLocation(200, 30);
                c.add(titleBetween);

                JLabel answer5L= new JLabel("A: San Fransisco");
                answer5L.setFont(new Font("Arial", Font.PLAIN, 25));
                answer5L.setSize(600, 30);
                answer5L.setLocation(50, 80);
                c.add(answer5L);

                question5TextC = new JLabel("Didn't see that coming? Correct!");
                question5TextC.setFont(new Font("Arial", Font.PLAIN, 25));
                question5TextC.setSize(600, 30);
                question5TextC.setLocation(50, 120);
                c.add(question5TextC);

                next10 = new JButton("Next");
                next10.setFont(new Font("Arial", Font.PLAIN, 25));
                next10.setSize(100, 30);
                next10.setLocation(250, 250);
                next10.addActionListener(this);
                c.add(next10);
            }
            else if(answer2Q5.isSelected()){
                c.removeAll();
                c.revalidate();
                c.repaint();

                titleBetween = new JLabel("Your answer");
                titleBetween.setFont(new Font("Arial", Font.PLAIN, 40));
                titleBetween.setSize(300, 30);
                titleBetween.setLocation(200, 30);
                c.add(titleBetween);

                JLabel answer5L= new JLabel("A: Beijing");
                answer5L.setFont(new Font("Arial", Font.PLAIN, 25));
                answer5L.setSize(600, 30);
                answer5L.setLocation(50, 80);
                c.add(answer5L);

                question5TextB = new JLabel("Close but not really.");
                question5TextB.setFont(new Font("Arial", Font.PLAIN, 25));
                question5TextB.setSize(600, 30);
                question5TextB.setLocation(50, 120);
                c.add(question5TextB);

                JLabel answer5cL= new JLabel("Correct answer: San Fransisco");
                answer5cL.setFont(new Font("Arial", Font.PLAIN, 25));
                answer5cL.setSize(600, 30);
                answer5cL.setLocation(50, 160);
                c.add(answer5cL);

                next10 = new JButton("Next");
                next10.setFont(new Font("Arial", Font.PLAIN, 25));
                next10.setSize(100, 30);
                next10.setLocation(250, 250);
                next10.addActionListener(this);
                c.add(next10);
            }

            else if(answer3Q5.isSelected()){
                c.removeAll();
                c.revalidate();
                c.repaint();

                titleBetween = new JLabel("Your answer");
                titleBetween.setFont(new Font("Arial", Font.PLAIN, 40));
                titleBetween.setSize(300, 30);
                titleBetween.setLocation(200, 30);
                c.add(titleBetween);

                JLabel answer5L= new JLabel("A: Oradea");
                answer5L.setFont(new Font("Arial", Font.PLAIN, 25));
                answer5L.setSize(600, 30);
                answer5L.setLocation(50, 80);
                c.add(answer5L);

                JLabel question5TextB1 = new JLabel("Cmon man =))))...Incorrect!");
                question5TextB1.setFont(new Font("Arial", Font.PLAIN, 25));
                question5TextB1.setSize(600, 30);
                question5TextB1.setLocation(50, 120);
                c.add(question5TextB1);

                JLabel answer5cL= new JLabel("Correct answer: San Fransisco");
                answer5cL.setFont(new Font("Arial", Font.PLAIN, 25));
                answer5cL.setSize(600, 30);
                answer5cL.setLocation(50, 160);
                c.add(answer5cL);

                next10 = new JButton("Next");
                next10.setFont(new Font("Arial", Font.PLAIN, 25));
                next10.setSize(100, 30);
                next10.setLocation(250, 250);
                next10.addActionListener(this);
                c.add(next10);
            }
            else {
                c.removeAll();
                c.revalidate();
                c.repaint();

                titleBetween = new JLabel("Your answer");
                titleBetween.setFont(new Font("Arial", Font.PLAIN, 40));
                titleBetween.setSize(300, 30);
                titleBetween.setLocation(200, 30);
                c.add(titleBetween);

                JLabel answer5L= new JLabel("A: Tokyo");
                answer5L.setFont(new Font("Arial", Font.PLAIN, 25));
                answer5L.setSize(600, 30);
                answer5L.setLocation(50, 80);
                c.add(answer5L);

                question5TextB = new JLabel("Close but not really.");
                question5TextB.setFont(new Font("Arial", Font.PLAIN, 25));
                question5TextB.setSize(600, 30);
                question5TextB.setLocation(50, 120);
                c.add(question5TextB);

                JLabel answer5cL= new JLabel("Correct answer: San Fransisco");
                answer5cL.setFont(new Font("Arial", Font.PLAIN, 25));
                answer5cL.setSize(600, 30);
                answer5cL.setLocation(50, 160);
                c.add(answer5cL);

                next10 = new JButton("Next");
                next10.setFont(new Font("Arial", Font.PLAIN, 25));
                next10.setSize(100, 30);
                next10.setLocation(250, 250);
                next10.addActionListener(this);
                c.add(next10);
            }
        }

        //FINAL

        if(e.getSource()==next10){
            c.removeAll();
            c.revalidate();
            c.repaint();

            trueA=counter;
            falseA=5-counter;
            percent=counter*100/5;

            titleFinal = new JLabel("Summary");
            titleFinal.setFont(new Font("Arial", Font.PLAIN, 40));
            titleFinal.setSize(300, 30);
            titleFinal.setLocation(200, 30);
            c.add(titleFinal);

            JLabel correctAnswers = new JLabel("Correct answers: "+trueA);
            correctAnswers.setFont(new Font("Arial", Font.PLAIN, 25));
            correctAnswers.setSize(600, 30);
            correctAnswers.setLocation(50, 80);
            c.add(correctAnswers);

            JLabel wrongAnswers = new JLabel("Incorrect answers: "+falseA);
            wrongAnswers.setFont(new Font("Arial", Font.PLAIN, 25));
            wrongAnswers.setSize(600, 30);
            wrongAnswers.setLocation(50, 120);
            c.add(wrongAnswers);

            JLabel percentageRight = new JLabel("Correct answers percent: "+percent+"%");
            percentageRight.setFont(new Font("Arial", Font.PLAIN, 25));
            percentageRight.setSize(600, 30);
            percentageRight.setLocation(50, 160);
            c.add(percentageRight);

            exit = new JButton("Exit");
            exit.setFont(new Font("Arial", Font.PLAIN, 25));
            exit.setSize(100, 30);
            exit.setLocation(250, 250);
            exit.addActionListener(this);
            c.add(exit);
        }
        if(e.getSource()==exit){
            System.exit(0);
        }
    }
}

