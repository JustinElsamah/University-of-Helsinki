package wormgame.gui;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import wormgame.domain.Piece;
import wormgame.game.WormGame;

public class DrawingBoard extends JPanel implements Updatable{
    
    private final WormGame game;
    private final int pieceLength;
    
    public DrawingBoard(WormGame game, int pieceLength){
        super.setBackground(Color.GRAY);
        this.game = game;
        this.pieceLength = pieceLength;
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        for(Piece piece : this.game.getWorm().getPieces()){
            g.fill3DRect(pieceLength * piece.getX(), pieceLength * piece.getY(), pieceLength, pieceLength, true);
        }
        g.setColor(Color.RED);
        g.fillOval(pieceLength * game.getApple().getX(), pieceLength * game.getApple().getY(), pieceLength, pieceLength);
    }

    @Override
    public void update() {
        repaint();
    }
    
}
