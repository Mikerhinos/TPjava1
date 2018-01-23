import javax.swing.*;
import java.awt.*;

class TP10 {
    private double produit;
    private Double nombre = 0.0;

    // Utilisation de setters et getters pour pouvoir accéder aux variables dans le actionevent
    private double getProduit() {
        return produit;
    }

    private void setProduit(double produit, boolean b) {
        if (b) { // un nouveau clique déclenche le reset du produit
            this.produit = 1;
        }
        this.produit *= produit;
    }

    private double getNombre() {
        return nombre;
    }

    private void setNombre(double nombre) {
        this.nombre = nombre;
    }

    TP10() {
        JFrame frame = new JFrame();
        frame.setTitle("tp10 : produit des entiers");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        JPanel tp10 = new JPanel();
        tp10.setLayout(new GridBagLayout());
        GridBagConstraints constraint = new GridBagConstraints();
        frame.setContentPane(tp10);

        JLabel label = new JLabel("Saisissez un nombre : ");
        constraint.fill = GridBagConstraints.NONE;
        constraint.gridx = 0;
        constraint.gridy = 1;
        tp10.add(label, constraint);

        JTextField texte = new JTextField();
        constraint.fill = GridBagConstraints.NONE;
        texte.setColumns(6);
        constraint.gridx = 1;
        constraint.gridy = 1;
        tp10.add(texte, constraint);

        JLabel label2 = new JLabel();
        constraint.gridwidth = GridBagConstraints.REMAINDER;
        constraint.gridx = 0;
        constraint.gridy = 3;
        tp10.add(label2, constraint);

        JButton bouton = new JButton("Calculer");
        bouton.addActionListener(actionEvent -> {
            if (texte.getText().matches("-?\\d+(\\.\\d+)?")) { // si la saisie est bien numérique, afin d'éviter une exception
                setProduit(1.0, true); // nouveau clique, remise à zéro (1 en fait) du produit
                setNombre(Double.parseDouble(texte.getText()));
                for (int i = 1; i <= getNombre(); i++) {
                    setProduit(i, false);
                }
                label2.setText("La factorielle de " + getNombre() + " est " + getProduit());
            }
        });
        constraint.fill = GridBagConstraints.NONE;
        constraint.gridx = 0;
        constraint.gridy = 2;
        tp10.add(bouton, constraint);


        frame.setVisible(true);
    }
}
        
