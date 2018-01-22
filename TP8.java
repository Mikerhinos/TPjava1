// Import d'une librairie externe écrivant un nombre en toutes lettres

import com.ibm.icu.text.NumberFormat;
import com.ibm.icu.text.RuleBasedNumberFormat;

import javax.swing.*;
import java.awt.*;

class TP8 {
    TP8() {
        JFrame frame = new JFrame();
        frame.setTitle("TP8 : écrire un nombre");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        JPanel tp8 = new JPanel();
        tp8.setLayout(new GridBagLayout());
        GridBagConstraints constraint = new GridBagConstraints();
        frame.setContentPane(tp8);

        JLabel label = new JLabel("Saisissez un nombre : ");
        constraint.fill = GridBagConstraints.HORIZONTAL;
        constraint.gridx = 0;
        constraint.gridy = 1;
        tp8.add(label, constraint);

        JTextField texte = new JTextField();
        constraint.fill = GridBagConstraints.HORIZONTAL;
        texte.setColumns(6);
        constraint.gridx = 1;
        constraint.gridy = 1;
        tp8.add(texte, constraint);

        JLabel label2 = new JLabel();
        constraint.fill = GridBagConstraints.HORIZONTAL;
        constraint.gridx = 0;
        constraint.gridy = 3;
        tp8.add(label2, constraint);

        JButton bouton = new JButton("Calculer et afficher");
        bouton.addActionListener(actionEvent -> {
            double nombre = Double.parseDouble(texte.getText());
            double somme = 0;
            for (int i = 0; i <= nombre; i++) {
                somme = somme + i;
            }
            NumberFormat formatter =
                    new RuleBasedNumberFormat(RuleBasedNumberFormat.SPELLOUT);
            String result = formatter.format(somme);
            label2.setText("La somme des entiers de " + nombre + " est " + result);
        });
        constraint.fill = GridBagConstraints.HORIZONTAL;
        constraint.gridx = 0;
        constraint.gridy = 2;
        tp8.add(bouton, constraint);


        frame.setVisible(true);
    }
}
