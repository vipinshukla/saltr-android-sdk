/**
 * Copyright Teoken LLC. (c) 2013. All rights reserved.
 * Copying or usage of any piece of this source code without written notice from Teoken LLC is a major crime.
 * Այս կոդը Թեոկեն ՍՊԸ ընկերության սեփականությունն է:
 * Առանց գրավոր թույլտվության այս կոդի պատճենահանումը կամ օգտագործումը քրեական հանցագործություն է:
 */
package saltr.parser.response.level;

import java.util.List;

public class Board {
    private List<BoardCompositeAsset> composites;
    private List<BoardChunk> chunks;
    private Integer rows;
    private Integer cols;
    private List<List<Integer>> blockedCells;
    private Integer isFirstRowShifted;
    private List<Integer> position;
    private CustomProperties properties;

    public CustomProperties getProperties() {
        return properties;
    }

    public void setProperties(CustomProperties properties) {
        this.properties = properties;
    }

    public Integer getIsFirstRowShifted() {
        return isFirstRowShifted;
    }

    public void setIsFirstRowShifted(Integer isFirstRowShifted) {
        this.isFirstRowShifted = isFirstRowShifted;
    }

    public Integer getFirstRowShifted() {
        return isFirstRowShifted;
    }

    public void setFirstRowShifted(Integer firstRowShifted) {
        isFirstRowShifted = firstRowShifted;
    }

    public List<BoardChunk> getChunks() {
        return chunks;
    }

    public void setChunks(List<BoardChunk> chunks) {
        this.chunks = chunks;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public Integer getCols() {
        return cols;
    }

    public void setCols(Integer cols) {
        this.cols = cols;
    }

    public List<BoardCompositeAsset> getComposites() {
        return composites;
    }

    public void setComposites(List<BoardCompositeAsset> composites) {
        this.composites = composites;
    }

    public List<List<Integer>> getBlockedCells() {
        return blockedCells;
    }

    public void setBlockedCells(List<List<Integer>> blockedCells) {
        this.blockedCells = blockedCells;
    }

    public List<Integer> getPosition() {
        return position;
    }

    public void setPosition(List<Integer> position) {
        this.position = position;
    }
}
