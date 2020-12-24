package looping.boy;

import javax.swing.*;
import javax.swing.ImageIcon;


public class Main {

    public static void main(String[] args) throws NullPointerException {

        boolean ok = false;
        try {
            System.out.println(new ImageIcon(Main.class.getClassLoader().getResource("loop.png")));
            Object[] optionsBoutons = {
                    new ImageIcon(Main.class.getClassLoader().getResource("loop.png")),
                    new ImageIcon(Main.class.getClassLoader().getResource("max.png")),
                    new ImageIcon(Main.class.getClassLoader().getResource("jon.png")),
                    new ImageIcon(Main.class.getClassLoader().getResource("gui.png")),
                    new ImageIcon(Main.class.getClassLoader().getResource("remy.png"))
            };

            if (Main.class.getClassLoader().getResource("loop.png").equals(null)) throw new NullPointerException();


            do {
                // 3 boutons donc optionType = YES_NO_CANCEL_OPTION
                int r = JOptionPane.showOptionDialog(null, "Qui est le meilleur programmeur ?", "Programmeurs",
                        JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                        optionsBoutons, optionsBoutons[3]);

                if (r == JOptionPane.YES_OPTION) {
                    JOptionPane.showMessageDialog(null, "Bien évidement, \nc'est Looping le meilleur programmeur !", "Programmeurs", 3, new ImageIcon("./img/loop.png"));
                    ok = true;
                } else if (r == JOptionPane.NO_OPTION) {
                    JOptionPane.showMessageDialog(null, "Re-tente ta chance !");
                } else if (r == JOptionPane.CANCEL_OPTION) {
                    System.exit(0);
                } else {
                    JOptionPane.showMessageDialog(null, "Re-tente ta chance !");
                }

            } while (ok != true);

        } catch (NullPointerException e) {
            e.getMessage();
        }

    }

}
