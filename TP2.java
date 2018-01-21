import javax.swing.*;
import java.awt.*;

class TP2 {
    TP2() {
        JFrame frame = new JFrame();
        frame.setTitle("TP2 : Échange de valeurs");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        // Création du panel TP2 en GridBagLayout qui permet de positionner assez simplement les éléments d'un panel
        JPanel tp2 = new JPanel();
        tp2.setLayout(new GridBagLayout());
        GridBagConstraints constraint = new GridBagConstraints();
        frame.setContentPane(tp2);

        // Ligne 1 : le label
        JLabel question = new JLabel("Entrez une valeur A et B : ");
        constraint.fill = GridBagConstraints.HORIZONTAL;
        constraint.gridx = 0;
        constraint.gridy = 0;
        tp2.add(question, constraint);


        // Ligne 2 : label valeur A et son champs de saisie
        JLabel a = new JLabel("A : ");
        constraint.fill = GridBagConstraints.HORIZONTAL;
        constraint.gridx = 0;
        constraint.gridy = 1;
        tp2.add(a, constraint);

        JTextField valA = new JTextField();
        constraint.fill = GridBagConstraints.HORIZONTAL;
        valA.setColumns(6);
        constraint.gridx = 1;
        constraint.gridy = 1;
        tp2.add(valA, constraint);


        // Ligne 3 : label valeur B et son champs de saisie
        JLabel b = new JLabel("B : ");
        constraint.fill = GridBagConstraints.HORIZONTAL;
        constraint.gridx = 0;
        constraint.gridy = 2;
        tp2.add(b, constraint);

        JTextField valB = new JTextField();
        constraint.fill = GridBagConstraints.HORIZONTAL;
        valB.setColumns(6);
        constraint.gridx = 1;
        constraint.gridy = 2;
        tp2.add(valB, constraint);


        // Création du bouton d'inversion
        JButton bouton = new JButton("Inverser les valeurs");
        bouton.addActionListener(actionEvent -> {
            // Inversion des valeurs des champs via une variable tampon 'c'
            String c = valA.getText();
            valA.setText(valB.getText());
            valB.setText(c);
        });
        constraint.fill = GridBagConstraints.HORIZONTAL;
        constraint.gridx = 0;
        constraint.gridy = 3;
        tp2.add(bouton, constraint);

        frame.setVisible(true);
    }
}

