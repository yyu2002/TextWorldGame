public class TakeCommand implements Command {
    private Player player;
    private String itemName;

    public TakeCommand(Player player) {
        this.player = player;
    }

    public void init(String input) {
        this.itemName = parseItemName(input);
    }

    private String parseItemName(String input) {
        return input.substring(input.indexOf(" ") + 1);
    }

    public boolean execute() {
        boolean success = player.takeItem(itemName);
        if (success)
            System.out.println("You took the " + itemName);
        return success;
    }
}
