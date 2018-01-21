import javax.swing.*;

class TP1 {
    TP1() {
        // Création d'une fenêtre frame avec son titre, sa taille et son action lorsque l'on clique sur la croix de fermeture
        JFrame frame = new JFrame();
        frame.setTitle("TP1 : Hello World");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        // Création du panel TP1 puis remplissage de la frame avec celui ci
        JPanel tp1 = new JPanel();
        frame.setContentPane(tp1);

        // Ajout d'un label avec la valeur voulue
        JLabel hello = new JLabel("Hello World !!!");
        tp1.add(hello);

        // Affichage de la frame
        frame.setVisible(true);
    }

}
