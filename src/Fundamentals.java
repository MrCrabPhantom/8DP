//Нарушения java namingConvention  +++++++++++++++++++
abstract class Fundamentals {
    //Модификаторы досутпа ++++++++++++++++++
    private String name;

    int absoluteLength(int i){
        int s = 0;
        for(int x = 0; x <= i ; x++) s = s + coordinateSystem.streetsLength[x];
        return s;
    }
    int relativeLength(int i){
        int sum = 0;
        for (int x = 0; x < coordinateSystem.streetsLength[0]; x++) {
            i = i - coordinateSystem.streetsLength[x];
            if (i < 0) i = i + coordinateSystem.streetsLength[x];
            if (i < coordinateSystem.streetsLength[x]) {
                sum = x * 1000;
                if (i < 0) throw new AritheticError("Вы сломали программу");
                break;
            }
        }
        return (sum + i);
    }
    Color randomColor(){
        double r = Math.random();
        Color type = Color.GRAY;
        if (r <= 0.2) type = Color.BLACK;
        if (r > 0.2) type =  Color.BLUE;
        if (r > 0.4) type =  Color.GRAY;
        if (r > 0.6) type =  Color.RED;
        if (r > 0.8) type = Color.WHITE;
        return type;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
       String s = getName();
       return "Имя персонажа "+s;
    }

    static class coordinateSystem extends Fundamentals {
        static final int maxX = 1000;
        static final int[] streetsLength = {166,167,167,45,45,45,45,45,46,46,46,46,46};
    }
    class EndOfRoad extends Exception{
        Character character;
        EndOfRoad(){}
        EndOfRoad(Character c){character = c;}
    }
    class AritheticError extends RuntimeException{
        AritheticError(String s){super(s);}
    }
}
//Might be exception in relativeLength
//+