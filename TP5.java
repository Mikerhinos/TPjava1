import javax.swing.*;
import java.awt.*;
import java.util.concurrent.ThreadLocalRandom;

class TP5 {
    TP5() {
        // Génération du nombre aléatoire entre 10 et 20
        int nombreMystere = ThreadLocalRandom.current().nextInt(10, 20 + 1); // Le max est strictement inférieur nous devons lui ajouter 1 pour qu'il soit pris en compte

        JFrame frame = new JFrame();
        frame.setTitle("TP5 : trouver le nombre mystère");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        JPanel tp5 = new JPanel();
        tp5.setLayout(new GridBagLayout());
        GridBagConstraints constraint = new GridBagConstraints();
        frame.setContentPane(tp5);

        JLabel label = new JLabel("Devinez le nombre mystère ! Indice il est entre 10 et 20 ");
        constraint.fill = GridBagConstraints.HORIZONTAL;
        constraint.gridx = 0;
        constraint.gridy = 1;
        tp5.add(label, constraint);

        JTextField texte = new JTextField();
        constraint.fill = GridBagConstraints.HORIZONTAL;
        texte.setColumns(4);
        constraint.gridx = 0;
        constraint.gridy = 2;
        tp5.add(texte, constraint);

        JLabel label2 = new JLabel();
        constraint.fill = GridBagConstraints.HORIZONTAL;
        constraint.gridx = 0;
        constraint.gridy = 4;
        tp5.add(label2, constraint);


        JButton bouton = new JButton("Rechercher et calculer");
        bouton.addActionListener(actionEvent -> {
            int nombre = Integer.parseInt(texte.getText());
            if (nombre < 10 || nombre > 20) {
                label2.setText("Le nombre mystère est compris entre 10 et 20 !");
            } else if (nombre < nombreMystere) {
                label2.setText("Le nombre mystère est supérieur !");
            } else if (nombre > nombreMystere) {
                label2.setText("Le nombre mystère est inférieur !");
            } else if (nombre == nombreMystere) {
                label2.setText("Félicitations le nombre mystère est bien " + nombre + " !");
            }
        });
        constraint.fill = GridBagConstraints.HORIZONTAL;
        constraint.gridx = 0;
        constraint.gridy = 3;
        tp5.add(bouton, constraint);


        frame.setVisible(true);
    }
}
