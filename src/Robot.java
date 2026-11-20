public abstract class Robot {
    protected int energie;
    protected int silaUtoku;

    Robot(int silaUtoku) {
        this.energie = 100;
        this.silaUtoku = silaUtoku;
    }

    public void utoc(Robot cil){
        if (energie > 0){
            cil.prijmiZasah(silaUtoku);
        }
    };

    public void prijmiZasah(int silaUtoku){
        energie -= silaUtoku;
        if (energie < 0){
            energie = 0;
        }
    };

    @Override
    public String toString() {
        return "\n" + getClass().getSimpleName() + ", energie = " + energie;
    }
}
