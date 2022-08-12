import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//push

public class Grades {

    public void mainPage() {
        JFrame frame = new JFrame("Grade Calculator");
        JLabel ownership = new JLabel("This Program is a Property of Batuhan Yıldız & Can Mızraklı.");
        JLabel trademark = new JLabel("Has been trademarked by Batheand & Mızraklı Inc.™");
        ownership.setBounds(199,29,500,20);
        trademark.setBounds(199,49,500,20);
        JButton calculate = new JButton("By Number Grades");
        JButton grades = new JButton("By Letter Grades");
        frame.setForeground(Color.black);
        grades.setBounds(319,219,80,20);
        frame.setSize(700,670);
        calculate.setBounds(319,249,80,20);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
        JLabel ownership = new JLabel("This Program is a Property of Batuhan Yıldız & Can Mızraklı.");
        JLabel trademark = new JLabel("Has been trademarked by Batheand & Mızraklı Inc.™");
        JLabel instructions = new JLabel("Please select the course you want to modify");

        frame.setSize(700,670);
        ownership.setBounds(199,29,500,20);
        trademark.setBounds(199,49,500,20);

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
        JLabel ownership = new JLabel("This Program is a Property of Batuhan Yıldız & Can Mızraklı.");
        JLabel trademark = new JLabel(" Has been trademarked by Batheand & Mızraklı Inc.™");
        JLabel instructions = new JLabel("Please select the course you want to modify");
        //JTable courses = new JTable(3,2);

        String [] cNames = new String[3];
        cNames[0] = "AA, AB, BA, BB...";
        cNames[1] = "A, A-, B+, B...";
        cNames[2] = "AA, BA, BB, CB...";
        

        int courseNum;

        JButton c1 = new JButton(cNames[0]);
        JButton c2 = new JButton(cNames[1]);
        JButton c3 = new JButton(cNames[2]);
        

        c1.setBounds(279,99,110,20);
        c2.setBounds(279,129,110,20);
        c3.setBounds(279,159,110,20);
        
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
        ownership.setBounds(199,29,500,20);
        trademark.setBounds(199,49,500,20);
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
        JLabel ownership = new JLabel("This Program is a Property of Batuhan Yıldız & Can Mızraklı.");
        JLabel trademark = new JLabel("  Has been trademarked by Batheand & Mızraklı Inc.™");
        JButton goBack = new JButton("Back to main page.");
        


        ownership.setBounds(199,29,500,20);
        trademark.setBounds(199,49,500,20);
        frame.setSize(700,670);
        goBack.setBounds(19,19,99,20);

        

        frame.add(ownership);
        frame.add(trademark);
        frame.add(goBack);

        frame.setLayout(null);
        frame.setVisible(true);

        goBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                byLetter();
            }
        });

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
        JLabel ownership = new JLabel("This Program is a Property of Batuhan Yıldız & Can Mızraklı.");
        JLabel trademark = new JLabel("  Has been trademarked by Batheand Can Mızraklı Inc.™");
        JButton goBack = new JButton("Back to main page.");
        JButton calculate = new JButton("Calculate!");


        ownership.setBounds(199,29,500,20);
        trademark.setBounds(199,49,500,20);
        frame.setSize(700,670);
        goBack.setBounds(19,19,99,20);
        calculate.setBounds(389,299,100,20);

        goBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                byNumbers();
            }
        });

        String [] Credit = new String[8];
        for(int i=0; i<8; i++) {
            Credit[i] = "Enter The Credit Of The Class";
        }
        String [] GPA = new String[8];
        for(int i=0; i<8; i++) {
            GPA[i] = "Enter The GPA Of The Class";
        }
        
        JTextField field1a = new JTextField();
        JTextField field2a = new JTextField();
        JTextField field3a = new JTextField();
        JTextField field4a = new JTextField();
        JTextField field5a = new JTextField();
        JTextField field6a = new JTextField();
        JTextField field7a = new JTextField();
        JTextField field8a = new JTextField();

        field1a.setText(Credit[1]);
        field2a.setText(Credit[2]);
        field3a.setText(Credit[3]);
        field4a.setText(Credit[4]);
        field5a.setText(Credit[5]);
        field6a.setText(Credit[6]);
        field7a.setText(Credit[7]);
        field8a.setText(Credit[8]);

        JTextField field1b = new JTextField();
        JTextField field2b = new JTextField();
        JTextField field3b = new JTextField();
        JTextField field4b = new JTextField();
        JTextField field5b = new JTextField();
        JTextField field6b = new JTextField();
        JTextField field7b = new JTextField();
        JTextField field8b = new JTextField();

        field1b.setText(GPA[1]);
        field2b.setText(GPA[2]);
        field3b.setText(GPA[3]);
        field4b.setText(GPA[4]);
        field5b.setText(GPA[5]);
        field6b.setText(GPA[6]);
        field7b.setText(GPA[7]);
        field8b.setText(GPA[8]);
        /* 
        field1a.setBounds(279,99,70,20);
        field2a.setBounds(279,119,70,20);
        field3a.setBounds(279,139,70,20);
        field4a.setBounds(279,99,70,20);
        field5a.setBounds(279,119,70,20);
        field6a.setBounds(279,139,70,20);
        field7a.setBounds(279,99,70,20);
        field8a.setBounds(279,119,70,20);

        field1b.setBounds(349,99,70,20);
        field2b.setBounds(349,119,70,20);
        field3b.setBounds(349,139,70,20);
        field4b.setBounds(349,99,70,20);
        field5b.setBounds(349,119,70,20);
        field6b.setBounds(349,139,70,20);
        field7b.setBounds(349,99,70,20);
        field8b.setBounds(349,119,70,20);
        */
        /*
        frame.add(field1a);
        frame.add(field2a);
        frame.add(field3a);
        frame.add(field4a);
        frame.add(field5a);
        frame.add(field6a);
        frame.add(field7a);
        frame.add(field8a);

        frame.add(field1b);
        frame.add(field2b);
        frame.add(field3b);
        frame.add(field4b);
        frame.add(field5b);
        frame.add(field6b);
        frame.add(field7b);
        frame.add(field8b);
        */
        

        frame.add(calculate);
        frame.add(ownership);
        frame.add(trademark);
        frame.add(goBack);

        frame.setForeground(Color.black);

        frame.setLayout(null);
        frame.setVisible(true);

        switch (courseNum) {
            case 1:
            /* 
                calculate.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        int [] credits = new int [8];
                        int [] gpas = new int [8];
                        int [] weightedGpas = new int [8] ;
                        int totalWeightedGpa = 0, totalCredits = 0;
                        double finalgpa;


                        credits[0] = Integer.parseInt(field1a.getText());
                        credits[1] = Integer.parseInt(field2a.getText());
                        credits[2] = Integer.parseInt(field3a.getText());
                        credits[3] = Integer.parseInt(field4a.getText());
                        credits[4] = Integer.parseInt(field5a.getText());
                        credits[5] = Integer.parseInt(field6a.getText());
                        credits[6] = Integer.parseInt(field7a.getText());
                        credits[7] = Integer.parseInt(field8a.getText());

                        for(int i = 0; i<8; i++) {
                            
                            totalCredits = totalCredits + credits[i];
                        }

                        gpas[0] = Integer.parseInt(field1b.getText());
                        gpas[1] = Integer.parseInt(field2b.getText());
                        gpas[2] = Integer.parseInt(field3b.getText());
                        gpas[3] = Integer.parseInt(field4b.getText());
                        gpas[4] = Integer.parseInt(field5b.getText());
                        gpas[5] = Integer.parseInt(field6b.getText());
                        gpas[6] = Integer.parseInt(field7b.getText());
                        gpas[7] = Integer.parseInt(field8b.getText());

                        for(int i = 0; i<8; i++) {
                            weightedGpas[i] = credits[i] * gpas[i];
                            totalWeightedGpa = totalWeightedGpa + weightedGpas[i];
                        }

                        finalgpa = totalWeightedGpa/totalCredits;
                        JLabel answer = new JLabel("Your Calculated GPA is: " + finalgpa);
                        answer.setBounds(419,249,200,20);
                        frame.add(answer);

                    }
                });
                */
                break;
            case 2:
                goBack.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.setVisible(false);
                        byLetter();
                    }
                });
                break;
            default:
        }

       
        
    }
    public static void main(String[] args) {
        Grades x = new Grades();
        x.mainPage();
    }

}
