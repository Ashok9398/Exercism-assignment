public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        return 40;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int hasBeen){
        return expectedMinutesInOven() - hasBeen;
    }
    

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int noOfLayers) {
        return 2 * noOfLayers;
    }
    

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int noOfLayers, int hasBeen) {
        return (2 * noOfLayers) + hasBeen;
    }
}
