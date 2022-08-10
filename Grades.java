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
        JButton calculate = new JButton("Useless Button!");
        JButton grades = new JButton("Grades");
        frame.setForeground(Color.black);
        grades.setBounds(319,219,80,20);
        frame.setSize(700,670);
        calculate.setBounds(319,249,80,20);
        grades.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                GradeEditorPage();
            }
        });

        frame.add(ownership);
        frame.add(trademark);
        frame.add(calculate);
        frame.add(grades);

        frame.setLayout(null);
        frame.setVisible(true);

    }
    public void GradeEditorPage() {
        JFrame frame = new JFrame("Grade Calculator");
        JLabel ownership = new JLabel("This Program is a Property of Batuhan Yıldız.");
        JLabel trademark = new JLabel("  Has been trademarked by Batheand Inc.™");
        JLabel instructions = new JLabel("PLease select the course you want to modify");
        //JTable courses = new JTable(3,2);

        String [] cNames = new String[6];
        cNames[0] = "OPTION 1";
        cNames[1] = "OPTION 2";
        cNames[2] = "OPTION 3";
        cNames[3] = "OPTION 4";
        cNames[4] = "OPTION 5";
        cNames[5] = "OPTION 6";

        int courseNum;

        JButton c1 = new JButton(cNames[0]);
        JButton c2 = new JButton(cNames[1]);
        JButton c3 = new JButton(cNames[2]);
        JButton c4 = new JButton(cNames[3]);
        JButton c5 = new JButton(cNames[4]);
        JButton c6 = new JButton(cNames[5]);

        c1.setBounds(279,99,70,20);
        c2.setBounds(279,129,70,20);
        c3.setBounds(279,159,70,20);
        c4.setBounds(349,99,70,20);
        c5.setBounds(349,129,70,20);
        c6.setBounds(349,159,70,20);

        frame.add(c1);
        frame.add(c2);
        frame.add(c3);
        frame.add(c4);
        frame.add(c5);
        frame.add(c6);


        c1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                CourseModifier(1);
            }
        });

        c2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                CourseModifier(2);
            }
        });

        c3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                CourseModifier(3);
            }
        });

        c4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                CourseModifier(4);
            }
        });

        c5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                CourseModifier(5);
            }
        });

        c6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                CourseModifier(6);
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

    public void CourseModifier(int courseNum) {
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
                GradeEditorPage();
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
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            default:
        }
    }
    public static void main(String[] args) {
        Grades x = new Grades();
        x.mainPage();
    }

}
