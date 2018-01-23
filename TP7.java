import javax.swing.*;
import java.awt.*;

class TP7 {
    TP7() {
        JFrame frame = new JFrame();
        frame.setTitle("TP7 : somme des entiers");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        JPanel tp7 = new JPanel();
        tp7.setLayout(new GridBagLayout());
        GridBagConstraints constraint = new GridBagConstraints();
        frame.setContentPane(tp7);

        JLabel label = new JLabel("Saisissez un nombre : ");
        constraint.fill = GridBagConstraints.HORIZONTAL;
        constraint.gridx = 0;
        constraint.gridy = 1;
        tp7.add(label, constraint);

        JTextField texte = new JTextField();
        constraint.fill = GridBagConstraints.HORIZONTAL;
        texte.setColumns(6);
        constraint.gridx = 1;
        constraint.gridy = 1;
        tp7.add(texte, constraint);

        JLabel label2 = new JLabel();
        constraint.fill = GridBagConstraints.HORIZONTAL;
        constraint.gridx = 0;
        constraint.gridy = 3;
        tp7.add(label2, constraint);

        JButton bouton = new JButton("Calculer");
        bouton.addActionListener(actionEvent -> {
            if (texte.getText().matches("-?\\d+(\\.\\d+)?")) { // si la saisie est bien numérique, afin d'éviter une exception
                double nombre = Double.parseDouble(texte.getText());
                double somme = 0;
                for (int i = 0; i <= nombre; i++) {
                    somme = somme + i;
                }
                label2.setText("La somme des entiers de " + nombre + " est " + somme);
            }
        });
        constraint.fill = GridBagConstraints.HORIZONTAL;
        constraint.gridx = 0;
        constraint.gridy = 2;
        tp7.add(bouton, constraint);


        frame.setVisible(true);
    }
}
