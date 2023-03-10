package structural.facade;

public class FunitureFacade {
    private FunitureFacade(){
        this.chair = new Chair();
        this.table = new Table();
        this.television = new Television();
    }
    private Chair chair;
    private Table table;
    private Television television;

    private static FunitureFacade instance = null;

    public static FunitureFacade getInstance() {
        if(instance == null) {
            return new FunitureFacade();
        }
        return instance;
    }

    public void makeChairAndTable() {
        chair.make();
        table.make();
    }
    public void makeTableAndTelevision() {
        table.make();
        television.make();
    }
    public void makeTelevisionAndChair() {
        television.make();
        chair.make();
    }
}
