import javax.swing.*;
import java.awt.*;

class TP6 {
    TP6() {
        JFrame frame = new JFrame();
        frame.setTitle("TP6 : produit positif ou négatif");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        JPanel tp6 = new JPanel();
        tp6.setLayout(new GridBagLayout());
        GridBagConstraints constraint = new GridBagConstraints();
        frame.setContentPane(tp6);


        JLabel question = new JLabel("Entrez une valeur A et B : ");
        constraint.fill = GridBagConstraints.HORIZONTAL;
        constraint.gridx = 0;
        constraint.gridy = 0;
        tp6.add(question, constraint);


        JLabel a = new JLabel("A : ");
        constraint.fill = GridBagConstraints.HORIZONTAL;
        constraint.gridx = 0;
        constraint.gridy = 1;
        tp6.add(a, constraint);

        JTextField valA = new JTextField();
        constraint.fill = GridBagConstraints.HORIZONTAL;
        valA.setColumns(6);
        constraint.gridx = 1;
        constraint.gridy = 1;
        tp6.add(valA, constraint);


        JLabel b = new JLabel("B : ");
        constraint.fill = GridBagConstraints.HORIZONTAL;
        constraint.gridx = 0;
        constraint.gridy = 2;
        tp6.add(b, constraint);

        JTextField valB = new JTextField();
        constraint.fill = GridBagConstraints.HORIZONTAL;
        valB.setColumns(6);
        constraint.gridx = 1;
        constraint.gridy = 2;
        tp6.add(valB, constraint);

        JLabel label2 = new JLabel();
        constraint.fill = GridBagConstraints.HORIZONTAL;
        constraint.gridx = 0;
        constraint.gridy = 4;
        tp6.add(label2, constraint);


        JButton bouton = new JButton("Contrôler le produit");
        bouton.addActionListener(actionEvent -> {
            if (valA.getText().matches("-?\\d+(\\.\\d+)?") && valB.getText().matches("-?\\d+(\\.\\d+)?")) { // si la saisie est bien numérique, afin d'éviter une exception
                double nA = Double.parseDouble(valA.getText());
                double nB = Double.parseDouble(valB.getText());
                if (nA * nB > 0) {
                    label2.setText("Le produit est positif ! (" + nA + "x" + nB + "=" + nA * nB + ")");
                } else if (nA * nB < 0) {
                    label2.setText("Le produit est négatif ! (" + nA + "x" + nB + "=" + nA * nB + ")");
                } else if (nA * nB == 0) {
                    label2.setText("Le produit est nul ! (" + nA + "x" + nB + "=" + nA * nB + ")");
                } else System.out.println("Erreur inconnue :/");
            }
        });
        constraint.fill = GridBagConstraints.HORIZONTAL;
        constraint.gridx = 0;
        constraint.gridy = 3;
        tp6.add(bouton, constraint);

        frame.setVisible(true);
    }
}