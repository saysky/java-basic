package behavior.mediator.airport;

/**
 * 所有的对象都只跟一个媒介中心打交道
 */
public class Run {
    public static void main(String[] args) {
        AirportMediator airportMediator = new AirportMediator();

        Fly f1 = new Fly("F1");
        Fly f2 = new Fly("F2");
        Fly f3 = new Fly("F3");

        f1.setAirportMediator(airportMediator);
        f2.setAirportMediator(airportMediator);
        f3.setAirportMediator(airportMediator);

        f1.in();
        System.out.println("---------------------------------------");
        f2.in();

        System.out.println("---------------------------------------");
        f3.in();


        System.out.println("---------------------------------------");
        f1.out();

    }
}
