package MingMang;

import org.overture.codegen.runtime.*;

import java.util.*;


@SuppressWarnings("all")
public class TestMingMang {
    public TestMingMang() {
    }

    protected void assertEqual(final Object expected, final Object actual) {
        if (!(Utils.equals(expected, actual))) {
            IO.print("Actual value (");
            IO.print(((Object) actual));
            IO.print(") different from expected (");
            IO.print(((Object) expected));
            IO.println(")\n");
        }
    }

    public void TestAll() {
        TestBoard sta = new TestBoard();
        sta.TestAll();
        TestNewGame();
        TestGoodMove();
        TestMoveWithPiecesBetween();
        TestConquer();
        TestReset();
        TestGameOver();
    }

    public void TestGameOver() {
        MingMang game = new MingMang();
        Object cpW = MingMang.quotes.WhiteQuote.getInstance();
        Object cpBS = MingMang.quotes.BlankSpaceQuote.getInstance();
        Object cpB = MingMang.quotes.BlackQuote.getInstance();
        VDMMap board = MapUtil.map();
        Boolean over = false;
        board = MapUtil.map(new Maplet(SeqUtil.seq(1L, 1L),
                    MingMang.quotes.WhiteQuote.getInstance()),
                new Maplet(SeqUtil.seq(1L, 2L),
                    MingMang.quotes.WhiteQuote.getInstance()),
                new Maplet(SeqUtil.seq(1L, 3L),
                    MingMang.quotes.WhiteQuote.getInstance()),
                new Maplet(SeqUtil.seq(1L, 4L),
                    MingMang.quotes.WhiteQuote.getInstance()),
                new Maplet(SeqUtil.seq(1L, 5L),
                    MingMang.quotes.WhiteQuote.getInstance()),
                new Maplet(SeqUtil.seq(1L, 6L),
                    MingMang.quotes.WhiteQuote.getInstance()),
                new Maplet(SeqUtil.seq(1L, 7L),
                    MingMang.quotes.WhiteQuote.getInstance()),
                new Maplet(SeqUtil.seq(1L, 8L),
                    MingMang.quotes.WhiteQuote.getInstance()),
                new Maplet(SeqUtil.seq(2L, 1L),
                    MingMang.quotes.WhiteQuote.getInstance()),
                new Maplet(SeqUtil.seq(2L, 2L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(2L, 3L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(2L, 3L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(2L, 4L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(2L, 5L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(2L, 6L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(2L, 7L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(2L, 8L),
                    MingMang.quotes.WhiteQuote.getInstance()),
                new Maplet(SeqUtil.seq(3L, 1L),
                    MingMang.quotes.WhiteQuote.getInstance()),
                new Maplet(SeqUtil.seq(3L, 2L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(3L, 3L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(3L, 3L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(3L, 4L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(3L, 5L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(3L, 6L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(3L, 7L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(3L, 8L),
                    MingMang.quotes.WhiteQuote.getInstance()),
                new Maplet(SeqUtil.seq(4L, 1L),
                    MingMang.quotes.WhiteQuote.getInstance()),
                new Maplet(SeqUtil.seq(4L, 2L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(4L, 3L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(4L, 3L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(4L, 4L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(4L, 5L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(4L, 6L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(4L, 7L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(4L, 8L),
                    MingMang.quotes.WhiteQuote.getInstance()),
                new Maplet(SeqUtil.seq(5L, 1L),
                    MingMang.quotes.WhiteQuote.getInstance()),
                new Maplet(SeqUtil.seq(5L, 2L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(5L, 3L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(5L, 3L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(5L, 4L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(5L, 5L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(5L, 6L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(5L, 7L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(5L, 8L),
                    MingMang.quotes.WhiteQuote.getInstance()),
                new Maplet(SeqUtil.seq(6L, 1L),
                    MingMang.quotes.WhiteQuote.getInstance()),
                new Maplet(SeqUtil.seq(6L, 2L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(6L, 3L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(6L, 3L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(6L, 4L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(6L, 5L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(6L, 6L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(6L, 7L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(6L, 8L),
                    MingMang.quotes.WhiteQuote.getInstance()),
                new Maplet(SeqUtil.seq(7L, 1L),
                    MingMang.quotes.WhiteQuote.getInstance()),
                new Maplet(SeqUtil.seq(7L, 2L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(7L, 3L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(7L, 3L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(7L, 4L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(7L, 5L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(7L, 6L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(7L, 7L),
                    MingMang.quotes.BlankSpaceQuote.getInstance()),
                new Maplet(SeqUtil.seq(7L, 8L),
                    MingMang.quotes.WhiteQuote.getInstance()),
                new Maplet(SeqUtil.seq(8L, 1L),
                    MingMang.quotes.WhiteQuote.getInstance()),
                new Maplet(SeqUtil.seq(8L, 2L),
                    MingMang.quotes.WhiteQuote.getInstance()),
                new Maplet(SeqUtil.seq(8L, 3L),
                    MingMang.quotes.WhiteQuote.getInstance()),
                new Maplet(SeqUtil.seq(8L, 3L),
                    MingMang.quotes.WhiteQuote.getInstance()),
                new Maplet(SeqUtil.seq(8L, 4L),
                    MingMang.quotes.WhiteQuote.getInstance()),
                new Maplet(SeqUtil.seq(8L, 5L),
                    MingMang.quotes.WhiteQuote.getInstance()),
                new Maplet(SeqUtil.seq(8L, 6L),
                    MingMang.quotes.WhiteQuote.getInstance()),
                new Maplet(SeqUtil.seq(8L, 7L),
                    MingMang.quotes.WhiteQuote.getInstance()),
                new Maplet(SeqUtil.seq(8L, 8L),
                    MingMang.quotes.WhiteQuote.getInstance()));
        over = game.gameOver();
        assertEqual(over, true);
    }

    public void TestNewGame() {
        MingMang game = new MingMang();
        Board gameBoard = game.getBoard();
        Object cpW = MingMang.quotes.WhiteQuote.getInstance();
        Object cpBS = MingMang.quotes.BlankSpaceQuote.getInstance();
        Object cpB = MingMang.quotes.BlackQuote.getInstance();
        Boolean aux = false;
        assertEqual(((Object) gameBoard.getPiece(SeqUtil.seq(1L, 1L))),
            ((Object) cpW));
        assertEqual(((Object) gameBoard.getPiece(SeqUtil.seq(1L, 7L))),
            ((Object) cpW));
        assertEqual(((Object) gameBoard.getPiece(SeqUtil.seq(8L, 1L))),
            ((Object) cpW));
    }

    public void TestReset() {
        MingMang game = new MingMang();
        game.reset();
    }

    public void TestGoodMove() {
        MingMang game = new MingMang();
        Board gameBoard = game.getBoard();
        Object cpW = MingMang.quotes.WhiteQuote.getInstance();
        Object cpBS = MingMang.quotes.BlankSpaceQuote.getInstance();
        Object cpB = MingMang.quotes.BlackQuote.getInstance();
        Boolean aux = false;
        aux = game.movePiece(SeqUtil.seq(1L, 2L), SeqUtil.seq(2L, 2L));
        assertEqual(((Object) gameBoard.getPiece(SeqUtil.seq(2L, 2L))),
            ((Object) cpW));
        aux = game.movePiece(SeqUtil.seq(8L, 2L), SeqUtil.seq(7L, 2L));
        assertEqual(((Object) gameBoard.getPiece(SeqUtil.seq(7L, 2L))),
            ((Object) cpB));
        aux = game.movePiece(SeqUtil.seq(5L, 1L), SeqUtil.seq(5L, 2L));
        assertEqual(((Object) gameBoard.getPiece(SeqUtil.seq(5L, 2L))),
            ((Object) cpW));
        aux = game.movePiece(SeqUtil.seq(6L, 8L), SeqUtil.seq(6L, 7L));
        assertEqual(((Object) gameBoard.getPiece(SeqUtil.seq(6L, 7L))),
            ((Object) cpB));
    }

    public void TestMoveWithPiecesBetween() {
        MingMang game = new MingMang();
        Board gameBoard = game.getBoard();
        Object cpW = MingMang.quotes.WhiteQuote.getInstance();
        Object cpBS = MingMang.quotes.BlankSpaceQuote.getInstance();
        Object cpB = MingMang.quotes.BlackQuote.getInstance();
        Boolean aux = false;
        aux = game.movePiece(SeqUtil.seq(1L, 4L), SeqUtil.seq(5L, 4L));
    }

    public void TestConquer() {
        MingMang game = new MingMang();
        Board gameBoard = game.getBoard();
        Object cpW = MingMang.quotes.WhiteQuote.getInstance();
        Object cpB = MingMang.quotes.BlackQuote.getInstance();
        Boolean aux = false;
        aux = game.movePiece(SeqUtil.seq(3L, 1L), SeqUtil.seq(3L, 3L));
        aux = game.movePiece(SeqUtil.seq(8L, 4L), SeqUtil.seq(3L, 4L));
        aux = game.movePiece(SeqUtil.seq(1L, 5L), SeqUtil.seq(3L, 5L));
        assertEqual(((Object) gameBoard.getPiece(SeqUtil.seq(3L, 4L))),
            ((Object) cpW));
        game.reset();
        aux = game.movePiece(SeqUtil.seq(4L, 1L), SeqUtil.seq(4L, 5L));
        aux = game.movePiece(SeqUtil.seq(5L, 8L), SeqUtil.seq(5L, 5L));
        aux = game.movePiece(SeqUtil.seq(6L, 1L), SeqUtil.seq(6L, 5L));
        assertEqual(((Object) gameBoard.getPiece(SeqUtil.seq(5L, 5L))),
            ((Object) cpW));
        game.reset();
        aux = game.movePiece(SeqUtil.seq(1L, 6L), SeqUtil.seq(4L, 6L));
        aux = game.movePiece(SeqUtil.seq(8L, 5L), SeqUtil.seq(4L, 5L));
        aux = game.movePiece(SeqUtil.seq(1L, 4L), SeqUtil.seq(4L, 4L));
        assertEqual(((Object) gameBoard.getPiece(SeqUtil.seq(4L, 5L))),
            ((Object) cpW));
        game.reset();
        aux = game.movePiece(SeqUtil.seq(7L, 1L), SeqUtil.seq(7L, 2L));
        aux = game.movePiece(SeqUtil.seq(6L, 8L), SeqUtil.seq(6L, 2L));
        aux = game.movePiece(SeqUtil.seq(5L, 1L), SeqUtil.seq(5L, 2L));
        assertEqual(((Object) gameBoard.getPiece(SeqUtil.seq(7L, 2L))),
            ((Object) cpB));
        assertEqual(((Object) gameBoard.getPiece(SeqUtil.seq(6L, 2L))),
            ((Object) cpB));
        assertEqual(((Object) gameBoard.getPiece(SeqUtil.seq(5L, 2L))),
            ((Object) cpW));
    }

    public String toString() {
        return "TestMingMang{}";
    }
}
