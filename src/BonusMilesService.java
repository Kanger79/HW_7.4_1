public class BonusMilesService {

    public int calculate(int price) {
        int costMile = 20;
        int miles = price / costMile;
        return miles;
    }
}