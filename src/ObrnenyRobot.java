public class ObrnenyRobot extends Robot{

    ObrnenyRobot (){
        super(20);
    }

    @Override
    public void prijmiZasah(int silaUtoku){
        silaUtoku = Math.max(silaUtoku-10,0);
        energie -= silaUtoku;
        if (energie < 0){
            energie = 0;
        }
    }
}
