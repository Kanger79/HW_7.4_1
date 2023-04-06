public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 20_039;
        int miles = service.calculate(price);

        System.out.println();
        System.out.println("При стоимости билета равной " + price + " рублей, " + "количество бонусных миль будет равно " + miles);

    }

}