import javax.swing.*;
import java.awt.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class TP9 {
    TP9() {
        JFrame frame = new JFrame();
        frame.setTitle("TP9 : positif-négatif / pair-impair");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        JPanel tp9 = new JPanel();
        tp9.setLayout(new GridBagLayout());
        GridBagConstraints constraint = new GridBagConstraints();
        frame.setContentPane(tp9);

        JLabel label = new JLabel("Saisissez un nombre : ");
        constraint.fill = GridBagConstraints.HORIZONTAL;
        constraint.gridx = 0;
        constraint.gridy = 1;
        tp9.add(label, constraint);

        JTextField texte = new JTextField();
        constraint.fill = GridBagConstraints.HORIZONTAL;
        texte.setColumns(4);
        constraint.gridx = 1;
        constraint.gridy = 1;
        tp9.add(texte, constraint);

        JLabel label2 = new JLabel();
        constraint.fill = GridBagConstraints.HORIZONTAL;
        constraint.gridx = 0;
        constraint.gridy = 3;
        tp9.add(label2, constraint);

        JButton bouton = new JButton("Analyser le nombre");
        bouton.addActionListener(actionEvent -> {
            if (texte.getText().matches("-?\\d+(\\.\\d+)?")) { // si la saisie est bien numérique, afin d'éviter une exception
                int saisieInt = Integer.parseInt(texte.getText());
                String reponse = "";
                if (saisieInt > 0) {
                    reponse += "Le nombre est positif et ";
                } else if (saisieInt < 0) {
                    reponse += "Le nombre est négatif et ";
                } else if (saisieInt == 0) {
                    reponse += "Le nombre est zéro et toujours ";
                } else reponse += "Erreur";
                if (saisieInt % 2 == 0) {
                    reponse += "pair";
                } else {
                    reponse += "impair";
                }
                label2.setText(reponse);
            }
        });
        constraint.fill = GridBagConstraints.HORIZONTAL;
        constraint.gridx = 0;
        constraint.gridy = 2;
        tp9.add(bouton, constraint);


        frame.setVisible(true);
    }
}
