
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class utils {

    public static ArrayList<String> Layer1Image, Layer2Image, Layer3Image;
    public static JLabel[] Layer1Label, Layer2Label, Layer3Label;

    private static void getImages(ArrayList<String> image, JLabel[] label) {

        BufferedImage img;
        try {
            for (int i = 0; i < label.length; i++) {
                img = ImageIO.read(new File("./src/images/%s".formatted(image.get(i))));

                Image dimg = img.getScaledInstance(label[i].getWidth(), label[i].getHeight(), Image.SCALE_SMOOTH);

                label[i].setIcon(new ImageIcon(dimg));

                SetPassword.map.put(label[i], image.get(i));
            }
        } catch (IOException e) {
            System.out.print(e.getMessage());
        }
    }

    public static void setImages() {
        Layer1Image = new ArrayList<>(
                Arrays.asList("parrot.jpg", "guitar.jpg", "cat.jpg", "football.jpg", "snake.jpg", "icecream.jpg",
                        "fruits.jpg", "ganeshji.jpg", "cycle.jpg", "eagle.jpg", "ironman.jpg", "dog.jpg"
                )
        );

        Layer2Image = new ArrayList<>(
                Arrays.asList("lion.jpg", "baby.jpg", "cake.jpg", "car.jpg", "spiderman.jpg",
                        "zebra.jpg", "shoes.jpg", "airplane.jpg", "bag.jpg", "elephant.jpg", "house.jpg", "watch.jpg")
        );

        Layer3Image = new ArrayList<>(
                Arrays.asList("scooter.jpg", "train.jpg", "tajmahal.jpg", "shiva.jpg", "bike.jpg", "glass.jpg",
                        "rose.jpg", "dron.jpg", "swan.jpg", "fish.jpg", "bedroom.jpg", "peacock.jpg")
        );

        Layer1Label = new JLabel[]{SetPassword.l1, SetPassword.l2, SetPassword.l3, SetPassword.l4, SetPassword.l5, SetPassword.l6, SetPassword.l7,
            SetPassword.l8, SetPassword.l9, SetPassword.l10, SetPassword.l11, SetPassword.l12};

        Layer2Label = new JLabel[]{SetPassword.l13, SetPassword.l14, SetPassword.l15, SetPassword.l16, SetPassword.l17, SetPassword.l18,
            SetPassword.l19, SetPassword.l20, SetPassword.l21, SetPassword.l22, SetPassword.l23, SetPassword.l24
        };

        Layer3Label = new JLabel[]{SetPassword.l25, SetPassword.l26, SetPassword.l27, SetPassword.l28, SetPassword.l29, SetPassword.l30,
            SetPassword.l31, SetPassword.l32, SetPassword.l33, SetPassword.l34, SetPassword.l35, SetPassword.l36
        };

        Collections.shuffle(Layer1Image);
        Collections.shuffle(Layer2Image);
        Collections.shuffle(Layer3Image);

        getImages(Layer1Image, Layer1Label);
        getImages(Layer2Image, Layer2Label);
        getImages(Layer3Image, Layer3Label);
//System.out.print(" "+Layer2Image);

    }

}
