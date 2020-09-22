package application;

import boardgame.Position;
import chess.ChessMatch;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ChessMatch cmat = new ChessMatch();

        UI.printBoard(cmat.getPieces());

        sc.close();
    }
}
