import javax.swing.*;
import java.awt.*;

class Fenetre extends JFrame {
    // variable qui servira à pointer l'indice de la card concernée
    int indice = 0;

    Fenetre() {
        // Définir le titre
        setTitle("TPs Java");
        // Définir la taille
        setSize(800, 600);
        // Positionner au centre de l'écran
        setLocationRelativeTo(null);
        // Définit l'action par défaut de la croix de la fenêtre en "fermer"
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Instanciation d'un panel global
        JPanel panel = new JPanel();
        // Création d'un layout pour gérer la disposition des éléments dans le jframe
        setLayout(new BorderLayout());

        // Choix de la couleur de fonds du panel
        panel.setBackground(Color.gray);

        // Utiliser le panel global en tant que conteneur actif
        setContentPane(panel);

        /*
        BOUTON 1 : HELLO WORLD
         */
        // Création d'un bouton
        JButton bouton1 = new JButton("TP 1 : Hello World");
        // Ajout d'un listener au bouton, version Java > 1.7
        bouton1.addActionListener(actionEvent -> {
            TP1 tp1 = new TP1();
        });
        // Ajout du bouton au panel
        panel.add(bouton1, BorderLayout.CENTER);


        /*
        BOUTON 2 : ECHANGE DE VARIABLES
         */
        JButton bouton2 = new JButton("TP 2 : Inversion de valeurs");
        bouton2.addActionListener(actionEvent -> {
            TP2 tp2 = new TP2();
        });
        panel.add(bouton2, BorderLayout.CENTER);


        /*
        BOUTON 3 : CAPTURE ET AFFICHANGE D'UNE SAISIE
         */
        JButton bouton3 = new JButton("TP3 : Capture et affichage d'une saisie");
        bouton3.addActionListener(actionEvent -> {
            TP3 tp3 = new TP3();
        });
        panel.add(bouton3, BorderLayout.CENTER);


        /*
        BOUTON 4 : ISOLATION ET CALCUL DU CARRÉ D'UN CODE POSTAL
         */
        JButton bouton4 = new JButton("TP4 : isolation et calcul du carré d'un code postal");
        bouton4.addActionListener(actionEvent -> {
            TP4 tp4 = new TP4();
        });
        panel.add(bouton4, BorderLayout.CENTER);


        /*
        BOUTON 5 : TROUVER LE NOMBRE MYSTÈRE
         */
        JButton bouton5 = new JButton("TP5 : trouver le nombre mystère");
        bouton5.addActionListener(actionEvent -> {
            TP5 tp5 = new TP5();
        });
        panel.add(bouton5, BorderLayout.CENTER);


        /*
        BOUTON 6 : PRODUIT POSITIF OU NÉGATIF
         */
        JButton bouton6 = new JButton("TP6 : produit positif ou négatif");
        bouton6.addActionListener(actionEvent -> {
            TP6 tp6 = new TP6();
        });
        panel.add(bouton6, BorderLayout.CENTER);


        /*
        BOUTON 7 : SOMME DES ENTIERS
         */
        JButton bouton7 = new JButton("TP7 : somme des entiers");
        bouton7.addActionListener(actionEvent -> {
            TP7 tp7 = new TP7();
        });
        panel.add(bouton7, BorderLayout.CENTER);


        /*
        BOUTON 8 : ÉCRIRE UN NOMBRE
         */
        JButton bouton8 = new JButton("TP8 : écrire un nombre");
        bouton8.addActionListener(actionEvent -> {
            TP8 tp8 = new TP8();
        });
        panel.add(bouton8, BorderLayout.CENTER);


        /*
        BOUTON 9 : POSITIF-NÉGATIF / PAIR-IMPAIR
         */
        JButton bouton9 = new JButton("TP9 : positif-négatif / pair-impair");
        bouton9.addActionListener(actionEvent -> {
            TP9 tp9 = new TP9();
        });
        panel.add(bouton9, BorderLayout.CENTER);


        /*
        BOUTON 10 : CALCUL DE FACTORIELLE
         */
        JButton bouton10 = new JButton("TP10 : calcul de factorielle");
        bouton10.addActionListener(actionEvent -> {
            TP10 tp10 = new TP10();
        });
        panel.add(bouton10, BorderLayout.CENTER);


        // Rendre la fenêtre visible
        setVisible(true);
    }
}
