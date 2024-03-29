/**
 * Copyright Teoken LLC. (c) 2013. All rights reserved.
 * Copying or usage of any piece of this source code without written notice from Teoken LLC is a major crime.
 * Այս կոդը Թեոկեն ՍՊԸ ընկերության սեփականությունն է:
 * Առանց գրավոր թույլտվության այս կոդի պատճենահանումը կամ օգտագործումը քրեական հանցագործություն է:
 */
package saltr;

import saltr.parser.LevelParser;
import saltr.parser.gameeditor.BoardData;
import saltr.parser.response.level.Board;
import saltr.parser.response.level.BoardChunk;
import saltr.parser.response.level.BoardCompositeAsset;
import saltr.parser.response.level.CustomPropertyCell;

import java.util.List;
import java.util.Map;

public class LevelBoard {
    public static String MAIN_BOARD_ID = "main";

    private Integer rows;
    private Integer cols;
    private List<List<Integer>> blockedCells;
    private List<Integer> position;
    private Object[][] boardVector;
    private Board rawBoard;
    private BoardData boardData;

    public LevelBoard(Board rawBoard, BoardData boardData) {
        this.rawBoard = rawBoard;
        this.boardData = boardData;
        cols = this.rawBoard.getCols();
        rows = this.rawBoard.getRows();
        blockedCells = this.rawBoard.getBlockedCells();
        position = this.rawBoard.getPosition();

        this.boardVector = new Object[rows][cols];
        LevelParser.parseBoard(boardVector, this.rawBoard, this.boardData);
    }

    public void regenerateChunks() {
        LevelParser.regenerateChunks(boardVector, rawBoard, boardData);
    }

    public List<BoardCompositeAsset> getComposites() {
        return rawBoard.getComposites();
    }

    public List<BoardChunk> getChunks() {
        return rawBoard.getChunks();
    }

    public Integer getRows() {
        return rows;
    }

    public Integer getCols() {
        return cols;
    }

    public List<List<Integer>> getBlockedCells() {
        return blockedCells;
    }

    public List<Integer> getPosition() {
        return position;
    }

    public Object[][] getBoardVector() {
        return boardVector;
    }

    public BoardData getBoardData() {
        return boardData;
    }

    public Map<String, String> getBoardProperties() {
        return rawBoard.getProperties().getBoard();
    }

    public List<CustomPropertyCell> cellProperties() {
        return rawBoard.getProperties().getCell();
    }
}
