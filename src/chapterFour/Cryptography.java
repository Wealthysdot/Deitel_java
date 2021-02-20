package chapterFour;

public class Cryptography {

    private int digit;


    public Cryptography() {

    }

    public int getDigit() {

        return digit;
    }

    public void setDigit(int digit) {
        this.digit = digit;
    }

        int remFour;
        public int getRemToGetFourthNumberFromDigit() {
            remFour = digit % 10;
            return remFour;
        }

        public int getTheFourthNumberToEncrypt(){
            return (remFour + 7) % 10;

        }

        public int getDivToMakeDigitThreeNumbers(){
            return digit / 10;
        }


        public int getRemToGetThirdNumber(){
            return getDivToMakeDigitThreeNumbers() % 10;
        }

        public int getThirdNumberToEncrypt(){
            return (getRemToGetThirdNumber() + 7) % 10;
        }


        public int getTwoNumberFromDigit(){
            return getDivToMakeDigitThreeNumbers() /10;
        }


            public int getRemToGetSecondNumber(){
                return getTwoNumberFromDigit() % 10;
        }

        public int getSecondNumberToEncrypt(){
            return (getRemToGetSecondNumber() + 7) % 10;
        }


                public int getOneNumberFromDigit(){
                    return digit /1000;
        }

        public int getFirstNumberToEncrypt(){
            return (getOneNumberFromDigit() + 7) % 10;
        }

        public void getEncrypt(){
            System.out.println("" + getSecondNumberToEncrypt() + getFirstNumberToEncrypt() + getTheFourthNumberToEncrypt() + getThirdNumberToEncrypt() );
        }



}
