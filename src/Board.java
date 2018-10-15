import javax.swing.*;
import java.awt.*;

public class Board {

    private JFrame frame;
    private Square[][] squares;
    JTextField userInput;

    public Board(int chessRow, int chessColumn) {
        frame = new JFrame();
        frame.setLayout(new BorderLayout());
        userInput = new JTextField();
        userInput.setPreferredSize(new Dimension(500,30));
        userInput.addActionListener(a -> {
            parse(userInput.getText());
            userInput.setText("");
        });
        frame.add(userInput, BorderLayout.SOUTH);
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        setupBoard(chessRow, chessColumn);
        setupPieces();

        for (int i = 0; i < squares.length; i++) {
            for (int r = 0; r < squares.length; r++) {
                frame.getContentPane().add(squares[i][r]);
                frame.revalidate();
                frame.repaint();
            }
        }
    }


    private void parse(String s){

    }


    private void setupBoard(int chessRow, int chessColumn) {
        squares = new Square[chessRow][chessColumn];
        for (int i = 0; i < chessRow; i++) {
            for (int r = 0; r < chessColumn; r++) {
                if ((i % 2 != 0 && r % 2 == 0) || (i % 2 == 0 && r % 2 != 0)) {
                    squares[i][r] = new Square(true, 100 * i / 2, 100 * r / 2);
                } else {
                    squares[i][r] = new Square(false, 100 * i / 2, 100 * r / 2);
                }
            }
        }
    }

    private void setupPieces() {
        for (int i = 0; i < squares.length; i++) {
            for (int r = 0; r < squares.length; r++) {
                switch (r) {
                    case 1:
                        squares[i][r].addPiece(new Pawn(true));
                        break;
                    case 6:
                        squares[i][r].addPiece(new Pawn(false));
                }
                if (r == 0 && (i == 0 || i == 7)) {
                    squares[i][r].addPiece(new Rook(true));
                }
                if (r == 7 && (i == 0 || i == 7)) {
                    squares[i][r].addPiece(new Rook(false));
                }
                if (r == 0 && (i == 1 || i == 6)) {
                    squares[i][r].addPiece(new Knight(true));
                }
                if (r == 7 && (i == 1 || i == 6)) {
                    squares[i][r].addPiece(new Knight(false));
                }
                if (r == 0 && (i == 2 || i == 5)) {
                    squares[i][r].addPiece(new Bishop(true));
                }
                if (r == 7 && (i == 2 || i == 5)) {
                    squares[i][r].addPiece(new Bishop(false));
                }
                if (r == 0 && (i == 4)) {
                    squares[i][r].addPiece(new King(true));
                }
                if (r == 7 && (i == 4)) {
                    squares[i][r].addPiece(new King(false));
                }
                if (r == 0 && (i == 3)) {
                    squares[i][r].addPiece(new Queen(true));
                }
                if (r == 7 && (i == 3)) {
                    squares[i][r].addPiece(new Queen(false));
                }
            }
        }
    }
}
