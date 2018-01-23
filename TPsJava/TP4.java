package TPsJava;

import javax.swing.*;
import java.awt.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class TP4 {
    /**
     * Le TP4 récupère un code postal dans la saisie utilisateur, puis affiche son carré
     */
    TP4() {
        JFrame frame = new JFrame();
        frame.setTitle("TP4 : isolation et calcul du carré d'un code postal");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        JPanel tp4 = new JPanel();
        tp4.setLayout(new GridBagLayout());
        GridBagConstraints constraint = new GridBagConstraints();
        frame.setContentPane(tp4);

        JLabel label = new JLabel("Saisissez une adresse : ");
        constraint.fill = GridBagConstraints.NONE;
        constraint.gridx = 0;
        constraint.gridy = 1;
        tp4.add(label, constraint);

        JTextArea texte = new JTextArea();
        constraint.fill = GridBagConstraints.HORIZONTAL;
        texte.setColumns(10);
        texte.setRows(4);
        constraint.gridx = 1;
        constraint.gridy = 1;
        tp4.add(texte, constraint);

        JLabel label2 = new JLabel();
        constraint.fill = GridBagConstraints.HORIZONTAL;
        constraint.gridx = 0;
        constraint.gridy = 3;
        tp4.add(label2, constraint);

        /*
        Bouton déclenchant la recherche par regex du code postal puis son affichage dans un label sous celui-ci, ainsi que son carré
         */
        JButton bouton = new JButton("Rechercher et calculer");
        bouton.addActionListener(actionEvent -> {
            Pattern search = Pattern.compile("(\\d{5})");
            Matcher find = search.matcher(texte.getText());
            if (find.find()) {
                label2.setText("Le code postal est : " + find.group(1) + " et son carré est " + Math.pow(Integer.parseInt(find.group(1)), 2));
            }
        });
        constraint.fill = GridBagConstraints.NONE;
        constraint.gridx = 0;
        constraint.gridy = 2;
        tp4.add(bouton, constraint);


        frame.setVisible(true);
    }
}
