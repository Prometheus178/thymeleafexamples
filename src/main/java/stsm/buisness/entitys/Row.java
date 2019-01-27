package stsm.buisness.entitys;

public class Row {
    private Variety variety = null;
    private Integer seedPerCell = null;

    public Row() {
       super();
    }

    public Variety getVariety() {
        return variety;
    }

    public void setVariety(Variety variety) {
        this.variety = variety;
    }

    public Integer getSeedPerCell() {
        return seedPerCell;
    }

    public void setSeedPerCell(Integer seedPerCell) {
        this.seedPerCell = seedPerCell;
    }
}
