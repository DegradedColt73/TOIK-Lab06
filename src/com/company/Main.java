package com.company;

class Main {

    /**
     * metoda main powinna implementowac algorytm do
     * jak najszybszego wyszukiwania wartosci
     * zmiennej digit z klasy QuizImpl (zakladamy ze
     * programista nie zna zawartosci klasy QuizImpl).
     * Nalezy zalozyc, ze pole digit w klasie QuizImpl
     * moze w kazdej chwili ulec zmianie. Do wyszukiwania
     * odpowiedniej wartosci nalezy wykorzystywac tylko
     * i wylacznie metode isCorrectValue - jesli metoda
     * przestanie rzucac wyjatki wowczas mamy pewnosc ze
     * poszukiwana zmienna zostala odnaleziona.
     */
    public static void main(String[] args) {

        Quiz quiz = new QuizImpl();
        int digit = (Quiz.MAX_VALUE - Quiz.MIN_VALUE) / 2 ; // zainicjuj zmienna
        int min = Quiz.MIN_VALUE;
        int max = Quiz.MAX_VALUE;

        for(int counter = 1; ;counter++) {
            try {
                quiz.isCorrectValue(digit);
                System.out.println("Trafiona proba!!! Szukana liczba to: "
                        + digit + " Ilosc prob: " + counter);
                break;
            } catch(Quiz.ParamTooLarge e) {
                System.out.println("Argument za duzy!!!");
                max = digit;
                digit = (max + min) / 2;
                System.out.println(digit);
                // implementacja logiki...
            } catch(Quiz.ParamTooSmall e) {
                min = digit;
                digit = (max + min) / 2;
                System.out.println("Argument za maly!!!");
                System.out.println(digit);
                // implementacja logiki...
            }
        }
    }
}