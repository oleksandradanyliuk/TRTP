package GameMontyHall.game;

public class Main {
    public static void main(String[] args) {
        GameLogic game = new GameLogic();
        Player player = new Player();
        UI ui = new UI();

        System.out.println("Ласкаво просимо до гри 'Три двері'!");
        int choice = player.chooseDoor();
        game.setPlayerChoice(choice);

        game.hostOpensDoor();
        ui.showHostDoor(game.getOpenedDoor());

        if (player.decideSwitch()) {
            game.switchChoice();
        }

        boolean win = game.checkWin(game.getPlayerChoice());
        ui.showResult(win, game.getPrizeDoor());
    }
}

