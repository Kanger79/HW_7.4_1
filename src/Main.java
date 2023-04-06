public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();

        int costTicket = 21_342;
        int costMile = 20;
        int miles = costTicket / costMile;

        System.out.println("При стоимости билета равной " + costTicket + " рублей, " + "количество бонусных миль будет равно " + miles);
    }
}