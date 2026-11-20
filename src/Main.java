void main() {
    Robot lehkyRobot = new LehkyRobot();
    Robot obrnenyRobot = new ObrnenyRobot();

    System.out.println("\n=========================================================== Lehký zaútočí na obrněného\n");

    lehkyRobot.utoc(obrnenyRobot);
    System.out.println(lehkyRobot);
    System.out.println(obrnenyRobot);

    System.out.println("\n=========================================================== Obrněný zaútočí na lehkého\n");

    obrnenyRobot.utoc(lehkyRobot);
    System.out.println(lehkyRobot);
    System.out.println(obrnenyRobot);

    System.out.println("\n=========================================================== Obrněný dostane zásah o síle 5\n");

    obrnenyRobot.prijmiZasah(5);
    System.out.println(lehkyRobot);
    System.out.println(obrnenyRobot);

    System.out.println("\n=========================================================== Obrněný dostane zásah o síle 200\n");

    obrnenyRobot.prijmiZasah(200);
    System.out.println(lehkyRobot);
    System.out.println(obrnenyRobot);

    System.out.println("\n=========================================================== Obrněný se pokusí zaútočit na lehkého\n");

    obrnenyRobot.utoc(lehkyRobot);
    System.out.println(lehkyRobot);
    System.out.println(obrnenyRobot);
}
