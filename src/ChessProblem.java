public class ChessProblem {
    public boolean bishop(String startPoint , String endPoint , int numberOfMoves){
        if(startPoint.equals(endPoint)){
            return true;
        }
        int sumOfStartPoint = sumOfValues(startPoint);
        int sumOfEndPoint = sumOfValues(endPoint);
        if(!sameBlockType(sumOfStartPoint , sumOfEndPoint)){
            return false;
        }
        int baseMoves = getBasicMoves(sumOfStartPoint,sumOfEndPoint);
        int secondaryMoves = getSecondaryMoves(startPoint,baseMoves,endPoint);
        return (baseMoves+secondaryMoves) <= numberOfMoves;

    }

    public boolean sameBlockType(int startSum , int endSum){
        return (isEven(startSum) && isEven(endSum)) || (isOdd(startSum) && isOdd(endSum));
    }

    public int sumOfValues(String position){
        return charValue(position) + numberValue(position);
    }

    public boolean isEven(int value){
        return value % 2 == 0;
    }
    public boolean isOdd(int value){
        return value % 2 != 0;
    }

    public int charValue(String position){
        return position.charAt(0);
    }

    public int numberValue(String position){
        return Integer.parseInt(position.substring(1));
    }

    public int getBasicMoves(int startPointSum , int endPointSum){
        return (Math.abs(startPointSum - endPointSum)) / 2;
    }

    public int getSecondaryMoves(String startPoint , int basicMoves , String endPoint){
        int startPointValue = numberValue(startPoint);
        int endPointValue  = numberValue(endPoint);
        int difference = startPointValue > endPointValue ? startPointValue - basicMoves : startPointValue + basicMoves;
        return Math.abs((difference - endPointValue));
    }
}
