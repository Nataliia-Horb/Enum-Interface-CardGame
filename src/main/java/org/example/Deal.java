package org.example;

/**
 * В изначальной задаче было выявлено 2 бага:
 * - некоректно отрабатывался кейс ввода пользователем отрицательных значений
 * - некоректно отрабатывался кейс ввода пользователем не числовых значений (например букв)
 * Было исправлено...
 *
 * Реализацию программы решила выполнить следующим образом:
 * в интерфейсе разместила константы и методы "Собери коллоду карт" "Потасуй карты" "Раздай карты игрокам"
 * в классах Enum-Suits Enum-Deck разместились константные перечисления (ранг и масть).
 * Мне не получилось разместить числовые значения рангов карт типа 2-ка 6-ка 10-ка и т.д.,поэтому я написала их в
 * буквенном представлении.
 * Для того, чтобы хранить константы в одном месте, я их все положила в интерфейс. Часть констант мне понадобилась в классе
 * Players и я решила в этом класе создать новый обьект CardsPlay play = new Deck();
 * (также было-бы возможным создать Deck play = new Deck() и через этот обьект добраться к константам), все работает,
 * но хотела-бы задать вопрос??? Допустимо ли так делать, или это плохая практика?
 * Спасибо за обратную связь :)
 *
 */
public class Deal {

    public static void main(String[] args) {
        Players newPlayers = new Players();
        Deck oneDeck = new Deck();

        String[] deck = oneDeck.fillDeck();
        deck = oneDeck.shufflingDeck(deck);
        oneDeck.displayedDeck(deck, newPlayers.getPlayers());
    }
}

