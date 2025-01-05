package first_game;

import java.awt.*;
import java.awt.event.*;
//java.awt.* and java.awt.event.* are used for the graphical user interface (GUI) and handling events like mouse clicks.
import java.util.Random; //java.util.Random is used to generate random numbers, which are used to place moles and plants on random tiles.
import javax.swing.*; //javax.swing.* is used for building the GUI components such as windows, buttons, and labels.

public class WhacAMole {
    int boardWidth = 600; // height and width is in pixels
    int boardHeight = 650;

    JFrame frame = new JFrame("Mario: Whac A Mole"); //main window of game with title
    JLabel textLabel = new JLabel();
    JPanel textPanel = new JPanel();
    JPanel boardPanel = new JPanel();

    JButton[] board = new JButton[9]; //array
    // holds the images
    ImageIcon moleIcon;
    ImageIcon plantIcon;

    // track the current tile where the mole or plant located
    JButton currMoleTile;
    JButton currPlantTile;

    Random random = new Random();
    Timer setMoleTimer;
    Timer setPlantTimer;
    int score;

    WhacAMole(){
        frame.setSize(boardWidth , boardHeight);
        frame.setLocationRelativeTo(null); // centers the window on the screen
        frame.setResizable(false); //disables resizing of window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        textLabel.setFont(new Font("Arial",Font.PLAIN ,50));
        textLabel.setHorizontalAlignment(JLabel.CENTER); // text at center
        textLabel.setText("Score: 0");
        textLabel.setOpaque(true); //Makes the background of the label opaque (so the background color is visible).

        textPanel.setLayout(new BorderLayout());
        textPanel.add(textLabel);
        frame.add(textPanel, BorderLayout.NORTH);

        boardPanel.setLayout(new GridLayout(3,3)); // tiles holds moles and plants
       // boardPanel.setBackground(Color.black);
        frame.add(boardPanel);

       // plantIcon = new ImageIcon(getClass().getResource("./piranha.png"));
        // ImageIcon loads the images
        //getScaledInstance(150, 150, Image.SCALE_SMOOTH): Resizes the images to a size of 150x150 pixels with smooth scaling.
        Image plantImg = new ImageIcon(getClass().getResource("./piranha.png")).getImage();
        plantIcon = new ImageIcon(plantImg.getScaledInstance(150 ,150, Image.SCALE_SMOOTH));

        Image moleImg = new ImageIcon(getClass().getResource("./monty.png")).getImage();
        moleIcon = new ImageIcon(moleImg.getScaledInstance(150 ,150, Image.SCALE_SMOOTH));

        score = 0;

        //This for loop creates 9 JButton objects (one for each tile) and adds them to the boardPanel.
        for (int i = 0; i < 9; i++) {
            JButton tile = new JButton();
            board[i] = tile;
            boardPanel.add(tile);
           // tile.setIcon(plantIcon);
            tile.setFocusable(false);//makes the buttons unfocusable, meaning they won’t take keyboard focus.
            //tile.setIcon(moleIcon);
            //Adds an action listener to handle what happens when a tile is clicked.
            tile.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JButton tile = (JButton) e.getSource();
                    //If the player clicks the tile with the mole, they earn 10 points.
                    if (tile == currMoleTile){
                        score+=10;
                        textLabel.setText("Score: "+Integer.toString(score));
                    }
                    //If they click the tile with the plant, the game ends, showing the score, and disables all tiles to stop further actions.
                    else if(tile == currPlantTile){
                        textLabel.setText("Game Over: "+Integer.toString(score));
                        setMoleTimer.stop();
                        setPlantTimer.stop();
                        for (int i = 0; i < 9; i++) {
                            board[i].setEnabled(false);
                        }
                    }
                }
            });
        }

        setMoleTimer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (currMoleTile!=null){
                    currMoleTile.setIcon(null); // Remove previous mole
                    currMoleTile = null;
                }

                int num = random.nextInt(9);
                JButton tile = board[num];

                //if tile is occupied by plant , skip tile for this turn
                if (currPlantTile == tile)
                {
                    return;
                }

                currMoleTile = tile;
                currMoleTile.setIcon(moleIcon);
            }
        });

        setPlantTimer = new Timer(1500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (currPlantTile!=null){
                    currPlantTile.setIcon(null); // Remove previous plant
                    currPlantTile = null;
                }

                int num = random.nextInt(9);
                JButton tile = board[num];

                //if tile is occupied by mole , skip tile for this turn
                if (currMoleTile == tile){
                    return;
                }

                currPlantTile = tile;
                currPlantTile.setIcon(plantIcon);
            }
        });

        setMoleTimer.start();
        setPlantTimer.start();
        frame.setVisible(true);
    }
}
