import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//push

public class Grades {

    public void mainPage() {
        JFrame frame = new JFrame("Grade Calculator");
        JLabel ownership = new JLabel("This Program is a Property of Batuhan Yıldız.");
        JLabel trademark = new JLabel("  Has been trademarked by Batheand Inc.™");
        ownership.setBounds(199,29,300,20);
        trademark.setBounds(199,49,300,20);
        JButton calculate = new JButton("By Number Grades");
        JButton grades = new JButton("By Letter Grades");
        frame.setForeground(Color.black);
        grades.setBounds(319,219,80,20);
        frame.setSize(700,670);
        calculate.setBounds(319,249,80,20);
        grades.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                byLetter();
            }
        });

        calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                byNumbers();
            }
        });

        frame.add(ownership);
        frame.add(trademark);
        frame.add(calculate);
        frame.add(grades);

        

        frame.setLayout(null);
        frame.setVisible(true);

    }

    public void byNumbers() {
        JFrame frame = new JFrame("Grade Calculator");
        JLabel ownership = new JLabel("This Program is a Property of Batuhan Yıldız.");
        JLabel trademark = new JLabel("  Has been trademarked by Batheand Inc.™");
        JLabel instructions = new JLabel("PLease select the course you want to modify");

        frame.setSize(700,670);
        ownership.setBounds(199,29,300,20);
        trademark.setBounds(199,49,300,20);

        frame.add(ownership);
        frame.add(trademark);

        

        String [] cNames = new String[2];
        cNames[0] = "Out of 4";
        cNames[1] = "Out of 100";

        JButton c1 = new JButton(cNames[0]);
        JButton c2 = new JButton(cNames[1]);

        c1.setBounds(279,99,70,20);
        c2.setBounds(279,129,70,20);

        c1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                byNumberCalculator(1);
            }
        });

        c2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                byNumberCalculator(2);
            }
        });

        JButton goBack = new JButton("Back to main page.");
        goBack.setBounds(19,19,99,20);
        goBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                mainPage();
            }
        });

        frame.add(c1);
        frame.add(c2);
        frame.add(goBack);

        frame.setLayout(null);
        frame.setVisible(true);
    }


    public void byLetter() {
        JFrame frame = new JFrame("Grade Calculator");
        JLabel ownership = new JLabel("This Program is a Property of Batuhan Yıldız.");
        JLabel trademark = new JLabel("  Has been trademarked by Batheand Inc.™");
        JLabel instructions = new JLabel("PLease select the course you want to modify");
        //JTable courses = new JTable(3,2);

        String [] cNames = new String[3];
        cNames[0] = "A, B, C";
        cNames[1] = "A+, A, A-";
        cNames[2] = "AA, AB, BB";
        

        int courseNum;

        JButton c1 = new JButton(cNames[0]);
        JButton c2 = new JButton(cNames[1]);
        JButton c3 = new JButton(cNames[2]);
        

        c1.setBounds(279,99,70,20);
        c2.setBounds(279,129,70,20);
        c3.setBounds(279,159,70,20);
        
        frame.add(c1);
        frame.add(c2);
        frame.add(c3);
        

        c1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                byLetterCalculator(1);
            }
        });

        c2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                byLetterCalculator(2);
            }
        });

        c3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                byLetterCalculator(3);
            }
        });

        


    /*
        courses.add(c1);
        courses.add(c2);
        courses.add(c3);
        courses.add(c4);
        courses.add(c5);
        courses.add(c6);

        courses.setBounds(199,99,300,300);

     */
        instructions.setBounds(199,199,300,20);
        ownership.setBounds(199,29,300,20);
        trademark.setBounds(199,49,300,20);
        frame.setSize(700,670);
        frame.add(ownership);
        frame.add(trademark);
        JButton goBack = new JButton("Back to main page.");
        goBack.setBounds(19,19,99,20);
        goBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                mainPage();
            }
        });
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(instructions);
        frame.add(goBack);
        //frame.add(courses);


    }

    public void byLetterCalculator(int courseNum) {
        JFrame frame = new JFrame("Grade Calculator");
        JLabel ownership = new JLabel("This Program is a Property of Batuhan Yıldız.");
        JLabel trademark = new JLabel("  Has been trademarked by Batheand Inc.™");
        JButton goBack = new JButton("Back to main page.");



        ownership.setBounds(199,29,300,20);
        trademark.setBounds(199,49,300,20);
        frame.setSize(700,670);
        goBack.setBounds(19,19,99,20);

        goBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                byLetter();
            }
        });

        frame.add(ownership);
        frame.add(trademark);
        frame.add(goBack);

        frame.setLayout(null);
        frame.setVisible(true);

        switch (courseNum) {
            case 1: 
                break;
            case 2:
                break;
            case 3:
                break;
            default:
        }
    }

    public void byNumberCalculator(int courseNum) {
        JFrame frame = new JFrame("Grade Calculator");
        JLabel ownership = new JLabel("This Program is a Property of Batuhan Yıldız.");
        JLabel trademark = new JLabel("  Has been trademarked by Batheand Inc.™");
        JButton goBack = new JButton("Back to main page.");



        ownership.setBounds(199,29,300,20);
        trademark.setBounds(199,49,300,20);
        frame.setSize(700,670);
        goBack.setBounds(19,19,99,20);

        goBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                byNumbers();
            }
        });

        switch (courseNum) {
            case 1:
                break;
            case 2:
                break;
            default:
        }

        frame.add(ownership);
        frame.add(trademark);
        frame.add(goBack);

        frame.setLayout(null);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        Grades x = new Grades();
        x.mainPage();
    }

}
