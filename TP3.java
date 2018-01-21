import javax.swing.*;
import java.awt.*;

class TP3 {
    TP3() {
        JFrame frame = new JFrame();
        frame.setTitle("TP3 : Capture et affichage d'une saisie");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        JPanel tp3 = new JPanel();
        tp3.setLayout(new GridBagLayout());
        GridBagConstraints constraint = new GridBagConstraints();
        frame.setContentPane(tp3);

        JLabel label = new JLabel("Saisissez du texte : ");
        constraint.fill = GridBagConstraints.HORIZONTAL;
        constraint.gridx = 0;
        constraint.gridy = 1;
        tp3.add(label, constraint);

        JTextField texte = new JTextField();
        constraint.fill = GridBagConstraints.HORIZONTAL;
        texte.setColumns(6);
        constraint.gridx = 1;
        constraint.gridy = 1;
        tp3.add(texte, constraint);

        // création du label qui recevra le texte avant le bouton pour pouvoir l'appeler sans erreur
        JLabel label2 = new JLabel();
        constraint.fill = GridBagConstraints.HORIZONTAL;
        constraint.gridx = 0;
        constraint.gridy = 3; // il sera bien affiché sous le bouton
        tp3.add(label2, constraint);

        JButton bouton = new JButton("Afficher");
        bouton.addActionListener(actionEvent -> {
            label2.setText("Vous avez écris : " + texte.getText());
        });
        constraint.fill = GridBagConstraints.HORIZONTAL;
        constraint.gridx = 0;
        constraint.gridy = 2;
        tp3.add(bouton, constraint);


        frame.setVisible(true);
    }

}
